/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ASUS
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameMenu
     */
    public MenuUtama() {
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

        jButton4 = new javax.swing.JButton();
        jLSIPIRS = new java.awt.Label();
        JBDataPasien = new javax.swing.JButton();
        JBDataRuangan = new javax.swing.JButton();
        JBDataDokter = new javax.swing.JButton();
        JBExit = new javax.swing.JButton();

        jButton4.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        jLSIPIRS.setAlignment(java.awt.Label.CENTER);
        jLSIPIRS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLSIPIRS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLSIPIRS.setText("Sistem Informasi Pasien Inap Rumah Sakit");

        JBDataPasien.setBackground(new java.awt.Color(51, 51, 255));
        JBDataPasien.setText("Data Pasien");

        JBDataRuangan.setBackground(new java.awt.Color(0, 0, 255));
        JBDataRuangan.setText("Data Ruangan");

        JBDataDokter.setBackground(new java.awt.Color(0, 0, 255));
        JBDataDokter.setText("Data Dokter");

        JBExit.setBackground(new java.awt.Color(51, 51, 255));
        JBExit.setText("Exit");
        JBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLSIPIRS, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBDataDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBDataRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLSIPIRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(JBDataPasien)
                .addGap(18, 18, 18)
                .addComponent(JBDataDokter)
                .addGap(18, 18, 18)
                .addComponent(JBDataRuangan)
                .addGap(40, 40, 40)
                .addComponent(JBExit)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBExitActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    public JButton getJBExit() {
        return JBExit;
    }

    public void setJBExit(JButton JBExit) {
        this.JBExit = JBExit;
    }

    public JButton getjBDataDokter() {
        return JBDataDokter;
    }

    public void setjBDataDokter(JButton jBDataDokter) {
        this.JBDataDokter = jBDataDokter;
    }

    public JButton getjBDataPasien() {
        return JBDataPasien;
    }

    public void setjBDataPasien(JButton jBDataPasien) {
        this.JBDataPasien = jBDataPasien;
    }

    public JButton getjBDataRuangan() {
        return JBDataRuangan;
    }

    public void setjBDataRuangan(JButton jBDataRuangan) {
        this.JBDataRuangan = jBDataRuangan;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDataDokter;
    private javax.swing.JButton JBDataPasien;
    private javax.swing.JButton JBDataRuangan;
    private javax.swing.JButton JBExit;
    private javax.swing.JButton jButton4;
    private java.awt.Label jLSIPIRS;
    // End of variables declaration//GEN-END:variables

    public void addActionListener(ActionListener e){
        JBExit.addActionListener(e);
        JBDataDokter.addActionListener(e);
        JBDataPasien.addActionListener(e);
        JBDataRuangan.addActionListener(e);
       
    }

    public JButton getJBDataDokter() {
        return JBDataDokter;
    }

    public void setJBDataDokter(JButton JBDataDokter) {
        this.JBDataDokter = JBDataDokter;
    }

    public JButton getJBDataPasien() {
        return JBDataPasien;
    }

    public void setJBDataPasien(JButton JBDataPasien) {
        this.JBDataPasien = JBDataPasien;
    }

    public JButton getJBDataRuangan() {
        return JBDataRuangan;
    }

    public void setJBDataRuangan(JButton JBDataRuangan) {
        this.JBDataRuangan = JBDataRuangan;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }
    
    
    
}
