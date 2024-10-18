package variables;

public class Shiftleft_operator {

	public static void main(String[] args) {
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
	}

}
/*In Java, the << operator is a bitwise left shift operator. 
 * It shifts the bits of the number to the left by the specified number of positions, 
 * effectively multiplying the number by 2number of positions2number of positions.
 * 
 * n Java, the >> operator is a bitwise right shift operator.
 *  It shifts the bits of the number to the right by the specified number of positions, 
 *  effectively dividing the number by 2number of positions2number of positions (using integer division).
 * 
 * System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  
 * 
 * 
 */






