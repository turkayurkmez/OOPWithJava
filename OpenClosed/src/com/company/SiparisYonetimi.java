package com.company;

public class SiparisYonetimi {
    private Musteri musteri;
    public double IndirimliFiyat(double fiyat){
        switch (musteri.getKart()){
            case Gold :
                return fiyat * 0.85;
            case Silver :
                return fiyat * 0.90;
            case Standart:
                return fiyat * 0.95;
            default :
                return fiyat;

        }
    }
}
