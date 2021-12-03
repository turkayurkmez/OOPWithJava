package com.company;

public class Adres implements IAdres {
    private int postaKodu;
    private String sokak;
    private String cadde;

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    @Override
    public String getCadde() {
        return cadde;
    }

    @Override
    public void setCadde(String cadde) {
       this.cadde = cadde;
    }

    public int getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(int postaKodu) {
        this.postaKodu = postaKodu;
    }
}
