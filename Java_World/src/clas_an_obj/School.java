package clas_an_obj;
// constrator 
public class School {
	String teachername;
	String position,name,dept;
	int roll_no ;
	
	public  School ()
	{
		System.out.println("School-Name: T.pudur Primary School");
	}
	
	public   School (String name,String position)
	{
		this.name = name;
		this.position =position;
		
		
	}
 	void display()
	{
	
		System.out.println("Name: " +name+" Position: "+position);
	}
	
	public School(String name, int roll_no ,String dept)
	{
	this.name = name;
	this.roll_no =roll_no;
	this.dept =dept;
	
		
	}
	void display2()
	{
		int va1;
		System.out.println("Name: " +name+" roll_no: "+roll_no+" Dept: "+dept);
	}
	

	public static void main(String[] args) {
		

		
		
		
		School const1 = new School();
		School const2 = new School("Baby-Kumari","Head-master");
		School const3 = new School("Prasanth",21,"Computer-Science");
		
		
		//const1.display();
		const2.display();
	    const3.display2();
		
	
	}

}
