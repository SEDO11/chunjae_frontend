package sec1;

public class Son1 {
    private int[] a = new int[5];
    
    // throws, 이걸 사용하는 클래스에 에러 정보 전달
    Son1(int[] arr) throws Exception {
        for(int i=0; i<arr.length; i++) {
            this.a[i] = arr[i];
            System.out.println(this.a[i]);
        }
    }

}
