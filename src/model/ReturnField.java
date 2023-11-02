/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class ReturnField {
    private int returnID;
    private String nameField;
    private String nameClient;
    private String returnTime;
    private float delay;
    private float fine;
    private float fees;

    public ReturnField() {
        super();

    }

    
    public ReturnField(int returnID, String nameField, String nameClient, String returnTime, float delay, float fine, float fees) {
        this.returnID = returnID;
        this.nameField = nameField;
        this.nameClient = nameClient;
        this.returnTime = returnTime;
        this.delay = delay;
        this.fine = fine;
        this.fees = fees;
    }

    public int getReturnID() {
        return returnID;
    }

    public void setReturnID(int returnID) {
        this.returnID = returnID;
    }

    public String getNameField() {
        return nameField;
    }

    public void setNameField(String nameField) {
        this.nameField = nameField;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }

    public float getFine() {
        return fine;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }
    
    
}
