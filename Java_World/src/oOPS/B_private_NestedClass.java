package oOPS;

public class B_private_NestedClass { //Outer class 

	public static void main(String[] args) {
		
		 B_private_NestedClass outer = new  B_private_NestedClass();
        outer.createInnerInstance();
        
	}
        public void createInnerInstance()
        {
        	InnerClass inner = new InnerClass();
        	inner.display();
        	
        }
        
        public class  InnerClass
        {
           void display()
           {
        	   System.out.println("Hi from the private inner class ");
        	   }
        	
        }
        
	}


