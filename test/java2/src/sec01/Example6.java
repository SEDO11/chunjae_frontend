package sec01;

public class Example6 {
    // 배열
    public static void main(String[] args) {
//        int max = 0;
//        int[] arr = {1, 5, 3, 8, 2};
//        for(int i=0; i<arr.length; i++) {
//            if(max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
        int[][] arr = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
                count += 1;
            }
        }
        avg = (double) sum / count;
        System.out.printf("sum: %d\navg: %.1f", sum, avg);
    }
}
