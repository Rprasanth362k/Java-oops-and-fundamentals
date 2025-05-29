package asuper_Final;

public class Agent_Mummy_Dog {
	
	 String color = "white",name;
	static  String specalist ="Bombsquad";
	 int Misson_succesed = 35,batch;
	 
	 public   Agent_Mummy_Dog()
	 {
		 System.out.println("Agent_Mummy_Dog died onDuty");
	 }
	 
	 
	 
	 public Agent_Mummy_Dog(String name,int batch)
	 {
		 this.name=name;
		 this.batch=batch;
		System.out.println("Agent: " +name + " Batch: "+batch);
	 }
	 
	 
	 public static void  main (String[] args) {
		 
		 Agent_Mummy_Dog mummy = new Agent_Mummy_Dog("Samantha",12);
		 mummy.skill();
		 
	 }
	 
	public void  skill()
	{
		System.out.println("Skill: Detection, search and rescue, security, and protection in various military operations");
	}
	 
	 
	public static void Rewards()
	 {
		 System.out.println("Reward: India Goverment annonced to Agent_Samantha_dog service  3 gold medal gived Thirisha");
		 
	 }
	 }
