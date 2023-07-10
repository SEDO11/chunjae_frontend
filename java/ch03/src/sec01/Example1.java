package sec01;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // 제어문: 조건 분기문, 반복문, 기타 제어문
        
        // 조건 분기문 : if, else if, else, switch case break
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("키 : ");
        double height = sc.nextDouble();

        System.out.printf("이름 : %s\n나이 : %d\n키 : %3.2f\n", name, age, height);

        String check = "";
        if(age >= 36) {
            check = "당신은 중년입니다.";
        }
        System.out.println(check);

        check = "";
        if(height<=170) check = "숏다리";
        System.out.println(check);
    }
}
