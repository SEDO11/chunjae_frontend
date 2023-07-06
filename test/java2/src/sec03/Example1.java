package sec03;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("홍길동", "hong", "12345", 5000);
        boolean run = true;

        while(run) {
            int select = Integer.parseInt(sc.nextLine());
            int money = 0;
            switch (select) {
                case 1:
                    System.out.print("입금 액: ");
                    money = Integer.parseInt(sc.nextLine());
                    int n = acc.setMoney(acc.getMoney()+money);
                    System.out.printf("잔액: %d", );

            }
        }

    }
}
