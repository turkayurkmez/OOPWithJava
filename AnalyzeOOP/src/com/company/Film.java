package com.company;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String filmAdi;
    private Yonetmen yonetmen;
    private List<Oyuncu> oyuncular;

    public Film(){
        oyuncular = new ArrayList<Oyuncu>();
    }

    public void OyuncuEkle(Oyuncu oyuncu){
        this.oyuncular.add(oyuncu);
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public Yonetmen getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(Yonetmen yonetmen) {
        this.yonetmen = yonetmen;
    }

    public List<Oyuncu> getOyuncular() {
        return oyuncular;
    }

    public void setOyuncular(List<Oyuncu> oyuncular) {
        this.oyuncular = oyuncular;
    }


}
