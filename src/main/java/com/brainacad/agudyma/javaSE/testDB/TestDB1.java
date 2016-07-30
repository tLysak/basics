package com.brainacad.agudyma.javaSE.testDB;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Random;

/**
 * Created by User on 7/25/2016.
 */
public class TestDB1 {
    private static final java.lang.String DB_CONNECTION = "jdbc:mysql://10.11.0.132:3306/brainacad?useSSL=false";
    private static final String DB_PASSWORD = "130245";
    private static final String DB_USER = "Sidhartha";


    public static void main(String[] args) {

        Connection dbConnection = null;
        try {
            dbConnection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER, DB_PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        try (Statement st = dbConnection.createStatement()) {
            st.execute("SELECT * FROM students");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("NAME");
                String lastName = rs.getString("LASTNAME");
//                int rate = rs.getInt("RATE");
                System.out.printf("%s,%s,%s", id, firstName, lastName);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String str = "INSERT INTO brainacad.students" + "(NAME,LASTNAME,EMAIL,AGE)" + "VALUES(?,?,?,?);";
        try (PreparedStatement ps = dbConnection.prepareStatement(str)) {
//            ps.setInt(1,7);
//            ps.setString(2,"Solomon");
//            ps.setString(3,"Goldman");
//            ps.setString(4,"sogo1488@gmail.com");
//            ps.setString(5, "22");
//            ps.executeUpdate();
//            System.out.println("INSERT OK!!!");
//
            Random random = new Random();
            String[] defaultName = {"Isaac", "Solomon", "David", "Benjamin"};
            String[] defaultLastName = {"Rabinovich", "Feldman", "Abramovich", "Rottenberg"};

            for (int n = 0; n < 100; n++) {
                String email = defaultName[random.nextInt(4)] + defaultLastName[random.nextInt(4)] + "1488@gmail.com";
                ps.setString(1, defaultName[random.nextInt(4)]);
                ps.setString(2, defaultLastName[random.nextInt(4)]);
                ps.setString(3, email);
                ps.setInt(4, random.nextInt(100));
                ps.executeUpdate();
                System.out.println(">>> added");


            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        try (Statement st = dbConnection.createStatement()) {

            ResultSet rs = st.executeQuery("SELECT * FROM students;");
            ResultSetMetaData md = rs.getMetaData();
            for (int i = 1; i <= md.getColumnCount(); i++) {
                System.out.println(md.getColumnName(i) + "\t\t");
            }
            System.out.println();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}