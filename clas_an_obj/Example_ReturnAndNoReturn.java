public class Example_ReturnAndNoReturn {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Example_ReturnAndNoReturn obj1 = new Example_ReturnAndNoReturn();
		int c=obj1.method1(101,102);
		
		System.out.println("Num1+Num2="+c);
	}
	
	
	public int   method1 (int num1 ,int num2)
	{
		int c = num1+num2;
		
		return c;
		
		
	}

}
