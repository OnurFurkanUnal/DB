/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temel.pgswingexample.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author vektorel
 */
public class DBOperations {

    public ResultSet select(String sqlQuery) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            System.out.println(sqlQuery);
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            return stmt.executeQuery();
        } catch (Exception e) {
        }
        return null;
    }

    public int insert(String sqlQuery) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            System.out.println(sqlQuery);
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            return stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void delete(String sqlQuery) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            System.out.println(sqlQuery);
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String sqlQuery) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            System.out.println(sqlQuery);
            PreparedStatement stmt = connection.prepareStatement(sqlQuery);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
