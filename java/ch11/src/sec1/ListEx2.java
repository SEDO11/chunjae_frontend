package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
    public static void main(String[] args) {
        // 자바에서 List 를 사용할 때 보통
        // 여러 개를 사용하기 위해 아래와 같이 작성함
        List lst1 = new ArrayList();
        lst1 = new Vector();
        lst1 = new LinkedList();
        
        // ArrayList 로 객체를 선언하면 ArrayList 만 생성 가능
        ArrayList lst2 = new ArrayList();
//        Vector lst2 = new Vector<>();
//        lst2 = new LinkedList<Object>();

        method1(lst1);
        method2(lst2);
    }

    public static void method1(List lst) {

    }

    public static void method2(ArrayList lst) {

    }

}
