/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

/**
 *
 * @author zxh25
 */
public class Appointment {

    private String appointmentID;

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String s) {
        this.appointmentID = s;
    }
    public Appointment(){}
    public Appointment(String aid){
    this.appointmentID=aid;
    }

}
