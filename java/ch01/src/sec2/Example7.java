package sec2;

public class Example7 {
    public static void main(String[] args) {
        int data1 = 1004;

        // 자동 타입 변환, 같거나 작은 데이터를 큰 데이터에 집어넣음
        float data2 = data1;
        char data3 = '오';
        int data4 = data3;

        // 강제 타입 변환, 큰 데이터를 더 작은 데이터에 집어넣음 | 데이터의 신빙성이 떨어지므로 잘 안 씀
        short data5 = (short) data1;
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data4); // 유니코드 번호 출력
        System.out.println(data5);
    }
}
