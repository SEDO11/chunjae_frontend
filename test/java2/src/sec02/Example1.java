package sec02;
// 클래스
public class Example1 {
    public static void main(String[] args) {
        Member member = new Member();

        member.name = "최하얀";
        member.age = 23;

        System.out.printf("%s %d", member.name, member.age);
    }
}
