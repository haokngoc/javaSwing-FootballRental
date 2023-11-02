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
import java.util.List;
import model.Field;


public class FieldService {
    private FieldDAO fieldDAO;
    public FieldService() {
        fieldDAO = new FieldDAO();
    }
    public List<Field> getAllFields() {
        return fieldDAO.getAllField();
    }
    public List<Field> getAllRentaledField() {
        return fieldDAO.getRentaledField();
    }
}
