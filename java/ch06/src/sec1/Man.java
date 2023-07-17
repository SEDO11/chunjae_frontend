package sec1;

// 인터페이스 : 전체 추상화

// 추상화 abstract
public abstract class Man {
    private int item1;
    private String item2;

    // 추상화 : 실제 구현 내용을 적지 않고, 상속 받는 클래스에서 구현 내용을 기술하므로 써 
    // 물려 받는 입장에서 쓰고 싶은 것이 다를 경우 미리 아래처럼 사용처를 정해버리면
    // 그대로 쓰든가 아니면, 오버라이딩을 해야함
    public abstract void method1();
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);

    // 추상화 아님, 추상화가 아니면 반드시 실행할 내용을 작성해야 한다.
    public void method5() {}
    public int method6() {return 100;}
    public void method7(int no) {
        System.out.println(no);
    }
    public int method8(int no) {return no;}

}
