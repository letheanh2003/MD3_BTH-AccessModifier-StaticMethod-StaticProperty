package BTH1_StaticMethod;

public class Main {
    public static void main(String[] args) {
// write your code here
        Students.change(); //calling change method

        //creating objects
        Students s1 = new Students(111, "TheAnh");
        Students s2 = new Students(222, "Khoa");
        Students s3 = new Students(333, "Thang");

        //calling display method
        s1.display();
        s2.display();
        s3.display();


    }
}