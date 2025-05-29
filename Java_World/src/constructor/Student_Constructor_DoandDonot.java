public class Student_Constructor_DoandDonot {
	
	int id;
	String name,department;
	char gender;
	
	Student_Constructor_DoandDonot(int id, String name,String department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
	}
	// do not define  two constructor with  same  parameter type even if parameter names are different ,java can not accept
	/*
	Student_Constructor_DoandDonot(int id, String name,String department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
	}
*/
	/*
	Student_Constructor_DoandDonot(int Id, String Name,String Department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
	}
	*/
	Student_Constructor_DoandDonot(int id, String name,char gender,String department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //do's
		Student_Constructor_DoandDonot student1 =new Student_Constructor_DoandDonot(101,"Prasanth","ComputerScience");
		Student_Constructor_DoandDonot student2 =new Student_Constructor_DoandDonot(102,"shivan","History");
		Student_Constructor_DoandDonot student3 =new Student_Constructor_DoandDonot(103,"Parvathi",'F',"History");

		student1.infoStudent();
		student2.infoStudent();
		student3.infoStudent3();
		
	}



	public void infoStudent() {
    System.out.println("id: "+id+", Name: "+name+", Department:" +department);		
	}
	public void infoStudent3() {
	    System.out.println("id: "+id+", Name: "+name+", Gender:"+gender+", Department:" +department);		
		}


}
