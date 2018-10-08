/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author zxh25
 */
public class Employee {

    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String role;
    private String id;
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public Employee() {
    }

    public Employee(String fn, String ln, String email, String phone, String role, ArrayList<Appointment> aps, String id) {
        this.fname = fn;
        this.lname = ln;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.appointments = aps;
        this.id = id;
    }

    // <editor-fold defaultstate="collapsed" desc="Setters and Getters">    
    public String getId() {
        return id;
    }

    public void setId(String s) {
        this.id = s;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String s) {
        this.fname = s;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String s) {
        this.role = s;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String s) {
        this.lname = s;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String s) {
        this.email = s;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String s) {
        this.phone = s;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> aps) {
        this.appointments = aps;
    }
// </editor-fold> 



    ;
    public ArrayList<String> viewSchedule() {

        ArrayList<String> lisTimeSlot = new ArrayList<>();
        for (int i = 0; i < appointments.size(); i++) {
            String sql = String.format("Select TimeSlots from room where AppoinmentID =%s;", appointments.get(i).getAppointmentID());
            try {
                Statement s = DBConnector.getConnection().createStatement();
                ResultSet rs = s.executeQuery(sql);
                while (rs.next()) {
                    String InterviewTime = rs.getString(1);
                    lisTimeSlot.add(InterviewTime);
                }
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }

        }

        return lisTimeSlot;
    }

    public void addAppointment(Appointment ap) {

        appointments.add(ap);
    }

    public void deleteAppointment(String apid) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getAppointmentID().equals(apid)) {
                appointments.remove(i);

            }
        }

    }

    public void ConfirmSelectedTimeSlots(String ErID, String AppoinmentID, String selectedTimeSlot, Employee e) {
        String[] ErIDList = ErID.split(",");
        String[] sqlThree = new String[ErIDList.length];
        for (int i = 0; i < ErIDList.length; i++) {
            sqlThree[i] = String.format("insert into interviewerTeam values ('%s','%s'); ", ErIDList[i], AppoinmentID);
        }
        String[] sql = new String[3];
        sql[0] = String.format("update room set room.AppoinmentID='%s' where TimeSlots='%s';", AppoinmentID, selectedTimeSlot);
        sql[1] = String.format("insert into Appointment values('%s')", AppoinmentID);
        sql[2] = String.format("update interviewee set AppoinmentID='%s' where EEID='%s';", AppoinmentID, e.getId());
        Connection cnn = DBConnector.getConnection();
        try {
            Statement s = cnn.createStatement();
            cnn.setAutoCommit(false);
            for (int i = 0; i < sql.length; i++) {
                s.executeUpdate(sql[i]);
            }
            for (int i = 0; i < sqlThree.length; i++) {
                s.executeUpdate(sqlThree[i]);
            }
            cnn.commit();
        } catch (SQLException sqle) {
            try {
                cnn.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(ChooseInterviewTime.class.getName()).log(Level.SEVERE, null, ex);
            }
            sqle.printStackTrace();
        }

    }

    public String cancelInterview(String selectedTimeSlot,int selectedIndex) {

        String EeID = "";
        String ApID = "";

        String sqlx = String.format("select interviewee.EEID,appointment.AppointmentID\n"
                + "from interviewee,appointment,room \n"
                + "where interviewee.AppoinmentID=appointment.AppointmentID\n"
                + "and appointment.AppointmentID=room.AppoinmentID\n"
                + "and  room.TimeSlots= '%s' ;", selectedTimeSlot);
        try {
            Statement s = DBConnector.getConnection().createStatement();
            ResultSet rs = s.executeQuery(sqlx);
            while (rs.next()) {
                EeID = rs.getString(1);
                ApID = rs.getString(2);

            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        String[] sql = new String[4];
        sql[0] = String.format("update interviewee set AppoinmentID=null where EEID='%s';", EeID);
        sql[1] = String.format("update room  set AppoinmentID=null where TimeSlots= '%s' ;", selectedTimeSlot);
        sql[2] = String.format("delete from interviewerteam where Appointment_AppointmentID='%s';", ApID);
        sql[3] = String.format("delete from appointment where AppointmentID='%s';", ApID);
        Connection cnn = DBConnector.getConnection();
        try {
            Statement s = cnn.createStatement();
            cnn.setAutoCommit(false);
            for (int i = 0; i < sql.length; i++) {
                s.executeUpdate(sql[i]);
            }
            cnn.commit();
        } catch (SQLException sqle) {
            try {
                cnn.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(InterviewList.class.getName()).log(Level.SEVERE, null, ex);
            }
            sqle.printStackTrace();
        }
        return ApID;
    }
        public void uploadAvailabilityWithOtherInterviewers(String interviewer, String timeSlot) {
        String sql = String.format("update room  set room.Interviewers='%s' where TimeSlots= '%s' ;", interviewer, timeSlot);
        try {
            Statement s = DBConnector.getConnection().createStatement();
            s.executeUpdate(sql);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

    public void uploadAvailabilityFirstOne(String timeSlot, Employee e) {
        String sql = String.format("insert into room values\n" + "(\"%s\",null,\"%s\");", timeSlot, e.getId());
        try {
            Statement s = DBConnector.getConnection().createStatement();
            s.executeUpdate(sql);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
