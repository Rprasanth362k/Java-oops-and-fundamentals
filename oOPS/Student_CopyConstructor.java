package class_Object;

public class Student_CopyConstructor {
	int id;
	String name;

	// normal constructuctor
	Student_CopyConstructor(int id,String name)
	{
		this.id =id;
		this.name =name;
	}
	//copy constructor
	Student_CopyConstructor( Student_CopyConstructor stu )
	{
		this.id =stu.id;
		this.name =stu.name;
	}
	void display()
	{
		System.out.println(id+ " "+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_CopyConstructor stu1 = new Student_CopyConstructor(21,"Prasanth");
		Student_CopyConstructor stu2 = new Student_CopyConstructor(stu1);
		stu2.display();

	}

}

