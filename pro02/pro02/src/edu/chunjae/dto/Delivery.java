package edu.chunjae.dto;
// 배송
public class Delivery {
    private int dno; // 배송코드
    private int sno; // 결제 번호
    private String cid; // 고객아이디
    private String daddr; // 배송지
    private String custel; // 고객연락처
    private String pcom; // 배송회사
    private String ptel; // 배송기사연락처
    private int pstate; // (0:배송전, 1:배송중, 2:도착, 3:구매결정)-배송상태
    private String bcode; // 화물코드

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getDaddr() {
        return daddr;
    }

    public void setDaddr(String daddr) {
        this.daddr = daddr;
    }

    public String getCustel() {
        return custel;
    }

    public void setCustel(String custel) {
        this.custel = custel;
    }

    public String getPcom() {
        return pcom;
    }

    public void setPcom(String pcom) {
        this.pcom = pcom;
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel;
    }

    public int getPstate() {
        return pstate;
    }

    public void setPstate(int pstate) {
        this.pstate = pstate;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }
}
