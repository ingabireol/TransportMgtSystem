/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Journey;

/**
 *
 * @author ingab
 */
public class JourneyDao {
    private String db_url = "jdbc:postgresql://localhost:5432/transportMgt_db";
    private String username = "olivier";
    private String passwd = "auca";
    
    public String generate_driverId(){
        
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select MAX(journey_id) as max_journey from  journey";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            if(rs.next() && rs != null){
                String id = rs.getString("max_journey");
                if(id == null)
                    return "JN001";
                Integer id1 = Integer.parseInt(id.substring(2)) + 1;
                id = id1.toString();
                while(id.length() != 3){
                    id = "0" + id;
                }                
            return "JN" + id;
            }
            else
                return "JN001";
                        
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }        
    }
    public String registerJourney(Journey journ) {
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "insert into journey values(?,?,?,?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, journ.getJourney_id());
            pst.setString(2, journ.getJourney_date());         
            pst.setString(3, journ.getJour_dest_name());
            pst.setString(4, journ.getJour_departure_time());
            pst.setString(5, journ.getDriver_id());
            pst.setString(6, journ.getJour_source_name());
            pst.setString(7, journ.getJour_arrival_time());
            pst.setDouble(8, journ.getPrice());
            pst.setString(9, journ.getJour_bus_no());
            
            int RowsAffected = pst.executeUpdate();
            if(RowsAffected > 0 ){
                return "Journey Created Successfully";
            }
            else
                return "Journey Not created";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "server Error";
        }
    }
    public String updateJourney(Journey journ) {
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "Update journey set journey_date = ?, destination_name = ?, source_name = ?, driver_id = ?, departure_time = ?, arrival_time = ?, price = ?, bus_no = ? where journey_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(9, journ.getJourney_id());
            pst.setString(1, journ.getJourney_date());         
            pst.setString(2, journ.getJour_dest_name());
            pst.setString(3, journ.getJour_source_name());
            pst.setString(4, journ.getDriver_id());
            pst.setString(5, journ.getJour_departure_time());
            pst.setString(6, journ.getJour_arrival_time());
            pst.setDouble(7, journ.getPrice());
            pst.setString(8, journ.getJour_bus_no());
            int RowsAffected = pst.executeUpdate();
            if(RowsAffected > 0 ){
                return "Journey updated Successfully";
            }
            else
                return "Journey Not updated";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "server Error";
        }
    }
    public String deleteJourney(Journey journ) {
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "delete from journey where journey_id = ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, journ.getJourney_id());
           
            int RowsAffected = pst.executeUpdate();
            if(RowsAffected > 0 ){
                return "Journey Created Successfully";
            }
            else
                return "Journey Not created";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "server Error";
        }
    }
    public Journey searchJourney(Journey journ) {
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select * from journey where journey_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, journ.getJourney_id());
            
            ResultSet rs = pst.executeQuery();
            if(rs.next() ){
                Journey jour = new Journey();
                jour.setJourney_id(rs.getString(1));
                jour.setJourney_date(rs.getString(2));
                jour.setJour_dest_name(rs.getString(3));
                jour.setJour_source_name(rs.getString(4));
                jour.setDriver_id(rs.getString(5));
                jour.setJour_departure_time(rs.getString(6));
                jour.setJour_arrival_time(rs.getString(7));
                jour.setPrice(rs.getDouble(8));
                jour.setJour_bus_no(rs.getString(9));
                System.out.println(rs.getString(3));
                con.close();
                return jour;
            }
            else{
                con.close();
                System.out.println("ieeeeeeeYesyeysye");
                return null;
                
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public List<Journey> retrieveJourney() {
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select * from journey";
            PreparedStatement pst = con.prepareStatement(sql);
          
            
            ResultSet rs = pst.executeQuery();
            List<Journey> All = new ArrayList<>();
            while(rs.next() ){
                Journey jour = new Journey();
                jour.setJourney_id(rs.getString(1));
                jour.setJourney_date(rs.getString(2));
                jour.setJour_dest_name(rs.getString(3));
                jour.setJour_source_name(rs.getString(4));
                jour.setDriver_id(rs.getString(5));
                jour.setJour_departure_time(rs.getString(6));
                jour.setJour_arrival_time(rs.getString(7));
                jour.setPrice(rs.getDouble(8));
                jour.setJour_bus_no(rs.getString(9));          
                All.add(jour);
            }
            con.close();
            return All;           
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
