package com.conversor.conversorDeTemperatura.igu;

import com.conversor.conversorDeTemperatura.modelo.ConversorTempFunction;

public class PantallaConversorTemp extends javax.swing.JFrame {
    private String gradosTo = "Celcius";
    private String gradosFrom = "Celcius";
    
    public PantallaConversorTemp() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ComboBoxTo = new javax.swing.JComboBox<>();
        ComboBoxFrom = new javax.swing.JComboBox<>();
        BtnConvertir = new javax.swing.JButton();
        textAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ResultadoConversion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ComboBoxTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Celcius", "Fahrenheit", "Kelvin"}));
        ComboBoxTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxToActionPerformed(evt);
            }
        });

        ComboBoxFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Celcius", "Fahrenheit", "Kelvin"}));
        ComboBoxFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFromActionPerformed(evt);
            }
        });

        BtnConvertir.setText("Convertir");
        BtnConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConvertirMouseClicked(evt);
            }
        });

        jLabel1.setText("A");

        jLabel2.setText("Convertir");

        ResultadoConversion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnConvertir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ResultadoConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(ComboBoxFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addComponent(ResultadoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnConvertir)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxToActionPerformed
        this.gradosTo = (String) ComboBoxTo.getSelectedItem();        
    }//GEN-LAST:event_ComboBoxToActionPerformed

    private void ComboBoxFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFromActionPerformed
        this.gradosFrom = (String) ComboBoxFrom.getSelectedItem();
    }//GEN-LAST:event_ComboBoxFromActionPerformed

    private void elegirConversion(){
        ConversorTempFunction operaciones = new ConversorTempFunction(Float.valueOf(this.textAmount.getText()));

        if(this.gradosTo == this.gradosFrom)
            ResultadoConversion.setText(this.textAmount.getText());
        else if(this.gradosTo == "Celcius" && this.gradosFrom == "Fahrenheit")
            ResultadoConversion.setText(operaciones.celciusToFahrenheit().toString());
        else if(this.gradosTo == "Fahrenheit" && this.gradosFrom == "Celcius")
            ResultadoConversion.setText(operaciones.fahrenheitToCelcius().toString());
        else if(this.gradosTo == "Kelvin" && this.gradosFrom == "Fahrenheit")
            ResultadoConversion.setText(operaciones.kelvinToFahrenheit().toString());
        else if(this.gradosTo == "Fahrenheit" && this.gradosFrom == "Kelvin")
            ResultadoConversion.setText(operaciones.fahrenheitToKelvin().toString());
        else if(this.gradosTo == "Celcius" && this.gradosFrom == "Kelvin")
        ResultadoConversion.setText(operaciones.celciusToKelvin().toString());
        else ResultadoConversion.setText(operaciones.kelvinToCelcius().toString());
    }
    private void BtnConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConvertirMouseClicked
        if( textAmount.getText() != null){
            elegirConversion();
        }else{
            System.out.println("Vacio");
        }
    }//GEN-LAST:event_BtnConvertirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConvertir;
    private javax.swing.JComboBox<String> ComboBoxFrom;
    private javax.swing.JComboBox<String> ComboBoxTo;
    private javax.swing.JLabel ResultadoConversion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textAmount;
    // End of variables declaration//GEN-END:variables
}
