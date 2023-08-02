package sec1;

public class Exam06 {
    public static void main(String[] args) {
        String code = "801225-1278001";
        char gender = code.charAt(7);
        String year = code.substring(0, 2);
        String month = code.substring(2, 4);
        String day = code.substring(4, 6);

        if(gender == '1' || gender == '3') {
            System.out.println("남자");
        } else if (gender == '2' || gender == '4') {
            System.out.println("여자");
        } else {
            System.out.println("외국인");
        }

        System.out.println("태어난 연 : "+ year);
        System.out.println("태어난 월 : "+ month);
        System.out.println("태어난 일 : "+ day);

    }
}
