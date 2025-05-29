package constructor;

public class Singleton {
	private static Singleton instance;
	private String name;
	private Singleton(String name)
	{
		this.name=name;
	}
	public static Singleton getInstance(String name)
	{
		
		if (instance == null)
		{
			instance =new Singleton(name);
			
		}
		return instance;
	}
	public static Singleton createnew_Getinstace(String name)
	{
		
	    instance =new Singleton(name);
			return instance;
	}
	public String getName()
	{
		return name;
	}
}
