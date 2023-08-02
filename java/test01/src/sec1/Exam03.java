package sec1;

public class Exam03 {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            for (int j=2; j<10; j++) {
                System.out.printf("%dx%d=%d\t", j, i, j*i);
            }
            System.out.println();
        }
    }
}
