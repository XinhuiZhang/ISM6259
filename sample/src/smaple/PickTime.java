/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaple;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zxh25
 */
public class PickTime extends javax.swing.JFrame {
    DefaultTableModel tm;
    private String role="";
    public void SetRole(String r){ this.role=r;}
    /**
     * Creates new form PickTime
     */
    public PickTime() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTimeSlots = new javax.swing.JTable();
        BtnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pick The time slot you want"));

        TableTimeSlots.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"9:00Am-9:30AM", "9:00Am-9:30AM", "9:00Am-9:30AM", "9:00Am-9:30AM", "9:00Am-9:30AM"},
                {"9:30AM-10:00AM", "9:30AM-10:00AM", "9:30AM-10:00AM", "9:30AM-10:00AM", "9:30AM-10:00AM"},
                {"10:00AM-10:30AM", "10:00AM-10:30AM", "10:00AM-10:30AM", "10:00AM-10:30AM", "10:00AM-10:30AM"},
                {"10:30AAM-11:00AM", "10:00AM-10:30AM", "10:00AM-10:30AM", "10:00AM-10:30AM", "10:00AM-10:30AM"},
                {"11:00AM-11:30AM", "11:00AM-11:30AM", "11:00AM-11:30AM", "11:00AM-11:30AM", "11:00AM-11:30AM"},
                {"11:30AM-12:00PM", "11:30AM-12:00PM", "11:30AM-12:00PM", "11:30AM-12:00PM", "11:30AM-12:00PM"},
                {"1:30PM-2:00PM", "1:30PM-2:00PM", "1:30PM-2:00PM", "1:30PM-2:00PM", "1:30PM-2:00PM"},
                {"2:00PM-2:30PM", "2:00PM-2:30PM", "2:00PM-2:30PM", "2:00PM-2:30PM", "2:00PM-2:30PM"},
                {"2:30PM-3:00PM", "2:30PM-3:00PM", "2:30PM-3:00PM", "2:30PM-3:00PM", "2:30PM-3:00PM"},
                {"3:00PM-3:30PM", "3:00PM-3:30PM", "3:00PM-3:30PM", "3:00PM-3:30PM", "3:00PM-3:30PM"},
                {"3:30PM-4:00PM", "3:30PM-4:00PM", "3:30PM-4:00PM", "3:30PM-4:00PM", "3:30PM-4:00PM"},
                {"4:00PM-4:30PM", "4:00PM-4:30PM", "4:00PM-4:30PM", "4:00PM-4:30PM", "4:00PM-4:30PM"},
                {"4:30PM-5:00PM", "4:30PM-5:00PM", "4:30PM-5:00PM", "4:30PM-5:00PM", "4:30PM-5:00PM"}
            },
            new String [] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTimeSlots.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        TableTimeSlots.setShowHorizontalLines(false);
        TableTimeSlots.setSurrendersFocusOnKeystroke(true);
        TableTimeSlots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTimeSlotsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTimeSlots);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtnConfirm.setText("Confirm");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(BtnConfirm)
                .addGap(169, 169, 169)
                .addComponent(btnCancel)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConfirm)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        MainPage mp = new MainPage();
        mp.SetRole(this.role);
        mp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void TableTimeSlotsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTimeSlotsMouseClicked
         // TODO add your handling code here:
         TableTimeSlots.setRowSelectionAllowed(false);
         tm=(DefaultTableModel)TableTimeSlots.getModel();
         TableTimeSlots.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_TableTimeSlotsMouseClicked

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
            java.util.logging.Logger.getLogger(PickTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PickTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PickTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PickTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PickTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JTable TableTimeSlots;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}