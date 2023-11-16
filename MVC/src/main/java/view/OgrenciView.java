package main.java.view;


import main.java.model.Ogrenci;

public class OgrenciView {

    public void ogrenciDetaylariniGoster(Ogrenci ogrenci) {
        System.out.println("Öğrenci Adı: " + ogrenci.getAd());
        System.out.println("Öğrenci Soyadı: " + ogrenci.getSoyad());

    }

}
