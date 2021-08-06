/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

import com.ems.utils.DateTimeUtil;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class EventForm extends JPanel {

    /**
     * Creates new form EventForm
     */
    private String imagePath;
    private EMS ems;

    public EventForm(EMS ems) {
        this.ems = ems;
        //initComponents();
        initComponent();
        VenueManagement vm = (VenueManagement) venue.getSelectedItem();
        venueCost.setText("" + vm.getVenueCost());
        imagePath = vm.getVenueImage();
        loadImage(imagePath);
    }

    private void initComponent() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        foodList = new javax.swing.JList<>();
        totalCost = new javax.swing.JTextField();
        evtType = new javax.swing.JComboBox<>();
        venue = new javax.swing.JComboBox<VenueManagement>();
        venueType = new javax.swing.JComboBox<>();
        bkID = new javax.swing.JTextField();
        noOfGuest = new javax.swing.JTextField();
        venueCost = new javax.swing.JTextField();
        foodCost = new javax.swing.JTextField();
        equipCost = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        equipmentList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        endTime = new javax.swing.JComboBox<>();
        stTime = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 801));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book an Event");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Event Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BookingID");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Venue Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Venue");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Equipments");
        jLabel6.setToolTipText("");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Event Date");
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Food Items");
        jLabel8.setToolTipText("");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Venue Cost");
        jLabel9.setToolTipText("");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No of Guests");
        jLabel10.setToolTipText("");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Food Items Cost");
        jLabel11.setToolTipText("");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Equipment Cost");
        jLabel12.setToolTipText("");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Cost");
        jLabel13.setToolTipText("");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 105, -1));
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 340, 280));

        totalCost.setBackground(new java.awt.Color(255, 255, 204));
        totalCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        totalCost.setEnabled(false);
        totalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostActionPerformed(evt);
            }
        });
        add(totalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 160, -1));

        evtType.setBackground(new java.awt.Color(255, 255, 204));
        evtType.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        evtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select One", "Birthday Party", "Family Event", "Conference", "Theme Party", "Wedding"}));
        evtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evtTypeActionPerformed(evt);
            }
        });
        add(evtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, -1));

        venue.setBackground(new java.awt.Color(255, 255, 204));
        venue.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        for (VenueManagement vm : VenueManagementDao.getAll()) {
            venue.addItem(vm);
        }
        venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueActionPerformed(evt);
            }
        });
        add(venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 190, -1));

        venueType.setBackground(new java.awt.Color(255, 255, 204));
        venueType.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        venueType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select One", "Indoor", "Open Air"}));
        
        venueType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueTypeActionPerformed(evt);
            }
        });

        
        add(venueType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, -1));

        bkID.setBackground(new java.awt.Color(255, 255, 204));
        bkID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bkID.setEnabled(false);
        bkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkIDActionPerformed(evt);
            }
        });
        add(bkID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 190, -1));

        noOfGuest.setBackground(new java.awt.Color(255, 255, 204));
        noOfGuest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        noOfGuest.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }

            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                noOfGuestInputMethodTextChanged(evt);
            }
        });
        noOfGuest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noOfGuestKeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                noOfGuestKeyReleased(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                noOfGuestKeyTyped(evt);
            }
        });
        add(noOfGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 190, -1));

        venueCost.setBackground(new java.awt.Color(255, 255, 204));
        venueCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        venueCost.setEnabled(false);
        venueCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueCostActionPerformed(evt);
            }
        });
        add(venueCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 160, -1));

        foodCost.setBackground(new java.awt.Color(255, 255, 204));
        foodCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        foodCost.setEnabled(false);
        foodCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodCostActionPerformed(evt);
            }
        });
        add(foodCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 160, -1));

        equipCost.setBackground(new java.awt.Color(255, 255, 204));
        equipCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        equipCost.setEnabled(false);
        add(equipCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 160, -1));

        btnClear.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, 130, 40));

        btnBook.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnBook.setText("Book");
        btnBook.setActionCommand("");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 730, 130, 40));

        foodList.setBackground(new java.awt.Color(255, 255, 204));
        foodList.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DefaultListModel<FoodManagement> foodlistModel = new DefaultListModel<>();
        for (FoodManagement fi : FoodManagementDao.getAll()) {
            foodlistModel.addElement(fi);
        }
        foodList.setModel(foodlistModel);
        foodList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        foodList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                foodListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(foodList);
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 190, 100));

        equipmentList.setBackground(new java.awt.Color(255, 255, 204));
        equipmentList.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DefaultListModel<EquipmentManagement> equipmentlistModel = new DefaultListModel<>();
        for (EquipmentManagement em : EquipmentManagementDao.getAll()) {
            equipmentlistModel.addElement(em);
        }
        equipmentList.setModel(equipmentlistModel);
        jScrollPane2.setViewportView(equipmentList);

        equipmentList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                equipmentListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(equipmentList);
        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 190, 100));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 204));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 190, -1));

        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("End Time");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Start Time");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        endTime.setBackground(new java.awt.Color(255, 255, 204));
        endTime.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        endTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));
        add(endTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, -1));

        stTime.setBackground(new java.awt.Color(255, 255, 204));
        stTime.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        stTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));
        add(stTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 190, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ems/bg15.png"))); // NOI18N
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 780));
    }// </editor-fold>                        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        totalCost = new javax.swing.JTextField();
        evtType = new javax.swing.JComboBox<>();
        venue = new javax.swing.JComboBox<>();
        venueType = new javax.swing.JComboBox<>();
        bkID = new javax.swing.JTextField();
        noOfGuest = new javax.swing.JTextField();
        venueCost = new javax.swing.JTextField();
        foodCost = new javax.swing.JTextField();
        equipCost = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        equipmentList = new javax.swing.JList<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        endTime = new javax.swing.JComboBox<>();
        stTime = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 801));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book an Event");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Event Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BookingID");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Venue Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Venue");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Equipments");
        jLabel6.setToolTipText("");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Event Date");
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Food Items");
        jLabel8.setToolTipText("");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Venue Cost");
        jLabel9.setToolTipText("");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No of Guests");
        jLabel10.setToolTipText("");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Food Items Cost");
        jLabel11.setToolTipText("");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Equipment Cost");
        jLabel12.setToolTipText("");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Cost");
        jLabel13.setToolTipText("");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 105, -1));

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 340, 280));

        totalCost.setBackground(new java.awt.Color(255, 255, 204));
        totalCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        totalCost.setEnabled(false);
        totalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostActionPerformed(evt);
            }
        });
        add(totalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 160, -1));

        evtType.setBackground(new java.awt.Color(255, 255, 204));
        evtType.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        evtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Birthday Party", "Family Event", "Conference", "Theme Party", "Wedding" }));
        evtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evtTypeActionPerformed(evt);
            }
        });
        add(evtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, -1));

        venue.setBackground(new java.awt.Color(255, 255, 204));
        venue.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        venue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                venueMouseClicked(evt);
            }
        });
        venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueActionPerformed(evt);
            }
        });
        add(venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 190, -1));

        venueType.setBackground(new java.awt.Color(255, 255, 204));
        venueType.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        venueType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Indoor", "Open Air" }));
        venueType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueTypeActionPerformed(evt);
            }
        });
        add(venueType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, -1));

        bkID.setBackground(new java.awt.Color(255, 255, 204));
        bkID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bkID.setEnabled(false);
        bkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkIDActionPerformed(evt);
            }
        });
        add(bkID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 190, -1));

        noOfGuest.setBackground(new java.awt.Color(255, 255, 204));
        noOfGuest.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        noOfGuest.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                noOfGuestInputMethodTextChanged(evt);
            }
        });
        noOfGuest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noOfGuestKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noOfGuestKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noOfGuestKeyTyped(evt);
            }
        });
        add(noOfGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 190, -1));

        venueCost.setBackground(new java.awt.Color(255, 255, 204));
        venueCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        venueCost.setEnabled(false);
        venueCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueCostActionPerformed(evt);
            }
        });
        add(venueCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 160, -1));

        foodCost.setBackground(new java.awt.Color(255, 255, 204));
        foodCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        foodCost.setEnabled(false);
        foodCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodCostActionPerformed(evt);
            }
        });
        add(foodCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 160, -1));

        equipCost.setBackground(new java.awt.Color(255, 255, 204));
        equipCost.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        equipCost.setEnabled(false);
        add(equipCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 160, -1));

        btnClear.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, 130, 40));

        btnBook.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnBook.setText("Book");
        btnBook.setActionCommand("");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 730, 130, 40));

        foodList.setBackground(new java.awt.Color(255, 255, 204));
        foodList.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        foodList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodListMouseClicked(evt);
            }
        });
        foodList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                foodListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(foodList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 190, 100));

        equipmentList.setBackground(new java.awt.Color(255, 255, 204));
        equipmentList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                equipmentListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(equipmentList);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 190, 100));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 204));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 190, -1));

        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("End Time");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Start Time");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        endTime.setBackground(new java.awt.Color(255, 255, 204));
        endTime.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        endTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        add(endTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, -1));

        stTime.setBackground(new java.awt.Color(255, 255, 204));
        stTime.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        stTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        add(stTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 190, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ems/bg15.png"))); // NOI18N
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void totalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCostActionPerformed

    private void bkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bkIDActionPerformed

    private void venueCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venueCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venueCostActionPerformed

    private void foodCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodCostActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        reSetFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void venueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venueMouseClicked

    }//GEN-LAST:event_venueMouseClicked

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        this.book();

    }//GEN-LAST:event_btnBookActionPerformed

    private void equipCostActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    private void venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venueActionPerformed
        // TODO add your handling code here:
        VenueManagement vm = (VenueManagement) venue.getSelectedItem();
        //System.out.println("" + vm.getVenueID() + ", " + vm.getVenueName() + ", "+ vm.getVenueContNo());
        venueCost.setText("" + vm.getVenueCost());
        imagePath = vm.getVenueImage();
        loadImage(imagePath);
        setTotCost();

    }//GEN-LAST:event_venueActionPerformed

    private void evtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evtTypeActionPerformed

    private void foodListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodListMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_foodListMouseClicked

    private void foodListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_foodListValueChanged
        // TODO add your handling code here:
        setFoodCost();
        setTotCost();

    }//GEN-LAST:event_foodListValueChanged

    private void equipmentListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_equipmentListValueChanged
        // TODO add your handling code here:
        double cost = 0.0;
        List<EquipmentManagement> list;
        list = equipmentList.getSelectedValuesList();
        for (EquipmentManagement em : list) {
            cost = cost + em.getEquipmentCost();
        }
        equipCost.setText("" + cost);
        setTotCost();
    }//GEN-LAST:event_equipmentListValueChanged

    private void noOfGuestInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_noOfGuestInputMethodTextChanged
        // TODO add your handling code here:
        //setFoodCost();
    }//GEN-LAST:event_noOfGuestInputMethodTextChanged

    private void noOfGuestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfGuestKeyTyped
        // TODO add your handling code here:
        //setFoodCost();
    }//GEN-LAST:event_noOfGuestKeyTyped

    private void noOfGuestKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfGuestKeyPressed
        // TODO add your handling code here:
       // setFoodCost();
    }//GEN-LAST:event_noOfGuestKeyPressed

    private void noOfGuestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfGuestKeyReleased
        // TODO add your handling code here:
        setFoodCost();
        setTotCost();
    }//GEN-LAST:event_noOfGuestKeyReleased

    private void venueTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venueTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venueTypeActionPerformed

    private void loadImage(String path) {

        if (path != null && !path.trim().equalsIgnoreCase("null") && path.trim().length() > 0) {
            try {
                BufferedImage myPicture = ImageIO.read(new File(path));
                imageLabel.setIcon(new ImageIcon(myPicture));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void setFoodCost() {
        double cost = 0.0;
        List<FoodManagement> list = foodList.getSelectedValuesList();

        for (FoodManagement fm : list) {
            cost = cost + fm.getFoodCost();
        }
        if (!noOfGuest.getText().trim().isEmpty()) {
            cost = cost * Double.parseDouble(noOfGuest.getText());
        }
        foodCost.setText("" + cost);
    }

    private boolean checkValidation() {
        if (evtType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(EventForm.this, "Select Event type");
            return false;
        } else if (venue.getSelectedIndex() == 0 && venueCost.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(EventForm.this, "Select Venue");
            return false;
        } else if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(EventForm.this, "Select Date");
            return false;
        } else if (venueType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(EventForm.this, "Select Venue Type");
            return false;
        } else if (stTime.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(EventForm.this, "Select Event Start Time");
            return false;
        } else if (endTime.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(EventForm.this, "Select Event End Time");
            return false;
        } else if (EventDao.isEventExisted(((VenueManagement) venue.getSelectedItem()).getVenueID(), new java.sql.Date(DateTimeUtil.updateTime(jDateChooser1.getDate(), (String) stTime.getSelectedItem()).getTime()), new java.sql.Date(DateTimeUtil.updateTime(jDateChooser1.getDate(), (String) endTime.getSelectedItem()).getTime()))) {
            JOptionPane.showMessageDialog(EventForm.this, "Another Event is Booked between these timings");
            return false;
        } else if (noOfGuest.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(EventForm.this, "Select No of guest");
            noOfGuest.grabFocus();
            return false;
        }
        return true;
    }


    private void book() {
        if (checkValidation() && bkID.getText().trim().isEmpty()) {
            String eventId = UUID.randomUUID().toString();
            String eventType = (String) evtType.getSelectedItem();
            VenueManagement venue = (VenueManagement) this.venue.getSelectedItem();
            String vType = (String) venueType.getSelectedItem();
            Date eventDate = jDateChooser1.getDate();
            String startTime = (String) stTime.getSelectedItem();
            String endTime = (String) this.endTime.getSelectedItem();
            int noOfGuest = Integer.parseInt(this.noOfGuest.getText());
            Event event = new Event(eventId, eventType, venue.getVenueID(), vType, eventDate, startTime, endTime, noOfGuest);
            EventDao.addEvent(event);
            for (FoodManagement fm : foodList.getSelectedValuesList()) {
                EventDao.addEventFood(eventId, fm.getFoodId());
            }
            for (EquipmentManagement em : equipmentList.getSelectedValuesList()) {
                EventDao.addEventEquipment(eventId, em.getEquipmentID());
            }
            JOptionPane.showMessageDialog(EventForm.this, "Event is successfully booked....");
            reSetFields();
        }
    }

    private void setTotCost() {
        if (!foodCost.getText().isEmpty() && !equipCost.getText().isEmpty() && !venueCost.getText().isEmpty()) {
            double fdCost = Double.parseDouble(foodCost.getText());
            double eqCost = Double.parseDouble(equipCost.getText());
            double vCost = Double.parseDouble(venueCost.getText());
            double total = fdCost + eqCost + vCost;
            totalCost.setText("" + total);
        }
    }

    private void reSetFields() {
        bkID.setText(null);
        evtType.setSelectedIndex(0);
        venue.setSelectedIndex(0);
        venueType.setSelectedIndex(0);
        foodList.clearSelection();
        equipmentList.clearSelection();
        stTime.setSelectedIndex(0);
        endTime.setSelectedIndex(0);
        noOfGuest.setText(null);
        venueCost.setText(null);
        foodCost.setText(null);
        equipCost.setText(null);
        totalCost.setText(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkID;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> endTime;
    private javax.swing.JTextField equipCost;
    private javax.swing.JList<EquipmentManagement> equipmentList;
    private javax.swing.JComboBox<String> evtType;
    private javax.swing.JTextField foodCost;
    private javax.swing.JList<FoodManagement> foodList;
    private javax.swing.JLabel imageLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField noOfGuest;
    private javax.swing.JComboBox<String> stTime;
    private javax.swing.JTextField totalCost;
    private javax.swing.JComboBox<VenueManagement> venue;
    private javax.swing.JTextField venueCost;
    private javax.swing.JComboBox<String> venueType;
    // End of variables declaration//GEN-END:variables
}
