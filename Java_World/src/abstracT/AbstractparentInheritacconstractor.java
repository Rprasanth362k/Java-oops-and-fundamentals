package abstracT;

public abstract class AbstractparentInheritacconstractor {
	
	int val;
	
	public AbstractparentInheritacconstractor()
	{
		System.out.println("parent: Default");
	}

	
	
	
	public AbstractparentInheritacconstractor(int vale)
	{
		System.out.println("Parent: parmiterised");
		this.val=vale;
	}
}
