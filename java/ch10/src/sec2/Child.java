package sec2;

class Parent { }

class My extends Parent { }
class Brother extends Parent { }
class Sister extends Parent { }
class Sibling extends Parent { }
class Season extends My { }
class Seasaw extends Brother { }

public class Child<T extends My> { // 형 변환이 My 이하의 클래스들만 가능
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
