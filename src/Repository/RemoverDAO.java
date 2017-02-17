package Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class RemoverDAO {

    public void removerFuncionario(int id) {

        Connection conexao = DbConexao.obterConexao();
        PreparedStatement stmt = null;

        try {

            stmt = conexao.prepareStatement("DELETE FROM Funcionarios WHERE ID=" + id);
            stmt.executeUpdate();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Funcionario com fornecedor em aberto.");

            try {

                stmt = conexao.prepareStatement("update Fornecedor SET Responsavel=-1 WHERE Responsavel =" + id);
                stmt.executeUpdate();
                stmt = conexao.prepareStatement("DELETE FROM Funcionarios WHERE ID=" + id);
                stmt.executeUpdate();

            } catch (SQLException ee) {

                JOptionPane.showMessageDialog(null, "Erro: " + ee);
            }
        }

        DbConexao.fecharConexao();
    }

    public void removerFornecedor(String cnpj){

        Connection conexao = DbConexao.obterConexao();
        PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("DELETE FROM Fornecedor WHERE CNPJ='" + cnpj + "'");
            stmt.executeUpdate();
        } catch (SQLException e) {

        }
        DbConexao.fecharConexao();
    }

}
