package com.company;

public class Mudur extends Calisan{
    public Mudur(){
        this.saatUcreti = 150;
    }

    @Override
    public double PirimDahilHesapla() {
        return MaasHesapla() * 1.08;
    }
}
