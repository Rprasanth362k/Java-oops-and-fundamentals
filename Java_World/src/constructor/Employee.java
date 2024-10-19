package constructor;

public class Employee {
	private String name;
	private int age;
	private Employee (String name,int age)
	{
		this.name=name;
		this.age=age;
	
	}
	public static Employee job_Eligable_Age(String name,int age) {
		if (age >18)
		{
			return new Employee(name,age);
		}
		else
		{
			System.out.println("employee greate the 18 only allow");
			return null;
		}
		
	}
	public String getname()
	{
		return  name;
	}
	public int  getage()
	{
		return  age;
	}

}
