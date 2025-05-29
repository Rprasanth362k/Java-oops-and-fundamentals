package variables;

public class Assignment {

	public static void main(String[] args) {
  short  a=10;
  short b=10;
  // a=a+b; // correct way  a=(short) (a+b); or  a1=a+b; 
  System.out.println(a);
  
	}

}
/*exp:1
 * int a=10, b=20;
 a+=10;
 b+=20;
 System.out.println(a);
 System.out.println(b);
 * 
 * exp:2
 * int a=10;
  a+=2;
  System.out.println(a);
  a-=4;
  System.out.println(a);
  a*=6;
  System.out.println(a);
  a/=2;
  System.out.println(a);
  
 * 
 */



