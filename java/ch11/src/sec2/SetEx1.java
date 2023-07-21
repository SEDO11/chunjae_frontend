package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet(); // 가장 대표적인 Set
        set1 = new TreeSet();


        Set<String> set2 = new HashSet<>();
        set2.add("이은영");
        set2.add("최상민");
        set2.add("김이호");
        set2.add("이슬비");
        set2.add("김이호");
        set2.add("이은영");
        System.out.println("Set: "+set2);
        
        // Set을 이용해 데이터를 하나씩 접근하는 경우
        Iterator it = set2.iterator(); // 이터레이터 생성
        while (it.hasNext()) {
            System.out.print(it.next()+"\t");
        }
        System.out.println();

        List<String> lst = new ArrayList<>();
        lst.add("이은영");
        lst.add("최상민");
        lst.add("김이호");
        lst.add("이슬비");
        lst.add("김이호");
        lst.add("이은영");
        System.out.println("List: "+lst);
    }
}
