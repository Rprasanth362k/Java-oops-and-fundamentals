package string;

public class Test {

	public static void main(String[] args) {
String  input = "sam";
String reverse ="";

for(int i=input.length()-1;i>=0;i--)//  sam input length is 3 string array index 012
{
	reverse += input.charAt(i);
	
	}
System.out.println(reverse);
}

}
// i=3-1:2>=0
