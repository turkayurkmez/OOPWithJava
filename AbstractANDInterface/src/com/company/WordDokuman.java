package com.company;

public class WordDokuman  extends Dokuman implements ICiktiAlinabilir {
    @Override
    public void Kaydet(String adres) {
       System.out.println("word dosyası, "+ adres+ " adresine kaydedildi");
    }

    @Override
    public void Oku(String adres) {
        System.out.println("word dosyası"+adres+ " adresinden okundu");

    }

    @Override
    public void CiktiAl() {

    }
}
