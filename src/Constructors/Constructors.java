package Constructors;

public class Constructors {

	
	   String name;
	    int age;

	    // Default constructor
	    public  Constructors() {
	        name = "John Doe";
	        age = 30;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // Creating an object using the default constructor
		Constructors person = new Constructors();
        person.display();
		 
	}
}