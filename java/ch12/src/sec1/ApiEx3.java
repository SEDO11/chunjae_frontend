package sec1;

import java.util.*;

public class ApiEx3 {
    public static void main(String[] args) {
//        int su = (int) (Math.random()*44+1); // 0~44 + 1 = 1~45
//        System.out.println(su);
        
        // 랜덤 복권 추첨
        Set<Integer> set = new HashSet<>();
        while(true) {
            int su = (int) (Math.random()*44+1);
            if(set.size() == 6) {
                break;
            } else if(set.contains(su)) {
                continue;
            } else {
                set.add(su);
            }
        }

        System.out.println(set);
        Integer[] lotto = set.toArray(new Integer[6]); // Set을 Array로 변형
        Integer[] lotto2 = set.toArray(new Integer[6]);

        Arrays.sort(lotto); // 오름차순 정렬
        Arrays.sort(lotto2, Collections.reverseOrder()); // 내림차순 정렬

        System.out.println(Arrays.toString(lotto));
        System.out.println(Arrays.toString(lotto2));

    }
}
