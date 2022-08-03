package gui.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    // Os objetos Connection permitem aos programas criar instruções de SQL que acessem bancos de dados.
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = loadProperties();
                String url = properties.getProperty("dburl");
                // O método static getConnection da classe DriverManager tenta conectar-se ao banco de dados especificado por seu URL.
                connection = DriverManager.getConnection(url, properties);

            } catch (SQLException e) {
                throw new DbIntegrityException(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();

            } catch (SQLException e) {
                throw new DbIntegrityException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fileInputStream = new FileInputStream("db.properties")) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties;

        } catch (IOException e) {
            throw new DbIntegrityException(e.getMessage());
        }
    }

    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();

            } catch (SQLException e) {
                throw new DbIntegrityException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();

            } catch (SQLException e) {
                throw new DbIntegrityException(e.getMessage());
            }
        }
    }
}
