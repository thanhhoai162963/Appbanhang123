package com.example.appbanhang.model;

public class Sanpham {
    private int ID;
    private String Tensanpham;
    private Integer Giasanpham;
    private String Hinhsanpham;
    private String Motasanpham;
    private int IDsanpham;

    public Sanpham(int ID, String tensanpham, Integer giasanpham, String hinhsanpham, String motasanpham, int IDsanpham) {
        this.ID = ID;
        Tensanpham = tensanpham;
        Giasanpham = giasanpham;
        Hinhsanpham = hinhsanpham;
        Motasanpham = motasanpham;
        this.IDsanpham = IDsanpham;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTensanpham() {
        return Tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        Tensanpham = tensanpham;
    }

    public Integer getGiasanpham() {
        return Giasanpham;
    }

    public void setGiasanpham(Integer giasanpham) {
        Giasanpham = giasanpham;
    }

    public String getHinhsanpham() {
        return Hinhsanpham;
    }

    public void setHinhsanpham(String hinhsanpham) {
        Hinhsanpham = hinhsanpham;
    }

    public String getMotasanpham() {
        return Motasanpham;
    }

    public void setMotasanpham(String motasanpham) {
        Motasanpham = motasanpham;
    }

    public int getIDsanpham() {
        return IDsanpham;
    }

    public void setIDsanpham(int IDsanpham) {
        this.IDsanpham = IDsanpham;
    }
}
