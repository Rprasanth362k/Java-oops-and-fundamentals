package polymorphism;

public class Car extends Vehicle{
	
	//@Override
	public void start()
	{
		super.start();
		System.out.println("Car is starting with a key");
	}
	
	
	public void openroof()
	{
		System.out.println("opening car roof");
	}

}
