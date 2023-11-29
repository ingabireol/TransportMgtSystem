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
import model.Driver;

/**
 *
 * @author ingab
 */
public class DriverDao {
    private String db_url = "jdbc:postgresql://localhost:5432/transportMgt_db";
    private String username = "olivier";
    private String passwd = "auca";
    
     public String generate_driverId(){
        
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select MAX(driver_id) as max_driver from  driver";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            if(rs == null){
                return "DR001";
            }
            if(rs.next()){
                String id = rs.getString("max_driver");
                if(id == null){
                    return "DR001";
                }
                Integer id1 = Integer.parseInt(id.substring(2)) + 1;
                
                id = id1.toString();
                while(id.length() != 3){
                    id = "0" + id;
                }
                con.close();
            return "DR" + id;
            }
            else
                return "DR001";
                        
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }        
    }
    
    public String registerDriver(Driver driver){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "insert into Driver values(?,?,?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, driver.getDriver_id());
            pst.setString(4, driver.getF_name());
            pst.setString(5, driver.getL_name());
            pst.setString(3, driver.getGender());
            pst.setString(2, driver.getLicence_no());
            pst.setString(6, driver.getContact_no());
            pst.setDouble(7, driver.getSalary());
            pst.setString(8, driver.getBus_id());

            int rows_affected = pst.executeUpdate();
            con.close();
            if(rows_affected > 0){
                return "Driver Registered";
            }
            else
                return "Driver Not Registered";
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }                
    }
     public String updateDriver(Driver driver){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "update Driver set bus_no = ?, licence_no = ?, gender = ?, driver_fname = ?, driver_lname = ?, contact_number = ?, salary  = ? where driver_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(8, driver.getDriver_id());
            pst.setString(4, driver.getF_name());
            pst.setString(5, driver.getL_name());
            pst.setString(3, driver.getGender());
            pst.setString(2, driver.getLicence_no());
            pst.setString(6, driver.getContact_no());
            pst.setDouble(7, driver.getSalary());
            pst.setString(1, driver.getBus_id());
            
            int rows_affected = pst.executeUpdate();
            con.close();
            if(rows_affected > 0){
                return "Driver Udated Successfully";
            }
            else
                return "Driver Not Updated";
        } catch (Exception e) {
            e.printStackTrace();
            return "Server Error";
        }                
    }
      public String deletDriver(Driver driver){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "Delete from Driver where driver_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, driver.getDriver_id());
           
            int rows_affected = pst.executeUpdate();
            con.close();
            if(rows_affected > 0){
                return "Driver deleted Successfully";
            }
            else
                return "Driver Not Deleted";
        } catch (Exception e) {
            e.printStackTrace();
            
            return "Server Error";
        }
        
    }
       public Driver searchDriver(Driver driver){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "select  * from Driver where driver_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, driver.getDriver_id());
            

            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                Driver driver1 = new Driver();
                driver1.setDriver_id(rs.getString(1));
                driver1.setLicence_no(rs.getString(2));
                driver1.setGender(rs.getString(3));
                driver1.setF_name(rs.getString(4));
                driver1.setL_name(rs.getString(5));                
                driver1.setSalary(rs.getDouble(7));
                driver1.setContact_no(rs.getString(6));
                driver1.setBus_id(rs.getString(8));
                con.close();
                return driver1;
            }
            else
                return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }                
    }
     public List<Driver> retrieveDrivers(){
        try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "select * from Driver";
            PreparedStatement pst = con.prepareStatement(sql);          

            ResultSet rs = pst.executeQuery();
            List<Driver> drivers = new ArrayList<>();
            while(rs.next()){
                
                Driver driver1 = new Driver();
                driver1.setDriver_id(rs.getString(1));
                driver1.setLicence_no(rs.getString(2));
                driver1.setGender(rs.getString(3));
                driver1.setF_name(rs.getString(4));
                driver1.setL_name(rs.getString(5));                
                driver1.setSalary(rs.getDouble(7));
                driver1.setContact_no(rs.getString(6));
                driver1.setBus_id(rs.getString(8));
                
                drivers.add(driver1);
            }
            con.close();
            return drivers;
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }                
    }
     public boolean BusExists(String id){
         try {
            Connection con = DriverManager.getConnection(db_url, username,passwd);
            String sql = "select  * from Bus where bus_id = ?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);            

            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                con.close();
                return true;
            }
            else
                con.close();
                return false;
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
        } 
         
     }
}
