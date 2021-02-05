
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meetm
 */
public class barter_ground extends javax.swing.JFrame {

    /**
     * Creates new form barter_ground
     */
    public barter_ground()  {
        initComponents();
        uNameTransfer t = new uNameTransfer();     
        try {
            create_info_panels(t.getUName());
        } catch (SQLException ex) {
            Logger.getLogger(barter_ground.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    
public void create_info_panels(String a){
int i=0;
// ********************************* CONNECTING TO DATABASE ******************************************************
try{
mysqlConnector my = new mysqlConnector();
ResultSet rowInfo = my.getResultSetFor("SELECT * FROM stockdetails;");

while(rowInfo.next()){
 // ******************************** DECLARING VARIABLES **********************************************
JPanel infoPane=new JPanel();                
JLabel bkPic_lb=new JLabel();
JLabel bkNmLb=new JLabel();
JLabel bkNmInfo=new JLabel();
JLabel bkAuthLb=new JLabel();
JLabel bkAuthInfo=new JLabel();
JLabel RSXInfo=new JLabel();
JLabel RSXValueLb=new JLabel();
JLabel RSXValueInfo=new JLabel();
JLabel usrNmLb=new JLabel();
JLabel usrNmInfo=new JLabel();
JButton bidBtn=new JButton();
// ******************************** SETTING THE COMPONENTS INTO THEIR RESPECTIVE LOCATION WITH DATA FROM TABLE ************************************        
infoPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
infoPane.setMinimumSize(new java.awt.Dimension(1107, 111));
infoPane.setLayout(null);
        
        bkPic_lb.setText("PICTURE"); 
        bkPic_lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoPane.add(bkPic_lb);
        bkPic_lb.setBounds(21, 12, 96, 84);

        bkNmLb.setText("BOOK NAME:");
        bkNmLb.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        infoPane.add(bkNmLb);
        bkNmLb.setBounds(230, 10, 130, 25);

        bkNmInfo.setText(rowInfo.getString("bkNm"));
        bkNmInfo.setFont(new java.awt.Font("Trebuchet MS",0,18));
        infoPane.add(bkNmInfo);
        bkNmInfo.setBounds(360, 10, 220, 30);

        bkAuthLb.setText("AUTHOR:");
        bkAuthLb.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        infoPane.add(bkAuthLb);
        bkAuthLb.setBounds(260, 60, 80, 30);

        bkAuthInfo.setText(rowInfo.getString("bkAuth"));
        bkAuthInfo.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        infoPane.add(bkAuthInfo);
        bkAuthInfo.setBounds(360, 60, 220, 30);           

        usrNmLb.setText("SELLER :");
        usrNmLb.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        infoPane.add(usrNmLb);
        usrNmLb.setBounds(630, 60, 120, 30);

        usrNmInfo.setText(rowInfo.getString("usrNm"));
        usrNmInfo.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        infoPane.add(usrNmInfo);
        usrNmInfo.setBounds(780, 60, 150, 30);
        
        switch(rowInfo.getString("RSX")){
            case "R":bidBtn.setText("BID");  RSXValueLb.setText("Charge/Day");  RSXInfo.setText("R"); RSXValueInfo.setText(rowInfo.getString("RSXValue"));break;
            case "S":bidBtn.setText("BUY");   RSXValueLb.setText("Price");  RSXInfo.setText("S");RSXValueInfo.setText(rowInfo.getString("RSXValue"));break;
            case "X": bidBtn.setText("Xchange"); RSXInfo.setText("X");break;
        }
        
        RSXInfo.setFont(new java.awt.Font("Trebuchet MS",0,24));
        infoPane.add(RSXInfo);
        RSXInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RSXInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RSXInfo.setBounds(161, 12, 40, 84);
               
        RSXValueLb.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        infoPane.add(RSXValueLb);
        RSXValueLb.setBounds(630, 10, 120, 30);       
        
        RSXValueInfo.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        infoPane.add(RSXValueInfo);
        RSXValueInfo.setBounds(780, 10, 150, 30);
        
        bidBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        infoPane.add(bidBtn);
        bidBtn.setBounds(1000, 20, 80, 70);               
        
        uName.setText(a);
        // Button action listener *********************************************************
        String r = rowInfo.getString("stockID");
        bidBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    my.setSQLUpdate("insert into bkbids values ('"+r+"','"+usrNmInfo.getText()+"','"+a+"')");
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                bidBtn.setVisible(false);
            }
        });
        

       main_panel.add(infoPane);
       if (i>=120*5)
       main_panel.setPreferredSize(new java.awt.Dimension(1129, 610+(i-(120*4))));
       
       infoPane.setBounds(11, 12+i, 1107, 111);
        
       i+=120;       
}
}
catch (Exception e){
System.out.println(e);
}

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        main_panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BARTER");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Pics/logo.jpg")));
        setMinimumSize(new java.awt.Dimension(1440, 860));
        setPreferredSize(new java.awt.Dimension(1440, 860));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME !");

        uName.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        uName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uName.setText("GUEST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1108, 11, 257, 131);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel4.setText("BARTER _____________________________");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(32, 11, 999, 57);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 172, 223, 600);

        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1129, 610));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1129, 610));

        main_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        main_panel.setMinimumSize(new java.awt.Dimension(1129, 600));
        main_panel.setPreferredSize(new java.awt.Dimension(1129, 610));
        main_panel.setLayout(null);
        jScrollPane1.setViewportView(main_panel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 170, 1150, 610);

        jMenuBar1.setMargin(new java.awt.Insets(0, 1170, 0, 0));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(55, 30));

        jMenu6.setText("SELLER'S ZONE   ");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem1.setText("Sell/Rent/Exchange");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem2.setText("Your Books");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

        jMenu1.setText("ACCOUNT");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem3.setText("Your Bids");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem4.setText("Inbox");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem5.setText("Sent Mail");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem6.setText("Compose");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem9.setText("Account Settings");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jMenuItem8.setText("Log Out");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        sell_books g = new sell_books();
        g.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        sellers_books g = new sellers_books();
        g.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        your_bids g = new your_bids();
        g.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Inbox g = new Inbox();
        g.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Sent g = new Sent();
        g.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Compose g = new Compose();
        g.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        WelcomeScreen g = new WelcomeScreen();
        g.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
account_settings g = new account_settings();
        g.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(barter_ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barter_ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barter_ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barter_ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barter_ground().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel uName;
    // End of variables declaration//GEN-END:variables
}
