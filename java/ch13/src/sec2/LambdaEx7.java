package sec2;

// Predicate
@FunctionalInterface
interface MyLambda7<T, Q> {
    boolean compare(T t, Q q);
}

public class LambdaEx7 {
    public static void main(String[] args) {
        MyLambda7<Integer, Integer> comp1 = (a, b) -> {
            return a==b ? true : false;
        };

        MyLambda7<String, String> comp2 = (s, s2) -> {
            return s.equals(s2) ? true : false;
        };

        System.out.println(comp1.compare(10, 20));
        System.out.println(comp2.compare("str", "str"));
        System.out.println(comp1.compare(200, 200));
    }
}
