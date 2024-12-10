package Constructors;

public class ParameterizedConstructor2 {

	double length;
    double width;

    // Constructor with two parameters
    public ParameterizedConstructor2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor2 rectangle = new ParameterizedConstructor2(5.0, 3.0);
        rectangle.display();  
	}

}
