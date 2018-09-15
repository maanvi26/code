package Sorting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SelectionSort {
	
	public List<Integer> selectionSort(List<Integer> list) {
		
		int selectedValue = 0;
		int temp = 0;
		
		for (int i = 0; i < list.size() - 1; i++) {
			selectedValue = list.get(i);
			for (int j = i; j < list.size(); j++) {
				if(selectedValue > list.get(j)) {
					selectedValue = list.get(j);
				}
			}
			if (list.indexOf(selectedValue) != i) {
				temp = list.get(i);
				list.set(list.indexOf(selectedValue), temp);
				list.set(i, selectedValue);
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		SelectionSort sort = new SelectionSort();
		LinkedList<Integer> unsortedList = new LinkedList<Integer>();
		LinkedList<Integer> sortedList = new LinkedList<Integer>();
		
		unsortedList.add(8);
		unsortedList.add(4);
		unsortedList.add(29);
		unsortedList.add(22);
		unsortedList.add(54);
		unsortedList.add(78);
		unsortedList.add(6);
		
		sortedList = (LinkedList<Integer>) sort.selectionSort(unsortedList);

		Iterator<Integer> ite = sortedList.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
