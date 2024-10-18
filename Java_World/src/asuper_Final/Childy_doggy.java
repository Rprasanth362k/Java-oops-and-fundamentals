package asuper_Final;

public class Childy_doggy  extends Agent_Mummy_Dog {
	
	String name;
	int batch;
	
	
/*	
	public Childy_doggy()
	{
		super();
		System.out.println("Thirisha Got agent job");
	}
*/	
	public  Childy_doggy(String name,int batch,String gender)
	{   
		super(name,batch);
		
		//System.out.println(name+batch);
	}
	

	public static void main(String[] args) {
		
		// Childy_doggy chil1 = new  Childy_doggy();
		 Childy_doggy chil = new  Childy_doggy("Thirisha",20,"female");
		
		//System.out.println(super.skill());
		//cannot user super in static method and static variables
		
		Agent_Mummy_Dog.Rewards();
		System.out.println("Role: "+Agent_Mummy_Dog.specalist);   
		chil.display();
	}
	
	
	void display()
	{   System.out.println("color: "+super.color);
		// super using instance variable
		super.skill(); //super using instance method.
	}
	
	

}
/*
super is for (object)instance-related tasks, like accessing instance methods and variables of a parent class.
when use super note to child extend parent.
*/