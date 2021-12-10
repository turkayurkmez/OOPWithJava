package com.company;

public class Oyuncu {
    private int id;
    private String ad;
    private String soyad;
    private String lakap;

    public String getLakap() {
        return lakap;
    }

    public void setLakap(String lakap) {
        this.lakap = lakap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        if (lakap != null){
            return lakap;
        }
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return  this.lakap != null ? lakap : ad + " " + soyad;
    }
}
