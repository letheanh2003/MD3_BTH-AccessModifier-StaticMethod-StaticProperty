package BTH1_StaticMethod;

public class Students {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    //constructor to initialize the variable
    Students(int r, String n) {
        rollNo = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "JAVA FULL STACK T11";
    }

    //method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
