package sec1;

public class Shape {
    // 필드 - 변수, 상수

    // public > default(기본값) > private 등은 접근 제한자 라고 부른다.
    // public은 어디에서든지 접근 가능
    // default는 같은 패키지 내에서만 접근 가능
    // private은 현재 클래스 내에서만 접근 가능
    public String type;
    public int length;
    public double area;

    // 보통은 private으로 만든다.
    private String type2;
    private int length2;

    // 매개변수를 받는 생성자를 만드는 경우 없는 걸 하나 새로 만들어야 한다.
    public Shape() {}

// 생성자
//    public Shape(String type) {
//        this(type, 0);
//    }

    public Shape(String type, int length) {
        this.type = type;
        this.length = length;
    }

    // 메소드
    public double calcArea() {
        if(this.type.equals("square")) {
            this.area = this.length * this.length;
        } else if (this.type.equals("triangle")) {
            this.area = this.length * 10 * 0.5;
        } else if (this.type.equals("circle")) {
            this.area = this.length * this.length * Math.PI;
        } else {
            this.area = 0.0;
        }
        return this.area;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }
}
