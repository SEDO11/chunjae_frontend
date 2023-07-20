package sec1;

interface InterGen3<T> {
    T method1(); // 반환 값의 타입을 범용(제너릭)할 경우
}

public class Gen3 implements  InterGen3<String>{
    @Override
    public String method1() {
        return "안녕";
    }
}
