package sec1;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hak = "";
        String pan = "";
        String grd = "";

        System.out.print("학번 : ");
        String bun = sc.nextLine();
        System.out.print("전산 : ");
        int jun = sc.nextInt();
        System.out.print("PG : ");
        int pg = sc.nextInt();
        System.out.print("OA : ");
        int oa = sc.nextInt();

        int tot = jun + pg + oa;
        double avg = tot / 3.0f;
        if(avg>=90) {
            hak = "A";
        } else if(avg>=80) {
            hak = "B";
        } else if(avg>=70) {
            hak = "C";
        } else if(avg>=60) {
            hak = "D";
        } else {
            hak = "F";
        }

        if(avg>=60) {
            int n = (int) avg % 10;
            if(n>=6) {
                hak += "+";
            } else if (n>=3) {
                hak += "0";
            } else {
                hak += "-";
            }
        }

        if(avg>=80 && jun >=70 && pg>=70 && oa>=70) {
            pan = "합격";
        } else {
            pan = "불합격";
        }

        grd = ((int) avg / 20)+"등급";

        System.out.println("학번\t전산\tPG\tOA\t총점\t평균\t학점\t판정\t등급");
        System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\t%s\t%s\t%s", bun, jun, pg,
                oa, tot, avg, hak, pan, grd);



    }
}
