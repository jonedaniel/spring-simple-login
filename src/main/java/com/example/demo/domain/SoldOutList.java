package com.example.demo.domain;

import java.util.Date;

public class SoldOutList {
    private Integer soldId;

    private String sId;

    private Date saleDate;

    public Integer getSoldId() {
        return soldId;
    }

    public void setSoldId(Integer soldId) {
        this.soldId = soldId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
}