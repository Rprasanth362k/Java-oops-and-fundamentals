package astatic_this;

public class Static_using_count {
 static int static_count =0;
       int obj_count=0;
 
 
 Static_using_count()
 {
	 static_count++;
	 obj_count++;
	System.out.println("static"+static_count);
	System.out.println("instance"+obj_count);
 }
 
	public static void main(String[] args) {
		
		Static_using_count obj1 = new Static_using_count();
		Static_using_count obj2 =new Static_using_count();
		
		
	}

}
