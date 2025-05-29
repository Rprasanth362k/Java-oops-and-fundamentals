package instaceof;
//downcasting_with_instanceof

public class Pulzar extends Bike {

	 static void main(String[] args) {
		Bike dow = new Pulzar();
		Pulzar.method1(dow);

	}
	
	static void method1(Bike dow)
	{
		if ( dow instanceof Pulzar )
		{  //child childreference  =(childname)parentreference;
			Pulzar dow1=(Pulzar)dow; 

		 //   Downcasting has to be done externally and due to downcasting a child object can acquire the properties of the parent object. 
			System.out.println("perfomed downcating");
		}
	}

}





// without instace of downcasting


/*parent class
 * 
 * package  downcasting;
 * class  Parent 
 * {
 * }
 * 
 * 
 * 
 * 
 *childclass
 * 
 * 
 * class Child 
 * {
 * public static void main(String[] args)
 * {
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
