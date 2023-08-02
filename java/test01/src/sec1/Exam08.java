package sec1;

import java.util.Scanner;

public class Exam08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money = 0;
        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            int i = sc.nextInt();
            int m = 0;
            switch (i) {
                case 1:
                    System.out.print("예금액>");
                    m = sc.nextInt();
                    money += m;
                    break;
                case 2:
                    System.out.print("출금액>");
                    m = sc.nextInt();
                    money += m;
                    break;
                case 3:
                    System.out.println("잔고>"+money);
                    break;
                case 4:
                    run = false;
            }

        }
    }
}
