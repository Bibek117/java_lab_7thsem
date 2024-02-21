/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcexample;

import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class CrudExmp {

    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/";
    static String db = "college_javaad";
    static String user = "root";
    static String pw = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet set = null;

        try {
            conn = DriverManager.getConnection(url + db, user, pw);
            if (conn != null) {
                System.out.println("Database connection vayo");

                String sqlQ = "INSERT INTO users ( fullname, email,phoneno,gender,title) VALUES (?, ?, ?, ?, ?)";

                PreparedStatement statement = conn.prepareStatement(sqlQ);
                statement.setString(1, "Ram sfde");
                statement.setString(2, "test@gmail.com");
                statement.setString(3, "98036678788");
                statement.setString(4, "male");
                statement.setString(5, "student");

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new student was inserted successfully!");
                }

               
                String Updatesql = "UPDATE users SET email = ? WHERE fullname=?";

                PreparedStatement state = conn.prepareStatement(Updatesql);
                state.setString(1, "angde@gmail.com");
                state.setString(2, "Bibek Angdembe");

                int rowsUpdated = state.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("An existing user was updated successfully!");
                }

                String delsql = "DELETE FROM users WHERE fullname = ?";

                PreparedStatement statem = conn.prepareStatement(delsql);
                statem.setString(1, "Ram sfde");

                int rowsDeleted = statem.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("An existing user was deleted successfully!");
                }
                 String sql = "SELECT * FROM users";
                st = conn.createStatement();
                set = st.executeQuery(sql);
                while (set.next()) {
                    System.out.println(set.getString("id"));
                    System.out.println(set.getString("fullname"));
                    System.out.println(set.getString("email"));
                    System.out.println(set.getString("phoneno"));
                    System.out.println(set.getString("gender"));
                    System.out.println(set.getString("title"));
                }
                
            }
            }catch (SQLException e) {
            System.out.println(e);
        }
        }

    }
