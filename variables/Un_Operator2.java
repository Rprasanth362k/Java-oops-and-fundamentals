package variables;

public class Un_Operator2 {

	public static void main(String[] args) {
		
		int a =11;
		int b =-10;
		boolean c=true;
		boolean d=false;
		System.out.println(~a); // -12  (minus of total positive value which starts from 0) 
        System.out.println(~b); // +9  (positive of total minus, positive starts from 0)  
        System.out.println(!c); // false 
        System.out.println(!d); //  true
	}

}
