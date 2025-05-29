package clas_an_obj;

public class Initialize_obj2 {
	int rollno;
	String name;
	
	

	public static void main(String[] args) {
		
		Initialize_obj2 stu1 = new Initialize_obj2();
		Initialize_obj2 stu2 = new Initialize_obj2();
		
		
		
		stu1.method1(21,"Prasanth");// method
		stu2.method1(22,"Sam"); // method
		
		stu1.displayinfo(); // method calling
		stu2.displayinfo(); // method calling
		
		

	}
	 void displayinfo() { // method sigatur
			
		System.out.println(rollno + ""+name);
		
	}
	void method1(int r, String n)  // variable initialize
	{
		rollno =r;
		name = n;
	}
	

}
