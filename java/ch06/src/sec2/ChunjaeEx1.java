package sec2;

import sec1.*;

public class ChunjaeEx1 extends Chunjae {
    // protected는 같은 패키지에 있거나 상속 관계에 있을 때만 가능

    public static void main(String[] args) {
        double pi = ChunjaeEx1.PI;
        System.out.println(pi * 10 * 10);

    }
}
