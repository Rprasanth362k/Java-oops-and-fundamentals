package oOPS;

public class JNon_static {

	
     int  count =0; // non _ static  variable 
  
	public static void main(String[] args) {
		
		JNon_static  obj = new JNon_static(); // create and object
		
		obj.displayNumber(); // call non_ static method
	}
		void displayNumber () //non_static method
		{
		System.out.println("Count"+count);
		}

}
