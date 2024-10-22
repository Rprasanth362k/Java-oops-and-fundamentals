package this_keyword;

public class A4 {
	int print=10;
	A4(){
		Printer print = new  Printer(this);
		print.display();
	}

	public static void main(String[] args) {
		A4 a= new A4();
	

	}

}
