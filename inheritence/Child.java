package inheritence;

public class Child  extends Parent{
	
	int val=10;
	
	Child()
	{
		this.childMethod();
		
	}
	void childMethod() {
	
		this.val=val;
       this.parentMethod(); //❌ this can call method, BUT it's not inheritance
        parentMethod(); // ✅ Inheritance lets us call parent method directly
    
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
