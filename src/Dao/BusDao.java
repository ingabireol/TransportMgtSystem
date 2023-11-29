/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Bus;

/**
 *
 * @author ingab
 */
public class BusDao {
    private String db_url = "jdbc:postgresql://localhost:5432/transportMgt_db";
    private String username = "olivier";
    private String passwd = "auca";
    
     public String generate_busId(){
        
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select MAX(bus_id) as max_bus from  bus";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String id = rs.getString("max_bus");
                Integer id1 = Integer.parseInt(id.substring(2)) + 1;
                id = id1.toString();
                while(id.length() != 3){
                    id = "0" + id;
                }                
            return "BS" + id;
            }
            else
                return "BS001";
                        
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }        
    }
    public String registerBus(Bus bus){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "insert into Bus values(?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, bus.getBus_id());
            pst.setString(2, bus.getPlate_no());
            pst.setString(3,  bus.getRegDate());
            pst.setInt(4, bus.getSize());
            int RowsAffected  = pst.executeUpdate();
            if(RowsAffected > 0 ){
                return "Bus Added Succesfully";
            }
            else
                return "Bus not Added";
            
        } catch (Exception e) {
            e.printStackTrace();
            return "server Error";
        }
    }
    public String updateBus(Bus bus){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "update Bus set plateno= ?, registerdate = ?, sizebus = ? where bus_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(4, bus.getBus_id());
            pst.setString(1, bus.getPlate_no());
            pst.setString(2,  bus.getRegDate());
            pst.setInt(3, bus.getSize());
            int RowsAffected  = pst.executeUpdate();
            if(RowsAffected > 0 ){
                return "Bus Added Succesfully";
            }
            else
                return "Bus not Added";
            
        } catch (Exception e) {
            e.printStackTrace();
            return "server Error";
        }
        
    }
    public String deleteBus(Bus bus){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "Delete from  Bus where bus_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, bus.getBus_id());
            
            int RowsAffected  = pst.executeUpdate();
            if(RowsAffected > 0 ){
                return "Bus Deleted Succesfully";
            }
            else
                return "Bus not Deleted";
            
        } catch (Exception e) {
            e.printStackTrace();
            return "server Error";
        }               
    }
    public Bus searchBus(Bus bus){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "select * from Bus where bus_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, bus.getBus_id());
            
            ResultSet rs = pst.executeQuery();
            if(rs.next() ){
                Bus bus1  = new Bus();
                bus1.setBus_id(rs.getString(1));
                bus1.setPlate_no(rs.getString(2));
                bus1.setRegDate(rs.getString(3));
                bus1.setSize(rs.getInt(4));
                return bus1;
                
            }
            else
                return null;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
       
    }
     public List<Bus> retrieveBuses(){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "select * from Bus;";
            PreparedStatement pst = con.prepareStatement(sql);
                       
            List<Bus> allBuses = new ArrayList<>();
            ResultSet rs = pst.executeQuery();
            while(rs.next() ){
                Bus bus1  = new Bus();
                bus1.setBus_id(rs.getString(1));
                bus1.setPlate_no(rs.getString(2));
                bus1.setRegDate(rs.getString(3));
                bus1.setSize(rs.getInt(4));
                allBuses.add(bus1);                
            }
            return allBuses;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
       
    }

    
}
