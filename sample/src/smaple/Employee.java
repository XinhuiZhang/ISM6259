/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    //private Appointment[] appointments = new Appointment[10];
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

    public void pickTime() {
    }

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

    ;
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

}
