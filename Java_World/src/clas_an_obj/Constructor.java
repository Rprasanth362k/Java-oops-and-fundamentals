package clas_an_obj;

public class Constructor {
	
	String name;
	int dis ;
    String price;
	Constructor(String produ_name,String price,int dis)
	{
		this.name=produ_name;
		
		this.price=price;
		this.dis=dis;
		
	}
	Constructor (String produ_name,int dis,String price)
	{
     this.name=produ_name;
		
		this.price=price;
		this.dis=dis;
	}
	


	public static void main(String[] args) {
		
		Constructor obj1 =new Constructor("soap","45",1);
		Constructor obj2 =new Constructor("shampo",1,"15");

     obj1.pro1();
     obj2.pro2();
     
	}
	
	public Constructor()
	{
		
	}
	public void pro1()
	{
		
		System.out.println(price+ dis +name);
		
	
		
		
	}
	
	
	public void pro2()
	{
		
		System.out.println(price+ dis +name);
		
	
		
		
	}

}
