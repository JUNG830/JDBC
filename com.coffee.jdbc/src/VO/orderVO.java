package VO;

import java.sql.Date;

public class orderVO {
    private Date orderDate;
    private String memberId;
    private String orderNo;
    private int mno;
    private int price;
    private String optionCode;
    private String mname;
    private int optionCount;


    public orderVO(Date orderDate, String memberId, String orderNo, int mno, int price, String optionCode, String mname, int optionCount) {
        this.orderDate = orderDate;
        this.memberId = memberId;
        this.orderNo = orderNo;
        this.mno = mno;
        this.price = price;
        this.optionCode = optionCode;
        this.mname = mname;
        this.optionCount = optionCount;
    }

    public void orderVOMNOOrderNo (int mno, String orderNo) {
        this.mno = mno;
        this.orderNo = orderNo;

    }



    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;

    }

    public int getOptionCount() {
        return optionCount;
    }

    public void setOptionCount(int optionCount) {
        this.optionCount = optionCount;
    }
}
