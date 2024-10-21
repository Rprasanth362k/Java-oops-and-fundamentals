package this_keyword;

public class Animal {
	String ani_name,type;
	Animal()
	{
		System.out.println("Animals are categorized as herbivores, carnivores, or omnivores based on what they eat:");
	}
	Animal(String ani_name,String type)
	{
		this();
		this.ani_name="cow";
		this.type="Herbivores";
		
		
	}
	Animal(String ani_name,String Type,int lifetime)
	{
		this("cow","Herbivores");
	}
	Animal(String ani_name,String type,int lifetime, String fav_food)
	{
		this("Lion","Carnivores",15);
		
	}
	
	Animal(String ani_name,String type,int lifetime, String fav_food,int varity)
	{
		this("Dog","Omnivores",15,"meat");
		
	}
	
	public static void main(String[] args) {
		
      Animal animal = new Animal("Tiger","Carnivores",15,"pig",8);

	}

}
