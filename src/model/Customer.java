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
public class Customer {
    private String cust_id;
    private String cust_first_name;
    private String cust_last_name;
    private String gender;
    private String cust_phone;

    public Customer() {
    }

    public Customer(String cust_id, String cust_first_name, String cust_last_name, String gender, String cust_phone) {
        this.cust_id = cust_id;
        this.cust_first_name = cust_first_name;
        this.cust_last_name = cust_last_name;
        this.gender = gender;
        this.cust_phone = cust_phone;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_first_name() {
        return cust_first_name;
    }

    public void setCust_first_name(String cust_first_name) {
        this.cust_first_name = cust_first_name;
    }

    public String getCust_last_name() {
        return cust_last_name;
    }

    public void setCust_last_name(String cust_last_name) {
        this.cust_last_name = cust_last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    
    
}
