package interfacE;
 interface Armrs {
	  int var1 =10;//abstract variable //
	String infinity = "infinity";
	//default  int val=10; //in a variable explicity do not mention becuse implicty public static final
	public static final String name = "Dark_DANGER_Drago";
	  public static final    String power    =infinity;             
	 
	  final int age = 0;

	
	
  	 String headpies(String name);
	
		
	public  void  chestplate();  // abstract method.
	public  void  necktplate(); // abstract method.
	  default String  leg_and_Claw_Guards(String armor)
    {
    	armor="protector";
    	System.out.println("Reinforced armor around the legs, with spikes near the claws for additional combat ability."+armor);

    	return armor;
    }
    public  static String spine_Armor(String num)
    {   num="wEAPON";
    System.out.println("Spine_Armor: Spikes or blades running down the back, offering protection and acting as weapons."+num);
		return num;
    	
    }
   // default   void  magic_Shield() {
	//}
    public  static int all_Armors_bag(int armor_count_automaticfit)
    {   armor_count_automaticfit=1000000000;
    System.out.println("Spine_Armor: Spikes or blades running down the back, offering protection and acting as weapons."+ armor_count_automaticfit);
		return armor_count_automaticfit;
    	
    }

}
//mutable - u can change the its content.மாறக்கூடிய
//immutable -once it is set ,it stays the same.மாறாத
 
 //explicity -தெளிவு.
 /*Explicitly: Something you specify clearly in the code. Example: When you declare a type, or use a modifier like public or private in Java.
  * 
  * 
  */
// implicity-மறைமுகம்.
 