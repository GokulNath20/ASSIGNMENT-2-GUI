
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HotelTick extends javax.swing.JFrame {

   // HotelForm form;
   
    
   
   public HotelTick() {
        initComponents();
        
    }
   
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("How do you select your favourite hotel based on these types :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 460, 40);

        jButton1.setText(">");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(249, 65, 41, 23);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jTextField1.setText("         Rating");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(50, 65, 105, 23);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jTextField2.setText("           Size");
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(50, 171, 105, 23);

        jButton2.setText(">");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(249, 117, 41, 23);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jTextField3.setText("        Location");
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(50, 119, 105, 23);

        jButton3.setText(">");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(249, 171, 41, 23);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Sitka Subheading", 0, 12)); // NOI18N
        jTextField4.setText("    Service Level");
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(50, 225, 105, 23);

        jButton4.setText(">");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(249, 223, 41, 23);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\GUIHOTEL\\Img\\Places-favorites-icon.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 70, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\GUIHOTEL\\Img\\Places-favorites-icon.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 250, 70, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\GUIHOTEL\\Img\\Places-favorites-icon.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 250, 70, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\GUIHOTEL\\Img\\Places-favorites-icon.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 0, 70, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\grayplain.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 110, 280, 183);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\grayplain.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 280, 183);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\grayplain.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 0, 280, 183);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\grayplain.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 110, 280, 183);

        setSize(new java.awt.Dimension(512, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         JOptionPane.showMessageDialog(this,"1.One Star Hotel is a hotel that offers only"+
         "the essentials while still meeting reasonable hygiene and security standards.\n"+
         "2.Two Star Hotel is a hotel that provides the bare essentials with some comfort quality.\n"+
         "3.Three Star Hotel is a hotel that provides average amenities, higher quality service,"+ 
         "physical attributes and design.\n4.Four Star Hotel is a hotel that provides above average, deluxe " +
         "service and experience for the guest.\n5.Five Star Hotel is a hotel that provides a luxury service"+
         " through all its means of operation.");
               
         close();
         RatingFrame rate = new RatingFrame();   
         rate.setVisible(true);
         
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        JOptionPane.showMessageDialog(this,"1.Small hotels with 25 rooms or less.\n"+
        "2.Medium hotel with 26 to 100 rooms.\n3.Large hotel with 300 to 600 rooms.\n"+
        "4.Major or very large hotel with more than 600 rooms.");
        
        close();
        SizeFrame size = new SizeFrame();
        size.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        JOptionPane.showMessageDialog(this,"1.Downtown places are in or towards the "+
        "centre of a largetown or city, where the shops and places of business are.\n"+
        "2.Airport Hotel is a hotel near the airport. The hotel does not have "+
        "to be connected to the airport (although some are) or even adjacent to it; it could be "+
        "located up to five miles away. Most airport hotels have a shuttle to and from the terminals.\n"+
        "3.A resort is a self-contained commercial establishment that tries to "+
        "provide most of a vacationer's wants, such as food, drink, lodging, sports, entertainment."+
        "4.Motels commonly have a one- or two-floor layout and guests access their rooms directly from the parking lot.");
                
                
        close();
        LocationFrame location = new LocationFrame();
        location.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           
        JOptionPane.showMessageDialog(this,"1.Luxury/Upmarket Hotel is considered a hotel "+
        "which provides a luxurious accommodation experience to the guest."+ 
        "There are no set standards (such as stars) for luxury hotels.\n"+
        "2.Mid-market branded hotel is a term used to describe three-and four-star hotels "+
        "that are positioned between five-star and entry-level budget hotels.\n" +
        "Mid-market hotel brands can be easily taken to tier-I and II cities, unlike luxury hotels.\n"+
        "3.Budget hotel is a term used to refer to small hotels, budget hotels with low number " +
        "of rooms and much lower service costs than those invested by corporations and businesses.\n" +
        "The object that budget hotel aimed at is the travelers from the middle class who want to travel economically");
        
    close();
    ServiceLevelFrame service = new ServiceLevelFrame();
    service.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(HotelTick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelTick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelTick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelTick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelTick().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
