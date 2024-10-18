package abstracT;

public class AbstractChildInheritacconstractor extends AbstractparentInheritacconstractor {

	int val;
	
	public AbstractChildInheritacconstractor()
	{
	     super();
	     //super(10);
		System.out.println("child: Default");
	}
	public AbstractChildInheritacconstractor(int val)
	{  
	 //super();
		super(10);
		this.val=val;
		System.out.println(val);
		System.out.println("Child: parametised");
		
	}
	public static void main(String[] args) {
		AbstractChildInheritacconstractor ab = new AbstractChildInheritacconstractor();
		
		AbstractChildInheritacconstractor ab1 = new AbstractChildInheritacconstractor(100);
	}

}
