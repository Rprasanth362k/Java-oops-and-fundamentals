package abstracT;

public class Kangiam_cow extends Cow {
	
	
	public Kangiam_cow(String name,String orgin,String dob)
	{
		super(name,orgin,dob);
		
	}
	

	public static void main(String[] args) {
		
   Kangiam_cow kc= new Kangiam_cow("shiva"," Kangiam_cow-countrybrid","09/06/200");// u can try upcasting &  downcasting.
   kc.eatgrass();
   
	}
     
	
	
	@Override
   protected void eatgrass()
	{
		System.out.println("i will eat grass");
		super.display();
		System.out.println("cow_age: "+super.age);
	}
	
}

