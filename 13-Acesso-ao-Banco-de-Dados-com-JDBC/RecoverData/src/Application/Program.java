package Application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        Connection connection; // Gerencia a conexão entre o programa Java e o banco de dados.
        Statement statement = null; // Envia instruções de SQL ao banco de dados
        ResultSet resultSet = null; // Permite que o programa manipule o resultado da consulta.

        try {
            connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from department");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ", " + resultSet.getString("Name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
