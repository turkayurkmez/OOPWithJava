package com.company;

public class WhatsappGonderici implements Gonderici{
    @Override
    public void Gonder(String kime) {
        System.out.println(kime + " adresine Whatsapp ile gönderildi");
    }
}
