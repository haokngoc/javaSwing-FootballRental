/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Admin
 */
import dao.ClientDAO;
import java.util.List;
import model.Client;


public class ClientService {
    private ClientDAO clientDAO;
    public ClientService() {
        clientDAO = new ClientDAO();
    }
    public List<Client> getAllClients() {
        return clientDAO.getAllClient();
    }
}

