package Constructors;

public class Bike extends Vehicle {
	 
		    int speed = 80; // Instance variable for Bike

		    // Overriding the displaySpeed method

		    public void displaySpeed() {
		        System.out.println("Bike speed: " + speed + " km/h");
		    }
		    
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();   // Vehicle reference, Vehicle object
        Vehicle vehicle2 = new Car();       // Vehicle reference, Car object
        Vehicle vehicle3 = new Bike();      // Vehicle reference, Bike object

        // Displaying speed based on object type
        vehicle1.displaySpeed();  // Output: Vehicle speed: 60 km/h
        vehicle2.displaySpeed();  // Output: Car speed: 120 km/h
        vehicle3.displaySpeed();  // Output: Bike speed: 80 km/h
	}
		// TODO Auto-generated method stub

	}


