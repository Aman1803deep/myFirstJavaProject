package breakTheLoop;

public class BreakStatementExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int counter = 0;
	        
	        while (true) {  // Infinite loop
	            counter++;
	            if (counter == 5) {
	                System.out.println("Counter reached 5, exiting loop.");
	                break;  // Exit the loop once counter is 5
	}
	        }
	}
}

