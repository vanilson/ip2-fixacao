package ip2.aula01.programa04;

public class Book {
	
	// ATRIBUTOS
	private String title;
	private Author author;
	private double price;
	private int qtyInStock;
	

	// GETs e SETs
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	// CONSTRUTOR
	public Book(String title, Author author, double price, int qtyInStock) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public boolean equals(Book b) {
		
		if (b == null) { 
			return false;
		}
		
		if (this.author == null || this.title == null) {
			return false;
		}

		return this.title.equals(b.title) && this.author.equals(b.author); 
		
		
	}

	
	

}
