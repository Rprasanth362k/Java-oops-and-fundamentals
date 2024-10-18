package typeCastingObj;

public class Mango extends Fruit{
	String Position;
	int mango_varieties;

	public static void main(String[] args) {
		
           Fruit fru = new Mango();  // Upcasting: Fruit reference holds a Mango object
           // fru can access methods from Fruit but not Mango-specific methods or attributes.upcasting -parent object behave as child object
           
           Mango man = (Mango)fru; //// man can now access both Fruit and Mango-specific methods and attributes
        //   Mango  ngo = (Mango) new Fruit();
           
         //  Mango ngo1 = new  Fruit();
        
           
           fru.Fruit="Sweet,Tasty,healthy";
           fru.mybenifit();
           man.mangotest();
           // fru.Position="King"; notright
           man.Position="King of Fruit";
           man.mango_varieties=500 ;
            }

	
public void mangotest(){
	System.out.println("Mango-->sweater then honey testy in mango");
	
	
}
}

/*
Mango ngo = (Mango) new Fruit(); 
// Invalid downcasting: This will throw a ClassCastException at runtime
// A Fruit object cannot be cast to a Mango because not all Fruits are Mangoes

Mango ngo1 = new Fruit(); 
// Compilation error: You cannot directly assign a Fruit object to a Mango reference
// The types are incompatible, so this line won't compile
*/