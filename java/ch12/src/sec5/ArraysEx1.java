package sec5;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        char[] arr1 = {'k','i', 'm','j', 'a', 'v', 'a'}; // String
        System.out.println(arr1);
        System.out.println();

        char[] arr2 = arr1; // arr1의 주소를 전달, 얕은 복제
        // 얕은 복제: 다른곳에 같은 데이터를 복제하는 것이 아니라
        // 이미 저장되어 있는 데이터의 주소만을 다른 변수에 저장
        // 그로므로 실제 기억된 데이터는 1개만 존재

        System.out.println(arr2);
        System.out.println(arr1.hashCode()); // 주소
        System.out.println(arr2.hashCode());
        System.out.println(arr1==arr2); // 주소가 같음
        System.out.println();


        char[] arr3 = Arrays.copyOf(arr1, arr1.length); // arr1의 모든 요소 복사
        System.out.println(arr3);
        System.out.println(arr3.hashCode());
        System.out.println(arr1==arr3); // 배열의 주소 비교, 주소가 다름
        System.out.println(Arrays.equals(arr1, arr3)); // 배열의 값 비교

        int[] points = {80, 90, 54, 30, 21, 1, 5, 99};
        System.out.println("정렬 전 : "+Arrays.toString(points));
        Arrays.sort(points); // 배열 정렬
        System.out.println("정렬 후 : "+Arrays.toString(points));
        System.out.println("54는 어디에 : "+Arrays.binarySearch(points, 54)); // 54를 찾아라, 반환값 :
        // 인덱스
    }
}
