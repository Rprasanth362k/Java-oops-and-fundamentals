package astatic_this;

public class JayaCollege {
 int rollno;
 String name;
 String dept;
 float fees;
 
 
 JayaCollege (int rollno,String name,String dept)
 {
 	this.rollno=rollno;
 	this.name=name;
 	this.dept=dept;
 	
 	}
 
JayaCollege (int rollno,String name,String dept,float fees)
 {
	this(rollno,name,dept); //reusing constructor 
	//this.rollno=rollno;
	//this.name=name;
	//this.dept=dept;
	this.fees=fees;
	
	 
 }
 
 

void stud_info1()
{
	System.out.println(" rollno: "+rollno+", name: "+name+", dept: "+dept+", fees: "+fees);
	//System.out.println(rollno+name+dept);
}
void stud_info2()
{
	
	System.out.println(" rollno: "+rollno+", name: "+name+", dept: "+dept);
}


	
	public static void main(String[] args) {
		JayaCollege stu2 =new JayaCollege(102,"Thangavel","Computer-Science"); 
		JayaCollege stu1 =new JayaCollege(101,"Prasanth","Computer-Science",18000f); 
		
		stu1.stud_info1();
		stu2.stud_info2();

	}

}
