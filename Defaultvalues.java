public class DefaultValues {
    // Primitive data types
    boolean b;
    byte by;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;

    // Reference data type
    String str;

    public void displayDefaultValues() {
        System.out.println("Default value of boolean: " + b);
        System.out.println("Default value of byte: " + by);
        System.out.println("Default value of short: " + s);
        System.out.println("Default value of int: " + i);
        System.out.println("Default value of long: " + l);
        System.out.println("Default value of float: " + f);
        System.out.println("Default value of double: " + d);
        System.out.println("Default value of char: '" + c + "'");
        System.out.println("Default value of String: " + str);
    }

    public static void main(String[] args) {
        DefaultValues dv = new DefaultValues();
        dv.displayDefaultValues();
    }
}

