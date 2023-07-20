package sec1;

// Type: T, Element: E, Key: K, Number: N, Value : V, Result: R, Question: Q, Query: Q, Generic, 에서
// 첫 번째 글자만 약어로 만들어 인자를 사용하는 것이 관례이다.
// public class 클래스명<인자> {}
public class Gen2<T> {
    private T t; // Genertic 이라는 클래스에서 가져온 클래스 타입의 변수

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
