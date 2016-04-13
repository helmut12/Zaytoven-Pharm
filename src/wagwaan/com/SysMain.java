/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagwaan.com;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import wagwaan.setup.UserRegIntfr;
import wagwaan.setup.DepartmentsIntfr;
import wagwaan.config.ConnectionDB;
import wagwaan.setup.StockItemsRegIntfr;
import wagwaan.stocks.StockIssuingIntfr;
import wagwaan.stocks.OrdersPanel;
import wagwaan.stocks.OrdersIntfr;
import wagwaan.setup.SuppliersIntfr;
import wagwaan.stocks.StockReceivingIntfr;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import wagwaan.config.SQLHelper;
import wagwaan.ops.PasswordResetting;
import wagwaan.stocks.StockRequestIntfr;

/**
 *
 * @author maurice
 */
public class SysMain extends javax.swing.JFrame {
private  Connection connectDB;
private String h_name;
private final Image backImage = new ImageIcon(this.getClass().getResource("/wagwaan/img/new.png")).getImage();


    /**
     * Creates new form SysMain
     */
    public SysMain() {
        connectDB =ConnectionDB.getInstance().getCon();
        initComponents();
    

    }


	
        public void paintComponent( Graphics g )
        {
           if(backImage == null){
           super.paintComponents(g);
           }
              
           else
           {
              Graphics2D g2d = (Graphics2D)g;

              //scale the image to fit the size of the Panel
              double mw = backImage.getWidth(jDesktopPane1);
              double mh = backImage.getHeight(jDesktopPane1);

              double sw = getWidth() / mw;
              double sh = getHeight() / mh;

              g2d.scale(sw, sh);
              g2d.drawImage(backImage, (int)mw, (int) mh, this);
           }
        }    
        public String headerName(){
        String name=null;
    try {
        ResultSet rs=SQLHelper.getResultset(connectDB, "select header_name from pb_header");
        while(rs.next()){
            name=rs.getString(1);
        }
    } catch (SQLException ex) {
        Logger.getLogger(SysMain.class.getName()).log(Level.SEVERE, null, ex);
    }
        return name;
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        deptitm = new javax.swing.JMenuItem();
        supplieritm = new javax.swing.JMenuItem();
        usrmgritm = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        stockregitm = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ordersitm = new javax.swing.JMenuItem();
        stockreqitm = new javax.swing.JMenuItem();
        stockreceivingitm = new javax.swing.JMenuItem();
        stockissuingitm = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        updatingdomsitm = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        ordersrptitm = new javax.swing.JMenuItem();
        stockreceivingrptitm = new javax.swing.JMenuItem();
        stockreqrptitm = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(headerName()
        );
        setIconImage(new ImageIcon(getClass().getResource("/wagwaan/img/new.png")).getImage());
        setName("MainFRM"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jDesktopPane1, gridBagConstraints);

        jMenuBar1.setForeground(new java.awt.Color(102, 102, 255));

        jMenu1.setText("SET UP");

        deptitm.setText("Departments");
        deptitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptitmActionPerformed(evt);
            }
        });
        jMenu1.add(deptitm);

        supplieritm.setText("Suppliers");
        supplieritm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplieritmActionPerformed(evt);
            }
        });
        jMenu1.add(supplieritm);

        usrmgritm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usrmgritm.setText("User Manager");
        usrmgritm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrmgritmActionPerformed(evt);
            }
        });
        jMenu1.add(usrmgritm);

        jMenuItem9.setText("Password Resetting");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        stockregitm.setText("Stock Items Registration");
        stockregitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockregitmActionPerformed(evt);
            }
        });
        jMenu1.add(stockregitm);

        jMenuItem8.setText("Suspending Suppliers");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem10.setText("Exit");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("OPERATIONS");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        ordersitm.setText("Orders");
        ordersitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersitmActionPerformed(evt);
            }
        });
        jMenu2.add(ordersitm);

        stockreqitm.setText("Stocks Requisition");
        stockreqitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockreqitmActionPerformed(evt);
            }
        });
        jMenu2.add(stockreqitm);

        stockreceivingitm.setText("Stock Receiving");
        stockreceivingitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockreceivingitmActionPerformed(evt);
            }
        });
        jMenu2.add(stockreceivingitm);

        stockissuingitm.setText("Stock Issuing");
        stockissuingitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockissuingitmActionPerformed(evt);
            }
        });
        jMenu2.add(stockissuingitm);

        jMenuItem1.setText("External Payments");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("UTILITIES");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        updatingdomsitm.setText("Updating Roles & Domains");
        updatingdomsitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatingdomsitmActionPerformed(evt);
            }
        });
        jMenu5.add(updatingdomsitm);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("REPORTS");
        jMenu3.add(jSeparator1);

        jMenuItem3.setText("Staff Register");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        ordersrptitm.setText("Ordered Items by Order No.");
        ordersrptitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersrptitmActionPerformed(evt);
            }
        });
        jMenu3.add(ordersrptitm);

        stockreceivingrptitm.setText("Stock Receiving By receiving No.");
        stockreceivingrptitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockreceivingrptitmActionPerformed(evt);
            }
        });
        jMenu3.add(stockreceivingrptitm);

        stockreqrptitm.setText("Stock Requisition");
        stockreqrptitm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockreqrptitmActionPerformed(evt);
            }
        });
        jMenu3.add(stockreqrptitm);

        jMenu6.setText("External Payments (Suppliers)");

        jMenuItem2.setText("Payment per Supplier");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenu3.add(jMenu6);

        jMenu8.setText("Suppliers");

        jMenuItem11.setText("Active Suppliers");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuItem12.setText("BlackListed Suppliers");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem12);

        jMenu3.add(jMenu8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("LEGIT INFORMATION SYSTEMS");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        int exit=JOptionPane.showConfirmDialog(null, "Are you sure you really want to exit?","Caution before Closing!!", JOptionPane.YES_NO_CANCEL_OPTION);
        if(exit==JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int exit=JOptionPane.showConfirmDialog(null, "Are you sure you really want to exit?","Caution before Closing!!", JOptionPane.YES_NO_CANCEL_OPTION);
        if(exit==JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void deptitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptitmActionPerformed
        DepartmentsIntfr d=new DepartmentsIntfr();
        jDesktopPane1.add(d);
        d.setSize(426, 177);
        d.setVisible(true);
    }//GEN-LAST:event_deptitmActionPerformed

    private void supplieritmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplieritmActionPerformed
        SuppliersIntfr sup=new SuppliersIntfr();
        jDesktopPane1.add(sup);
        sup.setSize(737, 374);
        sup.setVisible(true);
    }//GEN-LAST:event_supplieritmActionPerformed

    private void usrmgritmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrmgritmActionPerformed
        UserRegIntfr u=new UserRegIntfr();
        jDesktopPane1.add(u);
        u.setSize(456, 270);
        u.setVisible(true);
        
    }//GEN-LAST:event_usrmgritmActionPerformed

    private void stockregitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockregitmActionPerformed
        StockItemsRegIntfr st=new StockItemsRegIntfr();
        jDesktopPane1.add(st);
        st.setSize(800, 500);
        st.setVisible(true);
    }//GEN-LAST:event_stockregitmActionPerformed

    private void stockreceivingitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockreceivingitmActionPerformed
        StockReceivingIntfr st=new StockReceivingIntfr();
        jDesktopPane1.add(st);
        st.setSize(747, 500);
        st.setVisible(true);
    }//GEN-LAST:event_stockreceivingitmActionPerformed

    private void stockissuingitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockissuingitmActionPerformed
        StockIssuingIntfr st=new StockIssuingIntfr();
        jDesktopPane1.add(st);
        st.setSize(747, 500);
        st.setVisible(true);
    }//GEN-LAST:event_stockissuingitmActionPerformed

    private void ordersitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersitmActionPerformed
        OrdersIntfr o=new OrdersIntfr();
        jDesktopPane1.add(o);
        o.setSize(747, 500);
        o.setVisible(true);
    }//GEN-LAST:event_ordersitmActionPerformed

    private void ordersrptitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersrptitmActionPerformed
        OrdersPanel orders=new OrdersPanel(new javax.swing.JFrame(), true);
                orders.setVisible(true);
    }//GEN-LAST:event_ordersrptitmActionPerformed

    private void stockreceivingrptitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockreceivingrptitmActionPerformed
        ReceivingPanel st=new ReceivingPanel(new javax.swing.JFrame(), true);
        st.setVisible(true);
    }//GEN-LAST:event_stockreceivingrptitmActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void stockreqitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockreqitmActionPerformed
        StockRequestIntfr stock=new StockRequestIntfr();
        jDesktopPane1.add(stock);
        stock.setSize(800, 500);
        stock.setVisible(true);
    }//GEN-LAST:event_stockreqitmActionPerformed

    private void stockreqrptitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockreqrptitmActionPerformed
        RequestingPanel r=new RequestingPanel(new javax.swing.JFrame(), true);
        r.setVisible(true);
    }//GEN-LAST:event_stockreqrptitmActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void updatingdomsitmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatingdomsitmActionPerformed
        /*
                java.lang.Class classMain = null;
                String role_no=null;
                try {
                      classMain = java.lang.Class.forName("wagwaan.SysMain");
                      } catch (ClassNotFoundException ex) {
                            Logger.getLogger(SysMain.class.getName()).log(Level.SEVERE, null, ex);
                            }*/
            /*
                disMenuItems = (javax.swing.JMenuItem) fieldsArray1.get(this);
                            
                                ResultSet rs=SQLHelper.getResultset(connectDB, "select RL || nextval('role_no_seq')");
                                while(rs.next()){
                                    role_no=rs.getString(1);
                                }
                                java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into user_roles values(?, ?, ?)");
                                System.out.println("Ready to insert menu items");
                                pstmt.setString(1, role_no);
                                pstmt.setString(2, fieldsArray1.getName());
                                pstmt.setString(3, disMenuItems.getText());
                                pstmt.executeUpdate();
           
                    java.lang.reflect.Field[] fieldsArray = classMain.getDeclaredFields();
                    for (Field fieldsArray1 : fieldsArray) {
                        if (fieldsArray1.getName().endsWith("itm")) {
                            try {
                                connectDB.setAutoCommit(false);
                                javax.swing.JMenuItem disMenuItems=(javax.swing.JMenuItem) fieldsArray1.get(this);
                                 ResultSet rs=SQLHelper.getResultset(connectDB, "select RL || nextval('role_no_seq')");
                                while(rs.next()){
                                    role_no=rs.getString(1);
                                }
                                java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into user_roles values(?, ?, ?)");
                                System.out.println("Ready to insert menu items");
                                pstmt.setString(1, role_no);
                                pstmt.setString(2, fieldsArray1.getName());
                                pstmt.setString(3, disMenuItems.getText());
                                pstmt.executeUpdate();
                            
                            } catch (SQLException ex) {
                                Logger.getLogger(SysMain.class.getName()).log(Level.SEVERE, null, ex);
                            }
                             catch (IllegalArgumentException | IllegalAccessException ex) {
                                Logger.getLogger(SysMain.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                
                                } 
                    }
                            try {
                                connectDB.commit();
                                connectDB.setAutoCommit(true);
                                
                            } catch (SQLException ex) {
                                Logger.getLogger(SysMain.class.getName()).log(Level.SEVERE, null, ex);
                                            try {
                                                connectDB.rollback();
                                            } catch (SQLException ex1) {
                                                Logger.getLogger(SysMain.class.getName()).log(Level.SEVERE, null, ex1);
                                            }
                            }
                     
                                 */
    }//GEN-LAST:event_updatingdomsitmActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        wagwaan.accounts.ExternalPaymentsIntfr ex=new wagwaan.accounts.ExternalPaymentsIntfr();
        jDesktopPane1.add(ex);
        ex.setSize(800, 600);
        ex.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        wagwaan.com.ExternalPaymentDlg e=new wagwaan.com.ExternalPaymentDlg(new javax.swing.JFrame(), true);
        e.setSize(400, 250);
        e.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        wagwaan.ops.SuspendingSuppliersIntfr s=new wagwaan.ops.SuspendingSuppliersIntfr();
        jDesktopPane1.add(s);
        s.setSize(400, 250);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        PasswordResetting p=new PasswordResetting();
        jDesktopPane1.add(p);
        p.setSize(450, 300);
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        wagwaan.reports.ActiveSuppliersPdf a=new wagwaan.reports.ActiveSuppliersPdf();
        a.ActiveSuppliersPdf(connectDB);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        wagwaan.reports.BlackListedSuppPdf b=new wagwaan.reports.BlackListedSuppPdf();
        b.BlackListedSuppPdf(connectDB);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        wagwaan.com.StaffRegDates reg=new wagwaan.com.StaffRegDates(new javax.swing.JFrame(), true);
        reg.setSize(400, 200);
        reg.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem deptitm;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem ordersitm;
    private javax.swing.JMenuItem ordersrptitm;
    private javax.swing.JMenuItem stockissuingitm;
    private javax.swing.JMenuItem stockreceivingitm;
    private javax.swing.JMenuItem stockreceivingrptitm;
    private javax.swing.JMenuItem stockregitm;
    private javax.swing.JMenuItem stockreqitm;
    private javax.swing.JMenuItem stockreqrptitm;
    private javax.swing.JMenuItem supplieritm;
    private javax.swing.JMenuItem updatingdomsitm;
    private javax.swing.JMenuItem usrmgritm;
    // End of variables declaration//GEN-END:variables
}