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
import model.Ticket;

/**
 *
 * @author ingab
 */
public class TicketDao {
    private String db_url = "jdbc:postgresql://localhost:5432/transportMgt_db";
    private String username = "olivier";
    private String passwd = "auca";
    public String RegisterTicket(Ticket ticket){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "insert into  ticket values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ticket.getTicketId());
            pst.setString(2, ticket.getCustomer_id());
            pst.setString(3, ticket.getJourneyId());
              
            int rows = pst.executeUpdate();
            if(rows > 0) {
                return "Ticket Registered";
            }
            else 
                return "Ticket not Registered";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }
    }
    public String UpdateTicket(Ticket ticket){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "update ticket set journey_id = ?, customer_id = ? where ticket_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(3, ticket.getTicketId());
            pst.setString(2, ticket.getCustomer_id());
            pst.setString(1, ticket.getJourneyId());
              
            int rows = pst.executeUpdate();
            if(rows > 0) {
                return "Ticket Updated";
            }
            else 
                return "Ticket not Updated";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }
    }
    public String deleteTicket(Ticket ticket){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "delete from  ticket where ticket_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ticket.getTicketId());
                        
            int rows = pst.executeUpdate();
            if(rows > 0) {
                return "Ticket Deleted";
            }
            else 
                return "Ticket not Deleted";
            
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }
    }
    public Ticket searchTicket(Ticket ticket){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select * from ticket where ticket_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ticket.getTicketId());
            
              
            ResultSet rs  = pst.executeQuery();
            if(rs.next()) {
                Ticket theticket = new Ticket();
                theticket.setJourneyId(rs.getString(3));
                theticket.setTicketId(rs.getString(1));
                theticket.setCustomer_id(rs.getString(2));
                con.close();
                return theticket;
            }
            else {
                con.close();
                return null;
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public List<Ticket> retrieveTickets(){
        
                
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select * from ticket";
            PreparedStatement pst = con.prepareStatement(sql);
              
            ResultSet rs  = pst.executeQuery();
            List<Ticket> tickets = new ArrayList<>();
            while(rs.next()) {
                Ticket theticket = new Ticket();
                theticket.setJourneyId(rs.getString(3));
                theticket.setTicketId(rs.getString(1));
                theticket.setCustomer_id(rs.getString(2));
                con.close();
                tickets.add(theticket);
            }
            con.close();
            return tickets;
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public String generate_custId(){
        
        try{
            Connection con = DriverManager.getConnection(db_url, username, passwd);
            String sql = "select MAX(ticket_id) as max_ticket from  ticket";
            PreparedStatement pst = con.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String id = rs.getString("max_ticket");
                if(id == null){
                    return "TK001";
                }
                Integer id1 = Integer.parseInt(id.substring(2)) + 1;
                id = id1.toString();
                while(id.length() != 3){
                    id = "0" + id;
                }                
            return "TK" + id;
            }
            else
                return "TK001";
                        
        }catch(Exception ex){
            ex.printStackTrace();
            return "Server Error";
        }        
    }
    
}
