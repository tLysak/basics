package com.brainacad.skozigon.temp;

import java.sql.*;

/**
 * Created by skozigon on 25.07.2016.
 */
public class Main {
    public static final String DB_CONNECTION = "jdbc:mysql://127.0.0.1:3306/brainacad?useSSL=false";
    public static String DB_USER = "tymur";
    public static String DB_PASS = "tymur";
    static double time = 0;
    public static void main(String[] args) {

        Students students = new Students();

        Connection dbConnection = null;


        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASS);
            time = System.currentTimeMillis();
            dbConnection.setAutoCommit(false);

            try (PreparedStatement ps = dbConnection.prepareStatement(students.getString())) {
                for (int i = 0; i <= 100; i++) {
                    ps.setString(1, students.getName());
                    ps.setString(2, students.getLastname());
                    ps.setString(3, students.getEmail());
                    ps.setInt(4, students.getAge());
                    ps.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e){
            try {
                dbConnection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                dbConnection.commit();
                System.out.println("Time fool transaction:" + (System.currentTimeMillis() - time) );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        time = System.currentTimeMillis();

        try (PreparedStatement ps = dbConnection.prepareStatement(students.getString())) {
            for (int i = 101; i <= 200; i++) {
                try {
                    dbConnection.setAutoCommit(false);
                    ps.setString(1, students.getName());
                    ps.setString(2, students.getLastname());
                    ps.setString(3, students.getEmail());
                    ps.setInt(4, students.getAge());
                    ps.executeUpdate();
                }
                catch (SQLException e){
                    try {
                        dbConnection.rollback();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                } finally {
                    try {
                        dbConnection.commit();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Time current transaction: " + (System.currentTimeMillis() - time) );


        try(Statement st = dbConnection.createStatement()){
            st.execute("SELECT * FROM students ");

            ResultSet rs = st.executeQuery("SELECT * FROM students WHERE age>20;");
            ResultSetMetaData md = rs.getMetaData();
            for (int i = 1; i <= md.getColumnCount(); i++) {
                System.out.print(md.getColumnName(i)+ "\t\t\t\t\t\t\t");

            }
            System.out.println();
            while (rs.next()){
                for (int i = 1; i <= md.getColumnCount() ; i++) {
                    System.out.print(rs.getString(i) + "\t\t\t\t\t\t\t");
                }
                System.out.println();
            }


            ResultSet rs1 = st.getResultSet();
            while (rs.next()){
                int id = rs.getInt("id");
                String firstName = rs1.getString("NAME");
                String lastNme = rs1.getString("LASTNAME");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                System.out.printf("%s,%s,%s,%s,%s",id, firstName, lastNme, email, age);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
