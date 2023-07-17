package sec1;

public class ChunjaeEx2 {
    public static void main(String[] args) throws Exception {

        Sehoon s = new Sehoon();
        Chunjae[] c = new Chunjae[5];

        int n = 1;

        try {
            for(Chunjae k:c) {
                k.name = "세훈";
                System.out.println(k.name);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        s.setName("홍길동");
        System.out.println(s.getName());

        Sehoon[] s2 = new Sehoon[100];
        try {
            n = 1;
            for(int i=0; i<s2.length; i++) {
                s2[i] = new Sehoon(); // 객체 배열은 선언 후 각각 초기화를 진행하여 사용해야 한다.
                s2[i].setNum(n);
                s2[i].setName("세훈"+n);
                n++;
                System.out.printf("%d\t", s2[i].getNum());
                System.out.println(s2[i].getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
