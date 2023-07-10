package sec01;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // 키보드로 학번과 세 과목 점수를 입력받아
        // 총점, 평균, 학점, 판정, 등급등을 계산하여 출력
        // tot, avg, hak, pan, grd
        // 총점 = 전산 + PG + 0A
        // 평균은 세 과목의 점수의 총점을 3으로 나눈 실수
        // 학점은 평균이 96 이상은 A+, 93이상 A0, 90이상 A-,
        // 86 이상은 B+, 83이상 B0, 80이상 B-,
        // 76 이상은 C+, 73이상 C0, 70이상 C-,
        // 66 이상은 D+, 63이상 D0, 60이상 D-,
        // 나머지는 F
        // 판정은 평균이 80 이상이면서, 세 과목 모두 70 이상이면, "합격", 아니면, "불합격"
        // 등급은 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면 4등급, 3이면 3등급, 2이면 2등급, 1이면 1등급

        // 출력형식
        // 학번   전산  PG  0A  총점   평균  학점  판정  등급
        // xxx   xxx  xxx xxx  xxx   xxx  xx   xx   x등급

        Scanner sc = new Scanner(System.in);
        
        // 학점 입력
        System.out.print("학번: ");
        String num = sc.nextLine();
        
        // 각 과목에 대한 점수 | 전산, PG, OA 입력
        int[] score = new int[3];
        for(int i=0; i<3; i++) {
            System.out.printf("%d과목 학점 입력 : ", i+1);
            score[i] = Integer.parseInt(sc.nextLine());
        }
        
        // 총점 입력
        int sum = score[0] + score[1] + score[2];
        
        // 평균 계산
        float avg = sum / 3f;

        // 학점 계산
        String hak = "";
        if (96<=avg) {
            hak = "A+";
        } else if (93<=avg) {
            hak = "A0";
        } else if (90<=avg) {
            hak = "A-";
        } else if (86<=avg) {
            hak = "B+";
        } else if (83<=avg) {
            hak = "B0";
        } else if (80<=avg) {
            hak = "B-";
        } else if (76<=avg) {
            hak = "C+";
        } else if (73<=avg) {
            hak = "C0";
        } else if (70<=avg) {
            hak = "C-";
        } else if (66<=avg) {
            hak = "D+";
        } else if (63<=avg) {
            hak = "D0";
        } else if (60<=avg) {
            hak = "D-";
        } else {
            hak = "F";
        }
        
        // 판정 계산
        String pan = "";
        boolean p1 = false, p2 = false;
        if(avg>=80) {
            p1 = true;
        }
        if(score[0]>=70 && score[1]>=70 && score[2]>=70) {
            p2 = true;
        }
        if(p1 && p2) {
            pan = "합격";
        } else {
            pan = "불합격";
        }
        
        // 등급 계산
        String grd = "";
        int g1 = (int) avg / 20;
        if(g1>=5) {
            grd = "5";
        } else if(g1==4){
            grd = "4";
        } else if (g1 == 3) {
            grd = "3";
        } else if (g1 == 2) {
            grd="2";
        } else if (g1<=1) {
            grd="1";
        } else {
            grd="판정불가";
        }
        if(!grd.equals("판정불가")) {
            grd += "등급";
        }
        
        // 출력
        System.out.println("학번\t 전산\t PG\t OA\t 총점\t 평균\t 학점\t 판정\t 등급\t");
        System.out.printf("%s\t %d\t\t %d\t %d\t %d\t %3.2f\t %s\t\t %s\t %s\t",
                num, score[0], score[1], score[2], sum, avg, hak, pan, grd);
    }
}
