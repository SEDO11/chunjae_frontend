package sec1;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int sno;
    private String name;
    private int point;

    public Student() {}

    public Student(int sno, String name, int point) {
        this.sno = sno;
        this.name = name;
        this.point = point;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

public class ListEx3 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        
        // 추가
        lst.add("안녕");
        lst.add("하세요");
        lst.add("하하");
        lst.add("호호");
        System.out.println(lst);
        
        // 값 또는 인덱스로 제거
        lst.remove("호호");
        lst.remove(1);
        System.out.println(lst);
        
        // 전체 값 삭제
        lst.clear();
        System.out.println(lst);

        lst.add("홍길동");
        lst.add("일지매");
        lst.add("김보경");
        lst.add("김기태");
        System.out.println(lst);
        System.out.println(lst.size()); // 개수

        // contains, list 내의 값의 존재 확인 유무
        String s = lst.contains("이기태") ? "있음" : "없음";
        System.out.println(s);
        s = lst.contains("김기태") ? "있음" : "없음";
        System.out.println(s);
        
        // list가 비워져 있는지 확인
        s = lst.isEmpty() ? "비어있음" : "채워져있음";
        System.out.println(s);

        System.out.println();
        for (int i=0; i<lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        System.out.println();
        for (String i:lst
             ) {
            System.out.println(i);
        }


        // List를 클래스로 만들어서 값을 저장, 출력하는 법
        List<Student> std = new ArrayList<>();
        Student s1;
        String[] name = {"오세훈", "백준철", "신승원", "구예진"};
        for (int i=0; i<name.length; i++) {
            s1 = new Student();
            s1.setName(name[i]);
            s1.setSno(i+1);
            s1.setPoint(50);
            std.add(s1);
        }
        
        for (int i=0; i<std.size(); i++) {
            Student s2 = std.get(i);
            System.out.println(s2.getSno());
            System.out.println(s2.getName());
            System.out.println(s2.getPoint());
            System.out.println();
        }

        // jdk 1.6 이하에서는 안 될 수 있다.
        for (Student st1:std
             ) {
            System.out.println(st1.getSno());
            System.out.println(st1.getName());
            System.out.println(st1.getPoint());
            System.out.println();
        }
    }
}
