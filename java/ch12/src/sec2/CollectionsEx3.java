package sec2;

import java.util.Calendar;
import java.util.Scanner;

// 과제
public class CollectionsEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        System.out.print("알고싶은 월을 입력하세요 : ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.printf("\t\t\t%d 월\n", month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
//        c.get()
        c.set(2023,month-1,1); //입력받은 월의 1일로 세팅
        //month는 0이 1월이므로 -1을 해준다

        int end = c.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); //해당 월의 첫번째 요일(1:일요일 … 7:토요일)
//        System.out.println(end);
//        System.out.println(dayOfWeek);
        
        // 첫줄 날짜 입력
        int i = 1;
        for(int j=0; j<dayOfWeek-1; j++) {
            System.out.print("\t");
        }
        for(int j=dayOfWeek-1; j<7; j++) {
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();
        
        // 두번째 줄 부터 날짜 입력
        int cnt = 0;
        for(int j=i; j<=end; j++) {
            if(cnt == 6) {
                System.out.print(j+"\t");
                System.out.println();
                cnt = 0;
            } else {
                System.out.print(j+"\t");
                cnt++;
            }
        }
    }
}
