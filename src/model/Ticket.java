/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ingab
 */
public class Ticket {
    private String ticketId;
    private String customer_id;
    private String journeyId;

    public Ticket() {
    }

    public Ticket(String ticketId, String customer_id, String journeyId) {
        this.ticketId = ticketId;
        this.customer_id = customer_id;
        this.journeyId = journeyId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    
    
}
