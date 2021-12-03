package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Personel koray = new Personel();
        koray.Ad ="Koray";
        koray.Soyad="Atalay";
        koray.Yas = 38;

        int sayi = 8;

        Personel turkay = koray;
        turkay.Ad="Türkay";
        turkay.Yas = 41;

        System.out.println("Lütfen ürün adını girin");
        Scanner scanner = new Scanner(System.in);
        String urunAdi = scanner.next();
        Product product = new Product();
        product.setAd(urunAdi);

        System.out.println("Lütfen ürün fiyatını girin");
        double fiyat = scanner.nextDouble();
        product.setFiyat(fiyat);



        System.out.println(product.getAd() + "  " + product.getFiyat());
        product.setIndirimOrani(0.15);
        System.out.println(product.getAd() + " ürününün indirimli fiyatı: " + product.getIndirimliFiyat() + " TL'dir");

        FileInfo info = new FileInfo();
        info.setName("aylık-rapor");
        info.setCreatedDate(new Date());
        info.Save("Bu yazıyı kaydet");

        //araba.Calistir();
        //araba.GazaBas();
        //araba.getHiz();
        //araba.Durdur();
        String answer ="";
        do {
            System.out.println("Yapmak istediğiniz işlem: ");
            System.out.println("1. Öğrenci Ekleme");
            System.out.println("2. Id'ye Öğrenci Arama");
            System.out.println("3. Ada göre Öğrenci Arama");
            System.out.println("0. Çıkış");
            ClassRoom classRoom = new ClassRoom();
            answer = scanner.next();
            switch (answer){
                case "1":
                    addStudent(classRoom);
                case "2":
                    classRoom.FindStudent(1);
                    classRoom.FindStudent("Suzan","Özgür");
                    break;

            }

        }while (answer != "0");


    }

    private static void addStudent(ClassRoom classRoom) {

        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            Student student = new Student();

            System.out.println("Öğrenci no:");
            student.setId(scanner.nextInt());

            System.out.println("Öğrenci adı:");

            student.setName(scanner.next());
            System.out.println("Öğrenci soyadı:");
            student.setLastName(scanner.next());
            classRoom.AddStudent(student);
            System.out.println("Başka öğrenci eklemek ister misin?");
            answer = scanner.next();
            System.out.println(answer);
        }while (answer.equals("E"));

        System.out.println("Toplam öğrenci sayısı:"+ classRoom.getStudentsCount());

    }
}
