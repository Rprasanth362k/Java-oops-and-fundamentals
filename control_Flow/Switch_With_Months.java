package control_Flow;

public class Switch_With_Months {

	public static void main(String[] args) {
int mybirthaday_Month =6;
for(int english_Month =1;english_Month<=mybirthaday_Month;english_Month++)
{
	if(english_Month==6)
	{
		birthday();
switch (mybirthaday_Month)
{
case 1: String month_1 ="1-January";
break;
case 2: String month_2 ="2-February";
break;
case 3: String month_3 ="3-March";
break;
case 4: String month_4 ="4-April";
break;
case 5: String month_5 ="5-May";
break;
case 6: String month_6 ="6-Jun";
System.out.println(" *=> 03-06-2000  is MY birthday. <=*");
break;
case 7: String month_7 ="7-July";
break;
case 8: String month_8 ="8-August";
break;

case 9: String month_9 ="9-September";
break;
case 10: String month_10 ="10-October";
break;
case 11: String month_11 ="1-November";
break;
case 12: String month_12 ="1-December";
break;
default:
System.out.println("Check the month");
}
}
}	}

	public static void birthday() {
		
		System.out.println("Happy Birthday Prasanth");
	}

}
