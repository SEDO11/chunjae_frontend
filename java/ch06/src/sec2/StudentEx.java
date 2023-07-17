package sec2;

import sec1.Student;

public class StudentEx {
    public static void main(String[] args) {
        Student st1 = new Student();

        st1.print1(20);
        System.out.println(st1.print2());
        System.out.println(st1.print3("hello"));
        st1.print4();
    }

}
