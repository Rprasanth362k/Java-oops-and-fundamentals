package control_Flow;

public class Nested__For_Loop {

	public static void main(String[] args) {
	 //("Multiplication Table for  "+number);
		
		for(int number =1;number<=12;number++)
		{
			System.out.println("Multiplication Table for  "+number);
		
		for(int j=0;j<=12;j++)
		{
			System.out.println(number+" x "+j+" = "+(number*j));
		
		}
		}

	}

}
