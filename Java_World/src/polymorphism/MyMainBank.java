package polymorphism;

public class MyMainBank {

	public static void main(String[] args) {
		Bank b;
	    b = new OccBank();
	    OccBank b1 = (OccBank) b;
	    
	    System.out.println("Bank_interest"+b.getrateofInterest());
		System.out.println("Occbank_interesr"+b1.OccBank_getrateofInterest());
		
		
		b= new OpBank();
		OpBank b2 = (OpBank) b;
		System.out.println("Bank_interest"+b.getrateofInterest());
		System.out.println("OpBank_interst"+b2.OccBank_getrateofInterest());
		
		
		
		
		
	}

}
