/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */
public class DbConexao {

    public static String status = "Não conectou...";

    public DbConexao() {
    }

    public static java.sql.Connection obterConexao() {

        Connection connection = null;

        try {

            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost:3306";
            String mydatabase = "Hospital";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "senha";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {

                status = ("STATUS--->Conectado com sucesso!");

            } else {

                status = ("STATUS--->Não foi possivel realizar conexão.");

            }

            System.out.println("DB conectado."); //para teste
            return connection;
        } catch (ClassNotFoundException e) {

            System.out.println("Driver nao encontrado."); //para teste

            return null;
        } catch (SQLException e) {

            System.out.println("DB nao conectado."); //para teste

            return null;
        }
    }

    public static boolean fecharConexao() {

        try {

            DbConexao.obterConexao().close();
            System.out.println("DB desconectado."); //para teste
            return true;
        } catch (SQLException e) {

            return false;
        }
    }

    public static java.sql.Connection reiniciarConexao() {

        fecharConexao();

        return DbConexao.obterConexao();
    }
}
