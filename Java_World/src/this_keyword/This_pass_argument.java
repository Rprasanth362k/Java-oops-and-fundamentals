package this_keyword;
//4) this: to pass as an argument in the method
public class This_pass_argument {
	public void m(This_pass_argument obj1)
	{
		System.out.println("mehtod is invoked");
	}
	void  p(){
		m(this);
		
	}

	public static void main(String[] args) {
    
		This_pass_argument obj1 = new This_pass_argument();
		obj1.p();
		
	}

}
