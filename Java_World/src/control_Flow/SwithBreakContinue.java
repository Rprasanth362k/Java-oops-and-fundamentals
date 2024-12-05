package control_Flow;

public class SwithBreakContinue {

	public static void main(String[] args) {
		
		int day =3;
		switch(day)
		{
		//Checks variable value and executes matching case.
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thrusday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		
		default: //The default keyword specifies some code to run if there is no case match
		case 8: System.out.println("Invalid Day");

		}
		System.out.println("\n Example with break in aloop");
		for(int i=1;i<=5;i++)
		{
			if(i==4)
			{
				break;//Stops execution within a loop or switch.
			}
			System.out.println("i = "+i);
		}
		System.out.println("\n Example with break in aloop");
		for(int i= 1;i<=5;i++)
		{
			if(i==3)
			{
				continue;//Skips the remaining code of the current loop iteration.
			}
		System.out.println("i = "+i);

		
	}
	}

}
