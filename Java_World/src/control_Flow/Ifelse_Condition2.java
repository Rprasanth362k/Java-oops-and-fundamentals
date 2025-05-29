package control_Flow;

public class Ifelse_Condition2 {
//2) if-else statement

static  int vote_eligable_age=18;
 
	public static void main(String[] args) {
         
         
         vote_eligible("Ramesh",19);
	
	}
	public static int vote_eligible(String name,int age)
	{
       if(age>vote_eligable_age)
       {
    	     System.out.println("you are eligable for voting");
    	     return vote_eligable_age ;
    	  
       }
       else
       {
    	   System.out.println("Not Eligable");
    	   return 0;
       }
      

	}

}
