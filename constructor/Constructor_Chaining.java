package constructor;

public class Constructor_Chaining {
	String name,role;
	int exp;
char grade;
Constructor_Chaining(String name,String role)
{
	
	this.name=name;
	this.role=role;
	System.out.println("Name: "+name+", Role: "+role);
}
Constructor_Chaining(String name,String role,int exp)
{
	this(name,role);
	this.exp=exp;
	
	System.out.println("Exp: "+exp);
}
Constructor_Chaining(String name,String role,int exp,char grade)
{
	this(name,role,exp);
	
	this.grade=grade;
	
	System.out.println("Grade: "+grade);
}
	public static void main(String[] args) {
		Constructor_Chaining obj1 = new Constructor_Chaining("Lion","King");
		
		Constructor_Chaining obj2 = new Constructor_Chaining("Elephant"," Commander ",50);
		Constructor_Chaining obj3 = new Constructor_Chaining("Rhinoceros"," Chif_Solider ",35,'A');
		
	}

}
