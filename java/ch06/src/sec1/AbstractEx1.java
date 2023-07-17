package sec1;

public class AbstractEx1 {
    public static void main(String[] args) {
        // 추상화 클래스는 객체 선언만 되고 초기화는 되지 않는다.
        // 부모의 객체는 자식의 생성자로 객체 선언이 가능하다.
        Man m1;
        
        // 다형성
        // 아래와 같이 부모 클래스로 부터 선언된 객체는 자식 클래스의 객체를 생성할 수 있다.
        // 다른 자식 클래스를 이용해 형 변환도 가능하다.
        // 형 변환할 때마다 그 형태가 다양하게 변할 수 있다. -> 다형성
        m1 = new Child();
        m1.method1();
        m1 = new Disendant();
        m1.method1();

        // c1 = new Man() // 자식 클래스로 부터 선언된 객체는 부모 생성자로 객체를 생성할 수 없다.
        // c1 = new Descendant() // 형제 생성자로 객체를 생성할 수 없다.


    }
}
