
package Repository;

import Model.Enfermeiro;
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
                enfermeiro.setCargo(rs.getString(6));
                enfermeiro.setCidade(rs.getString(10));
                enfermeiro.setCpf(rs.getString(3));
                enfermeiro.setEndereco(rs.getString(8));
                enfermeiro.setLotacao(rs.getString(12));
                enfermeiro.setNome(rs.getString(2));
                enfermeiro.setRegime(rs.getString(11));
                enfermeiro.setRg(rs.getString(4));
                enfermeiro.setSalario(rs.getString(7));
                enfermeiro.setTelefone(rs.getString(5));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return enfermeiro;
    }
}
