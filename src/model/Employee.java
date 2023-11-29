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
public class Employee {
    private String emp_id;
    private String emp_lname;
    private String emp_fname;
    private float emp_salary;
    private String username;
    private String role;
    private String phone;
    private String passwd;

    public Employee() {
    }

    public Employee(String emp_id, String emp_lname, String emp_fname, float emp_salary, String username, String role, String phone, String passwd) {
        this.emp_id = emp_id;
        this.emp_lname = emp_lname;
        this.emp_fname = emp_fname;
        this.emp_salary = emp_salary;
        this.username = username;
        this.role = role;
        this.phone = phone;
        this.passwd = passwd;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_lname() {
        return emp_lname;
    }

    public void setEmp_lname(String emp_lname) {
        this.emp_lname = emp_lname;
    }

    public String getEmp_fname() {
        return emp_fname;
    }

    public void setEmp_fname(String emp_fname) {
        this.emp_fname = emp_fname;
    }

    public float getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(float emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    
    
    
}
