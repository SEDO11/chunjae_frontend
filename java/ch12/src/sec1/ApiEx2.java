package sec1;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ApiEx2 {
    /*
    java.util 패키지 : java.lang 패키지의 추가 기능판으로 대부분 import가 필요한 클래스로 구성

    Arrays
    Calendar
    Date
    Objects
     */

    public static void main(String[] args) {
        Date now = new Date(); // 현재 날짜와 시간
        System.out.println(now);

        String strnow = now.toString(); // 날짜를 String 으로 변환
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String today1 = sdf.format(strnow); 자바8 미만
//        System.out.println("문자열에 표시형식 날짜로 표시 : "+today1);
        String today2 = sdf.format(now); // 자바 8 이상 버전 부터 그냥 date를 넣어도 자동 포맷을 지원
        System.out.println("날짜에 표시형식 날짜로 표시 : "+today2);

        int y = now.getYear() + 1900; // 1900년도를 기준으로 해서 안쓰면 123 이렇게 나옴
        int M = now.getMonth() + 1; // 0 부터 시작
        int d = now.getDate();
        int w = now.getDay();
        int h = now.getHours();
        int m = now.getMinutes();
        int s = now.getSeconds();

        System.out.printf("%d년 %d월 %d일", y, M, d);
        System.out.printf("%d시 %d분 %d초", d, m, s);
        
        //자바8 이상은 LocaleDate를 활용하여 시간대나 지역의 지역성을 나타냄
    }
}
