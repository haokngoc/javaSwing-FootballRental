/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Rental {
    private int rentalID;
    private int fieldID;
    private String clientName;
    private String rentTime;
    private String returnTime;
    private String fees;
    public Rental() {
        super();
    }
    public Rental(int rentalID, int fieldID, String clientName, String rentTime, String returTime, String fees) {
        this.rentalID = rentalID;
        this.fieldID = fieldID;
        this.clientName = clientName;
        this.rentTime = rentTime;
        this.returnTime = returTime;
        this.fees = fees;
    }

    public int getRentalID() {
        return rentalID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    public int getFieldID() {
        return fieldID;
    }

    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returTime) {
        this.returnTime = returTime;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }
}
