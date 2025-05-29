package abstracT;

final public class Honda extends Bike{
	int val;
	
	
	public Honda(String name)
	{   
		
		super("String");
		this.name=name;
		System.out.println("Child: child class constructor "+val);
	}

	public Honda(int val , int val2)
	{   
		super(100,100);
	
		System.out.println("Child: child class constructor "+val);
	}

	public Honda()
	{
		super();
	
		
		System.out.println("Child: default constructor. ");
	}
	public static void main(String[] args) {
		Honda ho = new Honda(100,200);
		Honda ho1 = new Honda();
		System.out.println(ho.getname());
		ho.setname("R.Prasanth-earlyOwl");
		System.out.println();
		ho1.fun();
	
	}
 public void fun()
   {
	   super.fun2();
   }
	@Override
	public  void fun2()// public  override method  should only public not any access specier 
	{
	System.out.println("hi");
	}
	//@Override
   void fun8()// defult method (superclass) to subclass method public,defalut,protected.final    not  to be private ,static ,abstract.
	 {
		System.out.println("hellow"); 
	 }
	public static void fun4() {
		
	}

}
/* abstract class have used to abstract keyword
 * abstract class may or may not have abstract method, if used to abstract method ,that abstract method class  extended subclass have  must define or use the abstract method
 * abstract class can not create object
 * 
 * 
 */

















































