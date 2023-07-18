package sec2;

// import sec1.Dbl; 외부 클래스는 하나만 public을 할 수 있므로 Dbl은 default라서 사용 불가
import sec1.Outer;

// 433 페이지
public class Example2 {
    public static void main(String[] args) {
        Outer out1 = new Outer();
        out1.setItem1(100);
        out1.setItem2("홍길동");
        System.out.println(out1.getItem1());
        System.out.println(out1.getItem2());
        
        // 이너 클래스 객체 생성
        Outer.Inner in1 = out1.new Inner();
        in1.setItem3(200);
        in1.setItem4("일지매");
        System.out.println(in1.getItem3());
        System.out.println(in1.getItem4());
        
        // 이중 클래스인 Outer.java 안에 있는 Dbl 클래스의 객체를 생성하는 방법
//        out1.db; // 필드 이용
        out1.getDbl(); // 메서드 이용
    }
}
