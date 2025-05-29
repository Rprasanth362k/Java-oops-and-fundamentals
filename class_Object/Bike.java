package class_Object;

public class Bike {
	
	String Brand;
	String color;
	
	
	//constructor 
	Bike(String Brand,String color)
	
	{
		this.Brand = Brand;
		this.color =color;
	}
	public  void infoBike()
	{
		System.out.println("Brand: "+Brand +", color: "+ color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike Bike1 = new Bike("Honda","skyBlue");
        Bike1.infoBike();
	}

}
