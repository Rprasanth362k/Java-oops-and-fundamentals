package polymorphism;

public class Polymorpshism  {

	public static void main(String[] args) {
		
     Tree	mango_trees = new  Mango_Tree(); //upcasting
     Mango_Tree mango_tree = (Mango_Tree) mango_trees ; //downcating
     System.out.println(" max_age: "+mango_tree.max_age);
     System.out.println(" mango_Taste: "+mango_tree.mango_Taste);
     System.out.println("mango_varity: "+ Mango_Tree.mango_varity);
     mango_tree.structure();  //  overriding  method
     mango_tree.fruit_tree(); //  overriding  method
     mango_tree.fruit_taste(); // own method
     Mango_Tree.tasty_mango_type();// own static method for  Mango_Tree
     

     

	
	 Tree  oak_trees = new Oak_Tree();
	 Oak_Tree  oak_tree =  (Oak_Tree) oak_trees ;
	 System.out.println("for_human: "+oak_tree.for_Human);
	 System.out.println("Med_benifits: "+Oak_Tree.Med_benifits);
	 System.out.println("max_age: "+oak_tree.max_age);
	 oak_tree.structure();
	 oak_tree.non_fruit_tree();
	 Oak_Tree.medical_properties(15 ,"for_Human");
	 Oak_Tree.medical_properties("for_nature");
	 
	 
	}

}
