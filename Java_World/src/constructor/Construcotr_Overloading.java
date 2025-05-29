package constructor;

public class Construcotr_Overloading {
	String name,role,dept,develop_info;
	int exp;
	
	Construcotr_Overloading ()
	{
		this.develop_info=" Developer information";
		System.out.println(develop_info);
	}
	Construcotr_Overloading (String name,String role,int exp)
	{
		this.name=name;
		this.role=role;
		this.exp=exp;
		System.out.println("Name: "+name+", Role: "+role+", Exp: "+exp);
	}
	Construcotr_Overloading (String name,String role,String dept,int exp)
	{
		this.name=name;
		this.role=role;
		this.exp=exp;
		System.out.println("Name: "+name+", Role: "+role+", Exp: "+exp+", Dept: "+dept);
	}
	
	

	public static void main(String[] args) {
		
		Construcotr_Overloading obj1 = new Construcotr_Overloading();
		Construcotr_Overloading obj2 = new Construcotr_Overloading("Prasanth","Java_Developer",2);
		Construcotr_Overloading obj3 = new Construcotr_Overloading("vignesh","java Developer","BBa",2);
		
		
	
	}

}
