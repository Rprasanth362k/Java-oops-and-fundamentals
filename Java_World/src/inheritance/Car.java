package inheritance;

public class Car extends Vehicle {
	
	
	
	public static void main(String[] args)
	
	{     Car car =new Car();
	 
		  car.speed_break();
		
		Vehicle feature = new Vehicle(); 
		Vehicle.fuel_tank();   
		
		feature.horn(); 
		feature.engine();
		feature.fuel_tank();
		
		
	}
	
	
	public static void  blueprint()
	{
		System.out.println("Car: Blue print of car");
		
	}
	
	
}