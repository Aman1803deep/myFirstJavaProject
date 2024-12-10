package Constructors;

public class ParameterizedConstructor {
	
	 String title;
	 String author;

	    // Parameterized constructor
	    public ParameterizedConstructor(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    public void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ParameterizedConstructor book = new ParameterizedConstructor("1984", "George Orwell");
	    book.display();
}
}