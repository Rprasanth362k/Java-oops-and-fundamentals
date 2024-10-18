package encapsulation;

public class Myfriend {

	public static void main(String[] args) {
	
		
		MY_Personal mp = new MY_Personal();
		System.out.println(mp.Character); // default variable
		System.out.println(mp.gender);// public variable
		System.out.println(mp.things);//protected variable
		//System.out.println(mp.Secrites);// private variable
		
		mp.mythigs();//  protected method
		mp.wifi_password(); //default  method
		mp.water_bottol(); //public method
		//mp.Bank_account_info();//private method
		
	}

}
