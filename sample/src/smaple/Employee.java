/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author zxh25
 */
public class Employee {

    private ArrayList<Appointment> appointment = new ArrayList<>();
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String role;
    private String id;
    private Appointment[] appointments = new Appointment[10];
    //private  ArrayList<Appointment>() appointments =new ArrayList<>(); 

    public Employee() {
    }

    public Employee(String fn, String ln, String email, String phone, String role, Appointment[] aps, String id) {
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

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] aps) {
        this.appointments = aps;
    }
// </editor-fold> 

    public void pickTime() {
    }

    ;
    public void viewSchedule() {
    }

    ;
    public void addAppointment(Appointment ap) {
        for (int i = 0; i < 10; i++) {
            if (appointments[i]==null) {
                appointments[0] = ap;
                break;
            }
        }
    }
;

}