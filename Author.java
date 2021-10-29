
public class Author extends Person {
	
	private String publisher;
	
	//no-arg constructor of Author class
	public Author() {
		super();	
	}
	
	
	//constructor of Author class with name, publisher, birthDate parameters
	//it takes name and birthDate from Person class
	public Author(String name, String publisher, int birthDate) {
		super(name,birthDate);
		setPublisher(publisher);
	}

	
	//getter method of the publisher field
	public String getPublisher() {
		return publisher;
	}

	
	//setter method of the publisher field
	public void setPublisher(String publisher) {
		this.publisher = publisher;
		//try catch block throws exception if the publisher field contains letters less than three
		//and catches the exception, prints a related warning
		try {
			if(publisher.length()<3) throw new Exception();
		}
		catch (Exception ex) {
			System.out.println("Publisher cannot have letters less than three!");
		}	
	}
	
}
