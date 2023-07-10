package sec01;

public class Test01 {
    public static void main(String[] args) {
        // 4장

        // q3
//        for(int i=0; i<=10; i++) {
//            if (i%2==1) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // q4
//        int i = 10;
//        while(true) {
//            System.out.println(i);
//            i-=2;
//            if(i<0) {
//                break;
//            }
//        }

        // q5
        for(int i=0; i<5; i++) {
            for(int j=0; j<3; j++) {
                if(i==2) {
                    continue;
                }
                if(j==1) {
                    break;
                }
                System.out.print("A");
            }
        }
    }
}
