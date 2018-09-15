package java_excercises_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<Books> hs = new LinkedHashSet<Books>();
		Books b1 = new Books(23431, "Algorithms", "MIT", "XYZ", 34.67);
		hs.add(b1);
		Books b2 = new Books(32423, "C", "TMH", "ABC", 45.54);
		hs.add(b2);
		Books b3 = new Books(45434, "C++", "MIT", "SDS", 67.8);
		hs.add(b3);
		Books b4 = new Books(7856, "Java", "TMH", "HHBB", 9.99);
		hs.add(b4);
		Books b5 = new Books(5432, "CS", "UDS", "JHG", 11);
		hs.add(b5);
		Books b6 = new Books(4323, "OS", "REWE", "GHGH", 23);
		hs.add(b6);
		Books b7 = new Books(32423, "C", "TMH", "ABC", 45.54);
		hs.add(b7);
		Books b8 = new Books(765, "C++", "MIT", "SDS", 67.8);
		hs.add(b8);
		Books b9 = new Books(7856, "Java", "TMH", "HHBB", 9.99);
		hs.add(b9);
		Books b10 = new Books(8967, "JavaScript", "GDH", "TSDFF", 9.0);
		hs.add(b10);

		Iterator<Books> ite = hs.iterator();
		
		while(ite.hasNext()) {
			Books book = ite.next();
			System.out.println("Author : " + book.author + " Name: " + book.name + " Publisher: " + book.publisher +
					" ISBN: " + book.ISBN + " Price: " + book.price);
		}
		
		/*SetExample s = new SetExample();
		s.booksArray(hs);*/
		
	}
	
	public void booksArray(HashSet<Books> hs) {
		
		Books[] bk = (Books[]) hs.toArray(new Books[hs.size()]);
		
		for(Books book: bk)
			System.out.println("Author : " + book.author + " Name: " + book.name + " Publisher: " + book.publisher +
					" ISBN: " + book.ISBN + " Price: " + book.price);
	}
	

}
