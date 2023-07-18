package sec1;

public class Example3 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("원인 불명");
            e.printStackTrace();
        }
    }
}