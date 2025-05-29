package constructor;

public class FacoryMethodMain {

	public static void main(String[] args) {
	String [] [] data = {
			{"prasanth","24"},
			{"vishal","18"},
			
	};
	
	for (String[]  forward : data)
	{
		String  name= forward[0];
		int  age =Integer.parseInt(forward[1]);
		Employee emp = Employee.job_Eligable_Age(name,age);
		if(emp != null)
		{
			System.out.println(emp.getname()+emp.getage());
		}
		
	}
	}

}
