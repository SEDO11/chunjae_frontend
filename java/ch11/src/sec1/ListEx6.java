package sec1;

import java.util.LinkedList;
import java.util.List;

public class ListEx6 {
    public static void main(String[] args) {
        List<Student> s = new LinkedList<>();
        String[] name = {"오세훈", "백준철", "신승원", "구예진"};
        for (int i=0; i<4; i++) {
            int num = i+1;
            s.add(new Student(num, name[i], num<<2));
        }
        for (Student s1: s) {
            System.out.printf("%d %s %d\n", s1.getSno(), s1.getName(), s1.getPoint());
        }
    }
}
