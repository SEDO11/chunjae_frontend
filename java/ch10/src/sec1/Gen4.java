package sec1;

// 제너릭의 T(Type)은 기본형이 아니라 참조(클래스)형으로 선언해야 한다.
public class Gen4 implements InterGen3<Integer>{
    @Override
    public Integer method1() {
        return 0;
    }
}
