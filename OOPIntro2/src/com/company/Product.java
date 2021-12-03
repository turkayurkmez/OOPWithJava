package com.company;

public class Product {

    /* Bir ürünün ........................... vardır */

    /* Bir ürün .......... yapar | ile ............... yapılır*/
    private String resimAdresi;

    private String ad;
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        if (ad==""){
            System.out.println("Ürün adı boş olamaz");
        }
        else {
            this.ad = ad;
        }
    }



    private String aciklama;
    private int puan;
    private double fiyat;

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(double indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public void setFiyat(double deger){
        if (deger<0){
            //throw new IllegalArgumentException("fiyat değeri 0'dan küçük olamaz");
            System.out.println("fiyat değeri 0'dan küçük olamaz");
        }
        else{
            this.fiyat = deger;
        }
    }

    public  double getFiyat(){
        return this.fiyat;
    }

    public double getIndirimliFiyat(){
        return this.fiyat * (1-this.indirimOrani);
    }

    public String getResimAdresi() {
        return resimAdresi;
    }

    public void setResimAdresi(String resimAdresi) {
        this.resimAdresi = resimAdresi;
    }



    private double indirimOrani;
}
