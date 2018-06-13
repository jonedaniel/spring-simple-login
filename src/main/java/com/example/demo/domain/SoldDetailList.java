package com.example.demo.domain;

public class SoldDetailList {
    private Integer soldDetailId;

    private Integer soldId;

    private Integer gId;

    private Integer saleQuntityToday;

    public Integer getSoldDetailId() {
        return soldDetailId;
    }

    public void setSoldDetailId(Integer soldDetailId) {
        this.soldDetailId = soldDetailId;
    }

    public Integer getSoldId() {
        return soldId;
    }

    public void setSoldId(Integer soldId) {
        this.soldId = soldId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getSaleQuntityToday() {
        return saleQuntityToday;
    }

    public void setSaleQuntityToday(Integer saleQuntityToday) {
        this.saleQuntityToday = saleQuntityToday;
    }
}