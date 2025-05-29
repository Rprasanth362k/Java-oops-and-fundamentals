class Employee 
{
// 1. Using new keyword creating object 
int id;
String name;
Employee (int id , String name)
{
this.id=id;
this.name=name;
System.out.println(id+" "+name);
}
public static void main(String[] args)
{
 Employee  employye = new Employee(101,"prasanth");

}
}
