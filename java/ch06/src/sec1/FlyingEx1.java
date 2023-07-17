package sec1;

public class FlyingEx1 {
    public static void main(String[] args) {
        Flying f;
//        f1 = new Flying(); 구현 내용을 기술하지 않으면 사용 불가
        f = new Flying() {
            @Override
            public void fly() {
                System.out.println("내가 날라간다.");
            }
        };
        f.fly();

        f = new AIrplane();
        f.fly();

        f = new Birds();
        f.fly();

        f = new Dragonfly();
        f.fly();
    }
}
