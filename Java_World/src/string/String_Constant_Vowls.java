package string;

public class String_Constant_Vowls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input ="programming";
		
		int vowels =0,cosnononts=0;
		
		input =input.toLowerCase();
		
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else if(ch >='a'  && ch <='z')
			{
				cosnononts++;
			}
			System.out.println("vowels"+vowels);
			System.out.println("consonts"+cosnononts);
		}

	}

}
