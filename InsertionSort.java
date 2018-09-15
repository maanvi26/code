package Sorting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
	
	public List<Integer> insertionSort(List<Integer> list) {
		
		boolean swap;
		int temp = 0;
		int j;
		for (int i = 0; i < list.size(); i++) {
			swap = false;
			j = i;
			while ((j >= 1) && (list.get(j - 1) > list.get(j))) {
				temp = list.get(j);
				list.set(j, list.get(j - 1));
				list.set(j - 1, temp);
				if( j != 1) {
					j--;
				}
				swap = true; 
			}
			if(!swap) {
				continue;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		InsertionSort sort = new InsertionSort();
		LinkedList<Integer> unsortedList = new LinkedList<Integer>();
		LinkedList<Integer> sortedList = new LinkedList<Integer>();
		
		unsortedList.add(8);
		unsortedList.add(4);
		unsortedList.add(29);
		unsortedList.add(22);
		unsortedList.add(54);
		unsortedList.add(78);
		unsortedList.add(6);
		
		sortedList = (LinkedList<Integer>) sort.insertionSort(unsortedList);

		Iterator<Integer> ite = sortedList.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
