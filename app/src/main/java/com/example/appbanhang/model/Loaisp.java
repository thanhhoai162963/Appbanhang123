package com.example.appbanhang.model;

public class Loaisp {
    private int id;
    private String tenLoaiSp;
    private String hinhanhSp;

    public Loaisp(int id, String tenLoaiSp, String hinhanhSp) {
        this.id = id;
        this.tenLoaiSp = tenLoaiSp;
        this.hinhanhSp = hinhanhSp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoaiSp() {
        return tenLoaiSp;
    }

    public void setTenLoaiSp(String tenLoaiSp) {
        this.tenLoaiSp = tenLoaiSp;
    }

    public String getHinhanhSp() {
        return hinhanhSp;
    }

    public void setHinhanhSp(String hinhanhSp) {
        this.hinhanhSp = hinhanhSp;
    }
}
