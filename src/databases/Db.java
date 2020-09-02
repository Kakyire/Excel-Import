/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kakyire
 */
public class Db {

    private static final String URL = "jdbc:mysql://localhost:3306/excelimport";
    private static final String USER = "dan";
    private static final String PASSWORD = "danny";
    private static final String TIME="?useUnicode=true&"
            + "useJDBCCompliantTimezoneShift"
            + "=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static Connection connection;

    public static Connection dbConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection=DriverManager.getConnection(URL);
            connection = DriverManager.getConnection(URL+TIME, USER, PASSWORD);
            System.out.println("Successfully connected");
           
        } catch (Exception e) {
            e.printStackTrace();

        }
        return connection;
    }
}
