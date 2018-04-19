package com.example.thanghoang.seachhotel;

public class KhachSan {
     private String tenkhachsan;
    private String DiaChi;
    private float GiaTien;
    private int Image;

    public KhachSan(String tenkhachsan, String diaChi, float giaTien,int image) {
        this.tenkhachsan = tenkhachsan;
        DiaChi = diaChi;
        GiaTien = giaTien;
        Image = image;
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

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
