package inheritance;

public class Tata_car extends Car  {
	
	// public class  Tata_car extends Car,Vechicle  multiple inheritance not support in h java.
 public static void main(String[] args)
 {
	 
	bestcar();// Tata_car.bestcar();
	 Vehicle feature1 =new Vehicle();
	 Tata_car feature = new Tata_car();
	 feature.lowest_prce(); // own method
	 Car.blueprint();// parent class method.either(child and parent class ) same package not need to inherit and different package need inheritance
	 Car.fuel_tank(); //grand parent => parent => child.
	 Vehicle.fuel_tank(); //grand parent => grant_child
	 feature.horn();
	 feature1.horn();
	 }
	
	public static void  bestcar()
	{
		System.out.println("Tata_car: Best car in the India");
	}

	
	
	public void lowest_prce()
	{
		System.out.println("Tata_car: Lowest_price in the India");
	}
}
