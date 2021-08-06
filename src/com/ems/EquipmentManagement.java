

package com.ems;

import java.util.logging.Logger;


public class EquipmentManagement {
    private int equipmentID;
    private String equipmentName;
    private double equipmentCost;
    private String equipmentImage;

    public EquipmentManagement() {
    }

    public EquipmentManagement(int equipmentID, String equipmentName, double equipmentCost, String equipmentImage) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.equipmentCost = equipmentCost;
        this.equipmentImage = equipmentImage;
    }

    public EquipmentManagement(String equipmentName, double equipmentCost, String equipmentImage) {
        this.equipmentName = equipmentName;
        this.equipmentCost = equipmentCost;
        this.equipmentImage = equipmentImage;
    }

    public EquipmentManagement(String equipmentName, double equipmentCost) {
        this.equipmentName = equipmentName;
        this.equipmentCost = equipmentCost;
    }

    
    public int getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(int equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public double getEquipmentCost() {
        return equipmentCost;
    }

    public void setEquipmentCost(double equipmentCost) {
        this.equipmentCost = equipmentCost;
    }

    public String getEquipmentImage() {
        return equipmentImage;
    }

    public void setEquipmentImage(String equipmentImage) {
        this.equipmentImage = equipmentImage;
    }

    @Override
    public String toString() {
        return  equipmentName + "   :   " + equipmentCost ;
    }
    
    
}
