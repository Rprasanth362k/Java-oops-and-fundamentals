package this_keyword;
//3) this() : to invoke current class constructor
public class Animal {
	String ani_name,type;
	int varity;
	Animal()
	{
		System.out.println("Animals are categorized as herbivores, carnivores, or omnivores based on what they eat:");
	}
	Animal(String ani_name,String type)
	{
		this();
		this.ani_name="cow";
		this.type="Herbivores";
		System.out.println(" Ani_name: "+ani_name+",Type: "+type);		
		
	}
	Animal(String ani_name,String Type,int lifetime)
	{
		this("cow","Herbivores");
		System.out.println(" Ani_name: "+ani_name+",Type: "+type+", Lifetime: "+lifetime);	
		

	}
	 Animal(String ani_name,String type,int lifetime, int   varity)
		
		{
			
		this.varity=varity;
		System.out.println("Ani_name: "+ani_name+",Type:  "+type+", Lifetime: "+lifetime+", Varity:"+varity );
					
		}
	Animal(String ani_name,String type,int lifetime, String fav_food)
	{
		this("Lion","Carnivores",15);
		System.out.println(" Ani_name: "+ani_name+",Type: "+type+", Lifetime: "+lifetime+", Fav_food "+fav_food);
		
	}
	
	Animal(String ani_name,String type,int lifetime, String fav_food,int varity)
	
	{
		this("Dog","Omnivores",15,"meat");
		System.out.println(" Ani_name: "+ani_name+",Type: "+type+", Lifetime: "+lifetime+", Fav_food "+fav_food+", varity: "+varity);		
	}
  
	public static void main(String[] args) {
		 Animal animal = new Animal("Tiger: ","Carnivores ",15,"pig",8);
		
      Animal animal1 = new Animal("Leparod: ","Carnivores",15,3);

	}

}
