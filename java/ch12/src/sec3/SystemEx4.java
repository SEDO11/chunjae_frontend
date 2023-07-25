package sec3;

import java.util.Properties;
import java.util.Set;

public class SystemEx4 {
    public static void main(String[] args) {
        System.out.println("환경변수 : "+System.getenv("JAVA_HOME")); // 환경 변수 중에서 JAVA_HOME 정보를 출력
        System.out.println("운영체제 : "+System.getProperty("os.name"));
        System.out.println("사용자 : "+System.getProperty("user.name"));
        System.out.println("사용자 디렉토리 : "+System.getProperty("user.home"));
        System.out.println("자바버전 : "+System.getProperty("java.version"));
        System.out.println("자바 홈 : "+System.getProperty("java.home"));

        Properties props = System.getProperties();
//        System.out.println(props);
        Set keys = props.keySet();
        for (Object k:keys) {
            String key = (String) k;
            String val = System.getProperty(key);
            System.out.println(key+" : "+val);
        }
    }
}
