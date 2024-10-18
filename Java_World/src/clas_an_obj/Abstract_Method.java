package clas_an_obj;

public abstract class Abstract_Method {

	public static void main(String[] args) {
		student_info();
		
		
	}
	static void student_info() {
		String name="Prasanth",college_Name="Jaya Arts &  Science college. ";
		int age=24,roll_no=101;

		System.out.println("Name: "+ name+", Roll_no: "+roll_no+", Age: "+age+", College_Name: "+college_Name);
	}
 abstract	public void personal_info();

}
