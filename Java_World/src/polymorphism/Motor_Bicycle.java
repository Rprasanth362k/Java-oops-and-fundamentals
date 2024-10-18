package polymorphism;

public class Motor_Bicycle extends Cycle{
	
	int speed =50;

	public static void main(String[] args) {
		Cycle mb = new Motor_Bicycle();
		System.out.println(mb.speed);

		   
	}
	

}
