package pattern;

public class Pattern1 {

	public static void main(String[] args) {
  
		
		pattern1(1);
	}
 static void pattern1(int n)
 {
	 for ( int row=5; row>=n;row-- )
	 {
		 for (int col =5; col >=row;col++)
		 {
			System.out.print("*");
		 }
		 System.out.println("");
	 }
 }
}
