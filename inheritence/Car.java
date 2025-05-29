package inheritence;

public class Car extends Vehicle{
	String model;
	Car (int speed,String model)
	{
		super(speed);
		this.model=model;
        System.out.println("Car constructor: model set to " + model);
	}
	
	void display()
	{
        System.out.println("Car speed: " + speed + ", Model: " + model);
	}

	public static void main(String[] args) {

		Car c1 = new Car(100,"Honda");
		c1.display();
	}

}
