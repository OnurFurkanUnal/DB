/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temel.pgswingexample;

import com.temel.pgswingexample.gui.frmKisiListe;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class Runner {

    public static void main(String[] args) {
        System.out.println("Application Started...");
        
        frmKisiListe kisiListe=new frmKisiListe();
        kisiListe.setLocationRelativeTo(null);
        kisiListe.show();
//        Kisi k =new Kisi();
//        k.setAdres("Adres");
//        k.setEmail("email");
//        k.setIsim("Ad");
//        k.setSoyisim("Soyad");
//        k.setTel("12341234");
//        dbIslemleri.kisiEkle(k);

        

//        for (Kisi kisi : liste) {
//            System.out.println(kisi.toString());
//        }
//        
//        Kisi kisi = liste.get(liste.size()-1);
//        kisi.setSoyisim("TEMEL");
//        kisi.setIsim("Taner");
//        dbIslemleri.kisiGuncelle(kisi);
//        
//        dbIslemleri.kisiSil(kisi);
        
        System.out.println("Application Complete with Count:");

    }
}
