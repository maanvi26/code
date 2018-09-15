package Search;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BinarySearch {
	
	public int binarySearchFunction(int value, int left, int right, List<Integer> list) {
		
		int mid = (left + right) / 2;
		int index = 0;
		if(value == list.get(mid)) {
			index = mid;
			return index;
		} else if(value > list.get(mid)) {
			index = binarySearchFunction(value, mid + 1, right, list);
		} else if(value < list.get(mid)) {
			index = binarySearchFunction(value, left, mid - 1, list);
		}
		return index;
	}

	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(8);
		list.add(4);
		list.add(29);
		list.add(54);
		list.add(22);
		list.add(78);
		list.add(6);
		
		Collections.sort(list);
		
		int index = bs.binarySearchFunction(8, 0, list.size(), list);
		
		System.out.println(index);
		
		
	}

}
