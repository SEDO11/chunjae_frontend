package sec2;

class Student {
    public String concept;
}

public class MultiEx1 {
    public static void main(String[] args) {
//        Student st1 = new Student();
        Multi1 m1 = new Multi1<Student, String>(); // 사용할 key, value 타입 선언
        System.out.println(m1.setValue("김기태"));
    }
}
