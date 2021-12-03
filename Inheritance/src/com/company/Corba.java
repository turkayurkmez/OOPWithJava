package com.company;

//derived: süper sınıftan extend edilmiş sınıf.
public class Corba extends Yemek{
    private boolean sirkeVarmi;
    private boolean limonOlsunMu;

    public boolean isSirkeVarmi() {
        return sirkeVarmi;
    }

    public void setSirkeVarmi(boolean sirkeVarmi) {
        this.sirkeVarmi = sirkeVarmi;
    }

    public boolean isLimonOlsunMu() {
        return limonOlsunMu;
    }

    public void setLimonOlsunMu(boolean limonOlsunMu) {
        this.limonOlsunMu = limonOlsunMu;
    }
    public Corba(){
        this.setIsim("Şehriyeli Domates Çorbası");

    }
}
