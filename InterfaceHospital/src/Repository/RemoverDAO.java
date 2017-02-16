package Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */
public class RemoverDAO {

    public void removerFuncionario(int id) throws SQLException {

        Connection conexao = DbConexao.obterConexao();

        PreparedStatement stmt = null;

        stmt = conexao.prepareStatement("DELETE FROM Funcionarios WHERE ID=" + id);

        stmt.executeUpdate();

        DbConexao.fecharConexao();
    }

    public void removerFornecedor(String cnpj) throws SQLException {

        Connection conexao = DbConexao.obterConexao();

        PreparedStatement stmt = null;

        stmt = conexao.prepareStatement("DELETE FROM Funcionarios WHERE ID='" + cnpj + "'");

        stmt.executeUpdate();

        DbConexao.fecharConexao();
    }

}
