package astatic_this;

public class AStatic {
   String  nonstaticmember ="object";
  static String  staticmember ="class";

  
	public static void main(String[] args) 
	{
		
		
		
		
		AStatic obj2 = new AStatic();
		
		AStatic obj1 = new AStatic();
		obj1.instancemethod();
		System.out.println(obj1.nonstaticmember);
		int a=AStatic.staticmethod(5);//staticmethod(5);
		System.out.println(""+a);
		 System.out.println(staticmember );
		
	}
	 public  void instancemethod2() {
		instancemethod();
		System.out.println(nonstaticmember);
	    int a=AStatic.staticmethod(5);//staticmethod(5);
		System.out.println(""+a);
	    System.out.println(staticmember );
		 
		
	}
	public void instancemethod()
	 
	 {
	
	 }
	
	public static int  staticmethod(int a)
	{
		 
	return  a*a*a;
	}
	
	
	

}
