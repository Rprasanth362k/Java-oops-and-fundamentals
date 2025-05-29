package constructor;

public class Dowhile_Example3 {

	public static void main(String[] args) {
		
		
		String [] name = {"karan","raja","sundar","akash","vishal"};
		String [] homework_Status= {"Homework_Done","Homework_notDone","Homework_Done","Homework_Done","Homework_Done"};
		
		for(int i=0;i<name.length;i++)
		{
		do
		{
		System.out.println("Class_Room Not_Allowed"+	name[i]);
		}
		
		while(homework_Status.equals("Homework_Done"));
		{
			System.out.println("Class_Room Allowed"+name[i]);
			
		}
		}

	}

}
