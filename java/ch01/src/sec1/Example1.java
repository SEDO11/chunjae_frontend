package sec1;

public class Example1 {
    public static void main(String[] args) {
        int a; // 변수 선언
        a = 0; // 초기화
        int b = 0; // 선언 및 초기화
        int i=0, j=0, k=0; // 한 꺼번에 선언 및 초기화
        a += 5;
        i = a + 20;
        j = a - 20;
//        System.out.println(a);
//        System.out.print(i+"\n");
//        System.out.printf("j=%d", j); // c의 printf와 같음
        star(10);
    }

    public static void star(int n) {
//        for(int i=1; i<n; i++) {
//            for(int j=0; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n; i>0; i--) {
//            for(int j=0; j<n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=0; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int k = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i+k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k += 1;
        }
    }


}
