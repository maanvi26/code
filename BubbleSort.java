package Sorting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BubbleSort {
	
	public List<Integer> bubbleSort(List<Integer> list) {
		boolean swap;
		int temp = 0;
		int n1;
		int n2;
		
		for (int i = 0; i < list.size() - 1; i++) {
			swap = false;
			for (int j = 0; j < list.size() - 1; j++) {
				n1 = (int) list.get(j);
				n2 = (int) list.get(j + 1);
				if(n1 > n2) {
					temp = n2;
					list.set((j + 1), n1);
					list.set(j, temp);
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		BubbleSort sort = new BubbleSort();
		LinkedList<Integer> unsortedList = new LinkedList<Integer>();
		LinkedList<Integer> sortedList = new LinkedList<Integer>();
		
		unsortedList.add(8);
		unsortedList.add(4);
		unsortedList.add(29);
		unsortedList.add(54);
		unsortedList.add(22);
		unsortedList.add(78);
		unsortedList.add(6);
		
		sortedList = (LinkedList<Integer>) sort.bubbleSort(unsortedList);
		
		Iterator<Integer> ite = sortedList.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
