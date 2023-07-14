package sec1;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String tel;
    private String birth;
    private String email;
    private int point;

    public Member() {
        this("id", "pw", "name", "tel", "birth", "email");
    }

    public Member(String id, String pw, String name, String tel, String birth, String email) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
        this.birth = birth;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
