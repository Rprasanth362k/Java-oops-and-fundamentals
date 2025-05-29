package clas_an_obj;

public class Instance_Method {
	int sum, sum1;

	public static void main(String[] args) {
		Instance_Method obj1 = new Instance_Method();
		obj1.method("instance");
		System.out.println("The sum add of "+obj1.add(10,10));
		int sum1=obj1.multiple(10,10);
		System.out.println("The sum multiple of "+sum1);

	}
	public void method(String name)
	{
		System.out.println(" I am the "+name+" method. ");
	}
	public int add(int number1,int number2)
	{
		sum =number1+number2;
		return sum;
	}
	public int multiple(int number3,int number4)
	{
		sum1 =number3*number4;
		return sum1;
	}

}
