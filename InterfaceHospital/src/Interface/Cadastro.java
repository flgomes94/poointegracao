
package Interface;

import Repository.DbConexao;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Samuel R
 */
public class Cadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); 
        initComponents();
        DbConexao db = new DbConexao();
        db.obterConexao();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelEscolhaCadastro = new javax.swing.JPanel();
        jComboCadastro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PainelCad = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        painelEscolhaCadastro.setBackground(new java.awt.Color(0, 102, 102));

        jComboCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Enfermeiro", "Fornecedor", "Maqueiro", "Medicamentos", "Serviços Gerais", "Vigilante" }));
        jComboCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCadastroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Escolha sua opção de cadastro:");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro");

        javax.swing.GroupLayout PainelCadLayout = new javax.swing.GroupLayout(PainelCad);
        PainelCad.setLayout(PainelCadLayout);
        PainelCadLayout.setHorizontalGroup(
            PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PainelCadLayout.setVerticalGroup(
            PainelCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelEscolhaCadastroLayout = new javax.swing.GroupLayout(painelEscolhaCadastro);
        painelEscolhaCadastro.setLayout(painelEscolhaCadastroLayout);
        painelEscolhaCadastroLayout.setHorizontalGroup(
            painelEscolhaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEscolhaCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jComboCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelEscolhaCadastroLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, Short.MAX_VALUE)
                .addGap(294, 294, 294))
            .addComponent(PainelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelEscolhaCadastroLayout.setVerticalGroup(
            painelEscolhaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEscolhaCadastroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEscolhaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(painelEscolhaCadastro);

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

    private void jComboCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCadastroActionPerformed
        PainelCad.removeAll();
        if(this.jComboCadastro.getSelectedItem().equals("Administrador"))
        {
            CadastroGeral CadGeral = new CadastroGeral();
            CadGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelCad.add(CadGeral);
                CadGeral.setMaximum(true);
                CadGeral.setVisible(true);
            } catch (Exception e) {
            }
        }
        if(this.jComboCadastro.getSelectedItem() == "Enfermeiro")
        {
            
            CadastroEnfermeiro CadEnfermeiros = new CadastroEnfermeiro();
            CadEnfermeiros.setBorder(new EmptyBorder(new Insets(0,0,0,0)));       
            try {
                PainelCad.add(CadEnfermeiros);
                CadEnfermeiros.setMaximum(true);
                CadEnfermeiros.setVisible(true);
            } catch (Exception e) {
            }
        }

        if(this.jComboCadastro.getSelectedItem() == "Fornecedor")
        {
            CadastroFornecedor CadFornecedor = new CadastroFornecedor();
            CadFornecedor.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelCad.add(CadFornecedor);
                CadFornecedor.setMaximum(true);
                CadFornecedor.setVisible(true);
            } catch (Exception e) {
            }    
        }
        
        
        
        if(this.jComboCadastro.getSelectedItem() == "Maqueiro")
        {
            CadastroGeral CadGeral = new CadastroGeral();
            CadGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelCad.add(CadGeral);
                CadGeral.setMaximum(true);
                CadGeral.setVisible(true);
            } catch (Exception e) {
            }
        }
        
        if(this.jComboCadastro.getSelectedItem() == "Medicamentos")
        {
            CadastroMedicamentos CadMedicamentos = new CadastroMedicamentos();
            CadMedicamentos.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelCad.add(CadMedicamentos);
                CadMedicamentos.setMaximum(true);
                CadMedicamentos.setVisible(true);
            } catch (Exception e) {
            }
        }
        
        
        if(this.jComboCadastro.getSelectedItem() == "Serviços Gerais")
        {
            CadastroGeral CadGeral = new CadastroGeral();
            CadGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelCad.add(CadGeral);
                CadGeral.setMaximum(true);
                CadGeral.setVisible(true);
            } catch (Exception e) {
            }
        }    
            
        if(this.jComboCadastro.getSelectedItem() == "Vigilante")
        {
         CadastroGeral CadGeral = new CadastroGeral();
            CadGeral.setBorder(new EmptyBorder(new Insets(0,0,0,0)));
       
            try {
                PainelCad.add(CadGeral);
                CadGeral.setMaximum(true);
                CadGeral.setVisible(true);
            } catch (Exception e) {
            }    
        }
    }//GEN-LAST:event_jComboCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCad;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelEscolhaCadastro;
    // End of variables declaration//GEN-END:variables
}
