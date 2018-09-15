package java_excercises_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Books> al = new ArrayList<Books>();
		Books b1 = new Books(23431, "Algorithms", "MIT", "XYZ", 34.67);
		al.add(b1);
		Books b2 = new Books(32423, "C", "TMH", "ABC", 45.54);
		al.add(b2);
		Books b3 = new Books(45434, "C++", "MIT", "SDS", 67.8);
		al.add(b3);
		Books b4 = new Books(7856, "Java", "TMH", "HHBB", 9.99);
		al.add(b4);
		Books b5 = new Books(5432, "OS", "REWE", "GHGH", 23);
		al.add(b5);
		
		Iterator<Books> ite = al.iterator();
		
		while(ite.hasNext()) {
			Books book = ite.next();
			System.out.println("Author : " + book.author + " Name: " + book.name + " Publisher: " + book.publisher +
					" ISBN: " + book.ISBN + " Price: " + book.price);
		}

	}

}
