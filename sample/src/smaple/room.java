/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import com.mysql.cj.util.StringUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zxh25
 */
public class room {

    public ArrayList<String> timeSlots = new ArrayList<>();
    public ArrayList<String> ErID = new ArrayList<>();

    public void addSlots(String ts, String er) {
        timeSlots.add(ts);
        ErID.add(er);
    }

    public ArrayList<String> showTimeSlots() {
        ArrayList<String> LstimeSlot = new ArrayList<>();
        for (int i = 0; i < timeSlots.size(); i++) {
            LstimeSlot.add(timeSlots.get(i));
        }
        return LstimeSlot;
    }

    public String generateAppointment() {
        String AppoinmentID = "";
        String sqlz = String.format("select max(AppointmentID) from appointment;");
        try {
            Statement s = DBConnector.getConnection().createStatement();
            ResultSet rs = s.executeQuery(sqlz);
            while (rs.next()) {
                if (StringUtils.isNullOrEmpty(rs.getString(1))) {
                    AppoinmentID = "0";
                } else {
                    AppoinmentID = Integer.toString(Integer.parseInt(rs.getString(1)) + 1);
                }
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return AppoinmentID;
    }

    public String getInterviewersBySelectedTimeSlot(String selectedTimeslot) {
        String ErID = "";
        String sqlx = String.format("Select Interviewers from room where TimeSlots ='%s';", selectedTimeslot);
        try {
            Statement s = DBConnector.getConnection().createStatement();
            ResultSet rs = s.executeQuery(sqlx);
            while (rs.next()) {
                ErID = rs.getString(1);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return ErID;
    }

    public ArrayList<String> getTimeSlotsByInterviewers(Employee e) {

        ArrayList<String> timeSlots = new ArrayList<>();
        String sqlx = String.format("Select timeSlots from room where Interviewers like '%%%s%%';", e.getId());
        try {
            Statement s = DBConnector.getConnection().createStatement();
            ResultSet rs = s.executeQuery(sqlx);
            while (rs.next()) {
                timeSlots.add(rs.getString(1));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return timeSlots;
    }

    public void deleteTimeSlots(String timeSlot, String erid) {

        String interviewers = "";
        String sql = String.format("Select Interviewers from room where room.TimeSlots='%s';", timeSlot);
        Connection cnn = DBConnector.getConnection();
        try {
            Statement s = DBConnector.getConnection().createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                interviewers = rs.getString(1);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        String[] interviewersArray = interviewers.split(",");
        if (interviewersArray.length <= 1) {

            String sqlx = String.format("delete from room where room.TimeSlots='%s';", timeSlot);
            Connection cnn1 = DBConnector.getConnection();
            try {
                Statement ss = cnn1.createStatement();
                cnn1.setAutoCommit(false);
                ss.executeUpdate(sqlx);
                cnn1.commit();

            } catch (SQLException sqle) {
                try {
                    cnn1.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(ChooseInterviewTime.class.getName()).log(Level.SEVERE, null, ex);
                }
                sqle.printStackTrace();
            }
        } else {
            String ers="";
            for (int ind=0;ind<interviewersArray.length;ind++){
                if(interviewersArray[ind].equals(erid)){}else{
                ers+=interviewersArray[ind]+",";
                }
            
            }

            String sqlx = String.format("update room set interviewers='%s' where room.TimeSlots='%s';",ers, timeSlot);
            Connection cnn1 = DBConnector.getConnection();
            try {
                Statement ss = cnn1.createStatement();
                cnn1.setAutoCommit(false);
                ss.executeUpdate(sqlx);
                cnn1.commit();

            } catch (SQLException sqle) {
                try {
                    cnn1.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(ChooseInterviewTime.class.getName()).log(Level.SEVERE, null, ex);
                }
                sqle.printStackTrace();
            }

        }
    }
}
