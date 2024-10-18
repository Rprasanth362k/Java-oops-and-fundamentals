package inheritance;
//using_super_keyword_invoking_superclass_constructor
public class Subclass extends Superclass {
	
public	Subclass(int age)
{
	super(age);	
}

	public static void main(String[] args) {
		Subclass obj1 = new Subclass(20);
		
		obj1.displayage();
	}

}
