package sec2;

import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        // Map은 기본적으로 앞에는 키(String Type), 값 형태로 사용
        // 키는 중복 불가, 값은 중복 가능
        // python의 딕셔너리와 같음
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties(); // 프로퍼티는, 내재됨, 제너릭 사용 불가

        // HashMap
        // map에 키, 값을 추가할 때
        map1.put("no", 1);
        map1.put("kor", 100);
        map1.put("eng", 70);
        map1.put("mat", 90);
        System.out.println(map1);
        
        // 특정 데이터를 가져옴
        // 키의 값을 통한 접근
        System.out.println(map1.get("kor"));
        
        // 특징 키가 있는지 없는지 확인
        if(map1.containsKey("soc")) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
            map1.put("soc", 85);
        }
        
        // map에 특정 값이 있는지 확인
        int score = 100;
        if(map1.containsValue(score)) {
            System.out.println(score+"이 존재함");
        } else {
            System.out.println(score+"이 존재하지 않음");
        }
        System.out.println();
        
        // Map의 순회 기법, 많이 중요
        // 키와 값을 하나씩 묶어서 출력하는 경우
        System.out.println("키와 값을 하나씩 묶어서 출력");
//        for(Map a: map1) { // Map은 인덱스가 존재하지 않아서 이렇게 사용하는 건 불가능
//
//        }
        for (Map.Entry<String, Integer> entrySet: map1.entrySet()) {
            System.out.println(entrySet.getKey()+" : "+entrySet.getValue());
        }
        System.out.println();


        // HashTable
        map2.put("이름", "홍길동");
        map2.put("나이", "26");
        map2.put("키", "175.3");
        map2.put("몸무게", "74.5");
        System.out.println(map2);
        
        // map의 특정 키 제거
        if(map2.containsKey("키")) {
            map2.remove("키");
        } else {
            System.out.println("해당 키 없음");
        }
        System.out.println();
        
        // HashMap의 순회
        for (Map.Entry<String, String> eSet: map2.entrySet()) {
            System.out.println(eSet.getKey()+" : "+eSet.getValue());
        }


        // TreeMap
        map3.put("no", 1);
        map3.put("나이", 26);
        map3.put("키", 175);
        map3.put("몸무게", 74);
        System.out.println(map3);

        // map의 특정 키 제거
        if(map3.containsKey("몸무게")) {
            map3.remove("몸무게");
        } else {
            System.out.println("해당 키 없음");
        }
        System.out.println();

        // TreeMap의 순회
        for (Map.Entry<String, Integer> eSet: map3.entrySet()) {
            System.out.println(eSet.getKey()+" : "+eSet.getValue());
        }


        // Properties
        // 프로퍼티스는 입력값이 무조건 문자열이다, 변경 불가
        
        // 프로퍼티스에서 값을 넣어주는 경우
        map4.setProperty("margin", "40px");
        map4.setProperty("padding", "40px");
        map4.setProperty("width", "1200px");
        map4.setProperty("height", "50px");
        
        // 프로퍼티스에서 값을 가져오는 경우
        System.out.println(map4.getProperty("width"));

    }
}
