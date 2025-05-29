package string;

public class Palidrome_String {

	public static void main(String[] args) {

String input = "mam";
String reversed =new StringBuilder(input).reverse().toString();

if (input.equals(reversed))
{
	System.out.println("pali");
}
else
{
	System.out.println("not-pali");
}

}
}


// create the one string   that than reverse same  palindrome
//get the object using string bulider object input value, than the chekcd reverse , sam or not ,then old form input with toString method

//if input equal(reversed) other wise else part