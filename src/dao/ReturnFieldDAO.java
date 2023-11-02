/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import model.ReturnField;
/**
 *
 * @author Admin
 */
public class ReturnFieldDAO {
    private Connection connection;

    public ReturnFieldDAO() {
        connection = DAO.getConnection();
    }
    
    public boolean Return(ReturnField returnField) {
        try {
            String query = "INSERT INTO returnfield (returnID, nameField, nameClient, returnTime, delay, fine, fees) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            
            statement.setInt(1, returnField.getReturnID());
            statement.setString(2, returnField.getNameField());
            statement.setString(3, returnField.getNameClient());
            statement.setString(4, returnField.getReturnTime());
            statement.setFloat(5, returnField.getDelay());
            statement.setFloat(6, returnField.getFine());
            statement.setFloat(7, returnField.getFees());

            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        
    }
    public ArrayList<ReturnField> getAllReturn(){
        ArrayList<ReturnField> result = new ArrayList<ReturnField>();
        String sql = "SELECT * FROM returnfield";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                    ReturnField returnField = new ReturnField();
                    
                    returnField.setDelay(rs.getFloat("delay"));
                    returnField.setReturnID(rs.getInt("returnID"));
                    returnField.setNameField(rs.getString("nameField"));
                    returnField.setNameClient(rs.getString("nameClient"));
                    returnField.setReturnTime(rs.getString("returnTime"));
                    returnField.setFine(rs.getFloat("fine"));
                    returnField.setFees(rs.getFloat("fees"));
                    result.add(returnField);
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return result;
    }
    public boolean DeleteRent(ReturnField returnField) {
        try {
            String id = String.valueOf(returnField.getReturnID());
            String query = "DELETE FROM rental WHERE rentalID = "+id;
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
