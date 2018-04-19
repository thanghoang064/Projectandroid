package com.example.thanghoang.seachhotel;

public class KhachSan {
     private String tenkhachsan;
    private String DiaChi;
    private float GiaTien;

    private int rating;

    public KhachSan(String tenkhachsan, String diaChi, float giaTien) {
        this.tenkhachsan = tenkhachsan;
        DiaChi = diaChi;
        GiaTien = giaTien;
    }

    public KhachSan() {
    }

    public String getTenkhachsan() {
        return tenkhachsan;
    }

    public void setTenkhachsan(String tenkhachsan) {
        this.tenkhachsan = tenkhachsan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float giaTien) {
        GiaTien = giaTien;
    }


}
