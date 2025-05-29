package control_Flow;

public class Switch {

	public static void main(String[] args) {
		
		String [] passanger_Name={"Prasanth","Karan","RajaRam","Srinivasan","Prabu","Krishnan"};
		
		int []bus_Stop = {1,2,3,4,5,5};
		
		for(int i=0;i<passanger_Name.length;i++)
		{
			String passangername= passanger_Name[i];
			int  bus_Sto= bus_Stop[i];
		switch(bus_Sto)
		
		{
		case 1: System.out.println(passangername+"        BusStop is: "+"Thiruttani");
		break;
		case 2: System.out.println(passangername+"           BusStop is: "+"Arrakonum");
		break;
		case 3: System.out.println(passangername+"         BusStop is: "+"Puliamangalm");
		break;
	    case 4: System.out.println(passangername+"      BusStop is: "+"Polur");
		break;
	    case 5: System.out.println(passangername+"           BusStop is: "+"Thirvalgadu");
		break;
	    case 6: System.out.println(passangername+"        BusStop is: "+"Manvaur");
	    default:
	    	System.out.println(passangername+"        Missing the depature place");
		break;
		}
		
		}
		}

	}
	
	
	
	


