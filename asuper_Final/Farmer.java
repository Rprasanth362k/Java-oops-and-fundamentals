package asuper_Final;

final public class Farmer extends Market {
	//finally class கடைசி விவசாயி  can not extended 
	 public static void main(String[] args) {
		Farmer  n1= new Farmer();
		
		System.out.println("Super-market-purchasing"+n1.Supermarket );
		System.out.println("Farmer-shop-purchasing"+n1.Farmer_shop );
	
		Market.farmerland();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	final static void  farmerland()
	 {
		 System.out.println("Flat sales // can not overriding java and Reallife ");
		 }
}

