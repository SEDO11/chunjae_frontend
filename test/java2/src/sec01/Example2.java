package sec01;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = null;
        String pwNum = null;
        String phone = null;

        System.out.println("[필수 정보 입력]");
        System.out.print("1. 이름: ");
        name = sc.nextLine();
        System.out.print("2. 주민번호 앞 6자리: ");
        pwNum = sc.nextLine();
        System.out.print("3. 전화번호: ");
        phone = sc.nextLine();

        System.out.println("[입력한 내용]");
        System.out.printf("%s\n%s\n%s", name, pwNum, phone);
    }
}
