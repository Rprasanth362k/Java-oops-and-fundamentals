package polymorphism;

public class Flower_plant extends Plant {

	public static void main(String[] args) {
	

	}
	
	@Override
	protected void structure()
	{
		System.out.println("Flower_plant: plant structure is Short ");
		super.structure();
	}
	public void Flower_plant_purpose()
	{
		System.out.println("Purpose: Grown mainly for their beauty and fragrance.\n"
				+ "");
		
		
	}
	
	public void Caring_for_Flower_Plants()
	{
		System.out.println("Watering: Water regularly but ensure good drainage to avoid root rot.\n"
				+ "Sunlight: Some flowers need full sun, while others prefer shade.\n"
				+ "Soil: Use well-drained soil, often with organic matter like compost.\n"
				+ "Pruning: Trim dead flowers and leaves to promote healthy growth.\n"
				+ "Fertilizing: Use flower-specific fertilizers to help them bloom.");
	}
	
}
