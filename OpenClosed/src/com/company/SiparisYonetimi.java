package com.company;

public class SiparisYonetimi {
    private Musteri musteri;

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public double IndirimliFiyat(double fiyat){
        return musteri.getKart().IndirimHesapla(fiyat);

    }
}
