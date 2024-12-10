package ifElse;
import java.util.Scanner;

public class ifelseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Asking the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Using if-else to check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
	}

}
