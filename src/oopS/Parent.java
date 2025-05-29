package oopS;

public class Parent {
  int  num1;
   int num2;
   static int  num3;
  
	Parent(int num1,int num2,int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	void numInfo()
	{
		System.out.println(num1+num2+num3);
	}
	public static void main(String[] args) {
    Parent obj1 = new Parent(10,20,30);
    obj1.numInfo();
	}

}
