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
 * @author Samuel R
 */
public class Consulta extends javax.swing.JInternalFrame {

    public Consulta() {
         ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); 
        initComponents();
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEscolhaConsulta = new javax.swing.JPanel();
        jComboConsulta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PainelConsulta = new javax.swing.JPanel();

        painelEscolhaConsulta.setBackground(new java.awt.Color(0, 102, 102));

        jComboConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Enfermeiro", "Fornecedor", "Maqueiro", "Serviços Gerais", "Vigilante" }));
        jComboConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboConsultaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Escolha sua opção de consulta:");

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta");

        javax.swing.GroupLayout painelEscolhaConsultaLayout = new javax.swing.GroupLayout(painelEscolhaConsulta);
        painelEscolhaConsulta.setLayout(painelEscolhaConsultaLayout);
        painelEscolhaConsultaLayout.setHorizontalGroup(
            painelEscolhaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscolhaConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEscolhaConsultaLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(212, 212, 212))
        );
        painelEscolhaConsultaLayout.setVerticalGroup(
            painelEscolhaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEscolhaConsultaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEscolhaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelConsultaLayout = new javax.swing.GroupLayout(PainelConsulta);
        PainelConsulta.setLayout(PainelConsultaLayout);
        PainelConsultaLayout.setHorizontalGroup(
            PainelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PainelConsultaLayout.setVerticalGroup(
            PainelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEscolhaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelEscolhaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(PainelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboConsultaActionPerformed
        PainelConsulta.removeAll();
        if(this.jComboConsulta.getSelectedItem().equals("Administrador"))
        {
            ConsultaGeral ConsGeral = new ConsultaGeral();
            ConsGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelConsulta.add(ConsGeral);
                ConsGeral.setMaximum(true);
                ConsGeral.setVisible(true);
            } catch (Exception e) {
            }
        }
        if(this.jComboConsulta.getSelectedItem().equals("Enfermeiro"))
        {
            ConsultaEnfermeiro ConsEnfermeiro = new ConsultaEnfermeiro();
            ConsEnfermeiro.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelConsulta.add(ConsEnfermeiro);
                ConsEnfermeiro.setMaximum(true);
                ConsEnfermeiro.setVisible(true);
            } catch (Exception e) {
            }
        }

        if(this.jComboConsulta.getSelectedItem().equals("Fornecedor"))
        {
            ConsultaFornecedores ConsFornecedores = new ConsultaFornecedores();
            ConsFornecedores.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelConsulta.add(ConsFornecedores);
                ConsFornecedores.setMaximum(true);
                ConsFornecedores.setVisible(true);
            } catch (Exception e) {
            }
        }
        
          
        if(this.jComboConsulta.getSelectedItem().equals("Maqueiro"))
        {
            ConsultaGeral ConsGeral = new ConsultaGeral();
            ConsGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelConsulta.add(ConsGeral);
                ConsGeral.setMaximum(true);
                ConsGeral.setVisible(true);
            } catch (Exception e) {
            }

        }
        
        
        if(this.jComboConsulta.getSelectedItem().equals("Serviços Gerais"))
        {
            ConsultaGeral ConsGeral = new ConsultaGeral();
            ConsGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelConsulta.add(ConsGeral);
                ConsGeral.setMaximum(true);
                ConsGeral.setVisible(true);
            } catch (Exception e) {
            }
        }
            
        if(this.jComboConsulta.getSelectedItem().equals("Vigilante"))
        {
            ConsultaGeral ConsGeral = new ConsultaGeral();
            ConsGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelConsulta.add(ConsGeral);
                ConsGeral.setMaximum(true);
                ConsGeral.setVisible(true);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jComboConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelConsulta;
    private javax.swing.JComboBox<String> jComboConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painelEscolhaConsulta;
    // End of variables declaration//GEN-END:variables
}
