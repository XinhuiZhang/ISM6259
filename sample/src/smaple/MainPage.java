/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zxh25
 */
public class MainPage extends javax.swing.JFrame {

    private Employee e;

    public void SetEmployee(Employee e) {
        this.e = e;
    }

    private room r;

    public void SetRoom(room r) {
        this.r = r;
    }

    /**
     * Creates new form MainPage
     */
    public MainPage() {
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
        TextMessage = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextPhone = new javax.swing.JTextField();
        BtnViewMyInterviews = new javax.swing.JButton();
        BtnLogOut = new javax.swing.JButton();
        BtnUploadAvailability = new javax.swing.JButton();
        BtnPickInterviewTime = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scheduling Application");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Interview Status"));

        TextMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextMessage, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Information"));

        jLabel1.setText("Name:");

        jLabel2.setText("Email:");

        TextName.setEditable(false);
        TextName.setText("Xinhui Zhang");

        TextEmail.setEditable(false);
        TextEmail.setText("xinhui.zhang@ufl.edu");

        jLabel3.setText("Phone:");

        TextPhone.setEditable(false);
        TextPhone.setText("3527459304");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(63, 63, 63))
        );

        BtnViewMyInterviews.setText("View My Interviews");
        BtnViewMyInterviews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewMyInterviewsActionPerformed(evt);
            }
        });

        BtnLogOut.setText("Logout");
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });

        BtnUploadAvailability.setText("Upload Availability");
        BtnUploadAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUploadAvailabilityActionPerformed(evt);
            }
        });

        BtnPickInterviewTime.setText("Pick Interview time");
        BtnPickInterviewTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPickInterviewTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnViewMyInterviews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnUploadAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnPickInterviewTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(BtnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37)))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnUploadAvailability)
                        .addGap(20, 20, 20)
                        .addComponent(BtnViewMyInterviews)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPickInterviewTime)
                        .addGap(55, 55, 55)
                        .addComponent(BtnLogOut)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        // TODO add your handling code here:
        NewJFrame nf = new NewJFrame();
        nf.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BtnLogOutActionPerformed

    private void BtnUploadAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUploadAvailabilityActionPerformed
        // TODO add your handling code here:
        UploadAvailability pa = new UploadAvailability();
        pa.SetEmployee(e);
        pa.SetRoom(r);
        pa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnUploadAvailabilityActionPerformed

    private void BtnPickInterviewTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPickInterviewTimeActionPerformed
        // TODO add your handling code here:
        if (e.getAppointments().size() == 0) {
            ChooseInterviewTime cit = new ChooseInterviewTime();
            cit.SetEmployee(e);
            cit.SetRoom(r);
            cit.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "You already schedule a interview,Please check the interview list", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnPickInterviewTimeActionPerformed

    private void BtnViewMyInterviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewMyInterviewsActionPerformed
        // TODO add your handling code here:
        InterviewList il = new InterviewList();
        il.SetEmployee(e);
        il.SetRoom(r);
        il.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnViewMyInterviewsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ImageIcon iconLogo = new ImageIcon("projectimages/exxonmobil.png");
        lblIcon.setIcon(iconLogo);
        TextName.setText(e.getLname() + " " + e.getFname());
        TextPhone.setText(e.getPhone());
        TextEmail.setText(e.getEmail());
        if ((e.getRole()).equals("Interviewer")) {
            BtnPickInterviewTime.setVisible(false);
            String appMsg = String.format("You have %d interview(s) scheduled.", e.getAppointments().size());
            TextMessage.setText(appMsg);
            TextMessage.setEditable(false);
        } else {
            BtnUploadAvailability.setVisible(false);
            if (e.getAppointments().size() == 0) {
                TextMessage.setEditable(false);
                TextMessage.setText("You have an interview that needs to be scheduled");
            } else {
                String appMsg = String.format("You have %d interview(s) scheduled.", e.getAppointments().size());
                TextMessage.setText(appMsg);
                TextMessage.setEditable(false);
            }
        }

    }//GEN-LAST:event_formWindowOpened

    private void TextMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMessageActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnPickInterviewTime;
    private javax.swing.JButton BtnUploadAvailability;
    private javax.swing.JButton BtnViewMyInterviews;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextMessage;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIcon;
    // End of variables declaration//GEN-END:variables
}
