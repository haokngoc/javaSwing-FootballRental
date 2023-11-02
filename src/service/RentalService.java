/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Admin
 */
import dao.FieldDAO;
import dao.RentalDAO;
import java.util.List;
import model.Rental;


public class RentalService {
    private RentalDAO rentalDAO;
    
    public RentalService() {
        rentalDAO = new RentalDAO();
    }
    public List<Rental> getAllRentals() {
        return rentalDAO.getAllRental();
    }
    
}

