package sec02;

public class Example4 {
    public static void main(String[] args) {
        /*
        date
        1 2 3 4 5 6 7
        8 9 10 11 12 13 14
        15 16 17 18 19 20 21
        22 23 24 25 26 27 28
        29 30 31
         */
        int d = 1;
        loop:
        for(int i=0; i<5; i++) {
            for(int j=0; j<7; j++) {
                System.out.print(d++ + "\t");
                if(d==32) {
                    break loop;
                }
            }
            System.out.println();
        }
        System.out.println();

        /*
        star1
        * *
        * **
        * ***
        * ****
        * *****
         */
        System.out.println();
        for(int i=1; i<6; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        star2
          *****
          ****
          ***
          **
          * 
         */
        System.out.println();
        for(int i=5; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*
        * star3
        * *****
        *  ****
        *   ***
        *    **
        *     *
        * */
        int s1 = 0;
        for(int i=5; i>0; i--) {
            for(int j=0; j<s1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            s1++;
            System.out.println();
        }
        System.out.println();

        // 구구단
        // 2x1=2 ~~~~ 9x9=81
        System.out.println("구구단");
        for (int i=1; i<=9; i++) {
            for (int j=2; j<=9; j++) {
                System.out.printf("%dx%d=%d\t", j, i, i*j);
            }
            System.out.println();
        }
    }
}
