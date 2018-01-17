public class Book {

	private String author;
	private String name;	
	
	public Book(String author,String name) {
		super();
		this.name = name;
		this.author = author;
	}	
	
	public Book(String name) {
		super();
		this.name = name;
		this.author = "Unknown";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + name + "]";
	}
		
}
