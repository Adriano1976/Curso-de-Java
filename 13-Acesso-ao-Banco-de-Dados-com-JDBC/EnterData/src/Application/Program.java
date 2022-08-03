package Application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection; // Gerencia a conexão entre o programa Java e o banco de dados.
        PreparedStatement statement = null; // Enviar instruções de SQL ao banco de dados.
        try {
            connection = DB.getConnection();

            statement = connection.prepareStatement( // Inserção simples com preparedStatement.
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES "
                            + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            statement.setString(1, "Carlos Purple");
            statement.setString(2, "carlos@gmail.com");
            statement.setDate(3, new java.sql.Date(dateFormat.parse("22/04/1975").getTime()));
            statement.setDouble(4, 3000.00);
            statement.setInt(5, 4);
            
            int rowsAffected = statement.executeUpdate();            
            if (rowsAffected > 0) {
                // O objeto ResultSet contém os dados armazenados na forma de tabela.
                ResultSet resultSet = statement.getGeneratedKeys();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id: " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException | ParseException e) {
            throw new RuntimeException(e);
            
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
