package main.java.controller;

import main.java.model.Ogrenci;
import main.java.view.OgrenciView;


public class OgrenciController {

    private Ogrenci ogrenci;
    private OgrenciView ogrenciView;

    public OgrenciController(Ogrenci ogrenci, OgrenciView ogrenciView) {
        this.ogrenci = ogrenci;
        this.ogrenciView = ogrenciView;
    }

    public void setOgrenciAd(String ad) {
        ogrenci.setAd(ad);
    }

    public String getOgrenciAd() {
        return ogrenci.getAd();
    }

    public void setOgrenciSoyad(String soyad) {
        ogrenci.setSoyad(soyad);
    }

    public String getOgrenciSoyad() {
        return ogrenci.getSoyad();
    }

    public void ogrenciDetaylariniGoster() {
        ogrenciView.ogrenciDetaylariniGoster(ogrenci);
    }
}
