package sec1;

import java.util.Scanner;

public class Exam09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int[] score = null;
        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            int sel = sc.nextInt();
            int m = 0;
            switch (sel) {
                case 1:
                    System.out.print("학생수>");
                    m = sc.nextInt();
                    score = new int[m];
                    break;
                case 2:
                    for(int i=0; i<score.length; i++) {
                        System.out.printf("score[%d]>", i);
                        score[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    for(int i=0; i<score.length; i++) {
                        System.out.printf("score[%d]: %d\n", i, score[i]);
                    }
                    break;
                case 4:
                    int max = score[0];
                    int tot = score[0];
                    for(int i=1; i<score.length; i++) {
                        if(max < score[i]) {
                            max = score[i];
                        }
                        tot += score[i];
                    }
                    System.out.printf("최고 점수 : %d\n", max);
                    System.out.printf("평균 점수 : %3.1f\n", ((double) tot/score.length));
                    break;
                case 5:
                    run = false;
                    break;
            }

        }
    }
}
