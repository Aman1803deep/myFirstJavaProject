package Constructors;

public class CompileTimePolymorphism {
	   
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	    public double add(double a, double b) {
	        return a + b;
	    }
	        
	public static void main(String[] args) {

		CompileTimePolymorphism calc = new CompileTimePolymorphism();

        System.out.println("Sum of 2 integers: " + calc.add(10, 20));  // Output: 30       
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));  // Output: 60
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.5));  // Output: 31.0
	}

}
