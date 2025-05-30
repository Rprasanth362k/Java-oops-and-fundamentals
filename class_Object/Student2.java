class Student2 {
//displaying the state (data) of the objects by invoking the stuinfo() method.
  String name;
  int rollno;

  public static void main(String[] args) {
    Student2 akash = new Student2();
    akash.stuinfo("Akash", 20);
    Student2 stu2 = new Student2();
    stu2.name = "karan";
    stu2.rollno = 24;
    System.out.println(stu2.name + " " + stu2.rollno);
  }

  public void stuinfo(String name, int rollno) {
    System.out.println(name + " " + rollno);

  }

}
