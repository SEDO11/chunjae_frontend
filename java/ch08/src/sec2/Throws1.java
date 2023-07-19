package sec2;

// 모든 예외 처리는 try-catch-finally 또는 throws 를 반드시 써야 한다.
public class Throws1 {
    public static void main(String[] args) throws Exception{ // 메소드에서 없는 예외 처리는 여기를 통해 Exception 으로 떠넘김
        String name = null;
        nullCheck(name);
        int[] arr = new int[4];
//        otherCheck(arr);
        String data = "1004홍길동";
//        otherCheck(data);
    }

    public static void nullCheck(String a) throws NullPointerException{ // null 체크 예외
        boolean isHello = a.equals("hello"); // null과 문자열을 비교할 때 에러 발생
        System.out.println(isHello); // 예외가 발생했을 경우 NullPointerException로 보냄
    }

    public static void otherCheck(int[] a) throws ArrayIndexOutOfBoundsException{ // 배열 인덱스 초과 예외
        System.out.println(a[5]);
    }

    public static void otherCheck(String a) throws NumberFormatException, NullPointerException { // 문자열을 숫자형으로 바꾸는데 처리 예외
        int data = Integer.parseInt(a);
        System.out.println(data);
    }
}
