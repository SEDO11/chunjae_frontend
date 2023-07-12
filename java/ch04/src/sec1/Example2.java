package sec1;

public class Example2 {
    public static void main(String[] args){
        int[] a = {90, 75, 80, 85};
        int b[] = {85, 100, 70, 90};

        //
        int[] c = new int[4];
        c[0] = 100;
        c[1] = 100;
        c[2] = 100;
        c[3] = 100;
//        c[4] = 100; /* 선언할 때는 오류가 안나지만 실행하면 오류가 난다, 예외*/
        
        int[] d; // 선안만
        d = new int[]{90, 80, 85, 60}; // 할당과 초기화를 동시에 사용
        d[4] = 100; // 추가 할당시에는 오류가 없으나 실제 할당이 되지 못해서 출력할 수 없다.

        for(int i=0; i<a.length; i++) {
            System.out.printf("a[%d]=%d\t\t", i, a[i]);
        }
        System.out.println();

        for(int i=0; i<b.length; i++) {
            System.out.printf("a[%d]=%d\t\t", i, b[i]);
        }
        System.out.println();

        // foreach 문
        for (int p:c) {
            System.out.printf("%d\t", p);
        }

        for (int p:d) {
            System.out.println(p);
        }
    }
}
