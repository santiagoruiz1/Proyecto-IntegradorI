/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package co.edu.udea.PI.UI;

import co.edu.udea.PI.logica.Axiomas;
import co.edu.udea.PI.logica.FBF;
import java.awt.Color;

/**
 *
 * @author david
 */
public class Logic extends javax.swing.JFrame {
    
    /**
     * Creates new form Logic
     */
    public Logic() {
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

        jButton1 = new javax.swing.JButton();
        botonValidar = new javax.swing.JButton();
        textExpre1 = new javax.swing.JTextField();
        textExpre2 = new javax.swing.JTextField();
        botonComprobar = new javax.swing.JButton();
        labelAxioma = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNegacion = new javax.swing.JButton();
        btnAbrePar = new javax.swing.JButton();
        btnCierraPar = new javax.swing.JButton();
        btnFlecha = new javax.swing.JButton();
        btnFlechaBi = new javax.swing.JButton();
        btnDisy = new javax.swing.JButton();
        btnConj = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonValidar.setText("Validar");
        botonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonValidarActionPerformed(evt);
            }
        });

        botonComprobar.setText("Comprobar");
        botonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobarActionPerformed(evt);
            }
        });

        labelAxioma.setText("Axioma:");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNegacion.setText("⊢");
        btnNegacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegacionActionPerformed(evt);
            }
        });

        btnAbrePar.setText("(");
        btnAbrePar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbreParActionPerformed(evt);
            }
        });

        btnCierraPar.setText(")");
        btnCierraPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierraParActionPerformed(evt);
            }
        });

        btnFlecha.setText("→");
        btnFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaActionPerformed(evt);
            }
        });

        btnFlechaBi.setText("↔");
        btnFlechaBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaBiActionPerformed(evt);
            }
        });

        btnDisy.setText("∨");
        btnDisy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisyActionPerformed(evt);
            }
        });

        btnConj.setText("∧");
        btnConj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFlecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConj)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAbrePar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFlechaBi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCierraPar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisy))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNegacion)
                    .addComponent(btnAbrePar)
                    .addComponent(btnCierraPar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisy)
                    .addComponent(btnFlecha)
                    .addComponent(btnFlechaBi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConj)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textExpre2)
                                .addGap(18, 18, 18)
                                .addComponent(botonComprobar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAxioma)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textExpre1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botonValidar)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textExpre1)
                        .addGap(2, 2, 2))
                    .addComponent(botonValidar, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textExpre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonComprobar))
                .addGap(18, 18, 18)
                .addComponent(labelAxioma)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonValidarActionPerformed
        // TODO add your handling code here:
        String expresion = textExpre1.getText();
        
        try {            
            FBF f = new FBF(expresion);                
            textExpre1.setBackground(Color.GREEN);
        } catch (Exception e) {
            textExpre1.setBackground(Color.red);
        }
        
    }//GEN-LAST:event_botonValidarActionPerformed

    private void botonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobarActionPerformed
        String expresion = textExpre1.getText();
        String expresion2 = textExpre2.getText();
        labelAxioma.setText("Axioma:");
        FBF f;
        FBF f2;
        try {
            if(expresion.length()==1){
                f = new FBF(expresion.charAt(0));
            }else{
                f = new FBF(expresion);
            }
            if(expresion2.length()==1){
                f2 = new FBF(expresion2.charAt(0));
            }else{
                f2 = new FBF(expresion2);
            }
            Axiomas axiomas = new Axiomas(f, f2);
            labelAxioma.setText(axiomas.getTipoAxioma());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonComprobarActionPerformed

    private void btnNegacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegacionActionPerformed

        String texto = textExpre1.getText();
        texto = texto + '⊢';
        textExpre1.setText(texto);
    }//GEN-LAST:event_btnNegacionActionPerformed

    private void btnAbreParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbreParActionPerformed

        String texto = textExpre1.getText();
        texto = texto + '(';
        textExpre1.setText(texto);
    }//GEN-LAST:event_btnAbreParActionPerformed

    private void btnCierraParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierraParActionPerformed
        
        String texto = textExpre1.getText();
        texto = texto + ')';
        textExpre1.setText(texto);
    }//GEN-LAST:event_btnCierraParActionPerformed

    private void btnFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaActionPerformed
        
        String texto = textExpre1.getText();
        texto = texto + '→';
        textExpre1.setText(texto);
    }//GEN-LAST:event_btnFlechaActionPerformed

    private void btnFlechaBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaBiActionPerformed
        
        String texto = textExpre1.getText();
        texto = texto + '↔';
        textExpre1.setText(texto);
    }//GEN-LAST:event_btnFlechaBiActionPerformed

    private void btnDisyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisyActionPerformed
        
        String texto = textExpre1.getText();
        texto = texto + '∨';
        textExpre1.setText(texto);
    }//GEN-LAST:event_btnDisyActionPerformed

    private void btnConjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConjActionPerformed
        
        String texto = textExpre1.getText();
        texto = texto + '∧';
        textExpre1.setText(texto);
    }//GEN-LAST:event_btnConjActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logic().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComprobar;
    private javax.swing.JButton botonValidar;
    private javax.swing.JButton btnAbrePar;
    private javax.swing.JButton btnCierraPar;
    private javax.swing.JButton btnConj;
    private javax.swing.JButton btnDisy;
    private javax.swing.JButton btnFlecha;
    private javax.swing.JButton btnFlechaBi;
    private javax.swing.JButton btnNegacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAxioma;
    private javax.swing.JTextField textExpre1;
    private javax.swing.JTextField textExpre2;
    // End of variables declaration//GEN-END:variables
}
