/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temel.pgswingexample;

/**
 *
 * @author vektorel
 */
public class Il {

    private Integer id;
    private String adi;
    private String plakaKodu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getPlakaKodu() {
        return plakaKodu;
    }

    public void setPlakaKodu(String plakaKodu) {
        this.plakaKodu = plakaKodu;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Il){
            Il il =(Il) obj;
            if(il.getId()==this.id){
                return true;
            }
        }
        return false;
    }
 
    @Override
    public String toString() {
        return plakaKodu +"-"+ adi;
    }

}
