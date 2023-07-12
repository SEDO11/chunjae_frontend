package sec1;

public class Example3 {
    // 맨 뒤 원소 추가 함수
    public static String[] add(String[] originArr, String txt) {
        String[] newArr = new String[originArr.length+1];
        for (int i=0; i<originArr.length; i++) {
            newArr[i] = originArr[i];
        }
        newArr[originArr.length] = txt;
        return newArr;
    }
    
    // 맨 뒤 원소 삭제 함수
    public static String[] remove(String[] originArr) {
        String[] newArr = new String[originArr.length-1];
        for (int i=0; i<newArr.length; i++) {
            newArr[i] = originArr[i];
        }
        return newArr;
    }
    
    // 데이터 확인 후 삭제
    public static String[] remove(String[] originArr, String txt) {
        String[] newArr = new String[originArr.length-1];
        
        // txt와 같은 데이터가 있는지 확인
        boolean check = false;
        for(String p:originArr) {
            if(p.equals(txt)) {
                check = true;
                break;
            }
        }
        
        // txt 데이터가 있는 경우
        if(check) {
            int j=0;
            for (int i=0; i<originArr.length; i++) {
                if(originArr[i].equals(txt)) { // 없앨 데이터가 있으면
                    continue;
                } else { // 없앨 데이터가 아니면
                    newArr[j] = originArr[i];
                    j++;
                }
            }
            System.out.printf("%s 제거 완료\n", txt);
            return newArr;
        }
        System.out.println("해당 이름이 데이터에 존재하지 않습니다.");
        return originArr;
    }

    public static void main(String[] args) {
        // 원소 추가 요청
        String[] originArr = {"김기태", "박나연", "김이호", "오태훈", "서광"};
        originArr = add(originArr, "한선");
        for (String p:originArr) {
            System.out.println(p);
        }
        System.out.println();
        
        // 맨 뒤 요소 제거
        originArr = remove(originArr);
        for (String p:originArr) {
            System.out.println(p);
        }
        System.out.println();
        
        // 원하는 데이터 요소 제거
        originArr = remove(originArr, "김이호");
        for(String p:originArr) {
            System.out.println(p);
        }
    }
}