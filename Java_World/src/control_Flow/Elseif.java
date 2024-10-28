package control_Flow;

public class Elseif {

    static String[] name = {
        "Saran",
        "Vicky",
        "Raja",
        "Karan",
        "Gokul",
        "Vishal",
        "Prem",
        "David",
        "Ram",
        "Vijay"
    };
    static int[] tenthmark = {
        450,
        455,
        460,
        465,
        470,
        475,
        480,
        485,
        490,
        495,
        500
    };
    public static void main(String[] args) {

        elseifladder();

    }

    public static void elseifladder() {
        for (int i = 0; i < tenthmark.length; i++) {
            String grade;

            if (tenthmark[i] > 490) {
                grade = ": A+ - Grade";
            } else if (tenthmark[i] > 480) {
                grade = ": A - Grade";
            } else if (tenthmark[i] > 470) {
                grade = ": B - Grade";
            } else if (tenthmark[i] > 460) {
                grade = ": C - Grade";

            } else {
                grade = ": D - Grade";
            }
            String studentname = (i < name.length) ? name[i] : "Unknown";
            System.out.println(tenthmark[i] + ": " + grade + " " + studentname);
        }

    }

}