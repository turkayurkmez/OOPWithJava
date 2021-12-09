package com.company;

public class GoldKart extends  Kart {
    @Override
    public double IndirimHesapla(double fiyat) {
        return fiyat * 0.85;
    }
}
