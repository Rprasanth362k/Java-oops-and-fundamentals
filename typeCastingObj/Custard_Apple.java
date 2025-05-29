package typeCastingObj;

public class Custard_Apple extends Fruit{
	String Position;
	int custrad_Apple_varieties;
	public static void main(String[] args) {
		Fruit  fru = new Custard_Apple(); // upcasting only to use superclss method -->You cans see 1
		Custard_Apple cus= (Custard_Apple)fru; //downcasting  used to  both superclass and subclass method --> 2,3
		
		  
		fru.mybenifit();//1
		fru.Fruit="Sweet,Tasty,healthy";
		cus.fruittaste();//2
		cus.mybenifit();//3
		cus.Position="Queen";
		cus.custrad_Apple_varieties=7500;
		System.out.println("Fruit: "+fru.Fruit);
		System.out.println("Position: "+cus.Position);
		System.out.println("custrad_Apple_varieties: "+cus.custrad_Apple_varieties);
		
	}
	
	public void fruittaste()
	{
		System.out.println("my taste like butter+honey=wow." );
	}

}
