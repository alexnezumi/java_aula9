/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form inicio_GUI
     */
    public inicio_GUI() {
        initComponents();
        res_txt.setVisible(false);
        img_img.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        val1_txt = new javax.swing.JTextField();
        val2_txt = new javax.swing.JTextField();
        mais_txt = new javax.swing.JButton();
        menos_txt = new javax.swing.JButton();
        vezes_txt = new javax.swing.JButton();
        div_txt = new javax.swing.JButton();
        sair_btn = new javax.swing.JButton();
        img_img = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        res_txt = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora muito maneira", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 11))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setText("Valor1 :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(37, 100, 60, 14);

        jLabel3.setText("Valor2:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 70, 20);

        val1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val1_txtActionPerformed(evt);
            }
        });
        jPanel1.add(val1_txt);
        val1_txt.setBounds(110, 100, 250, 20);

        val2_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val2_txtActionPerformed(evt);
            }
        });
        jPanel1.add(val2_txt);
        val2_txt.setBounds(110, 140, 250, 20);

        mais_txt.setText("+");
        mais_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mais_txtActionPerformed(evt);
            }
        });
        jPanel1.add(mais_txt);
        mais_txt.setBounds(30, 240, 60, 20);

        menos_txt.setText("--");
        menos_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menos_txtActionPerformed(evt);
            }
        });
        jPanel1.add(menos_txt);
        menos_txt.setBounds(120, 240, 60, 23);

        vezes_txt.setText("x");
        vezes_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vezes_txtActionPerformed(evt);
            }
        });
        jPanel1.add(vezes_txt);
        vezes_txt.setBounds(220, 240, 60, 23);

        div_txt.setText("/");
        div_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_txtActionPerformed(evt);
            }
        });
        jPanel1.add(div_txt);
        div_txt.setBounds(330, 240, 60, 23);

        sair_btn.setForeground(new java.awt.Color(255, 0, 0));
        sair_btn.setText("X");
        sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sair_btn);
        sair_btn.setBounds(360, 310, 50, 23);

        img_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/hapy.png"))); // NOI18N
        jPanel1.add(img_img);
        img_img.setBounds(30, 20, 50, 60);

        jLabel4.setText("Resultado:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 180, 60, 20);

        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(259, 310, 60, 23);
        jPanel1.add(res_txt);
        res_txt.setBounds(200, 170, 60, 50);

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

        setSize(new java.awt.Dimension(421, 342));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void val1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val1_txtActionPerformed
    //VALOR1
    }//GEN-LAST:event_val1_txtActionPerformed

    private void mais_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mais_txtActionPerformed
    Controller.Atividade_DAO.mais();
    }//GEN-LAST:event_mais_txtActionPerformed

    private void menos_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menos_txtActionPerformed
     Controller.Atividade_DAO.menos();
    }//GEN-LAST:event_menos_txtActionPerformed

    private void vezes_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vezes_txtActionPerformed
    Controller.Atividade_DAO.mult();
    }//GEN-LAST:event_vezes_txtActionPerformed

    private void div_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_txtActionPerformed
    Controller.Atividade_DAO.div();
    }//GEN-LAST:event_div_txtActionPerformed

    private void val2_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val2_txtActionPerformed
    //VALOR2
    }//GEN-LAST:event_val2_txtActionPerformed

    private void sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_btnActionPerformed
    System.exit(0);
    }//GEN-LAST:event_sair_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Controller.Atividade_DAO.limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton div_txt;
    public static javax.swing.JLabel img_img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mais_txt;
    private javax.swing.JButton menos_txt;
    public static javax.swing.JLabel res_txt;
    private javax.swing.JButton sair_btn;
    public static javax.swing.JTextField val1_txt;
    public static javax.swing.JTextField val2_txt;
    private javax.swing.JButton vezes_txt;
    // End of variables declaration//GEN-END:variables
}
