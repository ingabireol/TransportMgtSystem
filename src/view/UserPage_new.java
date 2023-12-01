/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.AdminPages.BookTicket;
import view.AdminPages.CustomerMgt;
import view.AdminPages.HomePage;

/**
 *
 * @author ingab
 */
public class UserPage_new extends javax.swing.JFrame {

    Color defaultColor,clickedColor;
    
    /**
     * Creates new form UserPage_new
     */
    public UserPage_new() {
        initComponents();
        defaultColor = new Color(236,227,206);
        clickedColor = new Color(79,111,82);
        HomePage homePage = new HomePage();
        jDesktopPane.removeAll();
        jDesktopPane.add(homePage).setVisible(true);
       
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ConfPanel = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CustMgtBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BookTickBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(115, 144, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-bus-100.png"))); // NOI18N
        jLabel7.setText("Transport Management System");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/ingabireO lOgo2.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 270, 170));

        logOutBtn.setBackground(new java.awt.Color(236, 227, 206));
        logOutBtn.setMaximumSize(new java.awt.Dimension(137, 82));
        logOutBtn.setMinimumSize(new java.awt.Dimension(137, 82));
        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logOutBtnMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-log-out-100.png"))); // NOI18N
        jLabel10.setText("LOG OUT");

        javax.swing.GroupLayout logOutBtnLayout = new javax.swing.GroupLayout(logOutBtn);
        logOutBtn.setLayout(logOutBtnLayout);
        logOutBtnLayout.setHorizontalGroup(
            logOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOutBtnLayout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logOutBtnLayout.setVerticalGroup(
            logOutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1910, 240));

        ConfPanel.setBackground(new java.awt.Color(236, 227, 206));
        ConfPanel.setAutoscrolls(true);
        ConfPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeBtn.setBackground(new java.awt.Color(236, 227, 206));
        HomeBtn.setMaximumSize(new java.awt.Dimension(137, 82));
        HomeBtn.setMinimumSize(new java.awt.Dimension(137, 82));
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeBtnMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/HomeIcon.png"))); // NOI18N
        jLabel1.setText("Home");

        javax.swing.GroupLayout HomeBtnLayout = new javax.swing.GroupLayout(HomeBtn);
        HomeBtn.setLayout(HomeBtnLayout);
        HomeBtnLayout.setHorizontalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        HomeBtnLayout.setVerticalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConfPanel.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 309, 80));

        CustMgtBtn.setBackground(new java.awt.Color(236, 227, 206));
        CustMgtBtn.setMaximumSize(new java.awt.Dimension(137, 82));
        CustMgtBtn.setMinimumSize(new java.awt.Dimension(137, 82));
        CustMgtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustMgtBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CustMgtBtnMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-customers-80.png"))); // NOI18N
        jLabel2.setText("Manage Customers");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout CustMgtBtnLayout = new javax.swing.GroupLayout(CustMgtBtn);
        CustMgtBtn.setLayout(CustMgtBtnLayout);
        CustMgtBtnLayout.setHorizontalGroup(
            CustMgtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustMgtBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CustMgtBtnLayout.setVerticalGroup(
            CustMgtBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustMgtBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConfPanel.add(CustMgtBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 78, 310, 110));

        BookTickBtn.setBackground(new java.awt.Color(236, 227, 206));
        BookTickBtn.setMaximumSize(new java.awt.Dimension(137, 82));
        BookTickBtn.setMinimumSize(new java.awt.Dimension(137, 82));
        BookTickBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookTickBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BookTickBtnMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-ticket-80.png"))); // NOI18N
        jLabel5.setText("Book Ticket");

        javax.swing.GroupLayout BookTickBtnLayout = new javax.swing.GroupLayout(BookTickBtn);
        BookTickBtn.setLayout(BookTickBtnLayout);
        BookTickBtnLayout.setHorizontalGroup(
            BookTickBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookTickBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        BookTickBtnLayout.setVerticalGroup(
            BookTickBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookTickBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConfPanel.add(BookTickBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 309, 100));

        jPanel1.add(ConfPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 211, 300, 720));

        jDesktopPane.setBackground(new java.awt.Color(79, 111, 82));
        jDesktopPane.setFocusTraversalPolicyProvider(true);
        jDesktopPane.setPreferredSize(new java.awt.Dimension(1020, 700));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 1600, 990));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1891, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMousePressed
        // TODO add your handling code here:
        CustMgtBtn.setBackground(defaultColor);
        HomeBtn.setBackground(clickedColor);
        BookTickBtn.setBackground(defaultColor);
       
       
       
    }//GEN-LAST:event_HomeBtnMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        CustomerMgt custMgt = new CustomerMgt();
        jDesktopPane.removeAll();
        //        jDesktopPane.repaint();
        //        jDesktopPane.revalidate();
        jDesktopPane.add(custMgt).setVisible(true);

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        CustMgtBtn.setBackground(clickedColor);
        HomeBtn.setBackground(defaultColor);
        BookTickBtn.setBackground(defaultColor);
    }//GEN-LAST:event_jLabel2MousePressed

    private void CustMgtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustMgtBtnMouseClicked
        //         TODO add your handling code here:
        CustomerMgt custMgt = new CustomerMgt();
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.revalidate();
        Dimension dm  = jDesktopPane.getSize();
        custMgt.setSize(dm);
        jDesktopPane.add(custMgt).setVisible(true);

    }//GEN-LAST:event_CustMgtBtnMouseClicked

    private void CustMgtBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustMgtBtnMousePressed
        // TODO add your handling code here:
        //     System.out.println("Noooo");
        CustMgtBtn.setBackground(clickedColor);
        HomeBtn.setBackground(defaultColor);
        BookTickBtn.setBackground(defaultColor);

    }//GEN-LAST:event_CustMgtBtnMousePressed

    private void BookTickBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookTickBtnMouseClicked
        // TODO add your handling code here:
        BookTicket bookticket = new BookTicket();
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.revalidate();
        Dimension dm  = jDesktopPane.getSize();
        bookticket.setSize(dm);
        jDesktopPane.add(bookticket).setVisible(true);
    }//GEN-LAST:event_BookTickBtnMouseClicked

    private void BookTickBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookTickBtnMousePressed
        // TODO add your handling code here:
        CustMgtBtn.setBackground(defaultColor);
        HomeBtn.setBackground(defaultColor);
        BookTickBtn.setBackground(clickedColor);

        
    }//GEN-LAST:event_BookTickBtnMousePressed

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        // TODO add your handling code here:
        HomePage homePage = new HomePage();
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.revalidate();
        Dimension dm  = jDesktopPane.getSize();
        homePage.setSize(dm);
        jDesktopPane.add(homePage).setVisible(true);
       
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void logOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseClicked
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Are you sure You want to EXit","Confirm",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(option == JOptionPane.YES_OPTION){

            JOptionPane.showMessageDialog(this, "Thank You for using the System","Good Byee", JOptionPane.INFORMATION_MESSAGE);
            LoginPage loginPage = new LoginPage();
            this.dispose();
            loginPage.setVisible(true);
        }

    }//GEN-LAST:event_logOutBtnMouseClicked

    private void logOutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutBtnMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPage_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage_new().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookTickBtn;
    private javax.swing.JPanel ConfPanel;
    private javax.swing.JPanel CustMgtBtn;
    private javax.swing.JPanel HomeBtn;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel logOutBtn;
    // End of variables declaration//GEN-END:variables
}
