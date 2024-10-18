package encapsulation;

 public class MY_Personal {
	// class only permit  public ,abstract, final. 
	
	private String  Secrites ="Hide my self "; // class level only access
	private int  phonepay_pin =123;
	protected String things ="My-toys";
	  String Character ="good"; // same package access ,another package not access, if need to access another package class use protected and that package class ass ichild
	  public String  gender ="Male";
	  
	  public void water_bottol()
	  {
		  System.out.println("i will share water_bottol anyone need ");
	  }
	  
	 protected  void   mythigs()
	   {
		  System.out.println("I will share my things know parsone only like shirt,money..etc");
	   }
	   
	    void wifi_password()
	   {
		  System.out.println("Share by friend or my relations with nearby"); 
	   }
	   
	   private void Bank_account_info()
	   {
		   System.out.println("Donot share anyone");
	   }
	   
	 //encapsulation =data protection.
	 //Acess modifiers: private,default,protected,public


	 /*
	  private - only acess  with in class
	  eg.Atm pin , mobile password.
	  
	  default- same package act as public, different package act as private ,different package (protected method or Protected variable) an relationship like public
	  eg. neighbourrs -pet,pet name
	  
	  protected-
	  near and dear - neighbours and relatives --sslc mark ,job.
	  public -Accessed by all
	  
	  eg.shirt, bus destination.
	  
	  
	  */ 
	  
	  

}
