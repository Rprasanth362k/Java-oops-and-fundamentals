package inheritance;

public class Sundalvel_Father {
	static String father="Sundalvel";
	
	String mother = "Anusya";


	public static void main(String[] args) {
		
		 Sundalvel_Father  sundalvel_Father  = new  Sundalvel_Father();
		 Sundalvel_Father  sundalvel_Wife  = new  Sundalvel_Father();

     
		basicinfo_Sundarvel(sundalvel_Wife );
		sundalvel_Father.behaviourse();
	
	
	}
	public static void  basicinfo_Sundarvel(Sundalvel_Father sundalvel_WifeInstance)
	{
		String  job="farmer";
		int  age =27;
		
		System.out.println("father: "+father+" Job: "+job+" Age: "+age+  sundalvel_WifeInstance.mother);
	}
	public  void  behaviourse()
	{
		String attitude;
		String hobby;
		System.out.println(attitude=" goodboy, "+(hobby=" playing game "));
	}

}
