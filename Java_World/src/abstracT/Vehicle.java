package abstracT;

abstract public class Vehicle {

	public abstract void fuel();
	
	
	
	public void start()
	{
		System.out.println("starting ");
	}
	
	
	public  Vehicle()
	{
		System.out.println("abstract vehicle class constructor");
	}


public  static void display()
{
	System.out.println("Display the car from static");
}
public final void stop()
{
	System.out.println("Finally car stoping");
}

}