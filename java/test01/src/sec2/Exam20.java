package sec2;

import java.util.*;

public class Exam20 {
    public static void main(String[] args) {
        Set  set = new HashSet<>();
        boolean run = true;
        Integer[] arr;

        while(run) {
            if(set.size() == 6) {
                run = false;
            } else {
                int r = (int) (Math.random()*44 +1);
                set.add(r);
            }
        }
        arr = (Integer[]) set.toArray(new Integer[6]);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
