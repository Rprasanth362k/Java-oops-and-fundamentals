package oopS;

public  class Parmet_Constructor {
	
	String name,jobStatus,jobFinding;
	static int age;
	
	Parmet_Constructor (String name,int age,String jobStatus,String jobFinding)
	{
	 this.name=name;
	 this.age=age;
	 this.jobStatus=jobStatus;
	 this.jobFinding=jobFinding;
	}
	public void  studentDetails()
	{
		System.out.println("name: "+ name+", age: "+age+",jobStatus: "+jobStatus+",jobfinding: "+jobFinding);
	}
	
	public static void main(String[] args) {
		Parmet_Constructor  obj1 = new Parmet_Constructor ("Prasanth",25,"Job_seeker","Java_Developer");
		obj1.studentDetails();

	}

}
