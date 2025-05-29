package astatic_this;

public class SimpleStatic {
	int rollno ;
	String name;
	static String college="Jaya";
	
	
	static void changeStaticvalue()
	{
		college="college";
	//	System.out.println(rollno+name+college);
	}
	
	void display(){ 
		
		System.out.println("rollno: " +rollno +" name:" +name+" college: "+college);
	}
	SimpleStatic(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	

	public static void main(String[] args) {
	  //  changeStaticvalue();// or SimpleStatic.changeStaticvalue();
		SimpleStatic  obj1= new SimpleStatic (101,"Prasanth");
	    obj1.display();	
	

	}

}
