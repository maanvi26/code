package java_excercises_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,Books> hs = new HashMap<Integer,Books>();
		Books b1 = new Books(23431, "Algorithms", "MIT", "XYZ", 34.67);
		hs.put(b1.ISBN,b1);
		Books b2 = new Books(32423, "C", "TMH", "ABC", 45.54);
		hs.put(b2.ISBN,b2);
		Books b3 = new Books(45434, "C++", "MIT", "SDS", 67.8);
		hs.put(b3.ISBN,b3);
		Books b4 = new Books(8967, "Java", "TMH", "HHBB", 9.99);
		hs.put(b4.ISBN,b4);
		Books b5 = new Books(5432, "CS", "UDS", "JHG", 11);
		hs.put(b5.ISBN,b5);
		Books b6 = new Books(4323, "OS", "REWE", "GHGH", 23);
		hs.put(b6.ISBN,b6);
		Books b7 = new Books(32423, "C", "TMH", "ABC", 45.54);
		hs.put(b7.ISBN,b7);
		Books b8 = new Books(765, "C++", "MIT", "SDS", 67.8);
		hs.put(b8.ISBN,b8);
		Books b9 = new Books(8967, "Java", "TMH", "HHBB", 9.99);
		hs.put(b9.ISBN,b9);
		Books b10 = new Books(4367, "JavaScript", "GDH", "TSDFF", 9.0);
		hs.put(null,b10);
		
		Iterator<Map.Entry<Integer, Books>> lite = hs.entrySet().iterator();
		while(lite.hasNext()) {
			Map.Entry<Integer, Books> mentry = (Entry<Integer, Books>) lite.next();
			int key = mentry.getKey();
			Books val = mentry.getValue();
			System.out.println("Key: " + key + " Author: " + val.author + " Publisher: " + 
			val.publisher + " Name: " + val.name + " Price: " + val.price);
		}

	}

}
