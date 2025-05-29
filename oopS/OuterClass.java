package oopS;

public class OuterClass {
	
	private class InnerPrivate
	{
		void show()
		{
			System.out.println("private inner class");
		}
	}
	
protected class InnerProtected
	{
		void show()
		{
			System.out.println("protected inner class");
		}
	}

class InnerDefault
{
	void show()
	{
		System.out.println("Default inner class");
	}
}


public class InnerPublic
{
	void show()
	{
		System.out.println("public  inner class");
	}
}

	
}
