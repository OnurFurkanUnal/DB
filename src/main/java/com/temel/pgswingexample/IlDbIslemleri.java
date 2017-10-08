/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temel.pgswingexample;

import com.temel.pgswingexample.db.DBOperations;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class IlDbIslemleri {
    
    private DBOperations dbOperations = new DBOperations();
    
    public List<Il> illeriGetir() {
        List<Il> list = new ArrayList();
        try {
            String sqlQuery = " select * from il order by adi ";
            ResultSet resultSet = dbOperations.select(sqlQuery);
            while (resultSet.next()) {
                Il k = new Il();
                k.setId(resultSet.getInt("id"));
                k.setAdi(resultSet.getString("adi"));
                k.setPlakaKodu(resultSet.getString("plaka_kodu"));
                list.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
     public Il ilGetirId(Integer id) {
        try {
            String sqlQuery = " select * from il where id="+id;
            ResultSet resultSet = dbOperations.select(sqlQuery);
            while (resultSet.next()) {
                Il k = new Il();
                k.setId(resultSet.getInt("id"));
                k.setAdi(resultSet.getString("adi"));
                k.setPlakaKodu(resultSet.getString("plaka_kodu"));
                return k;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
