package control_Flow;

import java.util.Scanner;

public class Do_While_Example {
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	String correctPassword ="java123";
String 	enterpassword;
	do {
		System.out.println("Enter your password: ");
		enterpassword =scanner.nextLine();
		if(!enterpassword.equals(correctPassword))
		{
			System.out.println("incorrect password, pleasse try again.");
		}
		}
	while(!enterpassword.equals(correctPassword)); {
		System.out.println("Access granted!");
		scanner.close();

	}

	
}
}