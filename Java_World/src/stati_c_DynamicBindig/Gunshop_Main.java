package stati_c_DynamicBindig;

public class Gunshop_Main {

	public static void main(String[] args) {
		
		
		Gun ref1 =  new Ak_47();// upcsting
		
		
		//Dynamic binding
		ref1.gunPurpose();////access only superclass methods and variables not for subclass methods and variables
		ref1.name="Gun";
		
		Gun.legal_touse(); // static binding
		
		
	
		
	
		Ak_47 ak_47 = (Ak_47) ref1; //downcasting
		
		
		//downcasting used to access methods and  variable both forsubclass and subclass
		ak_47.name="Ak_47";
		ak_47.Type="Semi-Automatic Rifles";
		System.out.println("Name: "+ak_47.name);
		System.out.println("Type: "+ak_47.Type);
		ak_47.feature(); //Dynamic binding 
		Ak_47.legal_touse();//Static binding
		ak_47.gunPurpose(); //Dynamic binding 
		
		Gun ref2 = new M60();
		M60  m60 = (M60) ref2;
		m60.name="M60";
		m60.Type="Machine Guns";
		System.out.println("Name: "+m60.name);
		System.out.println("Type: "+m60.Type);
		m60.gunPurpose();//Dynamic binding 
		M60.legal_touse();//Static binding
		m60.feature();//Dynamic binding 
		ref2.gunPurpose();
	}

}
