package typeCastingObj;

public class MianUpcasitng  {

	public static void main(String[] args) {
		
		//Upcasting
		Sports spo = new Cricket();
		Sports spo1 = new Football();
		Cricket spo2 =new Cricket();
		Football  spo3=new Football();
		spo.displayname();
		spo1.displayname();
		spo2.cricdispylayname();
		spo3.footdisplayname();
		
		
		
		/* MianUpcasting extends football class  mean access Sports method and footballmethod
		 MianUpcasitng mian =new MianUpcasitng();
		 mian.displayname();
		 mian.footdisplayname();
		*/
		
		
		//Downcasting
		
		
		Sports spo4 = new Cricket();
		Cricket cri = (Cricket) spo4;
		spo4.Name="Prasanth";
		System.out.println(spo4.Name);
		spo4.displayname();
		cri.name="Dhoni";
		System.out.println(cri.name);
		cri.age=50;
		System.out.println(cri.age);
		cri.cricdispylayname();
		
		Sports spo5 = new Football();
	    Football foot =(Football) spo5;
		spo5.Name="prasanth";
		spo5.displayname();
		foot.name="Ronalodo";
		foot.age=35;
		foot.footdisplayname();
		
	}

}
