/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacehospital;

import java.awt.Insets;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Samuel R
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        Cadastro2 = new javax.swing.JButton();
        Consulta2 = new javax.swing.JButton();
        Atualização2 = new javax.swing.JButton();
        remoção2 = new javax.swing.JButton();
        Sair2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        PainelMenu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        Cadastro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro.png"))); // NOI18N
        Cadastro2.setText("Cadastro");
        Cadastro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro2ActionPerformed(evt);
            }
        });

        Consulta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/consulta.png"))); // NOI18N
        Consulta2.setText("Consulta");
        Consulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta2ActionPerformed(evt);
            }
        });

        Atualização2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atualização.png"))); // NOI18N
        Atualização2.setText("Atualização");
        Atualização2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atualização2ActionPerformed(evt);
            }
        });

        remoção2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        remoção2.setText("Remoção");
        remoção2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remoção2ActionPerformed(evt);
            }
        });

        Sair2.setText("Sair");
        Sair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Atualização2)
                        .addComponent(remoção2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Sair2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(Consulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(Cadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Consulta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atualização2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remoção2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Sair2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel4);

        javax.swing.GroupLayout PainelMenuLayout = new javax.swing.GroupLayout(PainelMenu);
        PainelMenu.setLayout(PainelMenuLayout);
        PainelMenuLayout.setHorizontalGroup(
            PainelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        PainelMenuLayout.setVerticalGroup(
            PainelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(PainelMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cadastro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro2ActionPerformed
        PainelMenu.removeAll();
        Cadastro telaCad = new Cadastro();
        telaCad.setBorder(new EmptyBorder(new Insets(0,0,0,0)));//Tirar Borda
        try {
            PainelMenu.add(telaCad);
            telaCad.setMaximum(true);
            telaCad.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Cadastro2ActionPerformed

    private void Consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta2ActionPerformed
        PainelMenu.removeAll();
        Consulta telaCons = new Consulta();
        telaCons.setBorder(new EmptyBorder(new Insets(0,0,0,0)));//Tirar Borda
        try {
            PainelMenu.add(telaCons);
            telaCons.setMaximum(true);
            telaCons.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Consulta2ActionPerformed

    private void Atualização2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atualização2ActionPerformed
        PainelMenu.removeAll();
        Atualizacao telaAtu = new Atualizacao();
        telaAtu.setBorder(new EmptyBorder(new Insets(0,0,0,0)));//Tirar Borda
        try {
            PainelMenu.add(telaAtu);
            telaAtu.setMaximum(true);
            telaAtu.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Atualização2ActionPerformed

    private void remoção2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remoção2ActionPerformed
        
    }//GEN-LAST:event_remoção2ActionPerformed

    private void Sair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair2ActionPerformed
        int op;
        op = JOptionPane.showConfirmDialog(null, "Tem Certeza?", "Tem Certeza?", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_Sair2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualização2;
    private javax.swing.JButton Cadastro2;
    private javax.swing.JButton Consulta2;
    private javax.swing.JPanel PainelMenu;
    private javax.swing.JButton Sair2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton remoção2;
    // End of variables declaration//GEN-END:variables
}
