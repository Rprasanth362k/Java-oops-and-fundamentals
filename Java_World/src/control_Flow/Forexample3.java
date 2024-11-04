package control_Flow;

public class Forexample3 {
//Java Labelled for Loop
	public static void main(String[] args) {
 char [] num =  {'a','e','i','o'};
    aa:
	for(int i =0;i<=6;i++)
	{
		
		System.out.println(" "+i+" iteration");
	
		for (int j =0;j<=6;j++)
		{
			System.out.println(" "+i+" iteration");
			if(i==4&&j==4)
			break aa;
			for(char number : num)
			{
				System.out.println(number);
				
			}
		}
		System.out.println("Exit Both Loop");

		
	}
	
		
	
	}

}
