/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import databases.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kakyire
 */
public class MainClass {

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) {
        System.out.println("Hellow world");
        con = new Db().dbConnection();
        loadItems();
    }

    private static void loadItems() {
        try {
            String sql = "select * from users";

            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
