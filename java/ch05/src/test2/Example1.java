package test2;

public class Example1 {
    // 자동차 클래스
    
    // 필드
    private String name; // 이름
    private String number; // 번호
    private int width; // 폭
    private int height; // 높이
    private int length; // 길이
    private double x; // x좌표
    private double y; // y좌표
    private double volume; // 탱크용량
    private double fuel; // 남은 연료
    private double efficiency; // 연비

    public Example1(String name, String number, int width, int height, int length, double volume, double fuel, double efficiency) {
        this.name = name;
        this.number = number;
        this.width = width;
        this.height = height;
        this.length = length;
        this.x = 0;
        this.y = 0;
        this.volume = volume;
        this.fuel = (fuel <= volume) ? fuel : volume;
        this.efficiency = efficiency;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getFuel() {
        return fuel;
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
        System.out.printf("현재 좌표 x:%f y:%f", this.x, this.y);
    }

    public void specific() {
        System.out.printf("%s %s %d %d %d", this.name, this.number, this.width, this.height, this.length);
    }

    public void charge(double fuel) {
        this.fuel += fuel;
        if(volume < this.fuel) {
            this.fuel = volume;
        }
        System.out.printf("남은 연료: %f", getFuel());
    }
}
