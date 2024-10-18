package variables;

public class Overflow {

	public static void main(String[] args) {
 int a=130;
 byte b = (byte)a; // overflow (cast) 
 System.out.println(a);
 System.out.println(b);
	}

}


/*
 * int a=-130;
 * byte b = (byte)a; //underflow(cast)
 * System.out.println(a);
 * System.out.println(b);
 * 
 * 
 *
 */

