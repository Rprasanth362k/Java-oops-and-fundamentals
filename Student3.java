class Student3

{
  //Initialization through a constructor
  int rollno;
  int age;
  String name;

  Student3(int rollno, int age, String name) {

    this.rollno = rollno;
    this.age = age;
    this.name = name;

  }
  void display() {
    System.out.println(rollno + " " + age + " " + name);

  }

  public static void main(String[] args) {
    Student3 student1 = new Student3(101, 24, "gokul");
    Student3 student2 = new Student3(102, 22, "raju");
    Student3 student3 = new Student3(103, 22, "Vishal");

    student1.display();
    student2.display();
    student3.display();
  }
}
