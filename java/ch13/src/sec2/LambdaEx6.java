package sec2;

// Function
@FunctionalInterface
interface MyLambda6<T , R> { // 여기에서 T는 매개변수, R는 반환값으로 사용 선언
    R cal(T a, T b);
}

public class LambdaEx6 {

    public static void main(String[] args) {
        // 곱하기
        MyLambda6<Integer, Long> mul = (a, b) -> { // Integer 형 입력, 출력
            return (long) a * b;
        };

        // 나누기
        MyLambda6<Integer, Double> div = (a, b) -> { // Integer 형 입력, Double 형 출력
            return (double) a / b;
        };

        // 더하기
        MyLambda6<Integer, Integer> sum = (a, b) -> {
            return (int) a+b;
        };

        // 빼기
        MyLambda6<Integer, Integer> sub = (a, b) -> {
            return (int) a-b;
        };

        // 나머지
        MyLambda6<Integer, Integer> mod = (a, b) -> {
            return (int) a%b;
        };

        System.out.println(sum.cal(30, 50));
        System.out.println(div.cal(52, 3));
        System.out.println(mul.cal(52, 3));
        System.out.println(sub.cal(52, 3));
        System.out.println(mod.cal(52, 3));
    }
}
