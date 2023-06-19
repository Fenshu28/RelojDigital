/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 13 jun 2023                     *
 * Fecha de actualización: 13 jun 2023                *
 * Descripción: Frame para el módulo 
 *****************************************************/

package view;

import controller.TiempoController;

public class RelojPanel extends javax.swing.JPanel {
    private TiempoController cronometro;
    public RelojPanel() {
        initComponents();
         cronometro = new TiempoController(jLabel1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInciar = new org.jdesktop.swingx.JXButton();
        btnParar = new org.jdesktop.swingx.JXButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Digital Display", 0, 80)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00:00:00");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);

        btnInciar.setText("Iniciar");
        btnInciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInciar);

        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });
        jPanel1.add(btnParar);

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnInciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInciarActionPerformed
        cronometro.iniciar();
    }//GEN-LAST:event_btnInciarActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        cronometro.parar();
    }//GEN-LAST:event_btnPararActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnInciar;
    private org.jdesktop.swingx.JXButton btnParar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
