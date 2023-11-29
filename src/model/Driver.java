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
public class Driver {
    private String driver_id;
    private String licence_no;
    private String gender;
    private String f_name;
    private String l_name;
    private String contact_no;
    private Double salary;
    private String bus_id;

    public Driver() {
    }

    public Driver(String driver_id, String licence_no, String gender, String f_name, String l_name, String contact_no, Double salary, String bus_id) {
        this.driver_id = driver_id;
        this.licence_no = licence_no;
        this.gender = gender;
        this.f_name = f_name;
        this.l_name = l_name;
        this.contact_no = contact_no;
        this.salary = salary;
        this.bus_id = bus_id;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getLicence_no() {
        return licence_no;
    }

    public void setLicence_no(String licence_no) {
        this.licence_no = licence_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getBus_id() {
        return bus_id;
    }

    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    
    
}
