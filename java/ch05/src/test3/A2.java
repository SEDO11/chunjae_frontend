package test3;

public class A2 {
    static int a;
    
    // static 으로 선언된 필드의 경우 static {}로 묶은 것 안에 값을 넣어줘야 갱신됨
    static {
        a = 8;
    }

    void setA() {
        a = 8;
    }
}
