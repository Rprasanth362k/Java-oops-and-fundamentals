package oopS;

public class SimpleConstructor {
	//Explicitly you created constructor now ,no more invoked java provide default constructor
	SimpleConstructor()
	{
		System.out.println("Vankam da mapla Thiruttani irunthu");
	}

	public static void main(String[] args) {
		System.out.println("The main() method ");
		//creating a class's object, that will invoke the constructor.
		SimpleConstructor obj1 = new  SimpleConstructor();
		

	}

}
