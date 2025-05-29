package basic_programme;

import java.util.Scanner;

public class Read_Number_From_Standered_Input {

	public static void main(String[] args) {
		
	
		
		int num;
		System.out.println("Enter the number:  ");
	    Scanner s = new Scanner(System.in); // 
	    num= s.nextInt();
	   //  returns the int value of the number that the next token represents. The token must represent a whole number between -2,147,483,648 and 2,147,483,647.
	    System.out.println("Entered is number: "+num);
	    s.close();
	
	}

}
