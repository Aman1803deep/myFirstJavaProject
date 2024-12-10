package ForLoop;

public class forLoopExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sumofnumbers = 0;
	        int n = 10; // Sum of first 10 natural numbers
	        
	        // Using a for loop to sum numbers from 1 to n
	        for (int i = 1; i <= n; i++) {
	        	sumofnumbers += i;  // Add the current value of i to sum
	        }

	        System.out.println("Sum of first " + n + " natural numbers is: " + sumofnumbers);
	}

}
