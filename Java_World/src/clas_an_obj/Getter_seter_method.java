package clas_an_obj;

public class Getter_seter_method {
	private int roll_no;
	private String name;
	public int get_roll_no()
	{
		return roll_no;
		
	}
	public void  set_roll(int roll_no) {
		this.roll_no=roll_no;
	}
	
	public String get_name()
	{
		return name;
	}
	public void set_name(String name) {
		this.name=name;
	}
	public void info_Display()
	{
		System.out.println("Roll_no: "+roll_no+",  Name: "+name);
	}

	public static void main(String[] args) {
		
		Getter_seter_method student = new Getter_seter_method();
		student.set_roll(101);
	    student.set_name("Prasanth ");
	    student.info_Display();
	    
	}

}
