package class_Object;

public class Student {
	int  id;   //filed or data member  or instace variabel
	String  name;
	String college;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Student stu1 = new Student();  // create object 
      stu1.college ="jaya college";
      stu1.id=101; // accessing member through reference variable
      stu1.name="prasanth";
     
      
     System.out.println("id:" + stu1.id+ ", name:"+stu1.name +", college:"+ stu1.college);
	
	}

}
