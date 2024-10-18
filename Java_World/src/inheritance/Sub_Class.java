package inheritance;

public class Sub_Class  extends Super_Class{
 int num=20;
 
 @Override
 public void display()
 {
	 System.out.println("Sub_Class: This method for Sub_Class");
 }
 
 
 public void mymethod()
 {
	 Sub_Class sub = new Sub_Class();
	 
	 System.out.println("Sub_class: "+sub.num);
	 System.out.println("Super_Class: "+super.num);
	 sub.display();
	 super.display();
	
 }
 public static void main(String[] args)
 {
	 Sub_Class obj = new Sub_Class();
	
	 obj.mymethod();
 }
 
}
