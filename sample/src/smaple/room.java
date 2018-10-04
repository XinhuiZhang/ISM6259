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
public class room {

    public String[] timeSlots = new String[10];
    public String[] ErID= new String[10];

    public void addSlots(String ts,String er) {
        for (int i = 0; i < 10; i++) {
            if (this.timeSlots[i]==null) {
                timeSlots[i] = ts;
                ErID[i]=er;
                break;
            }
        }

    }

}
