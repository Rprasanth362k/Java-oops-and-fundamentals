package polymorphism;

public class Oak_Tree  extends Tree{
	static int Med_benifits = 15;
	 String for_Human = "oak_Tree";
	
	 @Override
	 public   void  structure()
	 {
		 System.out.println(" Oak_Tree: Trees are  very Tall");
	 }
	 
	 @Override
	 public void non_fruit_tree()
	 {
		 System.out.println("  non_fruit_tree:  A non-fruit tree does not produce edible fruits.+"
		 		+ " These trees might produce seeds, cones,"
		 		+ " or flowers but are not cultivated for their edible produce."
		 		+ " Examples include pine, oak, or maple trees.");
	 }
	 public static void medical_properties(int Med_benifits ,String for_Human )//overloading
	 {
		 System.out.println("\"  medical_properties: Med_benifits for_Human: Reduces Swelling: Oak bark can help reduce inflammation.\n"
		 		+ "Stops Bleeding: It helps tighten tissues and reduce bleeding.\n"
		 		+ "Soothes Digestion: Oak bark tea can help with diarrhea.\n"
		 		+ "Heals Skin: It can be used to treat skin problems like rashes.\n"
		 		+ "Fights Infections: Oak bark has mild antibacterial properties."+" Med_benifits: "+Med_benifits+" for_Human: "+for_Human );
	 }
	 public static void medical_properties(String for_nature) //overloading
	 {
		 System.out.println("\"   Med_benifits for_nature   Wildlife Habitat: They provide homes and food for many animals.\n"
		 		+ "    Air Quality: They help clean the air by absorbing carbon dioxide.\n"
		 		+ "    Soil Health: Their leaves enrich the soil when they decompose.\n"
		 		+ "    Erosion Control: Their roots help prevent soil erosion.\n"
		 		+ "    Shade: They offer cooling shade, benefiting the environment around them.\n"
		 		+ "\n"
		 		+ "");
	 }
}
