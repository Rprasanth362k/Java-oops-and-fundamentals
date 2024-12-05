package string_Array_Predefinefunction;

import java.util.Arrays;

public class StringArray_vs_Arraylist_String {

	public static void main(String[] args) {
		String [] strArr= new String [5];
		strArr[0]="Lion";
		strArr[1]="Tiger";
        strArr[2]="Cheetah";
        strArr[3]="Leopard";
        
        System.out.println("Original Array Elements:");
        
       for(String animals : strArr)
    	   System.out.println(animals);
        
      //  System.out.println("Original Array Elments: "+ Arrays.toString(strArr));
     // newcat ="puma";
        
      // strArr =Arrays.copyOf(strArr,strArr.length);
       // strArr [4]=animals;
       // System.out.println("Array after adding two elements: "+Arrays.toString(strArr));
    
       
       String  newcat ="Puma";
	
    
       String [] newArray = new  String[strArr.length+1];
       for (int i =0; i< strArr.length;i++)
       {
    	  newArray[i]=strArr[i];
       }
       newArray[newArray.length -1]= newcat;
    	   System.out.println("Array after adding the the new element: ");
    	   for(String animals : newArray)
    	   {
        	   System.out.println(animals);
       }
	}
      
     
	}


