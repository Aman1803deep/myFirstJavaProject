package myFirstJavaProject;

public class myFirstClass {

	
	int date = 2024-11-16;
	String name = "Amandeep kaur";
	
	public void test()
	
	{
		System.out.println("Hello World:");
	}
	
	public static void main(String[] args) {
		
		myFirstClass obj1 = new myFirstClass();
		
		System.out.println("My name is: " + obj1.name);
		System.out.println("Today's date is: " + obj1.date);
		
		myFirstClass obj2 = new myFirstClass();
		
		obj2.test();
		
		
		
		
		
	}
		
	
}
