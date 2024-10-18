package abstracT;




abstract  class Bike {
 String name="hellow";
 static int age =10;
 final String dob=")3/06/2000";
 private String bag= "Chips";
 public  String bottol="water";
	 int val1=10;
protected	 int val2;
// only variable should => public private, protected,default,static ,final, not to be	abstract variable.
	
 public  Bike(int val1,int val2) {
	 this.val1=val1;
	 this.val2=val1;
	 System.out.println("Parent: Parmaterised constructor"+val1);
 }
 public Bike()
 {
	System.out.println("Parent: Default constructor"); 
 }
 public Bike(String name)
 {
	 this.name=name;
	System.out.println("Parent: Default constructor"); 
 }
 public abstract void fun();
 
	
	public void fun2() {
		System.out.println(" abstrrac method inside called ");
	}
	
	public String getname()// getter only  return
	{
		return name;
	}
	public void setname(String setname) //setter  not return
	{
		this.name=setname;
	}
	
// void fun3();
 
	 public  void sam1() {
		 
	 }
	 
	 void fun3(){
		 
	 }
	 


// public static void fun4() static method can not override.

 
 //private void fun4()
 {
	 
 }
}
// can have abstract variable.// object value gived sub ,store and for constractor val.
// constructor overriding
//can without abstract class can have abstract method 
// support single inherritance, multilevel and hiercheracal  inheritance ? multiple to inteface achive.

//Does not support multiple inheritance (one parent class only).
