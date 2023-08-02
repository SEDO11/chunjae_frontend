package sec1;

public class Exam02 {
    public static void main(String[] args) {
        int[] arr = {90, 80, 85, 75, 95};
        int tot = 0;
        double avg = 0.0f;
        for(int a: arr) {
            tot += a;
        }
        avg = (double) tot / arr.length;
        System.out.printf("%d\t%3.2f", tot, avg);
    }
}
