/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddBloodGroups.java
 *
 * Created on Sep 7, 2014, 8:46:03 PM
 */
package view.blood_stock_management;

import controller.blood_stock_management.BloodGroupController;
import connection.NotifierConnection;
import controller.blood_stock_management.BloodStockUpdateNotifier;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BloodGroup;

/**
 *
 * @author Anuradha
 */
public class AddBloodGroups extends javax.swing.JInternalFrame {

    String[] title = {"Group Name"};
    DefaultTableModel groupsDtm = new DefaultTableModel(title, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    
    BloodStockUpdateNotifier notifier = null;

    String oldGroupName = "";

    /**
     * Creates new form AddBloodGroups
     */
    public AddBloodGroups() throws FileNotFoundException, IOException {
        initComponents();
        groupsTable.setModel(groupsDtm);
        FileInputStream imgStream = null;
        File imgfile = new File("..\\BBMS\\src\\images\\drop.png");
        imgStream = new FileInputStream(imgfile);
        BufferedImage bi = ImageIO.read(imgStream);
        ImageIcon myImg = new ImageIcon(bi);
        this.setFrameIcon(myImg);
        setTitle("Blood Groups");
        this.setBounds(0, 0, 360, 430);

        notifier = NotifierConnection.getNotifierConnection(null);
        setGroupTableData();

    }

    private void setGroupTableData() {
        try {
            groupsDtm = new DefaultTableModel(title, 0);
            groupsTable.setModel(groupsDtm);
            ResultSet rst = BloodGroupController.getAllGroups();
            while (rst.next()) {
                String groupName = rst.getString("groupName");
                String[] data = {groupName};
                groupsDtm.addRow(data);
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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        groupNameText = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        groupsTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        editGroupText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(643, 432));
        setMinimumSize(new java.awt.Dimension(643, 432));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Blood Groups");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 30, 230, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SmallFormHeader.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 11, 607, 73);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Groups"));

        jLabel1.setText("Group Name*");

        groupNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                groupNameTextKeyTyped(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        groupsTable.setModel(groupsDtm);
        groupsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                groupsTableMouseClicked(evt);
            }
        });
        groupsTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                groupsTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(groupsTable);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Update");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        editGroupText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGroupTextActionPerformed(evt);
            }
        });
        editGroupText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editGroupTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(groupNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn))
                    .addComponent(editGroupText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editGroupText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(editBtn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 95, 602, 293);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 30, 330, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_groupNameTextKeyTyped

        if (groupNameText.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_groupNameTextKeyTyped

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            if (groupNameText.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Error: Please fill the required fields!");
            } else {
                String groupName = groupNameText.getText();
                BloodGroup group = new BloodGroup(groupName);
                int res = BloodGroupController.addGroup(group);
                if (res == 1) {
                    notifier.notifyUpdateBloodStock();
                    JOptionPane.showMessageDialog(null, "Added Succesfully");
                    groupNameText.setText("");
                    setGroupTableData();
                } else {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBloodGroups.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddBloodGroups.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void groupsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupsTableMouseClicked
        int row = groupsTable.getSelectedRow();
        String groupName = "" + groupsDtm.getValueAt(row, 0);
        editGroupText.setText(groupName);
        oldGroupName = groupName;
        editBtn.setEnabled(false);
        deleteBtn.setEnabled(true);
    }//GEN-LAST:event_groupsTableMouseClicked

    private void groupsTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_groupsTablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_groupsTablePropertyChange

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            BloodGroup deletedGroup = new BloodGroup(editGroupText.getText());
            if (editGroupText.getText().equals("UG")) {
                JOptionPane.showMessageDialog(null, "Cannot delete Fresh Blood");
            } else {
                int res = BloodGroupController.deleteGroup(deletedGroup);
                if (res == 1) {
                    notifier.notifyUpdateBloodStock();
                    JOptionPane.showMessageDialog(null, "Deleted Succesfully");
                    editGroupText.setText("");
                    setGroupTableData();
                } else {
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBloodGroups.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: To delete this blood group you need to delete all the other records having this blood group!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            if (editGroupText.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Error: Please fill the required fields!");
            } else {
                BloodGroup oldGroup = new BloodGroup(oldGroupName);
                if (oldGroupName.equals("UG")) {
                    JOptionPane.showMessageDialog(null, "Cannot update UG");
                } else {
                    BloodGroup newGroup = new BloodGroup(editGroupText.getText());
                    int res = BloodGroupController.updateGroup(oldGroup, newGroup);
                    if (res == 1) {
                        notifier.notifyUpdateBloodStock();
                        JOptionPane.showMessageDialog(null, "Updated Succesfully");
                        editGroupText.setText("");
                        setGroupTableData();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error!");
                    }
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBloodGroups.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: To update this blood group you need to delete all the other records having this blood group!");
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void editGroupTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGroupTextActionPerformed

    }//GEN-LAST:event_editGroupTextActionPerformed

    private void editGroupTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editGroupTextKeyTyped
        editBtn.setEnabled(true);
        deleteBtn.setEnabled(false);
        if (editGroupText.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_editGroupTextKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField editGroupText;
    private javax.swing.JTextField groupNameText;
    private javax.swing.JTable groupsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
