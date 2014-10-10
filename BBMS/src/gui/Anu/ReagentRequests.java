/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.Anu;

import Controller.IDGenerator;
import Controller.anu.ItemDA;
import Controller.anu.ReagentRequestDA;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anuradha
 */
public class ReagentRequests extends javax.swing.JInternalFrame {

    String[] title_requests = {"Item ID", "Item Type", "Quantity", "Units", "Reason for requesting"};
    DefaultTableModel requestItemsDtm = new DefaultTableModel(title_requests, 0);

    Calendar currenttime = Calendar.getInstance();
    java.util.Date today = new java.util.Date((currenttime.getTime()).getTime());
    /**
     * Creates new form ReagentRequests
     */
    public ReagentRequests() {
        initComponents();
        setRequestTableItems();
        setRequestItemIDComboItems();
        getNextRequestID();
        requestDateCalendar.setDate(today);
    }

    public void getNextRequestID() {
        try {
            String returnID = "";
            ResultSet rst;

            rst = ReagentRequestDA.getRequestIDs();

            rst.last();
            String curID = null;
            try {
                curID = rst.getString("RequestID");
                try {
                    returnID = IDGenerator.generateNextID(curID);
                } catch (Exception ex) {
                    Logger.getLogger(BloodReturn.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException e) {
                returnID = "RQ00000001";
            }
            requestIDText.setText(returnID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReagentRequests.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReagentRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setRequestItemIDComboItems() {
        requestItemIDCombo.removeAllItems();
        try {
            ResultSet rst = ItemDA.getAllReagentIDs();
            String id = null;
            while (rst.next()) {
                id = rst.getString("itemID");
                requestItemIDCombo.addItem(id);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setRequestTableItems() {
        try {
            requestItemsDtm = new DefaultTableModel(title_requests, 0);
            requestTable.setModel(requestItemsDtm);

            ResultSet rst = ReagentRequestDA.getAllRecords(requestIDText.getText());

            String id = null;
            String type = null;
            double quantity = 0;
            String unts = null;
            String reason = null;

            while (rst.next()) {

                id = rst.getString("itemID");

                ResultSet rst2 = ItemDA.getItem(id);
                while (rst2.next()) {
                    type = rst2.getString("itemType");
                    unts = rst2.getString("units");

                }

                quantity = rst.getDouble("qty");
                reason = rst.getString("reason");

                String[] ar = {id, type, "" + quantity, unts, reason};
                requestItemsDtm.addRow(ar);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        requestIDText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        requestItemIDCombo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        requestItemType = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        requestQtyText = new javax.swing.JTextField();
        requestDeleteBtn = new javax.swing.JButton();
        requestAddBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        requestReasonText = new javax.swing.JTextField();
        requestQtyUnitLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        requestDateCalendar = new com.toedter.calendar.JDateChooser();
        jLabel53 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jTabbedPane3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 102, 255)));

        jLabel10.setText("Request ID");

        requestIDText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        requestIDText.setEnabled(false);
        requestIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestIDTextActionPerformed(evt);
            }
        });

        jLabel11.setText("Effective Date");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Requesting critical reagents additional to the monthly allocation "));

        requestTable.setModel(requestItemsDtm);
        jScrollPane5.setViewportView(requestTable);

        jLabel2.setText("Item (Reagent/Test kit)");

        requestItemIDCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestItemIDComboActionPerformed(evt);
            }
        });

        jLabel12.setText("Item Type");

        requestItemType.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        requestItemType.setEnabled(false);
        requestItemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestItemTypeActionPerformed(evt);
            }
        });

        jLabel13.setText("Quatity requested");

        requestQtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestQtyTextActionPerformed(evt);
            }
        });

        requestDeleteBtn.setText("Remove Item");

        requestAddBtn.setText("Add Item");
        requestAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAddBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Details of Emergency Request");

        jLabel15.setText("Requesting officer Name");

        jButton18.setText("Generate Request");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel18.setText("Reason for emergency request");

        requestReasonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestReasonTextActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Emp Names" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(requestItemIDCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(requestItemType)
                                    .addComponent(requestReasonText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(requestQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(requestQtyUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(requestAddBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(requestDeleteBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(requestItemIDCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(requestItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(requestQtyUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(requestQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(requestReasonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestDeleteBtn)
                            .addComponent(requestAddBtn))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton18)
                .addContainerGap())
        );

        requestDateCalendar.setDateFormatString("yyyy-MM-dd");

        jLabel53.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel53.setText("Add Reagent Request");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(requestIDText, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addGap(515, 515, 515)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(requestDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(requestIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(requestDateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Request Reagents", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestIDTextActionPerformed

    private void requestItemIDComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestItemIDComboActionPerformed
        try {
            ResultSet rst = null;

            rst = ItemDA.getItem("" + requestItemIDCombo.getSelectedItem());

            while (rst.next()) {
                requestItemType.setText(rst.getString("itemType"));
                requestQtyUnitLabel.setText(rst.getString("units"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_requestItemIDComboActionPerformed

    private void requestItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestItemTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestItemTypeActionPerformed

    private void requestQtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestQtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestQtyTextActionPerformed

    private void requestAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAddBtnActionPerformed
        //        try {
        //            String requestID = requestIDText.getText();
        //            String itemID = "" + requestItemIDCombo.getSelectedItem();
        //            /*date collected*/
        //            java.util.Date dateR = requestDateCalendar.getDate();
        //            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //            String dateCollection = df.format(dateR);
        //            java.sql.Date sqlDateR = new java.sql.Date(dateR.getTime());
        //            double requestedQty = Double.parseDouble(requestQtyText.getText());
        //            String reason = requestReasonText.getText();
        //            String officerID = requestingOfficerText.getText();
        //            ReagentRequest request = new ReagentRequest(requestID, itemID, sqlDateR, requestedQty, reason, officerID);
        //            int added = ReagentRequestDA.addReceivedLog(request);
        //            if (added == 1) {
        //                JOptionPane.showMessageDialog(null, "Added Succesfully");
        //                setRequestTableItems();
        //            } else {
        //                JOptionPane.showMessageDialog(null, "Error!");
        //            }
        //        } catch (ClassNotFoundException ex) {
        //            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        //        } catch (SQLException ex) {
        //            Logger.getLogger(ItemManagement.class.getName()).log(Level.SEVERE, null, ex);
        //        }
    }//GEN-LAST:event_requestAddBtnActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void requestReasonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestReasonTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestReasonTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton18;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton requestAddBtn;
    private com.toedter.calendar.JDateChooser requestDateCalendar;
    private javax.swing.JButton requestDeleteBtn;
    private javax.swing.JTextField requestIDText;
    private javax.swing.JComboBox requestItemIDCombo;
    private javax.swing.JTextField requestItemType;
    private javax.swing.JTextField requestQtyText;
    private javax.swing.JLabel requestQtyUnitLabel;
    private javax.swing.JTextField requestReasonText;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
