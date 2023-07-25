package sec3;

// 보안관리자를 설정해서 특정 조건이 되면 시스템 종료
public class SystemEx1 {
    public static void main(String[] args) {
        // 자바 11 이전 버전에서 사용하던 방법
//        System.setSecurityManager(new SecurityManager(){
//            @Override
//            public void checkExit(int status) {
//                if(status != 5) {
//                    throw new SecurityException();
//                }
//            }
//        });
        
        
        for(int i=0; i<5; i++) {
            try {
                // 비밀번호 확인 로직
                System.out.println(i);
            } catch (SecurityException e) {
                System.out.println("종료");
                System.exit(i); // 여기에서 바로 종료
            }
        }
    }
}
