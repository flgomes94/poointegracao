/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacehospital;

import java.awt.Insets;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Walber
 */
public class Atualizacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form Atualizacao
     */
    public Atualizacao() {
                ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); 
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

        painelEscolhaAtualizacao = new javax.swing.JPanel();
        jComboConsulta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PainelAtualizacao = new javax.swing.JPanel();

        painelEscolhaAtualizacao.setBackground(new java.awt.Color(0, 102, 102));

        jComboConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Enfermeiro", "Fornecedor", "Maqueiro", "Medicamentos", "Serviços Gerais", "Vigilante" }));
        jComboConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboConsultaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Escolha sua opção de atualização:");

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualização");

        javax.swing.GroupLayout painelEscolhaAtualizacaoLayout = new javax.swing.GroupLayout(painelEscolhaAtualizacao);
        painelEscolhaAtualizacao.setLayout(painelEscolhaAtualizacaoLayout);
        painelEscolhaAtualizacaoLayout.setHorizontalGroup(
            painelEscolhaAtualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscolhaAtualizacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEscolhaAtualizacaoLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(212, 212, 212))
        );
        painelEscolhaAtualizacaoLayout.setVerticalGroup(
            painelEscolhaAtualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEscolhaAtualizacaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEscolhaAtualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelAtualizacaoLayout = new javax.swing.GroupLayout(PainelAtualizacao);
        PainelAtualizacao.setLayout(PainelAtualizacaoLayout);
        PainelAtualizacaoLayout.setHorizontalGroup(
            PainelAtualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PainelAtualizacaoLayout.setVerticalGroup(
            PainelAtualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelAtualizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEscolhaAtualizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelEscolhaAtualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(PainelAtualizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboConsultaActionPerformed
        PainelAtualizacao.removeAll();
        if(this.jComboConsulta.getSelectedItem().equals("Administrador"))
        {
            AtualizacaoGeral AtuGeral = new AtualizacaoGeral();
            AtuGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));

            try {
                PainelAtualizacao.add(AtuGeral);
                AtuGeral.setMaximum(true);
                AtuGeral.setVisible(true);
            } catch (Exception e) {
            }
        }
        if(this.jComboConsulta.getSelectedItem().equals("Enfermeiro"))
        {
            AtualizacaoEnfermeiro AtuEnfermeiro = new AtualizacaoEnfermeiro();
            AtuEnfermeiro.setBorder(new EmptyBorder(new Insets(0,0,0,0)));

            try {
                PainelAtualizacao.add(AtuEnfermeiro);
                AtuEnfermeiro.setMaximum(true);
                AtuEnfermeiro.setVisible(true);
            } catch (Exception e) {
            }
        }

        if(this.jComboConsulta.getSelectedItem().equals("Fornecedor"))
        {
            AtualizacaoFornecedor AtuFornecedor = new AtualizacaoFornecedor();
            AtuFornecedor.setBorder(new EmptyBorder(new Insets(0,0,0,0)));

            try {
                PainelAtualizacao.add(AtuFornecedor);
                AtuFornecedor.setMaximum(true);
                AtuFornecedor.setVisible(true);
            } catch (Exception e) {
            }
        }

        if(this.jComboConsulta.getSelectedItem().equals("Maqueiro"))
        {
            AtualizacaoGeral AtuGeral = new AtualizacaoGeral();
            AtuGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));

            try {
                PainelAtualizacao.add(AtuGeral);
                AtuGeral.setMaximum(true);
                AtuGeral.setVisible(true);
            } catch (Exception e) {
            }
        }

        if(this.jComboConsulta.getSelectedItem().equals("Medicamentos"))
        {
            AtualizacaoMedicamentos AtuMedicamentos = new AtualizacaoMedicamentos();
            AtuMedicamentos.setBorder(new EmptyBorder(new Insets(0,0,0,0)));

            try {
                PainelAtualizacao.add(AtuMedicamentos);
                AtuMedicamentos.setMaximum(true);
                AtuMedicamentos.setVisible(true);
            } catch (Exception e) {
            }
        }


        if(this.jComboConsulta.getSelectedItem().equals("Serviços Gerais"))
        {
            AtualizacaoGeral AtuGeral = new AtualizacaoGeral();
            AtuGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));

            try {
                PainelAtualizacao.add(AtuGeral);
                AtuGeral.setMaximum(true);
                AtuGeral.setVisible(true);
            } catch (Exception e) {
            } 
        }

        if(this.jComboConsulta.getSelectedItem().equals("Vigilante"))
        {
         AtualizacaoGeral AtuGeral = new AtualizacaoGeral();
            AtuGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));

            try {
                PainelAtualizacao.add(AtuGeral);
                AtuGeral.setMaximum(true);
                AtuGeral.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jComboConsultaActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAtualizacao;
    private javax.swing.JComboBox<String> jComboConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painelEscolhaAtualizacao;
    // End of variables declaration//GEN-END:variables
}
