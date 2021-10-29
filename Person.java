
public class Person {
	
	private String name;
	private String birthDate = "-";
	private String birthPlace = "-";
	
	//no-arg constructor of Person class
	public Person() {
		
	}
	
	
	//constructor of Person class with name, birthDate, birthPlace parameters
	public Person(String name, int birthDate, String birthPlace) {
		setName(name);
		setBirthPlace(birthPlace);
		this.birthDate = birthDate + "";	
		//try catch block throws exception if the birthDate field is less than zero, 
		//catches the exception and prints a related warning 
		try {
			if(birthDate < 0) throw new Exception();
		}
		catch (Exception ex) {
			System.out.println("Birth date cannot be less than zero!");
		}		
	}
	

	//constructor of Person class with name, birthDate parameters
	public Person(String name, int birthDate) {
		setName(name);
		this.birthDate = birthDate + "";
		//try catch block throws exception if the birthDate field is less than zero, 
		//catches the exception and prints a related warning 
		try {
			if(birthDate < 0) throw new Exception();
		}
		catch (Exception ex) {
			System.out.println("Birth date cannot be less than zero!");
		}
	}

	
	//constructor of Person class with name parameter
	public Person(String name) {
		setName(name);
	}

	
	//getter method of the name field
	public String getName() {
		return name;
	}

	
	//setter method of the name field
	public void setName(String name) {
		this.name = name;	
		//try catch block throws exception if the name field contains letters less than three
		//and catches the exception, prints a related warning
		try {
			if(name.length() < 3) throw new Exception();
		}
		catch (Exception ex) {
			System.out.println("Name cannot have letters less than three!");
		}
	}

	
	//getter method of the birthDate field
	public String getBirthDate() {
		return birthDate;
	}

	
	//setter method of the birthDate field
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;		
	}

	
	//getter method of the birthPlace field
	public String getBirthPlace() {
		return birthPlace;
	}

	
	//setter method of the birthPlace field
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;	
		//try catch block throws exception if the birthPlace field contains letters less than three
		//and catches the exception, prints a related warning
		try {
			if(birthPlace.length() < 3) throw new Exception();
		}
		catch (Exception ex) {
			System.out.println("Birth place cannot have letters less than three!");
		}	
	}	
	
}
