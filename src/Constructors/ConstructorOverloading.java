package Constructors;

public class ConstructorOverloading {

	String name;
    int age;

    // Constructor with one parameter
    public ConstructorOverloading(String name) {
        this.name = name;
        this.age = 0;  // Default age
    }

    // Constructor with two parameters
    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating objects using different constructors
		ConstructorOverloading animal1 = new ConstructorOverloading("Lion");
        animal1.display();  // Output: Name: Lion, Age: 0

        ConstructorOverloading animal2 = new ConstructorOverloading("Elephant", 10);
        animal2.display();
	}

}
