package sec02;

public class Example1 {
    public static void main(String[] args) {
        // 반복문 : 일부의 문장을 반복하여 처리해야 하는 경우 활용
        // 1~100 의 합계
        
        // for 문
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 0~100까지 2의 배수만 더함
        int sum3 = 0;
        for(int i=0; i<=100; i+=2) {
            sum3 += i;
        }
        System.out.println(sum3);

        // while 문
        int sum2 = 0;
        int j = 1;
        while(true) {
            sum2 += j++;
            if(j==11) break;
        }
        System.out.println(sum2);

        int sum4 = 0;
        int j2 = 0;
        while(true) {
            sum4 += ++j2;
            System.out.printf("%d %d\n",j2, sum4);
            if(j2==10) break;
        }
        System.out.println(sum4);

    }
}
