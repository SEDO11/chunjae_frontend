package sec2;

import java.util.Arrays;

public class Example4 {
    // 189~203 page 내용
    // 연습문제 꼭 풀어보기
    public static void main(String[] args) {
        String code = "980422-1234567";
        System.out.println(code.length());

        // 해당 index 위치의 글자를 가져옴
        char m = code.charAt(7);
        System.out.println("성별코드: "+m);

        String gender = (m=='1' || m=='3') ? "남자" : "여자";
        System.out.println(gender);

        //생년 월 일 분리 80-12-15
        String yy = code.substring(0, 2); // 0~1 까지 추출
        String mm = code.substring(2, 4);
        String dd = code.substring(4, 6);
        System.out.printf("생년월일 : %s-%s-%s\n", yy, mm, dd);
        
        // 원하는 글자가 몇번째 index에 위치해 있는지 확인
        // 찾는 글자가 없는 경우 -1
        String nick = "KimKiTae";
        int idx = nick.indexOf('i');
        System.out.println(idx);
        idx = nick.lastIndexOf('i');
        System.out.println(idx);
        
        // 문자열 더하기 방법
        String name1 = nick + " imperial";
        String name2 = nick.concat(" imperial");
        System.out.println(name1);
        System.out.println(name2);
        
        // 문자열을 char형 배열로 변환 toCharArray()
        // 문자열을 byte형 배열로 변환 getBytes()
        char[] nArr = nick.toCharArray();
        byte[] bArr = nick.getBytes(); // ascii 코드로 변환해서 적용
        System.out.println(nArr[2]);
        System.out.println(bArr[2]);
        
        // 특정 타입의 데이터를 문자로 변환
        int age = 43;
        float ht = 173.8f;
        boolean ps = true;
        String val1 = String.valueOf(age);
        String val2 = String.valueOf(ht);
        String val3 = String.valueOf(ps);
        System.out.printf("%s %s %s\n", val1, val2, val3);

        if(val1.equals("43")) System.out.println("true");
        
        // 대, 소문자로 바꾸기
        System.out.println("대문자로 변환: "+nick.toUpperCase());
        System.out.println("소문자로 변환: "+nick.toLowerCase());
        
        // 치환, 해당 특정 문자를 찾아 바꾸기
        String nick2 = nick.replace('K', 'G');
        System.out.println(nick2);
        
        // 자르기, 문자열 배열을 특정 구분자로 분리
        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 = "백준철|신승원|구예진|한선|박진관|박나연";
        String chunjae3 = "백준철-신승원/구예진-한선/박진관-박나연";
        String[] stArr1 = chunjae1.split("/");
        String[] stArr2 = chunjae2.split("|"); // or 기호는 연산자라서 그대로 사용하면 구분이 불가능하다.
        String[] stArr3 = chunjae3.split("/|-"); // / 또는 -를 만나면 split
        // 문자열 배열을 for문 안쓰고 출력
        System.out.println(Arrays.toString(stArr1));
        System.out.println(Arrays.toString(stArr2));
        System.out.println(Arrays.toString(stArr3));

        String data1 = "        kim         ";
        String data2 = "tae         ";
        String data3 = "        gi";
        System.out.println(data1.length()+" "+data2.length()+" "+data3.length());
        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();
//        data1 = data1.strip();
//        data2 = data2.strip();
//        data3 = data3.strip();
        System.out.println(data1.length()+" "+data2.length()+" "+data3.length());
    }
}
