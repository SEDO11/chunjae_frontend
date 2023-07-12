package sec2;

// 2차원 배열

public class Example2 {
    public static void main(String[] args) {
        // java 17 doc - 자바개발문서
        int[] arr1 = {10, 20, 30};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90},
                {20, 40, 60}};
        int[][][] arr3 = {{{10, 20}, {30, 40}, {10, 20}}, {{10, 20}, {30, 40}, {10, 20}}, {{10, 20, 30}, {40, 50, 60, 70, 80}}};
        for (int i=0; i<arr3.length; i++) {
            for (int j=0; j<arr3[i].length; j++) {
                for (int k=0; k<arr3[i][j].length; k++) {
                    System.out.printf("arr3[%d][%d][%d]=%d\t",i, j, k, arr3[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
