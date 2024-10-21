package astatic_this;

public class StaticExample {
	 static String programming,developed,official_Website; // static variable
	 static int released , count;
	 static int[] numbers = new int[5];
	 
	 static {
	  System.out.println("Static BlocK: Executed when the class is loadded.");
	  count=0;
	  for (int i =0;i<numbers.length;i++)
	  {
	   numbers[i]=i*2;
	   if(numbers[i] %4  ==0)
	   {
	    count++;
	   }
	  }
	  System.out.println("Static Block: Array initialized with even number.");
	  System.out.println("Static Block: Number divisible by 4 = "+ count );
	  
	 }
	  static  // static Block
	  {
	   programming="Java";
	   developed="James Gosling";
	   official_Website="Oracle.com";
	   released =1996;
	   System.out.println("programming: "+StaticExample.programming+", Developed_by: "+developed+", Official_Website: "+official_Website+", Released: "+released);
	  }
	 
	 public static void displayNumber() {
	  System.out.println("Static Method: Displaying array elements:");
	  
	  for(int num : numbers)
	  {
	   System.out.println("Number: "+ num);

	  }
	 }
	 
	 public static void findEvenOrodd(int number)
	 {
	  if(number % 2== 0)
	  {
	   System.out.println("Static Mehtod: "+ number +"is even. ");
	  }
	  else {
	   System.out.println("Static Method: "+ number +"is odd. ");
	  }
	 }
	 
	 
	 public static void main(String[] args) {
	 
	  
	  displayNumber();
	  findEvenOrodd(3);
	  findEvenOrodd(6);
	 }
	 

	}