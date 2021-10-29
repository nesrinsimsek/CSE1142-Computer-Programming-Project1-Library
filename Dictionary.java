
public class Dictionary extends Book {
	
	private int definitions;
	
	//no-arg constructor of Dictionary class
	public Dictionary() {
		super();
	}

	
	//constructor of Dictionary class with id, title, author, definitions parameters
	//takes id, title and author from the Book class
	public Dictionary(int id, String title, Author author, int definitions) {
		super(id, title, author);	
		setDefinitions(definitions);	
	}

	
	//constructor of Dictionary class with id, title, definitions parameters
	//takes id and title from the Book class
	public Dictionary(int id, String title, int definitions) {
		super(id, title);			
		setDefinitions(definitions);	
	}

	
	//getter method of the definitions field
	public int getDefinitions() {
		return definitions;
	}

	
	//setter method of the definitions field
	public void setDefinitions(int definitions) {
		this.definitions = definitions;
		//try catch block throws exception if the definitions field is less than zero, 
		//catches the exception and prints a related warning 
		try {
			if(definitions < 0) throw new Exception();
		}
		catch (Exception ex){
			System.out.println("Definitions cannot be less than zero!");			
		}
	}

	
	//prints the dictionary's properties
	public String toString() {		 
		 return("Dictionary Name is " + getTitle() + ", definitions: " + definitions);		 
	}
	
}

