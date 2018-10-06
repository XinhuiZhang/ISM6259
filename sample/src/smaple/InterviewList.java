/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author zxh25
 */
public class InterviewList extends javax.swing.JFrame {

    private Employee e;

    public void SetEmployee(Employee e) {
        this.e = e;
    }
    private room r;

    public void SetRoom(room r) {
        this.r = r;
    }
    DefaultListModel<String> listModelInterviews = new DefaultListModel<>();

    /**
     * Creates new form InterviewList
     */
    public InterviewList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnCancelInterview = new javax.swing.JButton();
        BtnInterviewDocumentation = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListInterviews = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("List of Interviews"));

        BtnCancelInterview.setText("Cancel Interview");
        BtnCancelInterview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelInterviewActionPerformed(evt);
            }
        });

        BtnInterviewDocumentation.setText("Interview Documentation");
        BtnInterviewDocumentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInterviewDocumentationActionPerformed(evt);
            }
        });

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(ListInterviews);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCancelInterview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBack)
                        .addGap(18, 18, 18)
                        .addComponent(BtnInterviewDocumentation)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelInterview)
                    .addComponent(BtnInterviewDocumentation)
                    .addComponent(BtnBack))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInterviewDocumentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInterviewDocumentationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInterviewDocumentationActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        MainPage mp = new MainPage();
        mp.SetEmployee(e);
        mp.SetRoom(r);
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        ArrayList<String> lstOfInterviews = e.viewSchedule();
        for (int i = 0; i < lstOfInterviews.size(); i++) {
            listModelInterviews.addElement(lstOfInterviews.get(i));
        }
        ListInterviews.setModel(listModelInterviews);
        if (e.getRole().equals("Interviewer")) {
        } else {
            BtnInterviewDocumentation.setVisible(false);
        }


    }//GEN-LAST:event_formWindowOpened

    private void BtnCancelInterviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelInterviewActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel?", "Confirm Cancellation", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            String selectedTimeSlot = ListInterviews.getSelectedValue();
            int selectedIndex = ListInterviews.getSelectedIndex();
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
            listModelInterviews.remove(selectedIndex);
            e.deleteAppointment(ApID);
        }
    }//GEN-LAST:event_BtnCancelInterviewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterviewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterviewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterviewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterviewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterviewList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCancelInterview;
    private javax.swing.JButton BtnInterviewDocumentation;
    private javax.swing.JList<String> ListInterviews;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
