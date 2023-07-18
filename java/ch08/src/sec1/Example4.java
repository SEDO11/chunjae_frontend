package sec1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int su;
        try {
            System.out.print("숫자 입력 : ");
            su = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("문자로 입력하였음 숫자로 입력해야함");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
    }
}
