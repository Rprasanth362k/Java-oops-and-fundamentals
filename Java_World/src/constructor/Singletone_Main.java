package constructor;

public class Singletone_Main {

	public static void main(String[] args) {
		
			Singleton secreate1=  Singleton.getInstance("lion");
			Singleton secreate2=  Singleton.getInstance("lion");
		
			 System.out.println(secreate1== secreate2);
			
			 
			 Singleton secreate3 = Singleton.createnew_Getinstace("Tiger");
			 System.out.println(secreate1==secreate3);
			 
			 
			 System.out.println("Instance 1 name: "+ secreate1.getName());
			 System.out.println("Instance 1 name: "+ secreate3.getName());
				}

			

	}


