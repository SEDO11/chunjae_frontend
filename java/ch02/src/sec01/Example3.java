package sec01;

public class Example3 {
    public static void main(String[] args) {
        // 관계 연산 : ==, !=, <=(이하), >=(이상), <(미만), >(초과)
        int su1 = 90;
        int su2 = 85;
        int su3 = 88;
        System.out.println((su1==su2));
        System.out.println((su1!=su2));
        System.out.println((su1>su2));
        System.out.println((su2>=su3));
        System.out.println((su1<su2));
        System.out.println(su1<=su2);

        System.out.println((su1>=su2)&&(su2>=su3));
        System.out.println((su1>=su2)&&(su2<=su3));
        System.out.println((su1>=su2)||(su2>=su3));

        System.out.println(!(su1>=su2));
        System.out.println(!(su2>=su3));
    }
}
