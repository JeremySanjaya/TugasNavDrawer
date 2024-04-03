package com.example.tugasnavdrawer;

public class ListData {
    String nama;
    int gambar;

    public ListData(String nama, int gambar) {
        this.nama = nama;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

}