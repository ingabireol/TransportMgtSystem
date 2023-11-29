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
import model.Customer;

/**
 *
 * @author ingab
 */
public class CustomerDao {
    private String db_url = "jdbc:postgresql://localhost:5432/transportMgt_db";
    private String username = "olivier";
    private String passwd = "auca";
    public String RegisterCustomer(Customer cust){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "insert into customer values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cust.getCust_id());
            pst.setString(2, cust.getCust_first_name());
            pst.setString(3, cust.getCust_last_name());
            pst.setString(5, cust.getGender());
            pst.setString(4, cust.getCust_phone());        
            int rows = pst.executeUpdate();
            if(rows > 0) {
                return "Customer Registered";
            }
            else 
                return "Customer Not Registered";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }
    }
    public boolean Check_exists(Customer cust){
        
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select * from  customer where customer_phone = ?"; // AND  first_name =? AND last_name = ?
            PreparedStatement pst = con.prepareStatement(sql); 

            pst.setString(1, cust.getCust_phone());        
            ResultSet rs = pst.executeQuery();
                        
            if(rs.next()) {
                
//                System.out.print(rs.getString(2)+"   ");
//                System.out.println(rs.getString(3)+"   ");
//                System.out.println(rs.getString(5));
                return true;
            }
            else 
                return false;
            
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
    public String generate_custId(){
        
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select MAX(customer_id) as max_cus from  customer";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String id = rs.getString("max_cus");
                if(id == null){
                    return "CU001";
                }
                Integer id1 = Integer.parseInt(id.substring(2)) + 1;
                id = id1.toString();
                while(id.length() != 3){
                    id = "0" + id;
                }                
            return "CU" + id;
            }
            else
                return "CU001";
                        
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }        
    }
    public String UpdateCustomer(Customer cust){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "update customer set gender = ?,first_name = ?,last_name = ?, customer_phone = ? where customer_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(5, cust.getCust_id());
            pst.setString(2, cust.getCust_first_name());
            pst.setString(3, cust.getCust_last_name());
            pst.setString(1, cust.getGender());
            pst.setString(4, cust.getCust_phone());        
            int rows = pst.executeUpdate();
            if(rows > 0) {
                return "Customer Update";
            }
            else 
                return "Customer Not Updated";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }
    }
        public String deleteCustomer(Customer cust){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "Delete from customer where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cust.getCust_id());
                   
            int rows = pst.executeUpdate();
            if(rows > 0) {
                return "Customer Deleted";
            }
            else 
                return "Customer Not Deleted";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }
    }
     public Customer searchCustomer(Customer cust){
         
         try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select * from customer where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cust.getCust_id());
                   
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                cust.setCust_id(rs.getString(1));
                cust.setCust_first_name(rs.getString(2));
                cust.setCust_last_name(rs.getString(3));
                cust.setCust_phone(rs.getString(4));
                cust.setGender(rs.getString(5));        
                return cust;
            }
            else 
                return null;
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
         
     }
     public List<Customer> retrieveCustomers(){
         
         try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select * from customer";
            PreparedStatement pst = con.prepareStatement(sql);
            
            List<Customer> customers = new ArrayList<>();
//            customers = null;
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                Customer cust = new Customer();
                cust.setCust_id(rs.getString(1));
                cust.setCust_first_name(rs.getString(2));
                cust.setCust_last_name(rs.getString(3));
                cust.setCust_phone(rs.getString(4));
                cust.setGender(rs.getString(5)); 
                boolean add = customers.add(cust);               
            }
            return customers;
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
         
         
     }
}
