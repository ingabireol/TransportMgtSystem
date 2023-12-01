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
import model.Employee;

/**
 *
 * @author ingab
 */
public class EmployeeDao {
    private String db_url = "jdbc:postgresql://localhost:5432/transportMgt_db";
    private String username1 = "olivier";
    private String passwd1 = "auca";
    
    public Employee loginStatus(Employee emp) {
        try{
            Connection con = DriverManager.getConnection(db_url, username1, passwd1);
            String sql = "select * from employee where username=? AND password = ?";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, emp.getUsername());
            pst.setString(2, emp.getPasswd());
            ResultSet rs = pst.executeQuery();
                                  
            if(rs.next()){
                Employee emp1 = new Employee();
                emp1.setEmp_fname(rs.getString(2));
                emp1.setEmp_lname(rs.getString(3));
                emp1.setEmp_id(rs.getString(1));
                emp1.setPhone(rs.getString(4));
                emp1.setEmp_salary(rs.getFloat(5));
                emp1.setPasswd(rs.getString(6));
                emp1.setRole(rs.getString(7));
                emp1.setUsername(rs.getString(8));
                return emp1;            
                
                
//                String password = rs.getString("password");
//                String role = rs.getString("role");
                
//                if(emp.getPasswd().compareTo(password) ==0){
//                    return role;                   
//                }
//                else{
//                    return "No user";
//                }
            }
            else{
                return null;
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;        
    }
    public String generate_empId(){
        
        try{
            Connection con = DriverManager.getConnection(db_url, username1, passwd1);
            String sql = "select MAX(emp_id) as max_emp from  employee";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String id = rs.getString("max_emp");
                Integer id1 = Integer.parseInt(id.substring(2)) + 1;
                id = id1.toString();
                while(id.length() != 3){
                    id = "0" + id;
                }                
            return "EM" + id;
            }
            else
                return "EM001";
                        
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }        
    }
        public String registerEmployee(Employee emp){
            try {
                Connection con = DriverManager.getConnection(db_url,username1,passwd1);
                String sql =  "insert into employee values(?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, emp.getEmp_id());
                pst.setString(2, emp.getEmp_fname());
                pst.setString(3, emp.getEmp_lname());
                pst.setString(4, emp.getPhone());
                pst.setDouble(5, emp.getEmp_salary());
                pst.setString(7, emp.getRole());
                pst.setString(8, emp.getUsername());
                pst.setString(6, emp.getPasswd());
                int RowsAffected = pst.executeUpdate();
                if(RowsAffected > 0){
                    return "EMployee Registered";
                }
                else
                    return "EMployee Not registered";
                
            } catch (Exception e) {
                return "server Error";
            }            
        }
        public String updateEmployee(Employee emp){
            try {
                Connection con = DriverManager.getConnection(db_url,username1,passwd1);
                String sql =  "update employee set employee username = ?,first_name = ? ,last_name = ?, phone = ?, salary = ?, password= ?, role = ?,where emp_id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(8, emp.getEmp_id());
                pst.setString(2, emp.getEmp_fname());
                pst.setString(3, emp.getEmp_lname());
                pst.setString(4, emp.getPhone());
                pst.setDouble(5, emp.getEmp_salary());
                pst.setString(7, emp.getRole());
                pst.setString(1, emp.getUsername());
                pst.setString(6, emp.getPasswd());
                int RowsAffected = pst.executeUpdate();
                if(RowsAffected > 0){
                    return "EMployee Updated Successfully";
                }
                else
                    return "EMployee Not Updated";
                
            } catch (Exception e) {
                return "server Error";
            }            
        }
        public Employee searchEmployee(Employee emp) {
        try{
            Connection con = DriverManager.getConnection(db_url, username1, passwd1);
            String sql = "select * from employee where emp_id = ?";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, emp.getEmp_id());
       
            ResultSet rs = pst.executeQuery();
                                  
            if(rs.next()){
                Employee emp1 = new Employee();
                emp1.setEmp_fname(rs.getString(2));
                emp1.setEmp_lname(rs.getString(3));
                emp1.setEmp_id(rs.getString(1));
                emp1.setPhone(rs.getString(4));
                emp1.setEmp_salary(rs.getFloat(5));
                emp1.setPasswd(rs.getString(6));
                emp1.setRole(rs.getString(7));
                emp1.setUsername(rs.getString(8));
                return emp1;  
            }
            return null;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
       }
       
        public List<Employee> retrieveEmployee() {
        try{
            Connection con = DriverManager.getConnection(db_url, username1, passwd1);
            String sql = "select * from employee";
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            List<Employee> employees = new ArrayList<>();
            while(rs.next()){
                Employee emp1 = new Employee();
                emp1.setEmp_fname(rs.getString(2));
                emp1.setEmp_lname(rs.getString(3));
                emp1.setEmp_id(rs.getString(1));
                emp1.setPhone(rs.getString(4));
                emp1.setEmp_salary(rs.getFloat(5));
                emp1.setPasswd(rs.getString(6));
                emp1.setRole(rs.getString(7));
                emp1.setUsername(rs.getString(8));
                employees.add(emp1);
            }
            return employees;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
       }
        public String deleteEmployee(Employee emp){
            try {
                Connection con = DriverManager.getConnection(db_url,username1,passwd1);
                String sql =  "delete from employee where emp_id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, emp.getEmp_id());
                int RowsAffected = pst.executeUpdate();
                if(RowsAffected > 0){
                    return "EMployee Delete Successfully";
                }
                else
                    return "EMployee Not Deleted";
                
            } catch (Exception e) {
                return "server Error";
            }            
        }
        
    
    
}
