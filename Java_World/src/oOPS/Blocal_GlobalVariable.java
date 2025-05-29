package oOPS;

public class Blocal_GlobalVariable {
	private double balance;  // Instance variable

    public Blocal_GlobalVariable(double initialBalance) {
        this.balance = initialBalance;  // Initialize instance variable
    }   
	
	public static void main(String[] args) {
		
		Blocal_GlobalVariable obj = new Blocal_GlobalVariable(12.0);
	   double balane=obj.getBalance(100);
	   System.out.println("instance variable "+balane);
	}
	 public void deposit(double amount) {
	        balance += amount;  // Modify instance variable
	    }

	    public double getBalance(int a)
	    {       balance=a;
	        return balance;  // Access instance variable
	    }
}



/*//local and global variable:-

public class Blocal_GlobalVariable {

	  int  a ;
	String name ;
	static String Team = "India ";
	public static void main(String[] args) {

		Blocal_GlobalVariable  obj  = new Blocal_GlobalVariable();
		
		obj.method1(10);
		
		//System.out.println("local and global variable"+a);
		
	}
	public  void method1(int b)
	{
	//	b=a;	
		int c =a+b;
		System.out.println("local and global variable"+c);
	}

}


//Static global variable
 * 
public class Blocal_GlobalVariable {
	   private static int count = 0;  // Static variable
	   
	   public Blocal_GlobalVariable() {
	        count++;  // Increment static variable
	    }

	
	public static void main(String[] args) {
		
		Blocal_GlobalVariable obj = new Blocal_GlobalVariable();
		int  Count=obj.getCount();
		System.out.println("count: "+Count);
		
		 
	}
		  
		    public static int getCount() {
		        return count;  // Access static variable
		    
		    }
	
	}

 */














