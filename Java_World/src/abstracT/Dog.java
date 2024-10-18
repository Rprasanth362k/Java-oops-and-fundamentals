package abstracT;

public class Dog extends Animal {
	
 
  
   public Dog(String name)
   {
	   super(name);
	  
	   
   }
	

	public static void main(String[] args) {
		
Dog  dog = new Dog("Jhony");
 
 dog.sound();
 dog.sleep();
	}
	
	
	public void sound()
	{
		System.out.println(name+"making sound is wow wow");
	}
	
}
