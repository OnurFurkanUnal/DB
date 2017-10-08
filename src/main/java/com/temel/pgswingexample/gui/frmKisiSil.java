/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temel.pgswingexample.gui;

import com.temel.pgswingexample.Kisi;
import com.temel.pgswingexample.KisiDbIslemleri;

/**
 *
 * @author vektorel
 */
public class frmKisiSil extends javax.swing.JDialog {

    Kisi kisi;
    /**
     * Creates new form frmKisiSil
     */
    public frmKisiSil(java.awt.Frame parent, boolean modal,Kisi kisi) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtMesaj.setText(kisi.getIsim() +" "+kisi.getSoyisim()+" Adlı kişiyi \n silmek istediğinizden emin misiniz?");
        this.kisi=kisi;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOnayla = new javax.swing.JButton();
        btnIptal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMesaj = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Silme Onayı");
        setResizable(false);

        btnOnayla.setText("Onayla");
        btnOnayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnaylaActionPerformed(evt);
            }
        });

        btnIptal.setText("İptal");
        btnIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIptalActionPerformed(evt);
            }
        });

        txtMesaj.setEditable(false);
        txtMesaj.setColumns(20);
        txtMesaj.setRows(3);
        jScrollPane1.setViewportView(txtMesaj);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIptal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(btnOnayla)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOnayla)
                    .addComponent(btnIptal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIptalActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnIptalActionPerformed

    private void btnOnaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnaylaActionPerformed
        KisiDbIslemleri dbIslemleri=new KisiDbIslemleri();
        dbIslemleri.kisiSil(kisi);
        this.dispose();
    }//GEN-LAST:event_btnOnaylaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIptal;
    private javax.swing.JButton btnOnayla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMesaj;
    // End of variables declaration//GEN-END:variables
}