package com.company;

public class SilverKart  extends  Kart{
    @Override
    public double IndirimHesapla(double fiyat) {
        return fiyat * 0.90;
    }
}
