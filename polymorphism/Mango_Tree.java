package polymorphism;

public class Mango_Tree extends Tree  {
	String mango_Taste="Butter+Honey";
       static int  mango_varity =600;
	 @Override
	 public   void  structure()
	 {
		 System.out.println(" Mango_Tree: Trees are  Tall");
	 }
	  @Override
	 public  void fruit_tree()
	 {
		 System.out.println(" \" Benifits: A fruit tree is a tree that produces edible fruits,"
		 		+ " such as apples, oranges, or mangoes. "
		 		+ "These fruits are typically consumed by humans or animals.");
	 }
	  

	
       public static void tasty_mango_type()
       {
    	   System.out.println("\" Tasty_mango_type:   Alphonso: Sweet and creamy.\n"
    	   		+ "    Kesar: Sweet with bright orange color.\n"
    	   		+ "    Langra: Tangy and greenish-yellow.\n"
    	   		+ "    Dasheri: Sweet and aromatic.\n"
    	   		+ "    Tommy Atkins: Firm and mildly sweet.\n"
    	   		+ "    Haden: Sweet and tart.\n"
    	   		+ "\n"
    	   		+ "");
       }
       public  void fruit_taste()
  	 {
  		 System.out.println(" Taste: Butter+Honey");
  	 }
  	  

}



// method overloading within class same method  name  different  parameter as method overloading. // compile time  polymrphism
//method overriding  same method  name  same parameter as method overriding  // runtime polymrphism