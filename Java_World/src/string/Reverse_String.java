package string;

public class Reverse_String {

	public static void main(String[] args) {

	int input =123;
	String revers ="";
	for( int i =input.length()-1;i>=0;i--)
	{
		 revers +=input.charAt(i);
		 
	}
	System.out.println(revers);
	}
	
	
}

