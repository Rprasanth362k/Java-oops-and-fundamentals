package control_Flow;

public class LeapYear {

	public static void main(String[] args) {
		Leap_Common_year();

	}
	public static void Leap_Common_year()
	{
	
 for (int year =2000;year <=2024;year++)
 {
	 if(((year %4 ==0 ) && (year %100 !=0)) || (year %400==0))
	 {
		 System.out.println(year+" :Leap Year");
	 
	 }
	 else
	 {
		 System.out.println(" '"+year+"' :Common Year");
	 }
 }
 
	}

 }


