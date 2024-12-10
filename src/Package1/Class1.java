package Package1;

public class Class1 {

	 int age = 34;
	 String name = "Aman";

	 void eat() {

		System.out.println("I am in private");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 et = new Class1();
		et.eat();
		System.out.println(et.age);
		System.out.println(et.name);

	}

}
