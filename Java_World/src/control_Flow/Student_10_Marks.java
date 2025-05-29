package control_Flow;

public class Student_10_Marks {
	public static void main(String[] args)
	{
	String [] studentName = {"Arun","Karan","Raja","varan","Kamal","Rajini"};
	int    [] studentMark = {450,465,486,445,440,489};
	int announce_Board_Eligble_Mark=450;
	
	
	for(int i = 0; i < studentMark.length; i++)
	{
		if (studentMark[i] > announce_Board_Eligble_Mark)
		{
			System.out.println("Eligble:     studentName:  "+studentName[i]+" studentMark:   "+studentMark[i]);
		}
		else
		{
			System.out.println("Not-Eliable: studentName:  "+studentName[i]+" studentMark:   "+studentMark[i]);

		}
		
	}

}
}
