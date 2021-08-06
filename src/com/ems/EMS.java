/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

/**
 *
 * @author dell
 */
public class EMS extends javax.swing.JFrame {


    /**
     * Creates new form EMS
     */
    public EMS() {
        //initComponents();
        this.setTitle("EMS");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        BorderLayout layout = new BorderLayout();

        this.getContentPane().setLayout(layout);

        jToolBar1 = new javax.swing.JToolBar();
        btnFoodManagement = new javax.swing.JButton();
        jToolBar1.setRollover(true);

        btnFoodManagement.setText("<html><center>Food</center><br />Management</html>");
        //btnFoodManagement.setBackground(new java.awt.Color(0, 0, 0));
        btnFoodManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        //btnFoodManagement.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodManagement.setFocusable(false);
        btnFoodManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFoodManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFoodManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFoodManagement);
        jToolBar1.add(new JSeparator(SwingConstants.VERTICAL));
        btnEquipmentManagement = new javax.swing.JButton();
        btnEquipmentManagement.setText("<html><center>Equipment</center><br />Management</html>");
        btnEquipmentManagement.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnEquipmentManagement.setFocusable(false);
        btnEquipmentManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquipmentManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEquipmentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipmentManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEquipmentManagement);
        jToolBar1.add(new JSeparator(SwingConstants.VERTICAL));
        btnVenueManagement = new javax.swing.JButton();
        btnVenueManagement.setText("<html><center>Venue</center><br />Management</html>");
        btnVenueManagement.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnVenueManagement.setFocusable(false);
        btnVenueManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenueManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenueManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenueManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVenueManagement);

        jToolBar1.add(new JSeparator(SwingConstants.VERTICAL));
        btnBookEvent = new javax.swing.JButton();
        btnBookEvent.setText("<html><center>Book</center><br />Event</html>");
        btnBookEvent.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnBookEvent.setFocusable(false);
        btnBookEvent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBookEvent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBookEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookEventActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBookEvent);

        jToolBar1.add(new JSeparator(SwingConstants.VERTICAL));
        btnViewEvent = new javax.swing.JButton();
        btnViewEvent.setText("<html><center>View</center><br />Event</html>");
        btnViewEvent.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnViewEvent.setFocusable(false);
        btnViewEvent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewEvent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEventActionPerformed(evt);
            }
        });
        
        jToolBar1.add(btnViewEvent);
        this.getContentPane().add(jToolBar1, BorderLayout.NORTH);
        
        jToolBar1.setVisible(false);

        

        JPanel loginForm = new LoginForm(this);
        
        this.getContentPane().add(loginForm, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnFoodManagement = new javax.swing.JButton();
        btnEquipmentManagement = new javax.swing.JButton();
        btnVenueManagement = new javax.swing.JButton();
        btnBookEvent = new javax.swing.JButton();
        btnViewEvent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setRollover(true);

        btnFoodManagement.setBackground(new java.awt.Color(0, 0, 0));
        btnFoodManagement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFoodManagement.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodManagement.setText("jButton1");
        btnFoodManagement.setFocusable(false);
        btnFoodManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFoodManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFoodManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFoodManagement);

        btnEquipmentManagement.setText("jButton1");
        btnEquipmentManagement.setFocusable(false);
        btnEquipmentManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquipmentManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEquipmentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipmentManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEquipmentManagement);

        btnVenueManagement.setText("jButton1");
        btnVenueManagement.setFocusable(false);
        btnVenueManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenueManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenueManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenueManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVenueManagement);

        btnBookEvent.setText("jButton1");
        btnBookEvent.setFocusable(false);
        btnBookEvent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBookEvent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBookEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookEventActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBookEvent);

        btnViewEvent.setText("jButton1");
        btnViewEvent.setFocusable(false);
        btnViewEvent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewEvent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEventActionPerformed(evt);
            }
        });
        jToolBar1.add(btnViewEvent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFoodManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodManagementActionPerformed
        // TODO add your handling code here:
        this.addComponent(new FoodManagementForm(this));
    }//GEN-LAST:event_btnFoodManagementActionPerformed

    private void btnEquipmentManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipmentManagementActionPerformed
        // TODO add your handling code here:
        this.addComponent(new EquipmentManagementForm(this));
    }//GEN-LAST:event_btnEquipmentManagementActionPerformed

    private void btnVenueManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenueManagementActionPerformed
        // TODO add your handling code here:
        this.addComponent(new VenueManagementForm(this));
    }//GEN-LAST:event_btnVenueManagementActionPerformed

    private void btnBookEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookEventActionPerformed
        // TODO add your handling code here:
        this.addComponent(new EventForm(this));
    }//GEN-LAST:event_btnBookEventActionPerformed

    private void btnViewEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEventActionPerformed
        // TODO add your handling code here:
        this.addComponent(new ViewBookingForm(this));
    }//GEN-LAST:event_btnViewEventActionPerformed

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
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMS().setVisible(true);
            }
        });
    }


    public void addComponent(JPanel component) {
        for (Component c : this.getContentPane().getComponents()) {
            if (c instanceof FoodManagementForm
                    || c instanceof EquipmentManagementForm
                    || c instanceof VenueManagementForm
                    || c instanceof EventForm
                    || c instanceof ViewBookingForm
                    || c instanceof ShowBookDetails
                    || c instanceof RegistrationForm
                    || c instanceof LoginForm) {
                this.getContentPane().remove(c);
            }
        }
        this.getContentPane().add(component, BorderLayout.CENTER);
        this.pack();
        setLocationRelativeTo(null);
    }

    public void enableToolbarAsManager() {
        this.jToolBar1.setVisible(true);
        btnBookEvent.setVisible(true);
        btnEquipmentManagement.setVisible(true);
        btnFoodManagement.setVisible(true);
        btnVenueManagement.setVisible(true);
        btnViewEvent.setVisible(true);
    }

    public void enableToolbarAsClient() {
        this.jToolBar1.setVisible(true);
        btnBookEvent.setVisible(true);
        btnEquipmentManagement.setVisible(false);
        btnFoodManagement.setVisible(false);
        btnVenueManagement.setVisible(false);
        btnViewEvent.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookEvent;
    private javax.swing.JButton btnEquipmentManagement;
    private javax.swing.JButton btnFoodManagement;
    private javax.swing.JButton btnVenueManagement;
    private javax.swing.JButton btnViewEvent;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
