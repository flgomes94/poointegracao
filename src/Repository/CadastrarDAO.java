/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.Enfermeiro;
import Model.Fornecedor;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class CadastrarDAO {
    Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    public CadastrarDAO(){
        
    }
    public boolean VerificaCpfExistente(String cpftest) {
        boolean x = true;
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "SELECT * FROM Funcionarios WHERE CPF = ?";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cpftest);
            rs = pst.executeQuery();
            
            if(rs.next()){
                x = false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return x;
    }
    
    public boolean VerificaCnpjExistente(String cnpjtest) {
        boolean x = true;
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "SELECT * FROM Fornecedor WHERE CNPJ = ?";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cnpjtest);
            rs = pst.executeQuery();
            
            if(rs.next()){
                x = false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return x;
    }
    

    public void cadastrarFuncionario(Funcionario adc){
       conexao = DbConexao.obterConexao();
        String sql;
        sql = "INSERT INTO Funcionarios (Nome, CPF, RG, Telefone, Cargo, Salario, Endereco, Estado, Cidade) VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, adc.getNome());
            pst.setString(2, adc.getCpf());
            pst.setString(3,adc.getRg());
            pst.setString(4,adc.getTelefone());
            pst.setString(5,adc.getCargo());
            pst.setString(6,adc.getSalario());
            pst.setString(7,adc.getEndereco());
            pst.setString(8,adc.getEstado());
            pst.setString(9, adc.getCidade());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
            rs.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
 
    }
    
    public void CadastrarEnfermeiro(Enfermeiro adc){
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "INSERT INTO Funcionarios (Nome, CPF, RG, Telefone, Cargo, Salario, Endereco, Estado, Cidade, Regime, Lotacao) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, adc.getNome());
            pst.setString(2, adc.getCpf());
            pst.setString(3,adc.getRg());
            pst.setString(4,adc.getTelefone());
            pst.setString(5,adc.getCargo());
            pst.setString(6,adc.getSalario());
            pst.setString(7,adc.getEndereco());
            pst.setString(8,adc.getEstado());
            pst.setString(9, adc.getCidade());
            pst.setString(10,adc.getRegime());
            pst.setString(11, adc.getLotacao());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            rs.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void CadastrarFornecedor(Fornecedor adc){
         conexao = DbConexao.obterConexao();
        String sql;
        sql = "INSERT INTO Fornecedor (CNPJ, Nome, Estado, Cidade, Bairro, CEP, Logradouro, N, Responsavel) VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1,adc.getCnpj());
            pst.setString(2,adc.getNome());
            pst.setString(3,adc.getEstado());
            pst.setString(4,adc.getCidade());
            pst.setString(5,adc.getBairro());
            pst.setString(6,adc.getCep());
            pst.setString(7,adc.getLogradouro());
            pst.setString(8,adc.getN());
            pst.setString(9,adc.getResponsavel());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            rs.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet busca(){
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "SELECT id as Código, nome as NOME from Funcionarios";
        try{
            pst = conexao.prepareStatement(sql); 
            rs = pst.executeQuery();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return rs;
    }
    
}
