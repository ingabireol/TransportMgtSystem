/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportmgtsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ingab
 */
public class TransportMgtSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        CreateTables create = new CreateTables();
//        create.createTable();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter something");
//        String id = sc.next();
//       Integer id1 = Integer.parseInt(id.substring(2));
//                  id1++;
//        id = id1.toString();
//       while(id.length() != 3){
//                      id = "0" + id;
//                  }
//                  System.out.println("PS"+id);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2023-08-20";
        try{
        Date todate = sdf.parse(date);
            System.out.println(date);
            System.out.println(sdf.format(todate));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
}
