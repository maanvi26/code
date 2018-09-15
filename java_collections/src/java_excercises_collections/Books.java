package java_excercises_collections;

public class Books {
	
	int ISBN;
	String name, publisher, author;
	double price;
	
	public Books(int iSBN, String name, String publisher, String author, double price) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}

	@Override
	public int hashCode() {

		return this.ISBN;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	
	

}
