package inheritence;

public class Student {

	int id; 
	String name;
	
	Student()
	{
		this(101,"Default");
        System.out.println("No-arg constructor");
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
     
  System.out.println("Parameterized constructor");
	}
	
	void infoDisplay()
	{
        System.out.println(this.id + " " + this.name); 
	}
	
	public static void main(String[] args) {

		Student student = new Student();
		student.infoDisplay();
	}

}
