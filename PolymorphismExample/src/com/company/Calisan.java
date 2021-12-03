package com.company;

public class Calisan {
    protected double saatUcreti = 125;
    public double MaasHesapla(){
       return saatUcreti * 180;
    }

    public double PirimDahilHesapla(){
        return  (saatUcreti * 180) * 1.03;
    }

}
