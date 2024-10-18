package variables;

class AVariable
{
	String a ="prasanth"; // instance variable
	static  int a1=10;    //  global  static variable
	
	public static void main(String args[])
	{
		
		AVariable  var = new AVariable();
		int sum=var.method1();
		System.out.println("sum: "+sum);
		
	}
	public int  method1()
	{
		int local1 = 10; // local variable 
	int  local2 = 20; // local variable  (or)
	//	int local1=10,local2=20;
	 int sum  = local1+local2;
	      return sum;
	}
	
	
	
}