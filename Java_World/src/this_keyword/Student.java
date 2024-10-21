package this_keyword;
//1) this: to refer current class instance variable

public class Student {
	int rollno;
	String name;
	float fees;
	Student(int  rollno,String name,float fees)
	{
		this.rollno=rollno;
		this.fees=fees;
		this.name=name;
	}
	public void  displaystudent_Info()
	{
		System.out.println("Rollno: "+rollno+", Fees: "+fees+",Name: "+name);
		
	}
	
	public static void main(String[] args) {
		Student stu1= new Student(101,"prasanth",5000f);
		Student stu2= new Student(102,"samvel",6000f);
		stu1.displaystudent_Info();
		stu2.displaystudent_Info();

	}

}
