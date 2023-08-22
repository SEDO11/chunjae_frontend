package edu.chunjae.dto;

// 출고
public class Serve {
    private int rno; // 출고 번호
    private int pno; // 출고 제품번호
    private int amount; // 출고 수량
    private int rprice; // 출고 가격
    private String resdate; // 입고일

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRprice() {
        return rprice;
    }

    public void setRprice(int rprice) {
        this.rprice = rprice;
    }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    @Override
    public String toString() {
        return "Released{" +
                "rno=" + rno +
                ", pno=" + pno +
                ", amount=" + amount +
                ", rprice=" + rprice +
                ", resdate='" + resdate + '\'' +
                '}';
    }
}
