package oopS;

public class Class_Object {
	
	String color;
	String brand;
	void  drive()
	{
        System.out.println("The " + color + " " + brand + " is driving.");
	}
	void stop() {
        System.out.println("The car has stopped.");
    }
	

	public static void main(String[] args) {
		
		Class_Object mycar = new Class_Object();
		mycar.color="Red";
		mycar.brand="Honda";
		mycar.drive();
		mycar.stop();

	}

}
