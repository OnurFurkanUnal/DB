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
public class Kisi {

    private Integer id;
    private String isim;
    private String soyisim;
    private String email;
    private String tel;
    private String adres;
    private Integer ilId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getIlId() {
        return ilId;
    }

    public void setIlId(Integer ilId) {
        this.ilId = ilId;
    }

    
    @Override
    public String toString() {
        return "Kisi{" + "id=" + id + ", isim=" + isim + ", soyisim=" + soyisim + ", email=" + email + ", tel=" + tel + ", adres=" + adres + '}';
    }

  
}
