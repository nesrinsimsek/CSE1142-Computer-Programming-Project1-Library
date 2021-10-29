
public class Book {
	
	private int id;
	private String title;
	private Author author;
	private boolean borrowed;
	

	//no-arg constructor of Book class 
	public Book() {
		
	}

	
	//constructor of Book class with id, title, author parameters
	public Book(int id, String title, Author author) {
		setId(id);
		setTitle(title);
		setAuthor(author);
	}
	
	
	//constructor of Book class with id, title parameters
	public Book(int id, String title) {
		setId(id);
		setTitle(title);
	}

	
	//constructor of Book class with title parameter
	public Book(String title) {
		setTitle(title);
	}

	
	//getter method of the borrowed field
	public boolean isBorrowed() {
		return borrowed;
	}

	
	//getter method of the id field
	public int getId() {
		return id;
	}

	
	//setter method of the id field
	public void setId(int id) {	
		this.id = id;
		//try catch block throws exception if the id field is less than zero, 
		//catches the exception and prints a related warning 
		try {
			if(id < 0) throw new Exception();
		}
		catch (Exception ex){
			System.out.println("Id cannot be less than zero!");			
		}			
	}

	
	//getter method of the title field
	public String getTitle() {
		return title;
	}
	
	
	//setter method of the title field
	public void setTitle(String title) {
		this.title = title;
		//try catch block throws exception if the title field contains letters less than three
		//and catches the exception, prints a related warning
		try {
			if(title.length() < 3) throw new Exception();
		}
		catch (Exception ex){
			System.out.println("Title cannot have letters less than three!");			
		}
	}

	
	//getter method of the author field
	public Author getAuthor() {
		return author;
	}

	
	//setter method of the author field
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	//this method returns true if the book is not borrowed yet
	//returns false if the book is borrowed
	public boolean borrowed() {
		if(borrowed == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//this method returns false if the book is returned before
	public boolean returned() {
		return false;		
	}
	
	
	//prints the books' properties
	public String toString() {
		return("Book name is " + getTitle() + ", Author is " + author.getName());
	}	
	
}

