package Application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;

public class Program {

    public static void main(String[] args) {

        Connection connection; // Gerencia a conexão entre o programa Java e o banco de dados.
        PreparedStatement statement = null; // Envia instruções de SQL ao banco de dados

        try {
            connection = DB.getConnection(); // Tenta conectar-se ao banco de dados especificado por seu URL.
            statement = connection.prepareStatement("DELETE FROM department WHERE Id = ?");
            statement.setInt(1, 5);

            int rowsAffected = statement.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());

        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
