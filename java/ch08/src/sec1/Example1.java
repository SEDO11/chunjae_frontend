package sec1;

// 예외 : 문법상의 오류가 아니고 실행 중의 오류가 발생한 상황

public class Example1 {
    public static void main(String[] args) {
        // 주요 예외 : NullPointer, Arithmetic, ArrayIndexBounds, ClassCast, NumberFormat,
        //     classNotFound
        // 모든 예외는 java.lang.Exception 의 자식 클래스로 구성
        // 외부 자원(파일, 데이터베이스, 주변 장치) 등을 연동하거나 활용하기 위해서는 반드시
        // 예외 처리가 동반되어야 한다.

        int[] arr = new int[5];

        String num = "1004홍길동";
        int parnum = 0;

        int no1 = 100;
        int no2 = 0;
        int res = 0;
//        if(no1!=0 && no2!=0) {
//            res = no1 / no2;
//        } else {
//            System.out.println("둘 중의 하나의 수가 0입니다.");
//        }

        try{
            //res = no1 / no2; // 예외처리 대책이 필요한 문장을 try 구절로 묶음
//            parnum = Integer.parseInt(num);
//            String b;
//            int c = 500 / 0;
            for(int i=0; i<arr.length+1; i++) {
                arr[i] = i;
            }
        } catch (ArithmeticException e) {
            System.out.println("no2가 0이라서 숫자를 0으로 나누려고 시도");
            e.printStackTrace(); // 오류 메세지 출력
        } catch (NullPointerException e) {
            System.out.println("null 포인터 에러");
            e.printStackTrace(); // 오류 메세지 출력
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat 에러");
            e.printStackTrace(); // 오류 메세지 출력
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 참조 에러");
            e.printStackTrace(); // 오류 메세지 출력
        } catch (Exception e) {
            System.out.println("에러");
            e.printStackTrace(); // 오류 메세지 출력
        } finally { // 실패든 성공이든 관계없이 무조건 실행해야하는 문장
            System.out.println("연결 종료");
            System.out.println("닫기");
        }
        
    }
}
