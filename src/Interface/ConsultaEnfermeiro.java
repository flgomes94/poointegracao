/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Insets;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Samuel R
 */
public class ConsultaEnfermeiro extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaCargaHoraria
     */
    public ConsultaEnfermeiro() {
                ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
*/
 
    private void jComboConsultaEnfActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       jPanelConsultaEnf.removeAll();
        if(this.jComboLotacao.getSelectedItem()== "Lotação")
        {
       
        }
        if(this.jComboLotacao.getSelectedItem() == "Carga Horária")
        {
       
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelConsultaEnf = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaInformacos = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabelSalarioTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboLotacao = new javax.swing.JComboBox<>();

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jScrollPane2.setViewportView(jTableConsulta);

        jTextAreaInformacos.setColumns(20);
        jTextAreaInformacos.setRows(5);
        jScrollPane3.setViewportView(jTextAreaInformacos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Somatório do Salário:");

        jLabelSalarioTotal.setText("Campo salario Total");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Escolha sua opção de consulta de enfermeiro:");

        jComboLotacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamento", "Emergência", "Enfermaria" }));
        jComboLotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaEnfLayout = new javax.swing.GroupLayout(jPanelConsultaEnf);
        jPanelConsultaEnf.setLayout(jPanelConsultaEnfLayout);
        jPanelConsultaEnfLayout.setHorizontalGroup(
            jPanelConsultaEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaEnfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(jPanelConsultaEnfLayout.createSequentialGroup()
                        .addGroup(jPanelConsultaEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelConsultaEnfLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelSalarioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelConsultaEnfLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConsultaEnfLayout.setVerticalGroup(
            jPanelConsultaEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaEnfLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanelConsultaEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanelConsultaEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelSalarioTotal))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanelConsultaEnf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboLotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLotacaoActionPerformed

        if(this.jComboLotacao.getSelectedItem().equals("Apartamento"))
        {
            
        }
        if(this.jComboLotacao.getSelectedItem().equals("Emergência"))
        {
        }

        if(this.jComboLotacao.getSelectedItem().equals("Enfermaria"))
        {
        }
        
    }//GEN-LAST:event_jComboLotacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboLotacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSalarioTotal;
    private javax.swing.JPanel jPanelConsultaEnf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextArea jTextAreaInformacos;
    // End of variables declaration//GEN-END:variables
}
