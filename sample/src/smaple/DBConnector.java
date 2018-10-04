/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author zxh25
 */
public abstract class DBConnector {

    private static Connection cnn = null;
    private static String dbname = "interviewscheduling";

    public DBConnector() {

    }

    public static Connection getConnection() {
        return cnn;
    }

    public static void setMySQLConnection(String uid, char[] pass) {
        String spass = new String(pass);

        try {
            String url = String.format("jdbc:mysql://localhost/%s?autoReconnect=true&useSSL=false&user=%s&password=%s", dbname, uid, spass);
//            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(url);
        } //        catch (ClassNotFoundException cfe) {
        //            cfe.printStackTrace();
        //        } 
        catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

//    public static int TransactSQL(String[] sql) {
//        Statement st = null;
//        int n = 0;
//        try {
//            st = cnn.createStatement();
//            cnn.setAutoCommit(false);//so that DBE waits for the COMMIT    
//            for (int i = 0; i < sql.length; i++) {
//                n += st.executeUpdate(sql[i]);
//            }
//            cnn.commit();
//        } catch (SQLException ex) {
//            try{
//                cnn.rollback();
//            
//        }catch(SQLException ec) { throw ec;}
//        return n;//number of rows impacted
//   
//    }
//    
    }

    
  
    