package whileLoop;

import java.util.Scanner;

public class whileLoopExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int number;

	        // loop to ensure valid user input
	        System.out.print("Enter a number between 1 and 10: ");
	        number = scanner.nextInt();

	        while (number < 1 || number > 10) {
	            System.out.print("Invalid input, Please enter a number between 1 and 10: ");
	            number = scanner.nextInt(); // Keep asking until valid input is given
	            scanner.close();
	        }

	        System.out.println("You entered a valid number: " + number);
	    }
	}

