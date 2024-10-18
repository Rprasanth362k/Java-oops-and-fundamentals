package astatic_this;

public class Simplestaticthis {
	
	int id ;
	static String  name="prasanth";
	String dept;
	
	
	public Simplestaticthis(int id, String dept) {
		
		this.id = id;
		this.dept =dept;
		System.out.println(id+name+dept);
		
	}
	
 void display()
 {
	 System.out.println(id+ name +dept);
 }
	public static void main(String[] args) {
		
		Simplestaticthis sta = new Simplestaticthis(101,"Computer-Science");
		 System.out.println(sta.id+ name +sta.dept);
		// System.out.println(id+ name +dept);// error came
			}
	}


