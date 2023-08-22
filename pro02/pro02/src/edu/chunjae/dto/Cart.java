package edu.chunjae.dto;

// 장바구니
public class Cart {
    private int no; // 장바구니 번호
    private String cid; // 고객아이디
    private String pno; // 상품번호
    private int amount; // 수량

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
