/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDAO {
    private Connection connection;

    public UserDAO() {
        this.connection = DAO.getConnection();
    }
    public boolean checkLogin(User user) {
        boolean result = false;
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                user.setName(rs.getString("name"));
                user.setPosition(rs.getString("position"));
                result = true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<User> getAllUser(){
        ArrayList<User> result = new ArrayList<User>();
        String sql = "SELECT * FROM user";
        try{
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setName(rs.getString("name"));
                    user.setPosition(rs.getString("position"));
                    result.add(user);
                }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return result;
    }
    public boolean saveUser(User user) {
        try {
            String query = "INSERT INTO user (id, username, password, name, position) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getName());
            statement.setString(5, user.getPosition());
            
            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean DeleteUser(User user) {
        try {
            String id = String.valueOf(user.getId());
            String query = "DELETE FROM user WHERE id="+id;
            PreparedStatement statement = connection.prepareStatement(query);

            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean EditUser(User user) {
        try {
            String id = String.valueOf(user.getId());
            String name = String.valueOf(user.getName());
            String password = String.valueOf(user.getPassword());
            String position = String.valueOf(user.getPosition());
            String username = String.valueOf(user.getUsername());
            String query = "Update user set id='"+id+"',username='"+username+"',password='" +password+ "',name='"+name+"',position='"+position+"' WHERE id="+id;
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

