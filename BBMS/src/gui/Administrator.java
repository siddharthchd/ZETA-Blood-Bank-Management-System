/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Administrator.java
 *
 * Created on Aug 18, 2014, 1:55:47 PM
 */
package gui;

import gui.Naduni.IssueChart;
import gui.Naduni.MedicalOfficer;
import gui.Ruchi.PredictRequests;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Anuradha
 */
public class Administrator extends javax.swing.JFrame {

    /**
     * Creates new form Administrator
     */
    public Administrator() throws IOException {
        FileInputStream imgStream = null;
        try {
            initComponents();
            File imgfile = new File("..\\BBMS\\src\\images\\drop.png");
            imgStream = new FileInputStream(imgfile);
            BufferedImage bi = ImageIO.read(imgStream);
            ImageIcon myImg = new ImageIcon(bi);
            this.setIconImage(myImg.getImage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                imgStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        requestsButton = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/images/red-blood-cells.png")))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrator");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(390, 0, 290, 50);

        jLayeredPane1.add(desktopPane);
        desktopPane.setBounds(200, 60, 1170, 650);

        jButton15.setText("Blood Collection Statistics");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton15);
        jButton15.setBounds(0, 60, 200, 30);

        jButton16.setText("Item Stock");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton16);
        jButton16.setBounds(0, 300, 200, 30);

        jButton17.setText("Request Reagents");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton17);
        jButton17.setBounds(0, 270, 200, 30);

        requestsButton.setText("Blood requests");
        requestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(requestsButton);
        requestsButton.setBounds(0, 150, 200, 30);

        jButton25.setText("Donor Register");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton25);
        jButton25.setBounds(0, 210, 200, 30);

        jButton32.setText("Daily Issue Register");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton32);
        jButton32.setBounds(0, 120, 200, 30);

        jButton33.setText("Adverse Events");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton33);
        jButton33.setBounds(0, 240, 200, 30);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 08.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton19);
        jButton19.setBounds(1010, 0, 60, 60);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 05.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton9);
        jButton9.setBounds(1070, 0, 60, 60);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 04.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton8);
        jButton8.setBounds(1130, 0, 60, 60);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 09.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton13);
        jButton13.setBounds(1190, 0, 60, 60);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 07.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton11);
        jButton11.setBounds(1250, 0, 60, 60);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 11.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton20);
        jButton20.setBounds(1310, 0, 60, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 01.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(0, 0, 60, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 02.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton6);
        jButton6.setBounds(60, 0, 60, 60);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 06.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton10);
        jButton10.setBounds(120, 0, 60, 60);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 08.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton12);
        jButton12.setBounds(180, 0, 60, 60);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 03.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton7);
        jButton7.setBounds(240, 0, 60, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 13.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(300, 0, 60, 60);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Karapitiya Blood Bank Management System");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(420, 0, 530, 50);

        jButton26.setText("Blood Donation Campaigns");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton26);
        jButton26.setBounds(0, 90, 200, 30);

        jButton34.setText("Blood & Component Stock Balance");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton34);
        jButton34.setBounds(0, 180, 200, 30);

        jButton1.setText("Issue Charts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(0, 350, 200, 30);

        jMenu1.setText("File");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Save");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Print");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cut");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Copy");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Paste");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

}//GEN-LAST:event_jButton15ActionPerformed

    private void requestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestsButtonActionPerformed
        PredictRequests pred = new PredictRequests();
        pred.setClosable(true);
        desktopPane.add(pred);
        pred.show();
}//GEN-LAST:event_requestsButtonActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        //        try {
        //            StockBalance2 stock2 = new StockBalance2();
        //            stock2.setClosable(true);
        //            desktopPane.add(stock2);
        //            desktopPane.setRequestFocusEnabled(true);
        //            stock2.show();
        //        } catch (IOException ex) {
        //            Logger.getLogger(MedicalOfficer.class.getName()).log(Level.SEVERE, null, ex);
        //        }
}//GEN-LAST:event_jButton25ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

}//GEN-LAST:event_jButton34ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton26ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton19ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton11ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {
            ChangePassword p = new ChangePassword();
            p.setClosable(true);
            desktopPane.add(p);
            p.show();
        } catch (IOException ex) {
            Logger.getLogger(MedicalOfficer.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_jButton20ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Personalize p = new Personalize(this, true);
        p.setClosable(true);
        desktopPane.add(p);
        p.show();
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IssueChart issue = new IssueChart(desktopPane.getSize());
        issue.setClosable(true);
        desktopPane.add(issue);
        desktopPane.setRequestFocusEnabled(true);
        issue.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Administrator().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JButton requestsButton;
    // End of variables declaration//GEN-END:variables

}
