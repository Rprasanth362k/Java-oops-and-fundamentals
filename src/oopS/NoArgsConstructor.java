package oopS;

public class NoArgsConstructor {
	int id;
	String name;
	
	NoArgsConstructor()
	{
		id =101;
		name ="Jhon";
		
	}

	
	void show ()
	{
		System.out.println("ID: "+id+", Name: "+name);
	}

	public static void main(String[] args) {
		System.out.println("NoArgs-constructor");
		
		NoArgsConstructor s1 = new NoArgsConstructor();
		s1.show();

	}

}
