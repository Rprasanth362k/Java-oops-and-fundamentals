package inheritance;

public class Mycalculation extends Calculation {
      
	public static void main(String[] args) {
		
		Mycalculation obj1 =new Mycalculation ();
		int a=20,b=10;
		
		
		obj1.addition(a,b);
		obj1.subtration( a,b);
		obj1.multipication(a,b);

	}

	
	public void multipication(int x, int y)
	{
		 int z =x*y;
		System.out.println("multipication:  x*y="+z);
	}
}

