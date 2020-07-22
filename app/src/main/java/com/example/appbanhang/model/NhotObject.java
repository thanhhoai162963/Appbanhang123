
package com.example.appbanhang.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NhotObject {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("tensp")
    @Expose
    private String tensp;
    @SerializedName("giasp")
    @Expose
    private String giasp;
    @SerializedName("hinhanhsp")
    @Expose
    private String hinhanhsp;
    @SerializedName("motaso")
    @Expose
    private String motaso;
    @SerializedName("idsanpham")
    @Expose
    private String idsanpham;

    public NhotObject() {
    }

    public NhotObject(String id, String tensp, String giasp, String hinhanhsp, String motaso, String idsanpham) {
        super();
        this.id = id;
        this.tensp = tensp;
        this.giasp = giasp;
        this.hinhanhsp = hinhanhsp;
        this.motaso = motaso;
        this.idsanpham = idsanpham;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getGiasp() {
        return giasp;
    }

    public void setGiasp(String giasp) {
        this.giasp = giasp;
    }

    public String getHinhanhsp() {
        return hinhanhsp;
    }

    public void setHinhanhsp(String hinhanhsp) {
        this.hinhanhsp = hinhanhsp;
    }

    public String getMotaso() {
        return motaso;
    }

    public void setMotaso(String motaso) {
        this.motaso = motaso;
    }

    public String getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(String idsanpham) {
        this.idsanpham = idsanpham;
    }

}
