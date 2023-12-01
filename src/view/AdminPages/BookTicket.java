
package view.AdminPages;

import Dao.CustomerDao;
import Dao.JourneyDao;
import Dao.TicketDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Customer;
import model.Journey;
import model.Ticket;

/**
 *
 * @author ingab
 */
public class BookTicket extends javax.swing.JInternalFrame {

    DefaultTableModel tableModelTIcket = new DefaultTableModel();
    DefaultTableModel tableModel = new DefaultTableModel();
    /** Creates new form EmployeeMgt */
    public BookTicket() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        addTableColumnsHeader();
        addTableRowData();
        TicketDao dao = new TicketDao();
        ticketIdTxt.setText(dao.generate_custId());
        JourneyDao jourdao = new JourneyDao();
        List<Journey> journeys = jourdao.retrieveJourney();
        journeyCombo.setSelectedIndex(-1);
        for(Journey thejourney  : journeys){
            journeyCombo.addItem(thejourney.getJourney_id());              
        }
        journeyCombo.setSelectedIndex(-1);
        setUneditable();
        addTableColumnsHeaderTIcket();
        addTableRowDataTicket();
        
    }
    private void addTableColumnsHeaderTIcket(){ 
        tableModelTIcket.addColumn("TicketId"); 
        tableModelTIcket.addColumn("CustomerId");
        tableModelTIcket.addColumn("Full Names");
        tableModelTIcket.addColumn("JourneyId");
        tableModelTIcket.addColumn("Date");
        tableModelTIcket.addColumn("destination");
        tableModelTIcket.addColumn("Source");
        tableModelTIcket.addColumn("Departure");
        tableModelTIcket.addColumn("Arrival");
  
        TIcketTable.setModel(tableModelTIcket);
    }
    private void resetFields(){
     custIdTxt.setText("");
        fnameTxt.setText("");
        lnameTxt.setText("");
        destinationTxt.setText("");
        sourceTxt.setText("");
        dateTxt.setDate(null);
        priceTxt.setText("");
        departureTxt.setText("");
        arrivalTimeTxt.setText("");      
        journIdtxt.setText("");
        journeyCombo.setSelectedIndex(-1);
        TicketDao dao = new TicketDao();
        ticketIdTxt.setText(dao.generate_custId());
        bookTicketBtn.setEnabled(true);
}
    private void addTableRowDataTicket(){
        tableModelTIcket.setRowCount(0);
        TicketDao ticketdao = new TicketDao();
        List<Ticket> tickets =  ticketdao.retrieveTickets();
        CustomerDao custdao = new CustomerDao();
        JourneyDao jourdao = new JourneyDao();
        tickets.forEach((theticket) -> {
            Customer cust = new Customer();
            Journey jour = new Journey();
            cust.setCust_id(theticket.getCustomer_id());
            cust = custdao.searchCustomer(cust);
            jour.setJourney_id(theticket.getJourneyId());
            jour = jourdao.searchJourney(jour);
            
            tableModelTIcket.addRow(new Object[]{
                theticket.getTicketId(),
                cust.getCust_id(),
                cust.getCust_first_name() +" "+ cust.getCust_last_name(),
                jour.getJourney_id(),
                jour.getJourney_date(),
                jour.getJour_dest_name(),
                jour.getJour_source_name(),
                jour.getJour_departure_time(),
                jour.getJour_arrival_time()
            });
        });
    }
    private void addTableColumnsHeader(){        
        tableModel.addColumn("");
        tableModel.addColumn("Date");
        tableModel.addColumn("destination");
        tableModel.addColumn("Source");
        tableModel.addColumn("DriverId");
        tableModel.addColumn("Departure");
        tableModel.addColumn("Arrival");
        tableModel.addColumn("Price");    
        tableModel.addColumn("busNo"); 
        JourneyTable.setModel(tableModel);
    }
    
    private void addTableRowData(){
        tableModel.setRowCount(0);
        JourneyDao jourdao = new JourneyDao();
        List<Journey> journeys = jourdao.retrieveJourney();
        for(Journey thejouney: journeys){
            tableModel.addRow(new Object[]{
                thejouney.getJourney_id(),
                thejouney.getJourney_date(),
                thejouney.getJour_dest_name(),
                thejouney.getJour_source_name(),
                thejouney.getDriver_id(),
                thejouney.getJour_departure_time(),
                thejouney.getJour_arrival_time(),
                thejouney.getPrice(),
                thejouney.getJour_bus_no()                
            });
        }
    }
        private void setUneditable(){
//            custIdTxt.setEditable(false);
            fnameTxt.setEditable(false);
            lnameTxt.setEditable(false);
            destinationTxt.setEditable(false);
            sourceTxt.setEditable(false);
            dateTxt.setEnabled(false);
            priceTxt.setEditable(false);
            departureTxt.setEditable(false);
            arrivalTimeTxt.setEditable(false);           
            
        }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        departureTxt = new javax.swing.JTextField();
        arrivalTimeTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JourneyTable = new javax.swing.JTable();
        bookTicketBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        searchJournBtn = new javax.swing.JButton();
        searchIdTxt = new javax.swing.JTextField();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        custIdTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        journIdtxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fnameTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lnameTxt = new javax.swing.JTextField();
        journeyCombo = new javax.swing.JComboBox<>();
        ticketIdTxt = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TIcketTable = new javax.swing.JTable();
        resetBtn = new javax.swing.JButton();
        searchCustomerBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 235, 216));
        setPreferredSize(new java.awt.Dimension(1020, 700));
        setRequestFocusEnabled(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1600, 990));

        jPanel1.setBackground(new java.awt.Color(255, 235, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Journey Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel4.setText("Destination ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setText("Source");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel7.setText("Ticket ID :  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel8.setText("Price");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 20));

        jLabel9.setText("Departure Time");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel11.setText("Arrival Time: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));
        jPanel1.add(sourceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 130, -1));
        jPanel1.add(destinationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, -1));
        jPanel1.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 130, 30));

        departureTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureTxtActionPerformed(evt);
            }
        });
        jPanel1.add(departureTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 130, -1));
        jPanel1.add(arrivalTimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 130, -1));

        JourneyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JourneyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JourneyTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JourneyTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 730, 260));

        bookTicketBtn.setText("Book");
        bookTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTicketBtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookTicketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, -1, -1));

        searchJournBtn.setText("Search");
        searchJournBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJournBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchJournBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));
        jPanel1.add(searchIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 118, -1));
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 130, -1));

        jLabel1.setText("Customer Id :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        custIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIdTxtActionPerformed(evt);
            }
        });
        jPanel1.add(custIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 130, -1));

        jLabel2.setText("Journey Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel1.add(journIdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 110, 30));

        jLabel6.setText("First Name :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        fnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(fnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 130, -1));

        jLabel10.setText("Last Name :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(lnameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 130, -1));

        journeyCombo.setMaximumRowCount(20);
        journeyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        journeyCombo.setToolTipText("");
        journeyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journeyComboActionPerformed(evt);
            }
        });
        jPanel1.add(journeyCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 130, -1));
        jPanel1.add(ticketIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 150, 20));

        jLabel13.setText("Search Journey Here");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, -1, -1));

        TIcketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TIcketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TIcketTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TIcketTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(TIcketTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 700, 210));

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 70, -1));

        searchCustomerBtn.setText("Search");
        searchCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchCustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departureTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_departureTxtActionPerformed

    private void custIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custIdTxtActionPerformed

    private void JourneyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JourneyTableMouseClicked
        // TODO add your handling code here:
           int i = JourneyTable.getSelectedRow();
        TableModel model  =  JourneyTable.getModel();
        journeyCombo.setSelectedItem(model.getValueAt(i, 0));
        journIdtxt.setText(model.getValueAt(i, 0).toString());
        destinationTxt.setText(model.getValueAt(i, 2).toString());
        sourceTxt.setText(model.getValueAt(i, 3).toString());
        departureTxt.setText(model.getValueAt(i, 5).toString());
        arrivalTimeTxt.setText(model.getValueAt(i, 6).toString());
        String date = model.getValueAt(i, 1).toString();                
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
try{
        Date todate = sdf.parse(date);
//                System.out.println(date);
//                System.out.println(sdf.format(todate));
        dateTxt.setDate(todate);
        }catch(Exception ex){ex.printStackTrace();}
        priceTxt.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_JourneyTableMouseClicked

    private void fnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTxtActionPerformed

    private void lnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTxtActionPerformed

    private void TIcketTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIcketTableMouseClicked
        // TODO add your handling code here:
        resetFields();
        TableModel model = TIcketTable.getModel();
        int i = TIcketTable.getSelectedRow();
        Customer cust = new Customer();
        Journey journ = new Journey();
        CustomerDao custdao = new CustomerDao();
        JourneyDao journdao = new JourneyDao();
        cust.setCust_id(model.getValueAt(i, 1).toString());
        journ.setJourney_id(model.getValueAt(i, 3).toString());
        journ = journdao.searchJourney(journ);
        cust = custdao.searchCustomer(cust);
        ticketIdTxt.setText(model.getValueAt(i, 0).toString());
        journeyCombo.setSelectedItem(journ.getJourney_id());
        journIdtxt.setText(journ.getJourney_id());
        destinationTxt.setText(journ.getJour_dest_name());
        sourceTxt.setText(journ.getJour_source_name());
        departureTxt.setText(journ.getJour_departure_time());
        arrivalTimeTxt.setText(journ.getJour_arrival_time());
        String date = journ.getJourney_date();                
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
try{
        Date todate = sdf.parse(date);
//                System.out.println(date);
//                System.out.println(sdf.format(todate));
        dateTxt.setDate(todate);
        }catch(Exception ex){ex.printStackTrace();}
        priceTxt.setText(journ.getPrice().toString());
        custIdTxt.setText(cust.getCust_id());
        fnameTxt.setText(cust.getCust_first_name());
        lnameTxt.setText(cust.getCust_last_name());
        bookTicketBtn.setEnabled(false);
        
    }//GEN-LAST:event_TIcketTableMouseClicked

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
       resetFields();        
    }//GEN-LAST:event_resetBtnActionPerformed

    private void searchCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerBtnActionPerformed
        // TODO add your handling code here:
        if(custIdTxt.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Id cant be empty", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Customer cust = new Customer();
            CustomerDao dao = new CustomerDao();
            cust.setCust_id(custIdTxt.getText());
            cust = dao.searchCustomer(cust);
            if(cust == null){
                JOptionPane.showMessageDialog(this, "Id Custoemr Does not Exist", "Result", JOptionPane.ERROR_MESSAGE);
            }
            else{
                custIdTxt.setText(cust.getCust_id());
                fnameTxt.setText(cust.getCust_first_name());
                lnameTxt.setText(cust.getCust_last_name());
                
            }
        }
    }//GEN-LAST:event_searchCustomerBtnActionPerformed

    private void TIcketTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIcketTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIcketTableMousePressed

    private void bookTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTicketBtnActionPerformed
        // TODO add your handling code here:
        if(fnameTxt.getText().trim().isEmpty() || lnameTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please first search for the Customer", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else if(departureTxt.getText().trim().isEmpty() || destinationTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "First Choose the Journey", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else{
            TicketDao ticketdao = new TicketDao();
            Ticket ticket = new Ticket();
            ticket.setTicketId(ticketIdTxt.getText());
            ticket.setCustomer_id(custIdTxt.getText());
            ticket.setJourneyId(journIdtxt.getText());
            String feedback = ticketdao.RegisterTicket(ticket);
            JOptionPane.showMessageDialog(this, feedback, "Result", JOptionPane.INFORMATION_MESSAGE);
            resetBtnActionPerformed(evt);
            addTableRowDataTicket();
        }
    }//GEN-LAST:event_bookTicketBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        TicketDao ticketdao = new TicketDao();
        if(ticketIdTxt.getText().compareTo(ticketdao.generate_custId()) == 0){
            JOptionPane.showMessageDialog(this, "Please first search the ticket", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        if(fnameTxt.getText().trim().isEmpty() || lnameTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please first search the ticket", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else if(departureTxt.getText().trim().isEmpty() || destinationTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please first search the ticket", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Ticket ticket = new Ticket();
            ticket.setTicketId(ticketIdTxt.getText());
            String feedback = ticketdao.deleteTicket(ticket);
            JOptionPane.showMessageDialog(this, feedback, "Result", JOptionPane.INFORMATION_MESSAGE);
            resetBtnActionPerformed(evt);
            addTableRowDataTicket();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if(fnameTxt.getText().trim().isEmpty() || lnameTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please first search for the Customer", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else if(departureTxt.getText().trim().isEmpty() || destinationTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "First Choose the Journey", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else{
            TicketDao ticketdao = new TicketDao();
            Ticket ticket = new Ticket();
            ticket.setTicketId(ticketIdTxt.getText());
            ticket.setCustomer_id(custIdTxt.getText());
            ticket.setJourneyId(journIdtxt.getText());
            String feedback = ticketdao.UpdateTicket(ticket);
            JOptionPane.showMessageDialog(this, feedback, "Result", JOptionPane.INFORMATION_MESSAGE);
            resetBtnActionPerformed(evt);
            addTableRowDataTicket();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchJournBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJournBtnActionPerformed
        // TODO add your handling code here:
        if(searchIdTxt.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Id cant be empty", "Empty Feild", JOptionPane.ERROR_MESSAGE);
        }
        else if(searchIdTxt.getText().length() == 5 && searchIdTxt.getText().contains("JN")){
            Journey journey = new Journey();
//            Journey journey1 = new Journey();

            JourneyDao jourdao = new JourneyDao();
            journey.setJourney_id(searchIdTxt.getText());
            journey = jourdao.searchJourney(journey);
            if(journey == null){
                System.out.println(searchIdTxt.getText());
                JOptionPane.showMessageDialog(this, "Id does not Exist", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                journIdtxt.setText(journey.getJourney_id());
                destinationTxt.setText(journey.getJour_dest_name());
                sourceTxt.setText(journey.getJour_source_name());
                departureTxt.setText(journey.getJour_departure_time());
                journeyCombo.setSelectedItem(journey.getJourney_id());
                arrivalTimeTxt.setText(journey.getJour_arrival_time());
                String date = journey.getJourney_date();                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             try{   
                Date todate = sdf.parse(date);
//                System.out.println(date);
//                System.out.println(sdf.format(todate));
                dateTxt.setDate(todate);}catch(Exception ex){ex.printStackTrace();}
                priceTxt.setText(journey.getPrice().toString());
                
            }
        }
        
    }//GEN-LAST:event_searchJournBtnActionPerformed

    private void journeyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journeyComboActionPerformed
        // TODO add your handling code here:
        Journey journey = new Journey();
        
     
        if(journeyCombo.getSelectedItem() ==null){
            return;
        }
        else if(journeyCombo.getSelectedItem() != null){
            
            if(journeyCombo.getSelectedItem().toString().equalsIgnoreCase("select")){
            
            journIdtxt.setText("");
            destinationTxt.setText("");
            sourceTxt.setText("");
            departureTxt.setText("");
            journeyCombo.setSelectedItem("");
            arrivalTimeTxt.setText("");
            dateTxt.setDate(null);
            priceTxt.setText("");
            
        }
        
        journey.setJourney_id(journeyCombo.getSelectedItem().toString());
        
        JourneyDao dao = new JourneyDao();
        journey = dao.searchJourney(journey);
        if(journey != null){
        journIdtxt.setText(journey.getJourney_id());
                destinationTxt.setText(journey.getJour_dest_name());
                sourceTxt.setText(journey.getJour_source_name());
                departureTxt.setText(journey.getJour_departure_time());
                journeyCombo.setSelectedItem(journey.getJourney_id());
                arrivalTimeTxt.setText(journey.getJour_arrival_time());
                String date = journey.getJourney_date();                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             try{   
                Date todate = sdf.parse(date);
//                System.out.println(date);
//                System.out.println(sdf.format(todate));
                dateTxt.setDate(todate);}catch(Exception ex){ex.printStackTrace();}
                priceTxt.setText(journey.getPrice().toString());
        }
       }
    }//GEN-LAST:event_journeyComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JourneyTable;
    private javax.swing.JTable TIcketTable;
    private javax.swing.JTextField arrivalTimeTxt;
    private javax.swing.JButton bookTicketBtn;
    private javax.swing.JTextField custIdTxt;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField departureTxt;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel journIdtxt;
    private javax.swing.JComboBox<String> journeyCombo;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchCustomerBtn;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JButton searchJournBtn;
    private javax.swing.JTextField sourceTxt;
    private javax.swing.JLabel ticketIdTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

}
