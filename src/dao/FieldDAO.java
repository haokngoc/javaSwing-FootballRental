/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Admin
 */
import model.Field;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FieldDAO {
    private Connection connection;

    public FieldDAO() {
        connection = DAO.getConnection();
    }

    public List<Field> getFields() {
        List<Field> fields = new ArrayList<>();

        String query = "SELECT * FROM Field";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) { 
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                float price = resultSet.getFloat("price");
                String des = resultSet.getString("des");

                Field field = new Field(name, type, price, des);
                fields.add(field);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fields;
    }
    public boolean saveField(Field field) {
        try {
            String query = "INSERT INTO field (id, name, type, des, price) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, field.getId());
            statement.setString(2, field.getName());
            statement.setString(3, field.getType());
            statement.setString(4, field.getDes());
            statement.setFloat(5, field.getPrice());
            
            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public ArrayList<Field> getAllField(){
        ArrayList<Field> result = new ArrayList<Field>();
        String sql = "SELECT * FROM field";
        try{
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                        Field field = new Field();
                        field.setId(rs.getInt("id"));
                        field.setName(rs.getString("name"));
                        field.setType(rs.getString("type"));
                        field.setDes(rs.getString("des"));
                        field.setPrice(rs.getFloat("price"));
                        result.add(field);
                }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return result;
    }
    public ArrayList<Field> getRentaledField(){
        String status = "Sân chưa được thuê";
        ArrayList<Field> result = new ArrayList<Field>();
        String sql = "SELECT * FROM field where des = '" + status + "'";
        try{
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                        Field field = new Field();
                        field.setId(rs.getInt("id"));
                        field.setName(rs.getString("name"));
                        field.setType(rs.getString("type"));
                        field.setDes(rs.getString("des"));
                        field.setPrice(rs.getFloat("price"));
                        result.add(field);
                }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return result;
    }
    public boolean DeleteField(Field field) {
    try {
        String id = String.valueOf(field.getId());
        String query = "DELETE FROM field WHERE id="+id;
        PreparedStatement statement = connection.prepareStatement(query);

        int rowsInserted = statement.executeUpdate();
        statement.close();

        return rowsInserted > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
    }
    public boolean EditField(Field field) {
    try {
        String id = String.valueOf(field.getId());
        String name = String.valueOf(field.getName());
        String price = String.valueOf(field.getPrice());
        String type = String.valueOf(field.getType());
        String des = String.valueOf(field.getDes());
        String query = "Update field set id='"+id+"',name='"+name+"',type='" +type+ "',des='"+des+"',price='"+price+"' WHERE id="+id;
        PreparedStatement statement = connection.prepareStatement(query);
        
        int rowsInserted = statement.executeUpdate();
        statement.close();

        return rowsInserted > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
    }
    public boolean UpdateField(Field field) {
        try {
            String id = String.valueOf(field.getId());
            String des = "Sân đã được thuê";
            String query = "Update field set des='"+des+"'WHERE id="+id;
            PreparedStatement statement = connection.prepareStatement(query);

            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean UpdateReturnField(Field field) {
        try {
            String id = String.valueOf(field.getId());
            String des = "Sân chưa được thuê";
            String query = "Update field set des='"+des+"'WHERE id="+id;
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
