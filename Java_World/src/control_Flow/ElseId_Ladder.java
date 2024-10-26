package control_Flow;

public class ElseId_Ladder {
 static	String[] name = {"Bheem","Raju","kalia","Dolu","Golu"};
 static	 String[] subject = {"tamil","english","maths","science","social_science"};
	
 static	 int[] [] mark = {
		{67,78,85,89,97},
		{89,67,78,45,79},
		{78,67,69,89,88},
		{44,56,87,98,93},
	    {98,96,97,79,80,}
		};
static	 int pass =50 ;
 
     

	public static void main(String[] args) {
		tenthmark();
	}
	
  public static void tenthmark()
  {
	for (int i=0; i<name.length;i++)
			{
			int totalmark=0;
			
			for (int j=0; j<subject.length;j++)
			{
				 totalmark += mark[i][j];
				if (mark[i][j] > pass)
					
				{  
           System.out.println(name[i]+ " passed in "+subject[j]+" mark: "+ mark[i] [j]);
				}
				else if(mark[i][j]< pass)
				{
					System.out.println(name[i]+" failed in "+subject[j]+" mark: "+ mark[i] [j]);
				}
			
				}
		
			{
			System.out.println(name[i]+ "'s total marks "+ totalmark);
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			}
		}
			
  }
}

//int hashcode =Integer.valueOf(mark[i][j]).hashCode();
