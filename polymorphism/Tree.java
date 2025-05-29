package polymorphism;

 public  class Tree {
	
	static String tree ="brancehs";
	
	 int max_age =150;
	static  int min_age =50;
	
	
	 public   void  structure()
	 {
		 System.out.println("Trees are  very Tall");
	 }
	 public  void fruit_tree()
	 {
		 System.out.println("fruit_tree: A fruit tree is a tree that produces edible fruits,"
		 		+ " such as apples, oranges, or mangoes. "
		 		+ "These fruits are typically consumed by humans or animals.");
	 }
	
	 public void non_fruit_tree()
	 {
		 System.out.println("Non_fruit_tree:  A non-fruit tree does not produce edible fruits.+"
		 		+ " These trees might produce seeds, cones,"
		 		+ " or flowers but are not cultivated for their edible produce."
		 		+ " Examples include pine, oak, or maple trees.");
	 }
	
	public static  void  benifits()
	{
		System.out.println(" Benifits: \n"
				+ "	{   Trees purify our air and combat climate change. ...\n"
				+ "    Trees provide housing to millions of species that protect us from disease. ...\n"
				+ "    Trees cool our streets and cities. ...\n"
				+ "    Trees protect against floods and water pollution. ...\n"
				+ "    Trees ease the mind during stressful times.");
	}
	
	
	public void structure(String  Tall)
	{
		System.out.println("Some Tress Tall"+Tall);
	}

}
