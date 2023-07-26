package sec1;

// 람다의 추상체는 기능적 인터페이스
@FunctionalInterface
interface MyLambda1 {
    void print();
}


// 람다식
public class LambdaEx1 {
    /*
        721, 728 페이지
    
        람다식 구현체
        // 매개변수    애로우토큰      함수바디
            (x, y)      ->          {x*y};
        () -> { };          : basic style
        (x) -> { };         : consumer
        () -> {x};          : Supplier
        (x) -> {x*x};       : 
        Operator (매개변수를 전달받아 처리를 한 후 다시 반환하는 타입), 
        Function (매개변수를 받아 처리를 한 후 그 결과를 형변환하여 반환하는 타입), 
        Predicate (매개변수를 받아 비교한 후 일치하는지 여부를 논리 값으로 반환하는 타입)
         */
    public static void main(String[] args) {
        method1();
        MyLambda1 lam1 = () -> {
            System.out.println("람다");
        };

        lam1.print();
    }

    public static void method1() {
        System.out.println("메소드");
    }
}
