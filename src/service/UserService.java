/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.UserDAO;
import java.util.List;
import model.User;

/**
 *
 * @author Admin
 */
public class UserService {
    private UserDAO userDAO;
    
    public UserService() {
        userDAO = new UserDAO();
    }
    public List<User> getAllUsers() {
        return userDAO.getAllUser();
    }
}
