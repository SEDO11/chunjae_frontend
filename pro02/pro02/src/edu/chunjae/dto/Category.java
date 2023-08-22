package edu.chunjae.dto;

// 카테고리
public class Category {
    // ET:초등교과서, ER:초등참고서, EW:초등문제집,
    // MT:중등교과서, MR:중등참고서, MW:중등문제집,
    // HT:고등교과서, HR:고등참고서, HW:고등문제집,
    private String cno; //
    private String cname;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
