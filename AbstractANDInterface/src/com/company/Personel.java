package com.company;

public class Personel implements Comparable<Personel> {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private IAdres evAdresi;
    private String ad;

    public IAdres getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(IAdres adresi) {
        this.evAdresi = evAdresi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public int compareTo(Personel o) {
        if (this.id > o.id){
            return  1;
        }
        else if(this.id < o.id){
            return -1;
        }else {
            return 0;
        }
    }
}
