package interfacE;

public class Dragon implements Armrs {

	
	public static void main(String[] args)
	{
		 Dragon  dr =new Dragon();
		 
		 dr.chestplate();
		String name =dr.headpies("protecter");
		dr.leg_and_Claw_Guards(name);
	    dr.necktplate();
	
	}
	
	public String headpies(String name)
	{
		System.out.println("A protective helmet with horns exposed, possibly enchanted with vision-enhancing properties for tracking enemies.");
		return name;
	}	
		
	public	 void  chestplate()
		{
			System.out.println("chest  Large , thick plates covering the dragon's chest and abdomen, with a sleek, aerodynamic design to minimize impact on flying.");
		}
		
	public	void necktplate()
		{
			System.out.println("neck Large, thick plates covering the dragon's chest and abdomen, with a sleek, aerodynamic design to minimize impact on flying.");
		}


}
