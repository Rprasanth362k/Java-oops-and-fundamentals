package control_Flow;

public class Switch_Break_Continue {

	public static void main(String[] args) {
		
		
	String searching_Supermarket ="Pizza";
    System.out.println("Switch Block:");
switch(searching_Supermarket)
{
case  "Bisscut":
    System.out.println("Healthy");
    break;
case  "Candy" :
	System.out.println("-> Not Good for teath  <-");
	break;
case  "Soft_drink":
	System.out.println("Not Good for Health");
	break;
	default:
	System.out.println(" Not Avilable");
	
	System.out.println("\n");
}
System.out.println("Break Block");
for(int i=0;i<=6;i++)
{
	if(i==3)
	{
		break;
	}
	System.out.println("i = "+i);

}
System.out.println("\n");
System.out.println("Continue Block");

for(int i=0;i<=6;i++)
{
	if(i==3)
	{
		continue;
	}
	System.out.println("i = "+i);

}




	}

}
