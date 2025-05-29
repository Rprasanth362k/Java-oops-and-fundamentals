package variables;

public class Terniary_Operator {

	public static void main(String[] args) {
  int a,b;
  a=10;
  b=(a ==1)? 20: 30; //condition ? expression_if_true : expression_if_false;

  System.out.println("value of b: "+b);
  b =(a==10)?20: 30; //condition ? expression_if_true : expression_if_false;

  System.out.println("value of b is: "+b);
	}

}
