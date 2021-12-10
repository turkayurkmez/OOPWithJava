package com.company;

public class Rapor {

    Gonderici gonderici;
    public Rapor(Gonderici gonderici){
        this.gonderici = gonderici;
    }
    public void Gonder(String gonderilecek){
        gonderici.Gonder(gonderilecek);

    }
}
