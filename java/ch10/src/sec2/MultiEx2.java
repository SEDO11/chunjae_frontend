package sec2;

public class MultiEx2 {
    public static void main(String[] args) {
        Multi2 m1 = new Multi2<String, Integer>("일지매", 26);
        Multi2 m2 = new Multi2<String, Integer>("홍길동", 45);
        Multi2 m3 = new Multi2<String, Integer>("일지매", 26);
        System.out.println(Multi2.conpare(m1 ,m3)); // 이름과 나이가 같으므로 true
        System.out.println(Multi2.conpare(m1 ,m2)); // 이름과 나이가 틀리므로 false
    }
}
