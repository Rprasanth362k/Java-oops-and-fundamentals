package constructor;

public class Constructor {
      String name;
      int  age;
      String role;
      // when do not define constructor automatically call default constructor.
      
    public  Constructor()
      {
    	this.name="prasanth";
    	this.age=24;
    	this.role="Software Developer";
    	
    	  
      }
    private Constructor(String name,int age ,String role)
    {
    	this.name=name;
    	this.age=age;
    	this.role=role;
    	
    }
    public void display()
    {
    	System.out.println("Name: "+name+", Age: "+age+", Role: "+role);	
    	
    }
    public void display1()
    {
    	System.out.println("Name: "+name+", Age: "+age+", Role: "+role);
    	
    }
 
	public static void main(String[] args) {
		
		Constructor dc = new Constructor();
		Constructor dc1 = new Constructor("karan",24,"welder");
		dc.display();
		dc1.display1();
	}

}
// constructor only public ,private ,protected only permit  , not permit static,final,abstract
//constructor  not allowed return type
//Constructor must have class name
//constructor automatically and constructor is spacial  method, methods need to call explicitly .
//constructor  two types one default constructor and parameterized constructor
//Unparameterized Constructor: Called automatically when you create an object with no arguments.
//Default Constructor: Provided by Java automatically if no other constructors are defined. Called automatically when you create an object with no arguments.
//Parameterized Constructor: Needs to be called explicitly by passing arguments during object creation.