public class ParameterizedConstructor {

    int experience ;  
    int salary;
    String jobVacancy, name;

    // Parameterized constructor
    ParameterizedConstructor(String name, String jobVacancy, int salary,int experience) {
        this.name = name;
        this.jobVacancy = jobVacancy;
        this.salary = salary;
        this.experience= experience;
    }

    void candidateInfo() {
        System.out.println("Candidate Name: " + name);
        System.out.println("Job Vacancy: " + jobVacancy);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        ParameterizedConstructor candidate1 = new ParameterizedConstructor("Prasanth", "Java Developer", 25000,1);
        ParameterizedConstructor candidate2 = new ParameterizedConstructor("Vignesh", "Frontend Developer", 26000,1);

        candidate1.candidateInfo();
        candidate2.candidateInfo();
    }
}
