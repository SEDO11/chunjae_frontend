package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    private int cno; // 과정 번호
    private String cName; // 코스의 이름
    private int cPrice; // 수강료
    private double cTime; // 코스의 기간

    public void setCno(int cno) {
        this.cno = cno;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcPrice(int cPrice) {
        this.cPrice = cPrice;
    }

    public void setcTime(double cTime) {
        this.cTime = cTime;
    }

    public int getCno() {
        return cno;
    }

    public String getcName() {
        return cName;
    }

    public int getcPrice() {
        return cPrice;
    }

    public double getcTime() {
        return cTime;
    }
}
public class ListEx4 {
    // 정보를 정적으로 저장하기 위해 사용
    static List<Course> cList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course c = null;
        boolean ck = true; // 과정 작업 상태, 참이면 새로운 데이터 입력 가능, false면 서비스 종료
        int cno = 0; // 과정 수
        
        while(ck) {
            System.out.println("1 : 과정등록 | 2 : 과정검색 | 3 : 과정삭제 | 4 : 과정목록 | 5,6 : 종료");
            System.out.print("작업번호[1-6] : ");

            int num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1: // 과정 등록
                    System.out.println("과정 등록");

                    c = new Course();
                    try {
                        System.out.printf("과목번호 : %d\n", cno);
                        c.setCno(cno);

                        System.out.print("과목이름 : ");
                        String s1 = sc.nextLine();
                        c.setcName(s1);

                        System.out.print("단가 : ");
                        int i1 = Integer.parseInt(sc.nextLine());
                        c.setcPrice(i1);

                        System.out.print("소요시간 : ");
                        double d = Double.parseDouble(sc.nextLine());
                        c.setcTime(d);

                        cno++;
                        System.out.printf("과목번호 : %d\n", cno);
                        c.setCno(cno);

                        cList.add(c);
                        System.out.println("새로운 과정을 등록하였습니다.");

                    } catch (Exception e) {
                        System.out.println("입력 오류 발생");
                    } finally {

                    }
                    break;
                    
                case 2: // 과정 검색
                    System.out.println("과정 검색");
                    System.out.println("검색할 과정 번호 : ");
                    int no = Integer.parseInt(sc.nextLine());
                    if (no<=num) {
                        Course co = cList.get(no);
                        System.out.printf("과정번호 : %d\n",co.getCno());
                        System.out.printf("과정이름 : %s\n",co.getcName());
                        System.out.printf("과정단가 : %d\n",co.getcPrice());
                        System.out.printf("소요시간 : %f\n",co.getcTime());
                    } else {
                        System.out.println("해당 과정이 존재하지 않습니다.");
                    }
                    System.out.println();
                    break;
                    
                case 3: // 과정 삭제
                    System.out.println("과정삭제");
                    System.out.print("삭제할 과정 번호: ");
                    no = Integer.parseInt(sc.nextLine());
                    if (no<=num) {
                        cList.remove(no);
                    } else {
                        System.out.println("해당 과정이 존재하지 않습니다.");
                    }
                    break;

                case 4: // 과정목록
                    System.out.println("과정 목록");
                    for(Course c1:cList) {
                        System.out.printf("과정번호 : %d\t",c1.getCno());
                        System.out.printf("과정이름 : %s\t",c1.getcName());
                        System.out.printf("과정단가 : %d\t",c1.getcPrice());
                        System.out.printf("소요시간 : %f\t",c1.getcTime());
                        System.out.println();
                    }
                    break;

                case 5:
                case 6:
                    ck = false;
                    break;

                default:
                    System.out.println("작업 번호는 1~6까지 입니다.");
            }
            c = new Course();
        }
        


    }
}
