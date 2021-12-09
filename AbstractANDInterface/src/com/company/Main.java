package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PdfDokuman oryantasyon = new PdfDokuman();
        ExcelDokuman satisRaporu = new ExcelDokuman();
        WordDokuman sozlesme = new WordDokuman();

        DokumanYazici yazici = new DokumanYazici();
        yazici.CiktiAl(satisRaporu);

        Personel personel = new Personel();
        personel.setId(26);
        personel.setAd("Ayhan");

        Personel personel2 = new Personel();
        personel2.setId(9);
        personel2.setAd("Türkay");
        //personel.getEvAdresi().getSokak();

        List<Personel> personelList = new ArrayList<Personel>();
        personelList.add(personel);
        personelList.add(personel2);

        Collections.sort(personelList);

        for ( Personel per : personelList ) {
            System.out.println(per.getAd());
        }
    }
}
