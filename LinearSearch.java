package Search;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinearSearch {
	
	public int linearSearchFunction(int value, List<Integer> list) {
		Iterator<Integer> ite = list.iterator();
		int temp = 0;
		while(ite.hasNext()) {
			if(ite.next().equals(value)) {
				break;
			}
			temp++;
		}
		return temp;
	}

	public static void main(String[] args) {
		
		LinearSearch ls = new LinearSearch();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(8);
		list.add(4);
		list.add(29);
		list.add(54);
		list.add(22);
		list.add(78);
		list.add(6);
		
		int index = ls.linearSearchFunction(78, list);
		System.out.println(index);

	}

}
