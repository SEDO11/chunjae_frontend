package sec4;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = new String("HongGilDong");
        String str2 = "HongKilBong";
        System.out.println(str1);
        System.out.println("특정 위치 문자열 출력 : " + str1.charAt(3));
        System.out.println("문자열 비교 : " + str1.equals(str2));

        byte[] bArr = str1.getBytes(); // 문자열을 Byte 배열로 분리
        
        // 별도의 메소드를 통해 반복문 출력
        printArr(bArr);


        // byte 배열을 char 배열로 변환
        char[] cArr = new char[bArr.length];
        for(int i=0; i<bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        // Arrays.toString() 이용
        System.out.print("byte[] 의 출력"+ Arrays.toString(cArr));
        System.out.println();
        
        // 특정 문자의 인덱스를 찾음
        System.out.println("i 는 몇 번째? : "+(str1.indexOf("i")));
        System.out.println("인덱스가 3부터 6전 까지 : "+str1.substring(3, 6));
        System.out.println("소문자 : "+str1.toLowerCase());
        System.out.println("대문자 : "+str1.toUpperCase());

        String data1 = str1.replace("H", "K");
        System.out.println(data1);
        String str3 = "       My name is kim     ";
        System.out.println(str3);
        System.out.println("공백 제거 전 글자 : "+str3.length());
        System.out.println("공백 제거 후 글자 : "+str3.trim().length());

        int k = 1004;
        String t1 = k+""; // 비추천
        String t2 = String.valueOf(k); // 추천
        
        System.out.println(t1);
        System.out.println(t2);
        
        // String을 통해 만들어진 객체인가 확인
        System.out.println("k가 문자열 ? "+(t1 instanceof String));
        System.out.println("k가 문자열 ? "+(t2 instanceof String));
    }
    
    // byte 배열의 형태로 받은 정보를 다시 char를 통해 글자로 출력
    static void printArr(byte[] b) { 
        for(int i=0; i<b.length; i++) {
            char c = (char) b[i];
            System.out.print(c);
        }
        System.out.println();
    }
}
