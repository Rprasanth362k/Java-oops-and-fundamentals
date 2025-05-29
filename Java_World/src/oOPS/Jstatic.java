package oOPS;

public class Jstatic {

	static int count = 1; // static variable
	
	public static void main(String[] args) {

		Jstatic.showcount(); // no need to create  an object.
		
	}
	static void showcount() //static method
	{
		System.out.println("Count: "+count);
	}

}
