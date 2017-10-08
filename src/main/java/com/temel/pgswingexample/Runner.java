/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temel.pgswingexample;

import com.temel.pgswingexample.gui.frmKisiListe;

/**
 *
 * @author vektorel
 */
public class Runner {

    public static void main(String[] args) {
        System.out.println("Application Started...");
        frmKisiListe kisiListe = new frmKisiListe();
        kisiListe.setLocationRelativeTo(null);
        kisiListe.show();
        System.out.println("Application Complete with Count:");
    }
}
