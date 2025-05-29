package abstracT;

public class Car extends  Vehicle {
	String fuel;
	
  public Car(String fuel)
  { super();
	  this.fuel=fuel;
  }
	public static void main(String[] args) {
		
		
		 Car car = new Car("petrol");
		 car.start();
		
		 car.fuel();
		 car.airconditonare();
		 Vehicle.display();
		 car.stop();
		 

	}
	@Override
	public void fuel()
	{
		System.out.println(fuel+ "is a car fueal");
	}
	public void airconditonare()
	{
		System.out.println("car airconditonare is on");
	}

}
