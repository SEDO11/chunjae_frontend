package sec2;

// 제너릭의 제한
public class MultiEx3 {
    public static void main(String[] args) {
//        Child<Parent> c1 = new Child<Parent>(); // My 까지 지정 해놨기 때문에 오류가 발생
        Child<My> c2 = new Child<>();
        Child<Season> c3 = new Child<>();
//        Child<Child> c4 = new Child<Child>(); // 자기 자신의 것은 생성 불가
    }
}
