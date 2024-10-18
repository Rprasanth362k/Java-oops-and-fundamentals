package polymorphism;

public class PolymorphismInheritanceExample {
	
	
	

	public static void main(String[] args) {
	//  Polymorphism (Runtime - Method Overriding)
		Vehicle vehicle1 = new Car(); // Parent reference to Child object upcasting , // call or access  parent properties and attributes = >method and variable
	//	vehicle1.start();
		
		Car  myvehicle =  (Car) vehicle1;// // call or access own and parent method and variable
		
		
		Vehicle vehicle2 = new Bike(); // Parent reference to Child object upcasting
		Bike   mycehicle = (Bike) vehicle2;// call or access own and parent method ,and variable
		
		
		vehicle1.start();// Car's start method is called (Polymorphism)
		
		vehicle2.start(); // Motorcycle's start method is called (Polymorphism)

		
		
	 //  Inheritance (Parent properties in Child class)
		Car myCar = new Car();
		myCar.start();  // Inherited and overridden method from Vehicle
		myCar.openroof();// Child-specific method
		
		
		
		Bike  mybike = new Bike();
		
		mybike.start(); // Inherited and overridden method from Vehicle
		mybike.wheelie(); // Child-specific method
		
		// Compile-time Polymorphism (Method Overloading)
		calculateSpeed(60); // Method with one argument
		calculateSpeed(60,2);  // Overloaded method with two arguments
		
	
	}
	// Example of Compile-time Polymorphism (Method Overloading)
    public static void calculateSpeed(int speed) {
        System.out.println("Speed is: " + speed + " km/h");
    }

    public static void calculateSpeed(int speed, int time) {
        System.out.println("Speed is: " + speed + " km/h, Time taken: " + time + " hours");
        
       
    }
   

}
