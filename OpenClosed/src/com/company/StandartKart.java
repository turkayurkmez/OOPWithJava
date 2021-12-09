package com.company;

public class StandartKart extends Kart {
    @Override
    public double IndirimHesapla(double fiyat) {
        return fiyat * 0.95;
    }
}
