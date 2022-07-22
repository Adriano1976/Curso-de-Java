package Application;

import java.sql.*;

public class DisplayCourse {

    public static void main(String[] args) {

        final String DATABASE_URL = "jdbc:mysql://localhost:3306/coursejdbc";
        final String SELECT_QUERY = "SELECT * FROM seller";

        // usa try com recursos para conectar-se e consultar o banco de dados
        try (
                Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "123456");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_QUERY)
        ) {
            // obtém os metadados de ResultSet
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            System.out.printf("Students Table of Course Database:%n%n");

            // exibe os nomes de coluna no ResultSet
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println();

            // exibe os resultados da consulta
            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                }
                System.out.println();
            }  // Os métodos close dos objetos AutoCloseable são chamados agora

        } catch (SQLException e) {
            System.out.println("The was an error accessing the database: " + e.getMessage());
        }
    }
} // fim da classe DisplayAuthors
