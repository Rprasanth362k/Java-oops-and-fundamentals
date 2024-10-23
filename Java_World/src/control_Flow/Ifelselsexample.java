package control_Flow;

public class Ifelselsexample {
	
	static String [] name = { "venkat","kamesh","surya","ayyapen"};
	static int [] age = {10,15,18,26};
    static  int min_age=18;
    static 	int max_age=26;
	public static void main(String[] args) {
		
       adultPlayground();
	}
	public  static void  adultPlayground()
	
	{
		
	
		for (int i=0;i< name.length;i++)
		if (age[i] >= min_age &&  age[i] <= max_age)	
		{
			System.out.println("Allowed Adult_Playground"+name[i]);
		}
		else if(age[i] >= 15 || age[i] <= 10)
		{
			childPlayground(name[i]);
			
		}
		else
		{
			System.out.println("not allowed");
		}
		
		
	}
	
	public  static void childPlayground(String name)
	{
		
		{
	System.out.println(" welcome to childeren park: "+name);	
	}
}
	}

