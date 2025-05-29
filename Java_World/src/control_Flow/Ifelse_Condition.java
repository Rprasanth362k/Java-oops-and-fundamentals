package control_Flow;

public class Ifelse_Condition {

	public static void main(String[] args) {
		policeSelection_criteria();
	}
	
	
	public static void policeSelection_criteria()
	    
	
	{    String [] police_Candiate_Name          = {"sam","ram","arun","varn","vishal","kunal","kanan"};
		 String [] police_Candiate_Nationality   = {"indian","indian","indian","indian","indian","nepal","srilanka"};
		 int    [] police_Candiates_Age          = {18,19,20,21,17,24,25};
		 String [] police_Candiates_Qualification= {"10-pass","Degree","Engineering","Diplmo","12","ItI","12"};
	     String [] min_Educational_Qualification = {"10-pass"};
	        int    min_Age =18;
	        int    max_Age =26;
        for(int i=0; i<police_Candiate_Name.length;i++)
        {
		if(police_Candiates_Age[i] >= min_Age && police_Candiates_Age[i] <= max_Age
				&& police_Candiate_Nationality[i].equals("indian") 
				&&(police_Candiates_Qualification[i].equals("10-pass") || 
				police_Candiates_Qualification[i].equals("Degree") || 
				police_Candiates_Qualification[i].equals("Engineering")|| 
				police_Candiates_Qualification[i].equals("Diplmo")||
				police_Candiates_Qualification[i].equals("12")))
				
		{
			System.out.println(" YOU elgible for age,nationality,qualification: "+police_Candiate_Name[i]);
		}
		
		else
			{
			System.out.println(" not eligble:: "+police_Candiate_Name[i]);
		}
        
		
        }
	
	}}

	
	//: Checks if two variables point to the same object in memory (reference equality).
//equals(): Compares the actual content of the objects (logical equality), provided the class has overridden the equals() method.

