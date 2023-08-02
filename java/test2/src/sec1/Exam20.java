package sec1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam20 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean run = true;
        while(run) {
            if(set.size() == 6) {
                run = false;
            } else {
                int rd = (int) (Math.random() * 44 + 1);
                set.add(rd);
            }
        }
        Integer[] lotto = set.toArray(new Integer[6]);
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}
