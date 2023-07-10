package sec01;

public class Example2 {
    public static void main(String[] args) {
        int[] js = {85, 90, 95, 60};
        float py = 0f;
        boolean check = true;
        boolean check2 = false;

        // if
        for(int i=0; i<js.length; i++) {
            py += js[i];
        }
        py /= js.length;
        
        if(py>=80) {
            System.out.println("합격");
        } else {
            System.out.println("탈락");
        }

        for(int i=0; i<js.length; i++) {
            if(js[i] < 80) {
                check = false;
                break;
            }
            if(js[i] >= 90) check2 = true;
        }

        if(check) {
            System.out.println("장학금 대상자");
        } else {
            System.out.println("장학금 대상자 아님");
        }
        
        if(check2) {
            System.out.println("과목 우수자");
        } else {
            System.out.println("과목 우수 아님");
        }

        System.out.println(py);

        if(py>=90) {
            System.out.println("수");
        } else if (py >= 80) {
            System.out.println("우");
        } else if (py >= 70) {
            System.out.println("미");
        } else if (py >= 60) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }

        int pt = (int) py / 10;
        String grade = "";
        
        // switch 문
        switch (pt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                grade = "5등급";
                break;
            case 6:
                grade = "4등급";
                break;
            case 7:
                grade = "3등급";
                break;
            case 8:
                grade = "2등급";
                break;
            case 9:
                grade = "1등급";
                break;
            default:
                grade = "판정 불가";
        }
        System.out.println(grade);
    }
}
