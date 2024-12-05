package string_Array_Predefinefunction;

public class Stringarray_initializen {

	public static void main(String[] args) {
		String [] strAr1 = new String [] {"vadha","sudhan","madthi"}; //inline initialization  
	
        String [] strAr3= new String[3];
        strAr3[0] ="Thrisha";
        strAr3[1] ="Samntha";
        strAr3[2] ="Nivetha Pethuraj";
       /* strAr3[3] ="Thamana"; (Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at Java_World/string_Array_Predefinefunction.Stringarray_initializen.main(Stringarray_initializen.java:12))*/
/*Similar to arrays, in string array only a fixed set of elements can be stored. It is an index-based data structure, which starts from the 0th position. 
        The first element will take place in Index 0, and the 2nd element will take place in Index 1, and so on.*/
        
        // String array is fixed length String Array (String[]):
        
    	String [] strAr2 = {"ani","sam","joe"};
    	
    	System.out.println("\n  forloop" );
    	for(int i=0;i<strAr2.length;i++)
    	{
    		System.out.println(strAr2[i]);
    	}
    	// foreach
    	System.out.println("\n  foreach" );
    	for(String swipe : strAr2)
    	{
    		System.out.println(swipe);
    	}
    	
    	
    	//ArrayList (ArrayList<String>):

        //Dynamic length: Can grow or shrink in size as elements are added or removed.
	}

}
