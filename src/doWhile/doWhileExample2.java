package doWhile;
 import java.util.Scanner;

public class doWhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number;

        // Do-while loop to ensure valid user input
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
            scanner.close();
        } while (number < 1 || number > 10); // Continue until the input is between 1 and 10

        System.out.println("You entered a valid number: " + number);
	}

}
