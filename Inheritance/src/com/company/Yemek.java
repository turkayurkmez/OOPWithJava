package com.company;

import java.util.ArrayList;
import java.util.List;

//super:
public class Yemek {
    private double fiyat;
    private String isim;

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<String> getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(List<String> malzemeler) {
        this.malzemeler = malzemeler;
    }

    private List<String> malzemeler = new ArrayList<String>();


    public Yemek(){
        malzemeler = new ArrayList<String>();
    }

    public void Pisir(){
        System.out.println(isim + " pişti");

    }

    public void Sunum(){
        System.out.println(isim + " Pilav ile birlikte....");
    }

}
