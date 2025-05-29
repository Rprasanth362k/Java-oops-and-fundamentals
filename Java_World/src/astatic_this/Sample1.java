package astatic_this;
//invoke current class methods and construtors.
public class Sample1  {
	
	Sample1(int x)
	{
		this();
		System.out.println(x);
		
	}
	
	Sample1()
	{
	System.out.println("hellow simple 1");	
	}

	
	void n()
	{
		System.out.println("hellow n");
		m();
		this.m();
	}
	
	public void m()
	{
		System.out.println("hellow m");
	}
}
