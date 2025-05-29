package class_Object;

public class Example_Mutable_Immutable {
	
	

	
	public static void main(String[] args)
	{
		String s1 ="Java";
		String s2=s1 ;
		s1=s1+ "Programming";
		System.out.println("Immutable");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2= sb1;
		sb1.append("Programming");
		System.out.println("\nMutable:");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
		
	}

}
