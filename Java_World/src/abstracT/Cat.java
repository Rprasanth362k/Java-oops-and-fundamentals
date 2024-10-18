package abstracT;

public class Cat extends  Animal{
	
	
	
public	Cat(String name)
{
	super(name);
}

	public static void main(String[] args) {

		
		Cat cat = new Cat("Tom");
		cat.sound();
		cat.sleep();
		
		
	}
	public void sound()
	{
		System.out.println(name+"cat sound meow meow");
	}
}
