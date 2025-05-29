package abstracT;

public class ChildInheritanceConstructor extends ParentInheritanceConstructor {
       int newval;
	public ChildInheritanceConstructor(int val)
	{    super(val);
		this.newval=val;
		
		System.out.println("Child: default cosntrurrot");
		
	}
	
	
	public static void main(String[] args) {
		ChildInheritanceConstructor ch = new ChildInheritanceConstructor(100);

	}

}
