package oopS;

public class Demo_StaticandNonstatic {
	
	static int x =101;
			int y =102;
			
			
		
			
			public static void staticMethod()
			{
				System.out.println(x);
				Demo_StaticandNonstatic obj1 = new Demo_StaticandNonstatic();
				System.out.println(obj1.y);
			}
			public void instanceMethod()
			{
				System.out.println(x);
				System.out.println(y);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo_StaticandNonstatic obj1 = new Demo_StaticandNonstatic();
		 staticMethod();
		 // instanceMethod();
		 obj1.instanceMethod();

	}

}
