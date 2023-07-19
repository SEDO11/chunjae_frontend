package sec1;

public class Example6 {
    public static void main(String[] args) {
        // 클래스 로딩 구문에는 반드시 try~catch 처리를 해야 한다.
        try {
            Class clazz = Class.forName("maria.jdbc.driver");
        } catch (ClassNotFoundException e) {
            System.out.println("존재하지 않거나 없는 클래스");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        } finally {
            System.out.println("연결된 모듈 닫기");
        }
    }
}
