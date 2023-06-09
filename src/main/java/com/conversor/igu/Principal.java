/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.conversor.igu;

import com.conversor.conversorDeMonedas.ConversorMonedas;
import com.conversor.conversorDeNumeros.ConversorNumerico;
import com.conversor.conversorDeTemperatura.ConversorTemperatura;

/**
 *
 * @author mikic
 */
public class Principal extends javax.swing.JFrame {
    private String conversorAUsar = "CONVERSOR DE MONEDAS";
    
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OptionsConversores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        BtnUsarConversor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        OptionsConversores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        OptionsConversores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONVERSOR DE MONEDAS", "CONVERSOR DE TEMPERATURA", "CONVERSOR NUMERICO" }));
        OptionsConversores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsConversoresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ESCOGE EL CONVERSOR QUE QUIERAS USAR");

        BtnUsarConversor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnUsarConversor.setText("USAR");
        BtnUsarConversor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUsarConversorMouseClicked(evt);
            }
        });
        BtnUsarConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsarConversorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OptionsConversores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(BtnUsarConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(OptionsConversores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BtnUsarConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OptionsConversoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsConversoresActionPerformed
        this.conversorAUsar = OptionsConversores.getSelectedItem().toString();
    }//GEN-LAST:event_OptionsConversoresActionPerformed

    //CONVERSOR DE MONEDAS
    //CONVERSOR DE TEMPERATURA
    //CONVERSOR NUMERICO
    private void BtnUsarConversorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsarConversorMouseClicked
           this.setVisible(false);
           if(this.conversorAUsar == "CONVERSOR DE MONEDAS"){
                ConversorMonedas.iniciarPantallaConversorDeMonedas();
           }
           if(this.conversorAUsar == "CONVERSOR DE TEMPERATURA"){
                ConversorTemperatura.iniciarPantallaConversorDeTemperatura();
           }
           if(this.conversorAUsar == "CONVERSOR NUMERICO"){
               ConversorNumerico.iniciarPantallaConversorDeNumeros();
           }
    }//GEN-LAST:event_BtnUsarConversorMouseClicked

    private void BtnUsarConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsarConversorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUsarConversorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUsarConversor;
    private javax.swing.JComboBox<String> OptionsConversores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
