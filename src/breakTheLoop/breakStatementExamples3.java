package breakTheLoop;

public class breakStatementExamples3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i is 5, breaking the loop");
                break;  // Exit the loop when i equals 5
            }
            System.out.println("i = " + i);
        }
	}

}
