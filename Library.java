import java.util.*;
public class Library  {
	
	private String address; 
	private ArrayList<Book> books = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();
	
	//constructor of Library class with address parameter
	public Library(String address) {
		setAddress(address);	
	}
	
	
	//prints the opening hours for libraries
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9 am to 5 pm.");	
	}
	
	
	//prints the address of libraries
	public void printAddress() {
		System.out.println(address);		
	}
	
	
	//adds the book which is created by the user into the books arraylist
	public boolean addBook(Book book) {
		return books.add(book);	
	}
	
	
	//adds the customer which is created by the user into the customers arraylist
	public void addCustomer(Customer customer) {
		customers.add(customer);		
	}
	
	
	//this method manages the borrowing book process
	public void borrowBook(String bookName, String personName) {
		int customerExistsHaspersonName = 0; //means the personName doesn't match with the name of any customer,
		                                   //so there is no such customer
		
		//checks if there exists any customer whose name matches with personName
		for(Customer object:customers) {   	
			if(object.getName().equals(personName)) {
				customerExistsHaspersonName = 1; //means the personName matches with the name of any customer
				
				int bookExistsHasbookName = 0; //means the bookName doesn't match with the name of any book,
											 //so there is no such book
				
				//checks if there exists any book has name matches with personName
				for(Book item:books) {  				
					if(item.getTitle().equals(bookName)) {
						bookExistsHasbookName = 1; //means the bookName matches with the name of any book
						
						if(!item.isBorrowed()) { //if the book isn't borrowed before, it is borrowed
							if (!object.isBorrowABook()) {	//if the customer didn't borrow any book before, s/he borrows					        
								System.out.println(personName+ " succesfully borrowed "+bookName+".");
								object.setBorrowABook(true); //the customer is accepted that s/he borrowed a book
						        object.setBorrowedBook(item); //the book is matched with the customer who borrowed it
								books.remove(item);	//the borrowed book is deleted from the books arraylist
								item.borrowed(); //means the book is borrowed and returns false
							}						
							
							else { //if the customer borrowed any book before, s/he cannot borrow again, prints a warning
								System.out.println("Sorry, " + personName + " already borrowed a book");
							}
						}
						break;				
					}			
				}														
				if(bookExistsHasbookName == 0) { //if the bookName doesn't match with the name of any book, prints a warning
					System.out.println("Sorry, this book is not in our catalog");
				}				
				break;
		   }         
		}	
		if(customerExistsHaspersonName == 0) { //if the personName doesn't match with the name of any customer, prints a warning
			System.out.println("Sorry, "+ personName + " is not a customer");
		}
	}
					
	
	//this method manages the returning book process
	public void returnBook(String personName) {
		int customerHaspersonNameForReturningBook = 0; //means the personName doesn't match with the name of any customer,
        											 //so there is no such customer
		
		//checks if there exists any customer whose name matches with personName	
		for(Customer object:customers) {	 
			if(object.getName().equals(personName)) {
				customerHaspersonNameForReturningBook = 1; //means the personName matches with the name of any customer
				
				if(object.isBorrowABook()) { //if the customer borrowed any book before, s/he returns
					System.out.println(personName + " successfully returned " + object.getBorrowedBook().getTitle());
					
					Book returnedBook = new Book(object.getBorrowedBook().getId(), object.getBorrowedBook().getTitle(),
							object.getBorrowedBook().getAuthor()); //creates a book object for the book which is returned
					
					returnedBook.returned(); //means the book is returned and returns false
					books.add(returnedBook); //adds the returned book into the books arraylist
					object.setBorrowABook(false); //the customer is accepted that s/he dind't borrow a book
				}				
				
				else { //if the customer didn't borrow any book before s/he cannot return, prints a warning
					System.out.println("Sorry, " + personName + " did not barrow a book");
				}
				break;
		    }	        	   
	    }		
		if (customerHaspersonNameForReturningBook == 0) { //if the personName doesn't match with the name of any customer, 
														//prints a warning	
			System.out.println("Sorry, " + personName + " is not a customer.");
		}		
	}
	
	
	//prints the books which is left in the library
	public void printAvailableBooks () {		
		if (!books.isEmpty()) {
			for (int i = 0; i < books.size(); i++) {			
					System.out.println(books.get(i).toString());					
			}
		} 
		else {
			System.out.println("No book in catalog");
		}
		System.out.println();
	}
	
	//getter method of the books field
	public ArrayList<Book>getBooks(){
		return books;		
	}
	
	
	//getter method of the customers field
	public ArrayList<Customer>getCustomers(){
		return customers;		
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
			if(address.length() < 3) throw new ArithmeticException();
		}
		catch (ArithmeticException ex) {
			System.out.println("Address cannot have letters less than three!");
		}
	}

}
