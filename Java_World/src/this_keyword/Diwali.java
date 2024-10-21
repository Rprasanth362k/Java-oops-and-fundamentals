package this_keyword;

public class Diwali {
//2) this: to invoke current class method
	
	
public void neighboure_1()
{
	System.out.println("Happy Diwali sam_vishal");
	this.neighboure_2();
	//neighboure_3();
}
public void neighboure_2()
{
	System.out.println("Happy Diwali sam_karan");
	
}
/*
public static void neighboure_3()
{
	System.out.println("Happy Diwali sam_prabu");
	
}
*/
	public static void main(String[] args) {
		Diwali diwali = new Diwali();
		diwali.neighboure_1();
	
	}

}
