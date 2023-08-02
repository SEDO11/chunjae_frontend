package sec1;

public class Exam05 {
    public static void main(String[] args) {
        int[][][] arr3 = {{{10, 20},{30, 40}, {10,20}},{{10, 20},{30, 40}, {10,20}}};
        for(int i=0; i<arr3.length; i++) {
            for(int j=0; j<arr3[i].length; j++) {
                for(int k=0; k<arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println("-----------------");
        }
    }
}
