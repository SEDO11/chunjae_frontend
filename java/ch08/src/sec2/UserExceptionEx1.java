package sec2;

public class UserExceptionEx1 {
    public static void main(String[] args) {
        RunException re;

        try {
            method1();
        } catch (RunException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void method1() throws RunException{
        throw new RunException("실행 "); // 예외 강제 발생
    }
}
