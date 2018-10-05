/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import java.util.ArrayList;

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
}
