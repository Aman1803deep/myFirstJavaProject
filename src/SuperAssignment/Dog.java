package SuperAssignment;

public class Dog extends Animal {

	
      Dog() {
	        System.out.println("I am in dog class");
	    }
      
      public void eat() {
    	  System.out.println("Dog eat");
    	  super.eat();
    	  System.out.println(super.Breed);
      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog dg = new Dog();
     dg.eat();
     
	}

}
