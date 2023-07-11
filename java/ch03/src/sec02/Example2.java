package sec02;

public class Example2 {
    public static void main(String[] args) {
        // while
        int cnt = 0;
        int sum = 0;
        while(cnt <= 100) {
            sum += cnt++;
        }
        System.out.println(sum);
    }
}
