package com.brainacad.skozigon.temp;

import java.sql.*;

/**
 * Created by skozigon on 25.07.2016.
 */
public class Main {
    public static String DB_CONNECTION = "jdbc:mysql://127.0.0.1:3306/brainacad?useSSL=false";
    public static String DB_USER = "grey";
    public static String DB_PASS = "nogi";
    public static void main(String[] args) {

//        Students students = new Students();

        Connection dbConnection = null;
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try(Statement st = dbConnection.createStatement()){
            st.execute("SELECT * FROM students WHERE age>20");

            ResultSet rs = st.executeQuery("SELECT * FROM students;");
            ResultSetMetaData md = rs.getMetaData();
            for (int i = 1; i <= md.getColumnCount(); i++) {
                System.out.print(md.getColumnName(i)+ "\t\t\t");

            }
            System.out.println();
            while (rs.next()){
                for (int i = 1; i <= md.getColumnCount() ; i++) {
                    System.out.print(rs.getString(i) + "\t\t\t");
                }
                System.out.println();
            }


            ResultSet rs1 = st.getResultSet();
            while (rs.next()){
                int id = rs.getInt("id");
                String firstName = rs1.getString("NAME");
                String lastNme = rs1.getString("LASTNAME");
                int age = rs.getInt("age");
                System.out.printf("%s,%s,%s,%s",id, firstName, lastNme, age);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try(PreparedStatement ps = dbConnection.prepareCall(students.getString())){
//            for (int i = 0; i <100 ; i++) {
//                ps.setInt(1,students.getId());
//                ps.setString(2, students.getName());
//                ps.setString(3, students.getLastname());
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }
}
