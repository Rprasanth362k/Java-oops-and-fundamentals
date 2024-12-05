package inheritance;

public class Sundarvel_Childs extends Sundalvel_Father {

	public static void main(String[] args) {
		
		Sundalvel_Father dhikshika = new Sundalvel_Father();
		Sundalvel_Father rohitha = new Sundalvel_Father();
		 
        System.out.println(Sundalvel_Father.father);
        System.out.println(rohitha.mother);
       System.out.println(dhikshika.mother);

        

          dhikshika.basicinfo_Sundarvel(dhikshika);
          rohitha.behaviourse();
		
}

}
