package sec1;

public class Example4 {
    public static void main(String[] args) {
        // 기본타입 변수의 최소값과 최대값 출력
        System.out.println("int 범위: " + Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        System.out.println("long 범위: " + Long.MIN_VALUE+"~"+Long.MAX_VALUE);
        System.out.println("float 범위: " + Float.MIN_VALUE+"~"+Float.MAX_VALUE);
        System.out.println("byte 범위: " + Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println("char 범위: " + Integer.toHexString(Character.MIN_VALUE)+"~"+Integer.toHexString(Character.MAX_VALUE));
        System.out.println("short 범위: " + Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        System.out.println("Double 범위: " + Double.MIN_VALUE+"~"+Double.MAX_VALUE);
    }
}
