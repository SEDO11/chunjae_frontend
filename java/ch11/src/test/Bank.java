package test;

import java.util.*;

public class Bank {
    private static List<Account> list = new ArrayList(); // 이용자 정보를 Account 클래스 형태로 List 를 통해 저장
    private static Scanner sc = new Scanner(System.in); // 데이터 입력
    public static void main(String[] args) {
        boolean run = true; // 반복
        Bank bank = new Bank();
        Account acc = new Account();

        while(run) {
            System.out.println("| 1.계좌생성 | 2.예금 | 3.출금 | 4.송금 | 5.계좌조회 | 6.종료 |");
            int choice = Integer.parseInt(sc.nextLine());
            int k = -1;
            switch (choice) {
                case 1:
                    System.out.println("계좌생성");
                    try {
                        acc = bank.create();
                        System.out.println("당신의 계좌번호 : "+acc.getAccount());
                        list.add(acc);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.println("예금");
                    k = bank.idPwCheck();
                    if (k == -1) {
                        System.out.println("아이디 혹은 비밀번호가 일치하지 않거나 없습니다.");
                    } else {
                        bank.deposit(k);
                    }
                    break;
                case 3:
                    System.out.println("출금");
                    k = bank.idPwCheck();
                    if (k == -1) {
                        System.out.println("아이디 혹은 비밀번호가 일치하지 않거나 없습니다.");
                    } else {
                        bank.withdraw(k);
                    }
                    break;
                case 4:
                    System.out.println("송금");
                    k = bank.idPwCheck();
                    if (k == -1) {
                        System.out.println("아이디 혹은 비밀번호가 일치하지 않거나 없습니다.");
                    } else {
                        int k2 = bank.nameAccCheck();
                        bank.transfer(k, k2);
                    }
                    break;
                case 5:
                    System.out.println("계좌조회");
                    for (Account acc2:list) {
                        System.out.printf("name: %s\t id: %s\t acc: %d\n",acc2.getName(), acc2.getId(), acc2.getAccount());
                    }
                    break;
                case 6:
                    System.out.println("종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력되었습니다.");
            }
        }
    }

    public Account create() throws Exception{
        Account acc = new Account();
        System.out.println("계좌생성 입력");

        System.out.print("이름 : ");
        String name = sc.nextLine();
        acc.setName(name);

        System.out.print("아이디 : ");
        acc.setId(idCheck());

        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();
        acc.setPw(pw);

        System.out.print("입금 잔액 : ");
        int money = Integer.parseInt(sc.nextLine());
        acc.setMoney(money);

        acc.setAccount(accCheck());

        return acc;
    }

    public int idPwCheck() {
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();

        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getId().equals(id) && list.get(i).getPw().equals(pw)) {
                return i;
            }
        }
        return -1;
    }

    public int nameAccCheck() {
        System.out.print("보낼 계좌번호 : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("이름 : ");
        String name = sc.nextLine();

        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getAccount() == num && list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int accCheck() {
        int rd = (int) (Math.random()*899+100);
        if(list.size() == 0) {
            return rd;
        } else {
            boolean chk_acc = true;
            while (chk_acc) {
                boolean check1 = true;
                loop:
                for(Account acc1 : list) {
                    if(acc1.getAccount() == rd) {
                        check1 = false;
                        rd = (int) (Math.random()*899+100);
                        break;
                    }
                }
                if(check1) {
                    chk_acc = false;
                }
            }
        }
        return rd;
    }

    public String idCheck() {
        String id = sc.nextLine();
        if(list.size() == 0) {
            return id;
        } else {
            boolean chk_acc = true;
            while (chk_acc) {
                boolean check1 = true;
                loop:
                for(Account acc1 : list) {
                    if(acc1.getId().equals(id)) {
                        System.out.println("중복된 아이디입니다.");
                        System.out.print("다시한번 더 입력해주세요 : ");
                        id = sc.nextLine();
                        check1 = false;
                        break;
                    }
                }
                if(check1) {
                    chk_acc = false;
                }
            }
        }
        return id;
    }

    public void deposit(int k) {
        System.out.print("입금할 금액: ");
        int money = Integer.parseInt(sc.nextLine());
        list.get(k).setMoney(list.get(k).getMoney()+money);
        System.out.println("입금 성공 , 잔액: "+list.get(k).getMoney());
    }

    public void withdraw(int k) {
        System.out.print("출금 할 금액: ");
        int money = Integer.parseInt(sc.nextLine());
        int money2 = list.get(k).getMoney();
        if(money2<money) {
            System.out.println("출금 금액 초과, 출금 실패");
        } else {
            list.get(k).setMoney(money2-money);
            System.out.println("출금 성공 , 잔액: "+list.get(k).getMoney());
        }
    }

    public void transfer(int k, int k2) {
        System.out.print("송금 할 금액: ");
        int money = Integer.parseInt(sc.nextLine());
        int money2 = list.get(k).getMoney();
        if(money2<money) {
            System.out.println("출금 금액 초과, 송금 실패");
        } else {
            list.get(k).setMoney(money2-money);
            System.out.printf("%s | 송금 성공 , 잔액: %d\n", list.get(k).getName(), list.get(k).getMoney());
            list.get(k2).setMoney(list.get(k2).getMoney()+money);
            System.out.printf("%s | 입금 성공 , 잔액: %d\n", list.get(k2).getName(),list.get(k2).getMoney());
        }
    }
}
