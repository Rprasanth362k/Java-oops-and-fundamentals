package variables;

public class Variable_type_Promotion {
	
	// variable type promotion (or) Implicit conversion 


public static void main(String args[])
{
	// Converts smaller(int) type to larger(float) type.
    int integer =10;  
    float  floating_point=integer;
    System.out.println("Integer: "+integer);   
    System.out.println("Integer to float pointing promotion: "+ floating_point);
}

}



//variable Explicit  conversion

/*  
 * // Converts larger(float) type to smaller(int) type
 * float x = 10.0;
 * int y =(int) x;//int y=x;//Compile time error  
 * System.out.println("float value"+x); //10.o
 * System.out.println("depromotion  float to int: "+y);//10
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */




