package sec1;

// 람다식
public class LambdaEx1 {
    public int method1(int x, int y) {
        return x*y;
    }
    /*
    721, 728 페이지

    람다식 구현체
    // (매개변수) -> {리턴값};
    (x, y) -> {x*y};
    () -> { };          : basic style
    (x) -> { };         : consumer
    () -> {x};          : Supplier
    (x) -> {x*x};       : 
    Operator (매개변수를 전달받아 처리를 한 후 다시 반환하는 타입), 
    Function (매개변수를 받아 처리를 한 후 그 결과를 형변환하여 반환하는 타입), 
    Predicate (매개변수를 받아 비교한 후 일치하는지 여부를 논리 값으로 반환하는 타입)
     */
}
