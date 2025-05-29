package stati_c_DynamicBindig;

public class Ak_47 extends Gun {
	String Type ;
	
	void feature()
	{
	
		System.out.println("Semi-automatic\n"
				+ "- Magazine-fed\n"
				+ "- Versatile for various uses");
	}
	  @Override
    public void gunPurpose()
	 {
		 System.out.println("Gun is a weapon that is used for shooting-unwanted object in theworld");
	 }
	
	static void legalto_Use()
	  {
		 System.out.println("Legal to use otherwise Offence"); 
	  }

	

}
