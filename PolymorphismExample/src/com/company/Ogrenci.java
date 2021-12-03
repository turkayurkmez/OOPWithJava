package com.company;

public class Ogrenci {
    private String ad;
    private String soyad;

    public String getAd() {
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

    public String getHakkinda() {
        return hakkinda;
    }

    public void setHakkinda(String hakkinda) {
        this.hakkinda = hakkinda;
    }

    private String hakkinda;

    @Override
    public String toString() {
        return ad + " " + soyad + " " + hakkinda;
    }

    public Ogrenci(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
    }


}
