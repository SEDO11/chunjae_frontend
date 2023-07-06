package sec01;

public class Example1 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        int s3 = s1 + s2; // short 는 연산을 하면 int형이 된다.

        int x = 5;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);

        double var1 = 3.5;
        double var2 = 2.7;
        int result2 = (int) (var1 + var2);
        System.out.println(result2);

        long var3 = 2L;
        float var4 = 1.8f;
        double var5 = 2.5;
        String var6 = "3.9";
        int result3 = (int) (var3 + (int) var4 + var5 + Double.parseDouble(var6));
        System.out.println(result3);
    }
}
