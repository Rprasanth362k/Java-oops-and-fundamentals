package polymorphism;

public class Child_Prasanth extends Parent_Ravi {

	public static void main(String[] args) {
		//Parent_Ravi pr = new Parent_Ravi();
	//	pr.instancemethod();
	//	Parent_Ravi.staticmethod();
		
		
		Parent_Ravi p =new Parent_Ravi();
		Child_Prasanth c =new Child_Prasanth();

		
		p.instancemethod();
		c.instancemethod();
		Child_Prasanth.staticmethod();
		Parent_Ravi.staticmethod();
		
	}
	//@Override
	static void staticmethod()
	{
		System.out.println("child: Static method ");
	}
	@Override
   void instancemethod()
	{
		System.out.println("Child: instance method ");
	}

}
