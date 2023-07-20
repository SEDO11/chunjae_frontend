package sec2;

import java.util.List;
import java.util.Objects;

public class Multi4 {
    public void method1(List<?> lst) { // 리스트 형태의 무슨타입이 와도 상관 없음
        for(Object obj:lst) {
            System.out.println(obj + "\t");
        }
    }

    public int method2(List<? extends Number> lst) { // 숫자만 가능 int, float, double...
        int hap = 0;
        for (Number num : lst) {
            hap += num.doubleValue();
        }
        return hap;
    }


    public List<? super Integer> method3(List<? super Integer> lst) { // Integer의 이상의 것만 사용, super는 이상의 것을 쓸 때 사용한다.
        for(int i=0; i<5; i++) {
            lst.add(i);
        }
        return lst;
    }
}
