/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportmgtsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author ingab
 */
public class CreateTables {
    private String db_url = "jdbc:postgresql://localhost:5432/transportMgt_db";
    private String username = "olivier";
    private String passwd = "auca";
    public void createTable(){
//        try{
//            Connection con = DriverManager.getConnection(db_url,username,passwd);
////            String sql = "CREATE Table Customer(customer_id int PRIMARY KEY, first_name varchar(20), last_name varchar(20), customer_destination varchar(20), customer_phone varchar(20) ); CREATE Table Employee(emp_id int PRIMARY KEY, first_name varchar(20), last_name varchar(20), phone varchar(20), salary float, password varchar(30), role varchar(20) ); CREATE Table Driver(licence_no varchar(20) PRIMARY KEY, driver_fname varchar(20), driver_lname varchar(20), contact_number varchar(20) ); create table  Destination(destination_name varchar(20) PRIMARY KEY, price float, distance int, time_required int ); CREATE Table Bus(plate_no varchar(7) primary key, driver_licence_no varchar(20), seating_capacity int, FOREIGN KEY (driver_licence_no) references Driver(licence_no) ); CREATE Table Journey(journey_id char(3) PRIMARY KEY, journey_date date, customer_id int, destination_name varchar(20), licence_no varchar(20), emp_id int, departure_time varchar(8), arrival_time varchar(8), FOREIGN key (customer_id) references Customer(customer_id), FOREIGN key (destination_name) references Destination(destination_name), FOREIGN KEY (emp_id) references Employee(emp_id), FOREIGN KEY (licence_no) references Driver(licence_no) );";
////               String sql = "ALTER TABLE destination ALTER COLUMN time_required type FLOAT;";
////              String sql = "insert into Destination values('Nyaruguru',5000,150,3.5); insert into Destination values('Nyamagabe',6000,170,4); insert into Destination values('Huye',3000,130,3); insert into Destination values('Nyanza',2400,95,2); insert into Destination values('Muhanga',1500,54,1); insert into Destination values('Ruhango',2000,75,1.5); insert into Destination values('Kamonyi',1000,30,0.5); insert into Destination values('Bugesera',700,45,0.75); insert into Destination values('Rwamagana',1400,50,1.5); insert into Destination values('Kayonza',1580,75,1.5); insert into Destination values('Gatsibo',2000,90,2); insert into Destination values('Ngoma',2500,100,2); insert into Destination values('Kirehe',3700,130,3.5); insert into Destination values('Nyagatare',3300,110,3); insert into Destination values('karongi',3600,113,3.7); insert into Destination values('Nyabihu',3400,130,3.5); insert into Destination values('Rubavu',4300,181,4); insert into Destination values('Rusizi',5000,233,5.4); insert into Destination values('Ngororero',3600,160,3.6); insert into Destination values('Nyamasheke',6400,204,5.5); insert into Destination values('Rutsiro',5200,130,4); insert into Destination values('Burera',3400,150,3.5); insert into Destination values('Gicumbi',3950,170,4); insert into Destination values('Gakenke',3150,130,3); insert into Destination values('Musanze',2300,95,2); insert into Destination values('Rulindo',1300,54,1);";
//              String sql  = "insert into bus values('RAB123P','1200280215427027',30); insert into bus values('RAC163G','1119680215427045',30); insert into bus values('RAD143D','1198880215424026',30); insert into bus values('RAC425F','1200380215435087',53); insert into bus values('RAE323R','1200480214427017',30); insert into bus values('RAD143T','1200580521705437',53); insert into bus values('RAC453G','1200080565427045',30); insert into bus values('RAG143Q','1199080578827075',53); insert into bus values('RAF623Y','1976080565427035',53); insert into bus values('RAC523K','1997070455427034',30);";
            //  String sql = "create table journey(journey_id char(5), journey_date date, destination_name varchar(20), source_name varchar(20), driver_id char(5), departure_time varchar(10), arrival_time varchar(10), price float );";                
////                String sql = "alter table driver add column gender char(1)";
////                 String sql = "insert into driver values('1198880215424026','Mugabo','Eric','0788680834','M'); insert into driver values('1200280215427027','Mugisha','Endrick','0782340834','M'); insert into driver values('1119680215427045','Rukundo','Fabrice','073454834','M'); insert into driver values('1200480214427017','Hahirwa','Laurent','0798630834','M'); insert into driver values('1200580521705437','Nhuti','Pacifique','0788645834','M'); insert into driver values('1200080565427045','Bazumutima','Didier','0728684834','M'); insert into driver values('1200380215435087','Habimana','Lambert','07884685834','M'); insert into driver values('1199080578827075','Mulinda','Chris','0784680634','M'); insert into driver values('1976080565427035','Yuhi','Manase','07874680834','M'); insert into driver values('1997070455427034','Uwase','Pamela','0785680834','F');";   
//              
//            PreparedStatement pst = con.prepareStatement(sql);
//            int rowsAffected = pst.executeUpdate();
//            System.out.println(" "+rowsAffected);
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String id = sc.next();
        String id1 = id.substring(2, 5);
        Integer id2 = Integer.parseInt(id1);
        id2++;
        id1 = id2.toString();
        
        
    }
   
    
}
