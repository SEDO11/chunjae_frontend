package sec2;

class MemberService {
    public boolean login(String id, String password) {
        if(id.equals("hong") && password.equals("12345")) {
            return true;
        }
        return false;
    }

    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}

public class Exam11 {
    public static void main(String[] args) {
        MemberService ms = new MemberService();
        boolean result = ms.login("hong", "12345");
        if(result) {
            System.out.println("로그인 성공");
            ms.logout("hong");
        } else {
            System.out.println("아이디 혹은 비밀번호 불일치");
        }
    }
}
