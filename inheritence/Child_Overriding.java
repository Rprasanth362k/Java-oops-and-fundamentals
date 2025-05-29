package inheritence;

public class Child_Overriding extends Parrent_Overriding {
	
	Child_Overriding()
	{
		System.out.println("child Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Overriding obj1 = new Child_Overriding();

		obj1.show();
	}
	
public void show ()
	{
		System.out.println("child instanceMethod");
	}


}
