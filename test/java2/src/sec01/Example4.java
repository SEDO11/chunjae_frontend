package sec01;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = null;
        String pw = null;
        String checkId = "java", checkPw = "12345";

        System.out.print("아이디: ");
        id = sc.nextLine();
        System.out.print("패스워드: ");
        pw = sc.nextLine();

        if(id.equals(checkId) && pw.equals(checkPw)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
