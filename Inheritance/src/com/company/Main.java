package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Asci asci = new Asci();
        //yemekler:
        Corba corba = new Corba();
        corba.setIsim("Analı kızlı");

        EtYemek etYemek = new EtYemek();
        etYemek.setIsim("Köfte");

        Baklava baklava = new Baklava();
        baklava.setIsim("Baklava");

        asci.Pisir(corba);
        asci.Pisir(etYemek);
        asci.Pisir(baklava);
    }
}
