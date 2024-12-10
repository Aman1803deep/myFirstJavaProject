package ForLoop;

public class forLoopExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int number = 2;
	      int factorial = 1;

	        //  loop to calculate factorial
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;  // Multiply the current value of i with factorial
	        }

	        System.out.println("Factorial of " + number + " is: " + factorial);
	}

}
