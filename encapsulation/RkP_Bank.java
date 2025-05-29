package encapsulation;

public class RkP_Bank {
	
	
	 final private int account_number=123456789;

  //  account_number =1234562;
	private int user_password =90000008;
	
	private  int minimum_blance  =1001;

    
    
    
    public int getAccount_Number()
    {
    	return  account_number;
    }
   // public void setAccount_Number(int setnumber)
    {
  	//this.account_number=setnumber;
    }
    public int getAccount_password()
    {
    	return user_password;
    }
    
    public void setAccount_password(int mysetpassword)
    {
    	if (mysetpassword>=90000008)
    	{
    	this.user_password=mysetpassword;
    //	System.out.println(this.user_password);
    	}
    	
    	else {
            System.out.println("Password must be greater than 90000008.");
    }
   
    	}
    public  int getminimum_Balance()
    {
    	return minimum_blance;
    }
    
    public void setminimum_Balance(int set_minumum)
    {
    	if (set_minumum>=1001)
    	{//1001<10000000
    	this.minimum_blance=set_minumum;
    	}
    	else {
            System.out.println("Minimum balance should be at least 1001.");
        }
    }
 
}
