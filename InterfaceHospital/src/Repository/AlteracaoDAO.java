
package Repository;

import Model.Enfermeiro;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AlteracaoDAO {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ResultSet buscaenfermeiros(){
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
    
    
    public ResultSet buscafornecedores(){
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "SELECT CNPJ as CNPJ, Nome as NOME from Fornecedor";
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return rs;
    }
    
    
    
    
    

    public Enfermeiro buscaenfid(String id) {
        Enfermeiro enfermeiro = new Enfermeiro();
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "SELECT * FROM Funcionarios WHERE ID = ?" ;
        try{
            pst=conexao.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                enfermeiro.setNome(rs.getString(2));
                enfermeiro.setCpf(rs.getString(3));
                enfermeiro.setRg(rs.getString(4));
                enfermeiro.setTelefone(rs.getString(5));
                enfermeiro.setCargo(rs.getString(6));
                enfermeiro.setSalario(rs.getString(7));
                enfermeiro.setEndereco(rs.getString(8));
                enfermeiro.setEstado(rs.getString(9));
                enfermeiro.setCidade(rs.getString(10));
                enfermeiro.setRegime(rs.getString(11));
                enfermeiro.setLotacao(rs.getString(12));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return enfermeiro;
    }
    
    
    public Fornecedor buscaforid(String id){
        Fornecedor fornecedor=new Fornecedor();
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "SELECT * FROM Fornecedor WHERE CNPJ = ?" ;
        try{
            pst=conexao.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                fornecedor.setCnpj(rs.getString(1));
                fornecedor.setNome(rs.getString(2));
                fornecedor.setEstado(rs.getString(3));
                fornecedor.setCidade(rs.getString(4));
                fornecedor.setBairro(rs.getString(5));
                fornecedor.setCep(rs.getString(6));
                fornecedor.setLogradouro(rs.getString(7));
                fornecedor.setN(rs.getString(8));
                fornecedor.setResponsavel(rs.getString(9));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return fornecedor;
    }

    public void alterarenf(Enfermeiro enf,int d) {
        conexao = DbConexao.obterConexao();
        String sql;
        sql = "UPDATE Funcionarios SET Nome=?, Telefone=?, Salario=?, Endereco=?, Estado=?, Cidade=?,Regime=?, Lotacao=? WHERE id=?" ;
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, enf.getNome());
            pst.setString(2, enf.getTelefone());
            pst.setString(3, enf.getSalario());
            pst.setString(4, enf.getEndereco());
            pst.setString(5, enf.getEstado());
            pst.setString(6, enf.getCidade());
            pst.setString(7, enf.getRegime());
            pst.setString(8, enf.getLotacao());
            pst.setInt(9, d);
            
            pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        DbConexao.fecharConexao();
    }
    
}
