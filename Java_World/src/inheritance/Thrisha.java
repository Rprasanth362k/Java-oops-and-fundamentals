package inheritance;

public class Thrisha extends  Samantha_child_cow {
	
	
	private  String eat;
//	private static String drink;
	public String drink;
	public String production;
	
	private String name;
	private String age;
	private String work;
	private int sallary;
	
	public Thrisha ()
	{
		
	}
	{
		//super(eat,drink,production);
		
	}

	public Thrisha(String name, String age, String work,int sallary,String eat, String drink,String production)
	{
		super(eat,drink,production);
		this.name=name;
		this.age=age;
		this.work=work;
		this.sallary=sallary;
		//this.eat=eat;
		//this.drink=drink;
		//this.production=production;
	//	System.out.println("");
	}
	
	
	


	public static void main(String[] args) {
		Thrisha obj2 = new Thrisha();
		Thrisha obj1 = new Thrisha("Trisha","26","flim_industroy",100000000,"pakoda","cofee","kollyword");
		
	//	Samantha_child_cow obj3 =new Thrisha();
	//	Samantha_child_cow obj4 = (Samantha_child_cow )obj2;
		
		
		
	
		obj1.mybio();
		//obj3.dailevent();
		obj1.dailevent();
	

	}
	
	public  void mybio()
	{
		//super.dailevent();
		super.mybiograph();
		
		System.out.println("name: "+name+"age: "+age+"work: "+work);
		System.out.println("eat: "+super.eat+" drink: "+super.drink+" work: "+super.production);
		//System.out.println("eat: "+this.eat+" drink: "+this.drink+" work: "+this.production);
		
		
	}
	
	public  void dailevent()
	{
		super.dailevent();
        System.out.println("Subclass dailevent:--" + super.eat + " eat: " + super.drink + " drink: " + " production: " + super.production);
	}

}
