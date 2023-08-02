package sec2;

public class Exam12 {
    public static void main(String[] args) {
        Car myCar = new Car();
    }
}

class Car {
    private int speed;
    private boolean stop;
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if(this.stop == true) this.speed = 0;
    }

}
