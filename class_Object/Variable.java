package class_Object;

 class Variable {
	
int instancevar=10;
static int staticVar =20;

	public static void main(String[] args) {
//local variable must be initialized		
	int localVar=30;
	System.out.println("Local variable"+localVar);
	System.out.println("Static Varibale:"+staticVar);
	//accessing instace variable -> directely not allowed 
	//System.out.println("Instace variable:"+obj1.instancevar);
	
	Variable obj1= new Variable();
	System.out.println("Instace variable:"+obj1.instancevar);
    obj1.instanceMethod();

	
	
	
}
 static void staticMethod()
	{
		System.out.println("inside static method");
		System.out.println("Static Varibale:"+staticVar);
        Variable obj1= new Variable();
		System.out.println("Instace variable:"+obj1.instancevar);
	}
 void instanceMethod()
	{
		System.out.println("inside instace method");
	
		staticMethod();
		System.out.println("Static Varibale:"+staticVar);
		System.out.println("Instace variable:"+instancevar);

	}
}