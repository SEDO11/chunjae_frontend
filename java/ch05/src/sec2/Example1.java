package sec2;

import sec1.Shape;

public class Example1 {
    public static void main(String[] args) {
        // 클래스 인스턴스 = new 생성자함수();
        // 클래스 내의 생성자 함수를 통해 새로운 인스턴스(객체)를 만들어라
        Shape s1 = new Shape();

        s1.type = "안녕";
        s1.length = 50;
        s1.area = s1.length * s1.length;
        System.out.printf("%s %d %.2f\n", s1.type, s1.length, s1.area);

        Shape s2 = new Shape("triangle", 40);
        Shape s3 = new Shape("circle", 20);
        Shape s4 = new Shape("square", 30);
        Shape s5 = new Shape("square2", 30);
        System.out.printf("%.2f %.2f %.2f %.2f", s2.calcArea(), s3.calcArea(), s4.calcArea(), s5.calcArea());
    }
}
