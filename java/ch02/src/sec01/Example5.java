package sec01;

import java.util.Date;

public class Example5 {
    public static void main(String[] args) {

        Date birth = new Date(); // 오늘날짜
        String birth2 = "2023-07-07";
        
        // birth의 타입 확인
        System.out.println(birth);
        System.out.println("birth 타입: " + (birth instanceof Date)); // Date 로 부터 만들어진 인스턴스 인지 확인
        System.out.println(birth.getClass().getName()); // 해당 변수의 타입 확인
        System.out.println(birth2.getClass().getName());

        //삼항 연산자
        int point = 84;
        String pan = (point >= 80) ? "합격" : "불합격";
        System.out.println(pan);
    }
}
