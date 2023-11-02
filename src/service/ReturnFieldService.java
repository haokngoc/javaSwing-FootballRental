/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Admin
 */
import dao.ReturnFieldDAO;
import java.util.List;
import model.ReturnField;


public class ReturnFieldService {
    private ReturnFieldDAO returnFieldDAO;
    
    public ReturnFieldService() {
        returnFieldDAO = new ReturnFieldDAO();
    }
    public List<ReturnField> getAll() {
        return returnFieldDAO.getAllReturn();
    }
    
}