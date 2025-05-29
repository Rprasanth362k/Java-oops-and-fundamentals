package encapsulation;

public class Prasanth_customer  {

	public static void main(String[] args) {
		
		RkP_Bank prasanth = new RkP_Bank();
		System.out.println(prasanth.getAccount_Number());
		
	    prasanth.setAccount_password(90000008);
		System.out.println(prasanth.getAccount_password());
		
		prasanth.setminimum_Balance(1001);
		System.out.println(prasanth.getminimum_Balance());
		
	}

}
