package sec1;

public class ApiEx1 {
    public static void main(String[] args) {
        /*
        java.lang : 별도의 import 과정이 필요없는 기본 클래스
        Object : 자바의 최상위 클래스
        System : 기본 입출력(키보드 입력, 모니터 출력), JVM의 동작 제어
        Class : 외부 라이브러리의 특정 클래스를 로딩할 때 사용
        String : 문자열을 다루기 위한 클래스
        StringBuffer/StringBuilder : 문자열 조작
         */

        int a = 1004; // Primitive(기본) 타입
        Integer b = 1004; // Wrapper 타입
        int a1 = b; // UnBoxing : Wrapper -> Primitive
        Integer b1 = a; // Boxing : Primitive -> Wrapper

        String val1 = "1004";
//        int val2 = Integer.parseInt(val1);
//        System.out.println("결과값 : "+val2);

        boolean res = isInteger(val1);
        System.out.println("변환 가능한 숫자 인지 판단결과 : "+ res);
        if(res) {
            int val2 = Integer.parseInt(val1);
            System.out.println(val2);
        } else {
            System.out.println("문자열 : " +val1);
        }

        String val3 = "365.24781"; // f를 붙혀도 변환 가능
        res = isDouble(val3);
        System.out.println("변환 가능한 숫자 인지 판단결과 : "+ res);
        if(res) {
            double val4 = Double.parseDouble(val3);
            System.out.println(val4);
        } else {
            System.out.println("문자열 : " + val3);
        }

    }
    
    // int형으로 변환 되는지 안되는지 확인 메소드
    public static boolean isInteger(String val) {
        boolean res = true;
        try {
            Integer.parseInt(val);
        } catch (Exception e) {
            res = false;
        }
        return res;
    }

    public static boolean isDouble(String val) {
        boolean res = true;
        try {
            Double.parseDouble(val);
        } catch (Exception e) {
            res = false;
        }
        return res;
    }
}
