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
import java.sql.SQLException;


public class CadastrarDAO {

    public boolean VerificaCpfExistente(String cpftest) throws SQLException {
        boolean result = true;
        Connection conexao = DbConexao.obterConexao();
       
        PreparedStatement stmt = null;
        
        stmt = conexao.prepareStatement("SELECT * FROM Funcionario WHERE CPF = ?"+cpftest+"");
        ResultSet rs = stmt.executeQuery();
        
	if(rs.next()){
            result = false;
        }
	stmt.close();
	return result;
    }
    
    public boolean VerificaCnpjExistente(String cnpj)throws SQLException{
        boolean result = true;
        Connection conexao = DbConexao.obterConexao();
       
        PreparedStatement stmt = null;
        
        stmt = conexao.prepareStatement("SELECT * FROM Fornecedor WHERE CNPJ = ?"+cnpj+"");
        ResultSet rs = stmt.executeQuery();
        
	if(rs.next()){
            result = false;
        }
	stmt.close();
	return result;
}
     

    public void cadastrarFuncionario(Funcionario adc)throws SQLException {
       Connection conexao = DbConexao.obterConexao();
       
        PreparedStatement stmt = null;
        
        stmt = conexao.prepareStatement("INSERT INTO Funcionarios (Nome, CPF, RG, Telefone, Cargo, Salario, Endereco, Estado, Cidade) VALUES (?,?,?,?,?,?,?,?,?)");
        
        stmt.setString(1, adc.getNome());
        stmt.setString(2, adc.getCpf());
        stmt.setString(3,adc.getRg());
        stmt.setString(4,adc.getTelefone());
        stmt.setString(5,adc.getCargo());
        stmt.setString(6,adc.getSalario());
        stmt.setString(7,adc.getEndereco());
        stmt.setString(8,adc.getEstado());
        stmt.setString(9, adc.getCidade());
        
        stmt.executeUpdate();
        
        DbConexao.fecharConexao();
    }
    
    public void CadastrarEnfermeiro(Enfermeiro adc)throws SQLException {
      Connection conexao = DbConexao.obterConexao();
       
        PreparedStatement stmt = null;
        
        stmt = conexao.prepareStatement("INSERT INTO Funcionarios (Nome, CPF, RG, Telefone, Cargo, Salario, Endereco, Estado, Cidade, Regime, Lotacao) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
        
        stmt.setString(1, adc.getNome());
        stmt.setString(2, adc.getCpf());
        stmt.setString(3,adc.getRg());
        stmt.setString(4,adc.getTelefone());
        stmt.setString(5,adc.getCargo());
        stmt.setString(6,adc.getSalario());
        stmt.setString(7,adc.getEndereco());
        stmt.setString(8,adc.getEstado());
        stmt.setString(9, adc.getCidade());
        stmt.setString(10,adc.getRegime());
        stmt.setString(11, adc.getLotacao());
        
        stmt.executeUpdate();
        
        DbConexao.fecharConexao();  
    }
    
    public void CadastrarFornecedor(Fornecedor adc) throws SQLException{
         Connection conexao = DbConexao.obterConexao();
       
        PreparedStatement stmt = null;
        
        stmt = conexao.prepareStatement("INSERT INTO Fornecedor (CNPJ, Nome, Estado, Cidade, Bairro, CEP, Logradouro, N, Responsavel) VALUES (?,?,?,?,?,?,?,?,?)");
        
        stmt.setString(1,adc.getCnpj());
        stmt.setString(2,adc.getNome());
        stmt.setString(3,adc.getEstado());
        stmt.setString(4,adc.getCidade());
        stmt.setString(5,adc.getBairro());
        stmt.setString(6,adc.getCep());
        stmt.setString(7,adc.getLogradouro());
        stmt.setString(8,adc.getN());
        stmt.setString(9,adc.getResponsavel());
        
        stmt.executeUpdate();
        
        DbConexao.fecharConexao(); 
    }
    
  }
