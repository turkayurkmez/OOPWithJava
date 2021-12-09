package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Object object = null;

        Ogrenci ogr1 =  new Ogrenci("Ender", "Gören");
        Ogrenci ogr2 =  new Ogrenci("Hakan","Örengül");
        Ogrenci ogr3 =  new Ogrenci("Türkay", "Ürkmez");

        System.out.println(ogr1);
        System.out.println(ogr3);
        System.out.println(ogr2);

        Mudur mudur = new Mudur();

        System.out.println("Maaş :"+mudur.MaasHesapla());
        System.out.println("Pirim: " +mudur.PirimDahilHesapla());


    }
}
