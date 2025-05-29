package constructor;

public class Forest {
	// copy constructor
	String name;
	String role;
	//Parameterized  constructor
	Forest (String name, String role)
	{
		this.name=name;
		this.role=role;
		
	}
  // copy constructor
	Forest (Forest paste)
	{
		this.name=paste.name;
		this.role=paste.role;
		
	}
	@Override
 public String toString()
 {
	return "Name: " + name +", Description: "+role;
	 
 }
 
	public static void main(String[] args) {
		Forest copy = new Forest("Lio_Linon","King Of the Forest.");
		Forest paste = new Forest(copy);
		System.out.println(copy);// when do not use toString() that will print the to hashcode like constructor.Forest@49c43f4e
		System.out.println(paste.name+", "+paste.role);

	}

}
/*
Key Points for Copy Constructor:

    Creates a New Object: Makes a new object with the same values as another.
    Prevents Changes to Original: Changes to the copy don’t affect the original object.
    Avoids Shared Memory: Each object has its own memory space.
    Useful for Cloning: Easy way to duplicate an object.
    Custom Copying: You can decide how to copy the object’s data.


*/