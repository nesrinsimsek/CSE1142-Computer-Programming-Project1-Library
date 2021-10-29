
public class Customer extends Person {
	
	private String address = "-";
	private Book borrowedBook;
	private boolean borrowABook;
	
	//no-arg constructor of Customer class
	public Customer() {
		super();
	}
	
	
	//constructor of Customer class with name, birthPlace, birthDate, address parameters
	//takes name, birthDate and birthPlace from Person class
	public Customer(String name, String birthPlace, int birthDate, String address ) {
		super(name, birthDate, birthPlace);	
		setAddress(address);		
	}
	
	
	//constructor of Customer class with name, birthDate, address parameters
	//takes name and birthDate from Person class
	public Customer(String name, int birthDate, String address) {
		super(name, birthDate);	
		setAddress(address);		
	}
	
	
	//constructor of Customer class with name, address parameters
	//takes name from Person class
	public Customer(String name, String address) {
		super(name);		
		setAddress(address);				
	}
	

	//constructor of Customer class with name, birthDate parameters
	//takes name and birthDate from Person class
	public Customer(String name, int birthDate) {
		super(name, birthDate);		
	}
	

	//constructor of Customer class with name parameter
	//takes name from Person class
	public Customer(String name) {
		super(name);	
	}
	

	//getter method of the address field
	public String getAddress() {
		return address;
	}
	

	//setter method of the address field
	public void setAddress(String address) {
		this.address = address;
		//try catch block throws exception if the address field contains letters less than three
		//and catches the exception, prints a related warning
		try {
			if(address.length() < 3) throw new Exception();
		}
		catch (Exception ex) {
			System.out.println("Address cannot have letters less than three!");
		}
	}
	

	//getter method of the borrowedBook field
	public Book getBorrowedBook() {
		return borrowedBook;
	}
	
	
	//setter method of the borrowedBook field
	public void setBorrowedBook(Book borrowedBook) {
		this.borrowedBook = borrowedBook;
	}
	
	
	//getter method of the borrowABook field
	public boolean isBorrowABook() {
		return borrowABook;
	}
	
	
	//setter method of the borrowABook field
	public void setBorrowABook(boolean borrowABook) {
		this.borrowABook = borrowABook;
	}
	
	
	//prints the customers' properties
	public String toString() {
		 return("Name: "+ getName() + ", Birth Date: " + getBirthDate() + ", Birth Place: " + getBirthPlace() + 
				 "\nAddress: "+address);		  
	}
	
}

