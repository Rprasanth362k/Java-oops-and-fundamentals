package clas_an_obj;

public class sample {
	
	
	static int  val =10;

	public static void main(String[] args) {
		
		
		new sample().nonstatic();// anonymous object.
		
		sample  n1 = new sample(), n2 =new sample(); // We can create multiple objects by one type only as we do in case of primitives.
		n1.elephant();
		n2.tiger();
		n1.Zebra();
		n2.lion();
		
		sample obj1 =new sample();
		
		
		System.out.println(sample.val);
	
        obj1.method1(); //sample.method1(); or method1();
	}
	
	private void lion() {
	System.out.println("i am non-veg");
		
	}

	private void Zebra() {
    System.out.println("i am veg");	
		
	}

	private void tiger() {
    System.out.println("i am non-veg");	
		
	}

	private void elephant() {
		
    System.out.println("i am veg");	
	}

	public static void method1()
	{
		System.out.println("static method called object reference");
		
		
	}
	public void nonstatic()
	{
		System.out.println("hellow , me called  anoynomys object");
	}

}


//Anonymous simply means nameless. 
//An object which has no reference is known as anonymous object. 
//It can be used at the time of object creation only.