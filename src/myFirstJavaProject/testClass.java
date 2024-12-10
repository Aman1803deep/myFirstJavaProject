package myFirstJavaProject;

public class testClass {

	
	public void addition(int a, int b )
	
	{
		int c= a+b;
		System.out.println("addition of numbers:" + c )	;
	}
	
	
	public void division(int a, int b )
	
	{
		int c= a/b;
		System.out.println("division of numbers:" + c )	;
	}
	
	
	public void Multiply(int a, int b )
	
	{
		int c= a*b;
		System.out.println("multiplication of numbers:" + c )	;
	}
	
	
	public void substraction(int a, int b )
	
	{
		int c= a-b;
		System.out.println("substraction of numbers:" + c )	;
	}
	
	public static void main(String[] args) {
		 int a= 10;
		 int b=2;
		testClass obj = new testClass();
		obj.addition(a, b);
		obj.Multiply(a, b);
		obj.division(a, b);
		obj.substraction(a, b);
	}

}
