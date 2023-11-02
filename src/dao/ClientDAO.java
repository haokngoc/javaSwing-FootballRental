/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Client;

/**
 *
 * @author Admin
 */
public class ClientDAO {
    private Connection connection;
    
    public ClientDAO() {
        connection = DAO.getConnection();
    }
    public List<Client> getClients() {
        List<Client> clients = new ArrayList<>();

        String query = "SELECT * FROM client";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) { 
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String tel = resultSet.getString("tel");
                String email = resultSet.getString("email");
                String note = resultSet.getString("note");

                Client client = new Client(name, address, tel, email, note);
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
    
    public boolean saveClient(Client client) {
        try {
            String query = "INSERT INTO client (name, address, tel, email, note) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, client.getName());
            statement.setString(2, client.getAddress());
            statement.setString(3, client.getTel());
            statement.setString(4, client.getEmail());
            statement.setString(5, client.getNote());
            
            
            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public ArrayList<Client> getAllClient(){
        ArrayList<Client> result = new ArrayList<Client>();
        String sql = "SELECT * FROM client";
        try{
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Client client = new Client();
                    client.setName(rs.getString("name"));
                    client.setAddress(rs.getString("address"));
                    client.setTel(rs.getString("tel"));
                    client.setEmail(rs.getString("email"));
                    client.setNote(rs.getString("note"));
                    result.add(client);
                }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return result;
    }
    public boolean DeleteClient(Client client) {
    try {
        String tel = String.valueOf(client.getTel());
        String query = "DELETE FROM client WHERE tel="+tel;
        PreparedStatement statement = connection.prepareStatement(query);

        int rowsInserted = statement.executeUpdate();
        statement.close();

        return rowsInserted > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
    }
    public boolean EditClient(Client client) {
        try {
            String name = String.valueOf(client.getName());
            String address = String.valueOf(client.getAddress());
            String tel = String.valueOf(client.getTel());
            String email = String.valueOf(client.getEmail());
            String note = String.valueOf(client.getNote());

            String query = "Update client set name='"+name+"',address='"+address+"',tel='" +tel+ "',email='"+email+"',note='"+note+"' WHERE tel="+tel;
            PreparedStatement statement = connection.prepareStatement(query);

            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
