package edu.chunjae.dto;

// 결제(판매)
public class Payment {
    private int sno; // 결제번호 
    private int pno; // 상품번호 
    private String cid; // 고객아이디
    private int amount; // 구매수량
    private int pmethod; // 결제수단
    private int pcom; // 결제대행사
    private int cnum; // 결제 카드 번호
    private int payprice; // 결제금액
    private String dno; //배송코드

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPmethod() {
        return pmethod;
    }

    public void setPmethod(int pmethod) {
        this.pmethod = pmethod;
    }

    public int getPcom() {
        return pcom;
    }

    public void setPcom(int pcom) {
        this.pcom = pcom;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public int getPayprice() {
        return payprice;
    }

    public void setPayprice(int payprice) {
        this.payprice = payprice;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "sno=" + sno +
                ", pno=" + pno +
                ", cid='" + cid + '\'' +
                ", amount=" + amount +
                ", pmethod=" + pmethod +
                ", pcom=" + pcom +
                ", cnum=" + cnum +
                ", payprice=" + payprice +
                ", dno='" + dno + '\'' +
                '}';
    }
}
