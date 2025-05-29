package clas_an_obj;




class Prasanth
{   
	String name="prasanth"; // instance variable or field or data member or propeties
	int  age = 25;
	static String  dept ="computer-science"; //  static  variable 
	public static void main(String[] args)
	
	
	{
		
		 Prasanth rk = new Prasanth(); // creating object
		 System.out.println(rk.name); // accessing member through  referece variable
		 System.out.println(rk.age);
		 System.out.println(Prasanth.dept); //Prasanth.dept or dept
	}
}