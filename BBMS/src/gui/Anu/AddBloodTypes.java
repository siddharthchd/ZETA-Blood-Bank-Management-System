/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddBloodTypes.java
 *
 * Created on Sep 7, 2014, 9:37:49 PM
 */
package gui.Anu;

import controller.anu.BloodGroupController;
import controller.anu.BloodTypeController;
import connection.NotifierConnection;
import controller.anu.BloodStockUpdateNotifier;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BloodGroup;
import model.BloodType;

/**
 *
 * @author Anuradha
 */
public class AddBloodTypes extends javax.swing.JInternalFrame {

    String[] title = {"Blood Type"};
    DefaultTableModel typesDtm = new DefaultTableModel(title, 0);
    String oldTypeName = "";
    BloodStockUpdateNotifier notifier = null;

    /**
     * Creates new form AddBloodTypes
     */
    public AddBloodTypes() {
        initComponents();
        notifier = NotifierConnection.getNotifierConnection(null);
        setTypeTableData();
    }

    private void setTypeTableData() {
        try {
            typesDtm = new DefaultTableModel(title, 0);
            typesTable.setModel(typesDtm);
            ResultSet rst = BloodTypeController.getAllTypes();
            while (rst.next()) {
                String typeName = rst.getString("BloodType");
                String[] data = {typeName};
                typesDtm.addRow(data);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBloodGroups.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddBloodGroups.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        typeNameText = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        typesTable = new javax.swing.JTable();
        editTypeText = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Blood Type"));

        jLabel1.setText("Blood Type*");

        typeNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                typeNameTextKeyTyped(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(typeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBtn)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Blood Type", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit/Delete Blood Type"));

        typesTable.setModel(typesDtm);
        typesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typesTableMouseClicked(evt);
            }
        });
        typesTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                typesTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(typesTable);

        editTypeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTypeTextActionPerformed(evt);
            }
        });
        editTypeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editTypeTextKeyTyped(evt);
            }
        });

        editBtn.setText("Update");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn))
                    .addComponent(editTypeText))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(editTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(editBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Update Blood Type", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            if (typeNameText.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Error: Please fill the required fields!");
            } else {
                String typeName = typeNameText.getText();
                BloodType type = new BloodType(typeName);
                int res = BloodTypeController.addType(type);
                if (res == 1) {
                    notifier.notifyUpdateBloodStock();
                    JOptionPane.showMessageDialog(null, "Added Succesfully");
                    typeNameText.setText("");
                    setTypeTableData();
                } else {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBloodTypes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddBloodTypes.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_addBtnActionPerformed

    private void typesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typesTableMouseClicked
        int row = typesTable.getSelectedRow();
        String typeName = "" + typesDtm.getValueAt(row, 0);
        editTypeText.setText(typeName);
        oldTypeName = typeName;
        editBtn.setEnabled(false);
        deleteBtn.setEnabled(true);
}//GEN-LAST:event_typesTableMouseClicked

    private void typesTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_typesTablePropertyChange
        // TODO add your handling code here:
}//GEN-LAST:event_typesTablePropertyChange

    private void editTypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTypeTextActionPerformed
}//GEN-LAST:event_editTypeTextActionPerformed

    private void editTypeTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editTypeTextKeyTyped
        editBtn.setEnabled(true);
        deleteBtn.setEnabled(false);
        if (editTypeText.getText().length() >= 20) {
            evt.consume();
        }
}//GEN-LAST:event_editTypeTextKeyTyped

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            if (editTypeText.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Error: Please fill the required fields!");
            } else {
                BloodType oldType = new BloodType(oldTypeName);
                if (editTypeText.getText().equalsIgnoreCase("Fresh blood")) {
                    JOptionPane.showMessageDialog(null, "Cannot update Fresh blood");
                } else {
                    BloodType newType = new BloodType(editTypeText.getText());
                    int res = BloodTypeController.updateType(oldType, newType);
                    if (res == 1) {
                        notifier.notifyUpdateBloodStock();
                        JOptionPane.showMessageDialog(null, "Updated Succesfully");
                        editTypeText.setText("");
                        editBtn.setEnabled(false);
                        setTypeTableData();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error!");
                    }
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBloodTypes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: To update this blood type you need to delete all the other records having this blood type!");
        }
}//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            BloodType deletedType = new BloodType(editTypeText.getText());
            if (editTypeText.getText().equalsIgnoreCase("Fresh blood")) {
                JOptionPane.showMessageDialog(null, "Cannot delete Fresh Blood");
            } else {
                int res = BloodTypeController.deleteType(deletedType);
                if (res == 1) {
                    notifier.notifyUpdateBloodStock();
                    JOptionPane.showMessageDialog(null, "Deleted Succesfully");
                    editTypeText.setText("");
                    setTypeTableData();
                } else {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBloodGroups.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: To delete this blood type you need to delete all the other records having this blood type!");
        }
}//GEN-LAST:event_deleteBtnActionPerformed

    private void typeNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeNameTextKeyTyped
        if (typeNameText.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_typeNameTextKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField editTypeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField typeNameText;
    private javax.swing.JTable typesTable;
    // End of variables declaration//GEN-END:variables
}
