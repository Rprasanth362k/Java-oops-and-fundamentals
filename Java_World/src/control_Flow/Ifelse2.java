package control_Flow;

public class Ifelse2 {
	static String [] name = {"raghul","gokul","Surya","vera","Saran"};
	static int []   ages = {10,15,18,26,27};
	static int max_age =26;
static 	int  min_age =18;

	public static void main(String[] args) {
	
    checkPlaygroundAccess();
	}
	public static void checkPlaygroundAccess()
	{
		for (int i=0;i<name.length;i++)
		{
			String currentname =name[i];
			int currentage = ages[i];
			
			if (isAllowedAdultPlayground(currentage))
			{
			System.out.println("Allowed in Adult Playground: "+currentname);	
			}
			else if(isAlowedchildPlayground(currentage))
					{
				      childPlayground(currentname);
				      System.out.println("Allowed in Child Playground: "+currentname);
				      
					}
					
			else {
				System.out.println(currentname+" is  not allowed in any playground");
			}
		}
	}
	public static boolean  isAllowedAdultPlayground(int age)
	{
		return age  >= min_age && age <= max_age;
	}
	public static boolean isAlowedchildPlayground(int age)
	{
		return age < min_age;
	}
	public static void childPlayground(String name)
	{
	//	System.out.println(name);
	}
	
	

}
