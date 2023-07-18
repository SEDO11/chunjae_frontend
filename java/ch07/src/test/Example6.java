package test;

class A2 {
    int m = 3;
    int n = 5;
    void abc() {
//        int n = 5; // 얘 때문에 bcd()에서 n이 증발
        class B {
            void bcd() {
                m = m+1;
                System.out.println(m);
                n = n+1;
                System.out.println(n);

            }
        }
    }
}

public class Example6 {
    public static void main(String[] args) {

    }
}
