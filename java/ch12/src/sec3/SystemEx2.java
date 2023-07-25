package sec3;

class Student {
    private int no;
    private String name;

    public Student() {}

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class SystemEx2 {
    public static void main(String[] args) {
        Student st1;
        st1 = new Student(1, "홍길동");
        System.out.println(st1.getNo()+st1.getName());

        // 쓰레기 값
        // 자바는 자동으로 가비지 컬렉션을 사용하기에 초기 값으로 출력
        st1 = null;
        st1 = new Student();
        System.out.println(st1.getNo()+st1.getName());

        // 가비지 컬렉션 동작
        // 더 이상 사용하지 않는 메모리 공간을 사용할 수 있는 공간으로 바꿈
        System.gc();
    }
}
