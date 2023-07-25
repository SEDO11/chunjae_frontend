package sec5;

import java.util.regex.Pattern;

public class patternEx1 {
    // 특정 틀이 맞는지 검사하는 걸 패턴 클래스 라 한다.
    public static void main(String[] args) {
        // 검증식 구조
        // () or [] : 그룹화를 나타냄
        // w : 단어, d : 정수
        // {글자수}, {최소글자수, 최대글자수}
        // ^ : 시작문자, $ : 끝 문자
        // ? : 유무확인, * : All, + : 무조건 하나 이상
        
        // d{3,4} 숫자 3~4 자리, 공백 금지
        // d{4} 숫자 4 자리
        String regExp = "(02|031|010)-\\d{3,4}-\\d{4}"; // 검증식
        
        // 비교값
        String tel1 = "(02)-1004-1234"; // 괄호 땜에 false
        String tel2 = "02-1004-1234";
        String tel3 = "010-1004-1234";
        String tel4 = "(010)-1004-1234"; // 괄호 땜에 false
        String tel5 = "(031)-1004-1234"; // 괄호 땜에 false
        String tel6 = "031-1004-1234";
        String tel7 = "03110041234"; // 하이픈이 없어서 false
        String tel8 = "031-100-1234";
        
        // 확인
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel1));
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel2));
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel3));
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel4));
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel5));
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel6));
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel7));
        System.out.println("형식 검증 : "+ Pattern.matches(regExp, tel8));
        System.out.println();
        
        // [0-9a-zA-Z] : 숫자, 영어 대소문자만 입력 가능
        // [가-힣] : 한글만 입력 가능
        // 이메일 검증
        regExp = "\\w+@\\w+(\\.\\w+)(\\.\\w+)?"; // \\.\\w dot 뒤에 무조건 하나 이상의 단어
//        regExp = "\\w+@\\w+.\\w*.[a-z]{2,3}$";
        String email1 = "kkt@gmail.com";        // true
        String email2 = "kkt.naver.com";        // @이 없으므로 false
        String email3 = "chunjae@nate.co.kr";   // true
        String email4 = "chunjae@hanmail.net";  // true
        String email5 = "chunjae@gmail";        // 뒤에 .단어가 없으므로 false
        String email6 = "chunjae@gmail.c.r";    // 뒤가 .단어.단어 형식을 만족하므로 true

        System.out.println("이메일 검증1 : "+Pattern.matches(regExp, email1));
        System.out.println("이메일 검증1 : "+Pattern.matches(regExp, email2));
        System.out.println("이메일 검증1 : "+Pattern.matches(regExp, email3));
        System.out.println("이메일 검증1 : "+Pattern.matches(regExp, email4));
        System.out.println("이메일 검증1 : "+Pattern.matches(regExp, email5));
        System.out.println("이메일 검증1 : "+Pattern.matches(regExp, email6));

    }
}
