/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lala;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 *
 * @author Vitoria Moreira
 */
public class entrar extends javax.swing.JFrame {

    /**
     * Creates new form entrar
     */
    public entrar() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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
        jLabelusuario = new javax.swing.JLabel();
        jTextFieldU = new javax.swing.JTextField();
        jTextFieldsenha = new javax.swing.JLabel();
        jTextFieldS = new javax.swing.JTextField();
        jButtoncadastro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelusuario.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabelusuario.setText("USUÁRIO");
        jPanel1.add(jLabelusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 20));

        jTextFieldU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUActionPerformed(evt);
            }
        });
        jTextFieldU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldU, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 30));

        jTextFieldsenha.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jTextFieldsenha.setText("SENHA");
        jPanel1.add(jTextFieldsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jTextFieldS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 260, 30));

        jButtoncadastro.setAutoscrolls(true);
        jButtoncadastro.setContentAreaFilled(false);
        jButtoncadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtoncadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncadastroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoncadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 140, 30));

        jLabel6.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel6.setText("BEM VINDO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, -1));

        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("REALIZAR CADASTRO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figurinhas/login.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jTextFieldUActionPerformed

    private void jButtoncadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncadastroActionPerformed
        // TODO add your handling code here:
        String fabio = jTextFieldU.getText();
        String senha = jTextFieldS.getText();

        if (!"fabio".equalsIgnoreCase(fabio)) {
            JOptionPane.showMessageDialog(null, "Usuário incorreta!!\n");
            jTextFieldU.requestFocus();
            jTextFieldU.setText(null);

        } else if (!"123".equalsIgnoreCase(senha)) {
            JOptionPane.showMessageDialog(null, "Senha incorreta!!\n");
            jTextFieldS.requestFocus();
            jTextFieldS.setText(null);

        } else {
            new CADASTRO().setVisible(true);
        }


    }//GEN-LAST:event_jButtoncadastroActionPerformed

    private void jTextFieldSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSActionPerformed

    private void jTextFieldUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldS.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldUKeyPressed

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
            java.util.logging.Logger.getLogger(entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncadastro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldS;
    private javax.swing.JTextField jTextFieldU;
    private javax.swing.JLabel jTextFieldsenha;
    // End of variables declaration//GEN-END:variables
}
