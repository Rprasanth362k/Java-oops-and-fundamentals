package clas_an_obj;

public class Initialization1_by_reference_variable_multiple_objects {
	String name;
	int   age;
	String dept;

	public static void main(String[] args) {
		Initialization1_by_reference_variable_multiple_objects ini = new Initialization1_by_reference_variable_multiple_objects();
		Initialization1_by_reference_variable_multiple_objects ini1 = new Initialization1_by_reference_variable_multiple_objects();
		
		 ini.name="sam";
		 ini.age=15;
		 ini.dept="cs";
		 
		 ini1.name="sam";
		 ini1.age=15;
		 ini1.dept="cs";
	}

}
