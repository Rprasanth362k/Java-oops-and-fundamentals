package variables;

public class Ampersand {

	public static void main(String[] args) {
		//&: Evaluates both conditions, even if the first one is false.
		
		boolean  result = (5>3) &(5<10);
	boolean  result1 = (5>3) &(5>10);
	
	System.out.println(result);
	System.out.println(result1);
	
	// && Only evaluates the second condition if the first one is true, making it more efficient in cases where short-circuiting is beneficial.


	boolean  result2 = (5>3) &&(5<10);
	boolean  result3 = (5>3) &&(5>10);
	System.out.println(result2);
	System.out.println(result3);
	
	//or
	
	int a=10;
	int b=5;
	int c=20;
	System.out.println(a<b&&a<c);//false && true =false
	System.out.println(a>b&&a<c);// true && true = true
	System.out.println(a<b&a<c);  //false & true =false
	System.out.println(a>b&a<c);// true & true = true
	
	/*
	 * & (Single Ampersand):

    Bitwise AND: Performs bitwise operations on integers.
    Logical AND: Evaluates both sides of a boolean expression, regardless of the first operand's value.

    && (Double Ampersand):

    Logical AND with Short-Circuiting: Only evaluates the second condition if the first one is true.
     This is more commonly used in conditional expressions.
	 */

}
}