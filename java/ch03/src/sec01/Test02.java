package sec01;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        
        // 5장 예제
        
        // q3
        double[] a = {1.2, 3.4, 5.6};
        double[] b = a;
        b[0] = 7.8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // q4
        int[] c = {1, 2, 3, 4 ,5};
        for (int k:c
             ) {
            System.out.print(k);
        }
        System.out.println();

        //q5
        int[][] d = new int[2][3];
        int v1 = 1;
        loop:
        for(int i=0; i<d.length; i++) {
            for(int j=0; j<d[i].length; j++) {
                if(i==1 && j==2) {
                    break loop;
                }
                d[i][j] = v1;
                v1 += 2;
                System.out.print(d[i][j]);
            }
        }
        System.out.println();

        //q7
        String a1 = "방가";
        String b1 = new String("방가");
        String c1 = "방가";
        String d1 = new String("방가");
        String e1 = "방가";
        String f1 = new String("방가");

        System.out.println(a1==b1);
        System.out.println(a1==c1);
        System.out.println(a1==d1);
        System.out.println(a1==e1);
        System.out.println(a1==f1);
        System.out.println();

        System.out.println(b1==c1);
        System.out.println(b1==d1);
        System.out.println(b1==e1);
        System.out.println(b1==f1);
        System.out.println();

        // q8
        String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
        String name = "";
        int age = 0;
        int[] arr = new int[4];
        arr[0] = str.indexOf("[");
        arr[1] = str.indexOf("]");
        arr[2] = str.lastIndexOf("[");
        arr[3] = str.lastIndexOf("]");

        System.out.println(""+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
        String str1 = str.substring(arr[0]+1, arr[1]);
        String str2 = str.substring(arr[2]+1, arr[3]);

        name = str1;
        age = Integer.parseInt(str2);

        System.out.println(name+" "+age);
    }
}
