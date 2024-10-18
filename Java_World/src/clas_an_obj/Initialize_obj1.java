package clas_an_obj;

public class Initialize_obj1 {
	
	int id ;
	String name;
	static String dept ;

	public static void main(String[] args) {
		
		Initialize_obj1 ini = new Initialize_obj1();
		
		ini.id=10;
		ini.name="prasanth";
		//ini.dept="Computer-science ";
		dept="Computer-Science";
		System.out.println(ini.id +" "+ini.name +" "+dept);
		
	}

}
