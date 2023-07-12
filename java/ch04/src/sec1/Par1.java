package sec1;

public class Par1 {
    public static void main(String[] args) {
        try {
            Son1 son = new Son1(new int[]{90, 80, 70, 60, 50, 40, 30, 20});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("무조건 출력");
        }

    }
}
