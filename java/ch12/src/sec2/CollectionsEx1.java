package sec2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class CollectionsEx1 {
    public static void main(String[] args) {
        // 하나만 선택
        Week monday = Week.MONDAY;
        System.out.println(monday.korea+monday.china);

        // 모든 열거형 선택
        Week[] wk = Week.values();
        System.out.println(Arrays.toString(wk));
        for (Week w: wk) {
            System.out.printf("%s (%s)\n", w.korea, w.china);
        }

        System.out.println(Week.MONDAY);            // 이름
        System.out.println(Week.MONDAY.ordinal());  // 인덱스
    }
}
