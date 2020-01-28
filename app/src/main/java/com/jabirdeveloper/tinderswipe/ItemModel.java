package com.jabirdeveloper.tinderswipe;

public class ItemModel {
    private int image;
    private String nama, usia, kota;

    public ItemModel() {
    }

    public ItemModel(int image, String nama, String usia, String kota) {
        this.image = image;
        this.nama = nama;
        this.usia = usia;
        this.kota = kota;
    }

    public int getImage() {
        return image;
    }

    public String getNama() {
        return nama;
    }

    public String getUsia() {
        return usia;
    }

    public String getKota() {
        return kota;
    }
}
