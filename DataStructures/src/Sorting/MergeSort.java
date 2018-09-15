package Sorting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {

	public List<Integer> mergeSort(List<Integer> list, int left, int right) {
	
		int mid = left;
		if(left != right) {
			mid = (left + right) / 2;
		}
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		if(mid != 0) {
		l1 = mergeSort(list, left, mid);
		l2 = mergeSort(list, mid + 1, right);
		}
		List<Integer> sortedList = merge(l1, l2);
		return sortedList;
	}
	
	public List<Integer> merge(List<Integer> l1, List<Integer> l2) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.addAll(l1);
		list.addAll(l2);
		
		return list;
	}
	
	public static void main(String[] args) {
		
		MergeSort sort = new MergeSort();
		LinkedList<Integer> unsortedList = new LinkedList<Integer>();
		LinkedList<Integer> sortedList = new LinkedList<Integer>();
		
		unsortedList.add(8);
		unsortedList.add(4);
		unsortedList.add(29);
		unsortedList.add(22);
		unsortedList.add(54);
		unsortedList.add(78);
		unsortedList.add(6);
		
		sortedList = (LinkedList<Integer>) sort.mergeSort(unsortedList, 0, unsortedList.size() - 1);

		Iterator<Integer> ite = sortedList.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}


	}

}
