/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 19 jun 2023                     *
 * Fecha de actualización: 19 jun 2023                *
 * Descripción: Frame para el módulo 
 *****************************************************/

package view;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        relojPanel1 = new view.RelojPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(581, 366));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(relojPanel1);
        relojPanel1.setBounds(120, 130, 320, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reloj.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 0, 658, 379);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
//            UIManager.setLookAndFeel(new FlatMacLightLaf());
            FlatAtomOneDarkIJTheme.setup();
            Principal.setDefaultLookAndFeelDecorated(
                    true);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private view.RelojPanel relojPanel1;
    // End of variables declaration//GEN-END:variables

}
