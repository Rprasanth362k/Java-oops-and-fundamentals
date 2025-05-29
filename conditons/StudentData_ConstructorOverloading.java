package conditons;

//constructor overloading 
public class StudentData_ConstructorOverloading {
	//fields or globalvariable
    String name, gender, class_section, DOB, BloodGroup; 
    float height;
    int id;

    // Constructor 1
    StudentData_ConstructorOverloading(int id, String name, String gender, String class_section, String BloodGroup) {
        this.id = id; //local variable opposite side global variable 
        this.name = name;
        this.gender = gender;
        this.class_section = class_section;
        this.BloodGroup = BloodGroup;
    }

    // Constructor 2
    StudentData_ConstructorOverloading(int id, String name, String gender, String class_section, String DOB, float height) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.class_section = class_section;
        this.DOB = DOB;
        this.height = height;
    }

    // Constructor 3
    StudentData_ConstructorOverloading(int id, String name, String gender, String class_section) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.class_section = class_section;
    }

    void studentData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Class Section: " + class_section);
        System.out.println("DOB: " + DOB);
        System.out.println("Blood Group: " + BloodGroup);
        System.out.println("Height: " + height);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        StudentData_ConstructorOverloading student1 = new StudentData_ConstructorOverloading(1, "Mukesh", "Male", "A", "B+");
        StudentData_ConstructorOverloading student2 = new StudentData_ConstructorOverloading(2, "Prasanth", "Male", "C", "03/06/2000", 5.10f);
        StudentData_ConstructorOverloading student3 = new StudentData_ConstructorOverloading(3, "Shivan", "Male", "B");

        student1.studentData();
        student2.studentData();
        student3.studentData();
    }
}



// global/field(static/nonstatic)  you can not initialize variable value it will provide default value.
/*
 * int byte shrot long-> 0
 * float double -. 0.0
 * String  null 
 * boolean  default value is false 
 * 
 * 
 * 
 */
