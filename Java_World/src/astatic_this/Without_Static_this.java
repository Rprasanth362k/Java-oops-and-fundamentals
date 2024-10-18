package astatic_this;

public class Without_Static_this {
 int count =0;
 
 Without_Static_this ()
{
	 count++;
	 System.out.println(count);
	
}
 
	public static void main(String[] args) {
		
		
		Without_Static_this  obj1 = new Without_Static_this();
	Without_Static_this  obj2 = new Without_Static_this();
	
	// Java static property is shared to all objects.
	// It makes your program memory efficient (i.e it saves memory).
	// Program of without static variable  
		
	}

}
