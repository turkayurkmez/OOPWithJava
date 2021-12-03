package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;

public abstract class Dokuman {
    private String baslik;
    private String konusu;
    private String olusturanKisi;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getKonusu() {
        return konusu;
    }

    public void setKonusu(String konusu) {
        this.konusu = konusu;
    }

    public String getOlusturanKisi() {
        return olusturanKisi;
    }

    public void setOlusturanKisi(String olusturanKisi) {
        this.olusturanKisi = olusturanKisi;
    }

    public void Kopyala(String nereden, String nereye){
        System.out.println("Dosyanız kopyalandı");
    }

    public abstract void Kaydet(String adres);       //??
        //Dokümanın nasıl kaydedileceğine,
        //miras alan sınıf karar verir

    public abstract void Oku(String adres);


}
