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
import model.Rental;

public class RentalDAO {
    private Connection connection;
    public RentalDAO() {
        connection = DAO.getConnection();
    }
    public boolean saveRental(Rental rental) {
    try {
        String query = "INSERT INTO rental (rentalID, fieldID, clientName, rentTime, returnTime, rentFee) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, rental.getRentalID());
        statement.setInt(2, rental.getFieldID());
        statement.setString(3, rental.getClientName());
        statement.setString(4, rental.getRentTime());
        statement.setString(5, rental.getReturnTime());
        statement.setString(6, rental.getFees());
        
        int rowsInserted = statement.executeUpdate();
        statement.close();

        return rowsInserted > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
    }
    public ArrayList<Rental> getAllRental(){
        ArrayList<Rental> result = new ArrayList<Rental>();
        String sql = "SELECT * FROM rental";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                    Rental rental = new Rental();
                    rental.setFieldID(rs.getInt("fieldID"));
                    rental.setRentalID(rs.getInt("rentalID"));
                    rental.setClientName(rs.getString("clientName"));
                    rental.setRentTime(rs.getString("rentTime"));
                    rental.setReturnTime(rs.getString("returnTime"));
                    rental.setFees(rs.getString("rentFee"));
                    result.add(rental);
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return result;
    }
    
    public boolean EditRental(Rental rental) {
        try {
            
            String stt = String.valueOf(rental.getRentalID());
            String idField = String.valueOf(rental.getFieldID());
            String clientName =  rental.getClientName();
            String rentTime = rental.getRentTime();
            String returnTime = rental.getReturnTime();
            String rentFee = rental.getFees();
            
            String query = "Update rental set rentalID='"+stt+"',fieldID='"+idField+"',clientName='" +clientName+ "',rentTime='"+rentTime+"',returnTime='"+returnTime+ "', rentFee='"+ rentFee + "' WHERE rentalID="+stt ;
            PreparedStatement statement = connection.prepareStatement(query);

            int rowsInserted = statement.executeUpdate();
            statement.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean DeleteRental(Rental rental) {
    try {
        String id = String.valueOf(rental.getRentalID());
        String query = "DELETE FROM rental WHERE rentalID = " + id;
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
