package polymorphism;

public class Vegetable_Plants extends Plant {

	public static void main(String[] args) {
		//inheritance 
		System.out.println("Inheritance");
		Vegetable_Plants veg_pla =new Vegetable_Plants();
		veg_pla.Caring_for_Vegetable_Plants(); //own method
		veg_pla.gendral_purpose(); //inherited method
		
		//polymorphism
		System.out.println("Polymorphism");
		Plant pla = new Vegetable_Plants();// can not inherit own method(upcasting) but (parent to child) override method to inherit
		pla.structure();
		//pla.structure1();
		pla.gendral_purpose();
	//	pla.Vegetable_Plants_purpose();
		
		Vegetable_Plants veg = (Vegetable_Plants) pla;//both parent and child class inherit (downcasting)
		veg.Caring_for_Vegetable_Plants();
		veg.Vegetable_Plants_purpose();
		veg.gendral_purpose();


	}
	@Override
	public void structure()//public void structure1()
	{   super.structure();
		System.out.println("Vegetable_Plants: plant structure is Short ");
	
	}
	
	public void Vegetable_Plants_purpose()
	{
		System.out.println("Purpose: Grown mainly for their beauty and fragrance.\n"
				+ "");
	}
	public void Caring_for_Vegetable_Plants()
	{
		System.out.println("Watering: Regular watering is important, but avoid overwatering.\n"
				+ "Sunlight: Needs plenty of sunlight, around 6-8 hours a day.\n"
				+ "Soil: Use nutrient-rich soil for better growth and yield.\n"
				+ "Pest Control: Protect plants from insects and diseases.\n"
				+ "Harvesting: Pick vegetables when they are ripe for the best taste.");
	}
}
