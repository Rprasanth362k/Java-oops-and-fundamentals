package abstracT;



/*Why And When To Use Abstract Classes and Methods?

To achieve security - hide certain details and only show the important details of an object
 * 
 * 
 * 
 * 
 */

abstract public class Cow {
	private String name;
	
	private String  orgin; 
	private String  dob ;
	int age=10;
	
	
	public Cow (String name,String orgin,String dob)
	{
		this.name=name;
		this.orgin=orgin;
		this.setDob(dob);
		
	}
	
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getorgin()
	{
		return orgin;
		
	}
	
	public  void setorgin(String orgin)
	{
		this.orgin=orgin;
	}
	
   public String getDob() {
	return dob;
}


public void setDob(String dob) {
	this.dob = dob;
}

	
	
 protected	abstract void eatgrass();


	public void display()
	{
		System.out.println("Name: " +name+", orgin: " +orgin+", dob: "+dob);
	}
	

}
