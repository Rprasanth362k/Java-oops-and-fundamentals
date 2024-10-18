package inheritance;

public class Samantha_child_cow extends MummuyCowSingle_Inheritace {
   String name="Samantha";
   String like="prasanth";
   
   int age=18;
protected String eat;
public String drink;
public String production;

public  Samantha_child_cow()
{
	System.out.println("i am samanth");
}


 public  Samantha_child_cow(String eat,String drink,String production )
   {
	 this.eat=eat;
	 this.drink=drink;
	 this.production=production;
	   
   }
   

	public static void main(String[] args) {
		Samantha_child_cow obj1 = new Samantha_child_cow("briyani","straberry_jucie","milking");

       obj1.mybiograph();
       obj1.dailevent();
	}
	
	public void dailevent() {
		super.dailevent();
	System.out.println("dailevent:--"+eat+" eat: "+drink+" drink: "+" production: "+production);
		
	}


	public void mybiograph()
	{
		super.mybio();
		System.out.println(name="Samanth"+"  i am hybrid  ");
		System.out.println(age=19);
		System.out.println(like ="Prasanth"+" like");
	}

}
