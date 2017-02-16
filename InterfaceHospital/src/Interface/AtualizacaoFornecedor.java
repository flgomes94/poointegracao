/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Fornecedor;
import Repository.AlteracaoDAO;
import Repository.RemoverDAO;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Samuel R
 */
public class AtualizacaoFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtualizacaoFornecedor
     */
    public AtualizacaoFornecedor() {
         ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); 
        initComponents();
        atualizatabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        jLabelNOME = new javax.swing.JLabel();
        jLabelNOME1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jLabelNOME2 = new javax.swing.JLabel();
        txtNome2 = new javax.swing.JTextField();
        txtNome3 = new javax.swing.JTextField();
        jLabelNOME3 = new javax.swing.JLabel();
        txtNome4 = new javax.swing.JTextField();
        jLabelNOME4 = new javax.swing.JLabel();
        jLabelNOME5 = new javax.swing.JLabel();
        jLabelNOME6 = new javax.swing.JLabel();
        txtNome6 = new javax.swing.JTextField();
        txtNome7 = new javax.swing.JTextField();
        jLabelNOME7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelNOME8 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jComboBoxEstados = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsEnf = new javax.swing.JTable();

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabelNOME.setText("Fornecedor:");

        jLabelNOME1.setText("CNPJ:");

        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });

        jLabelNOME2.setText("Cidade:");

        txtNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome2ActionPerformed(evt);
            }
        });

        txtNome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome3ActionPerformed(evt);
            }
        });

        jLabelNOME3.setText("CEP:");

        txtNome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome4ActionPerformed(evt);
            }
        });

        jLabelNOME4.setText("Bairro:");

        jLabelNOME5.setText("Estado:");

        jLabelNOME6.setText("Logradouro:");

        txtNome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome6ActionPerformed(evt);
            }
        });

        txtNome7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome7ActionPerformed(evt);
            }
        });

        jLabelNOME7.setText("nº:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o funcionário responsável", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelNOME8.setText("Responsável:");

        btnAtualizar.setText("Atualizar Fornecedor");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover  Fornecedor");
        btnRemover.setActionCommand("Apagar  Fornecedor");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jComboBoxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre - AC", "Alagoas - AL", "Amapá - AP", "Amazonas - AM", "Bahia  - BA", "Ceará - CE", "Distrito Federal  - DF", "Espírito Santo - ES", "Goiás - GO", "Maranhão - MA", "Mato Grosso - MT", "Mato Grosso do Sul - MS", "Minas Gerais - MG", "Pará - PA", "Paraíba - PB", "Paraná - PR", "Pernambuco - PE", "Piauí - PI", "Rio de Janeiro - RJ", "Rio Grande do Norte - RN", "Rio Grande do Sul - RS", "Rondônia - RO", "Roraima - RR", "Santa Catarina - SC", "São Paulo - SP", "Sergipe - SE", "Tocantins - TO" }));
        jComboBoxEstados.setToolTipText("");
        jComboBoxEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadosActionPerformed(evt);
            }
        });

        jTableConsEnf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNPJ", "Nome"
            }
        ));
        jTableConsEnf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsEnfMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableConsEnf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNOME8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNOME6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome6, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnRemover)
                            .addGap(341, 341, 341)
                            .addComponent(btnAtualizar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNOME)
                                    .addComponent(jLabelNOME2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabelNOME4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabelNOME1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNome1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNOME7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNome4)
                                            .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNOME3)
                                            .addComponent(jLabelNOME5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNOME)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNOME1)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNOME2)
                            .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNOME5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNOME4)
                            .addComponent(txtNome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNOME3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNOME7)
                            .addComponent(txtNome7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNOME6)
                            .addComponent(txtNome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNOME8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnAtualizar))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void txtNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome2ActionPerformed

    private void txtNome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome3ActionPerformed

    private void txtNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome4ActionPerformed

    private void txtNome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome6ActionPerformed

    private void txtNome7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        int selecionado = jTableConsEnf.getSelectedRow();
        String cnpj = jTableConsEnf.getModel().getValueAt(selecionado, 0).toString();
        
        RemoverDAO remover = new RemoverDAO();
        remover.removerFornecedor(cnpj);
        atualizatabela();
        
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void jComboBoxEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadosActionPerformed

    private void jTableConsEnfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsEnfMouseClicked
        int selecionado = jTableConsEnf.getSelectedRow();
        String id = jTableConsEnf.getModel().getValueAt(selecionado, 0).toString();
        AlteracaoDAO alteracao = new AlteracaoDAO();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor = alteracao.buscaforid(id);
        txtNome.setText(fornecedor.getNome());
        txtNome1.setText(fornecedor.getCnpj());
        txtNome2.setText(fornecedor.getCidade());
        txtNome4.setText(fornecedor.getBairro());
        txtNome3.setText(fornecedor.getCep());
        txtNome6.setText(fornecedor.getLogradouro());
        txtNome7.setText(fornecedor.getN());
        
        jComboBoxEstados.setSelectedItem(fornecedor.getEstado());
    }//GEN-LAST:event_jTableConsEnfMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEstados;
    private javax.swing.JLabel jLabelNOME;
    private javax.swing.JLabel jLabelNOME1;
    private javax.swing.JLabel jLabelNOME2;
    private javax.swing.JLabel jLabelNOME3;
    private javax.swing.JLabel jLabelNOME4;
    private javax.swing.JLabel jLabelNOME5;
    private javax.swing.JLabel jLabelNOME6;
    private javax.swing.JLabel jLabelNOME7;
    private javax.swing.JLabel jLabelNOME8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsEnf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JTextField txtNome4;
    private javax.swing.JTextField txtNome6;
    private javax.swing.JTextField txtNome7;
    // End of variables declaration//GEN-END:variables
private void atualizatabela() {
        AlteracaoDAO dao = new AlteracaoDAO();
        ResultSet rs = dao.buscafornecedores();
        jTableConsEnf.setModel(DbUtils.resultSetToTableModel(rs));
    }



}
