package continueTheLoop;

public class continueLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // Skip the current iteration when i is 5
            }
            System.out.println(i);
        }
    }
	}


