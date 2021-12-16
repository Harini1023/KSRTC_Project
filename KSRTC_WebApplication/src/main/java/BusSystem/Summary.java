package BusSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Summary extends Frame {

    
  
    JLabel l1, l2, l3, l4,
        l5, l6, l7, l8,
        l9, l10, l12, l13,
        l14, l11, l15;
  
    JTextField tf1, tf2, tf3,
        tf4, tf5, tf6,
        tf7, tf8, tf9;
        
  
    JTextArea area2, area1;
  
    JRadioButton rb1, rb2, rb3,
        rb4, rb5, rb6,
        rb7;
  
    JFileChooser f1;
  
    
    Summary()
    {
  
        l1 = new JLabel("TICKET SUMMARY");
        l1.setBounds(250, 100, 250, 20);
        l1.setFont(new Font("Verdana", Font.BOLD, 20));

  
        l2 = new JLabel(
            "First name :");
        l2.setBounds(50, 150, 250, 20);
  
        tf1 = new JTextField();
        tf1.setBounds(250, 150, 250, 20);
  
        l3 = new JLabel(
            "Last name:");
        l3.setBounds(50, 200, 250, 20);
  
        tf2 = new JTextField();
        tf2.setBounds(250, 200, 250, 20);
  
        l4 = new JLabel("AADHAR ID:");
        l4.setBounds(50, 250, 250, 20);
  
        tf3 = new JTextField();
        tf3.setBounds(250, 250, 250, 20);
  
        l5 = new JLabel("Email ID:");
        l5.setBounds(50, 300, 250, 20);
  
        tf4 = new JTextField();
        tf4.setBounds(250, 300, 250, 20);
  
        l6 = new JLabel("Contact Number:");
        l6.setBounds(50, 350, 250, 20);
  
        tf5 = new JTextField();
        tf5.setBounds(250, 350, 250, 20);
  
        l7 = new JLabel("Address:");
        l7.setBounds(50, 400, 250, 20);
  
        area1 = new JTextArea();
        area1.setBounds(250, 400, 250, 90);
  
        l9 = new JLabel("Gender:");
        l9.setBounds(50, 500, 250, 20);
  
        JRadioButton r5
            = new JRadioButton(" Male");
        JRadioButton r6
            = new JRadioButton(" Female");
  
        r5.setBounds(250, 500, 100, 30);
        r6.setBounds(350, 500, 100, 30);
  
        ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);
  
        l10 = new JLabel("Nationality:");
        l10.setBounds(50, 550, 250, 20);
  
        tf6 = new JTextField();
        tf6.setBounds(250, 550, 250, 20);
  
   
        tf8 = new JTextField();
        tf8.setBounds(250, 750, 250, 20);
  
        ImageIcon i2 = new ImageIcon("2.png");
        JLabel l15
            = new JLabel("", i2, JLabel.CENTER);
  
        l15.setBounds(900, 50, 600, 200);
  
     
        l8 = new JLabel(
            "Offers by KSRTC:");
        l8.setBounds(800, 270, 250, 30);
  
        rb1 = new JRadioButton("VACATION PACKAGE");
        rb1.setBounds(550, 150, 200, 30);
  
        rb2 = new JRadioButton("TRAVEL PACKAGE");
        rb2.setBounds(750, 150, 200, 30);;
  
        ButtonGroup bg1 = new ButtonGroup();
  
        bg1.add(rb1);
        bg1.add(rb2);
  
        rb3 = new JRadioButton("ULTIMATE KERALA TOURIST PACKAGE");
        rb3.setBounds(550, 200, 200, 30);
  
        rb4 = new JRadioButton("TEMPLE EXPLORATION PACKAGE");
        rb4.setBounds(750, 200, 320, 30);
  
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);
  
        String languages[]
            = { "COUPON101", "COUPON102", "COUPON103",
                "COUPON104", "COUPON105" };
        final JComboBox cb
            = new JComboBox(languages);
        cb.setBounds(800, 300, 90, 20);
  
        final JLabel label
            = new JLabel();
        label.setBounds(600, 430, 500, 30);
        JButton b = new JButton("Show");
        b.setBounds(650, 300, 80, 30);
  
        final DefaultListModel<String> li1
            = new DefaultListModel<>();
  
      
  
        DefaultListModel<String> li2
            = new DefaultListModel<>();
  
     
        JButton Receipt
            = new JButton("Generate ");
        Receipt.setBounds(550, 390, 140, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(700, 390, 120, 30);
        JButton Print = new JButton("Print");
        Print.setBounds(830, 390, 120, 30);
        JButton Home
            = new JButton("Home Page");
        Home.setBounds(180, 600, 140, 30);
  
        area2 = new JTextArea();
        area2.setBounds(550, 440, 420, 260);
  
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
       
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        
        add(tf8);
        add(area1);
        add(area2);
        add(l15);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(r5);
        add(r6);
        add(cb);
     
        add(label);
        add(Receipt);
        add(b2);
        add(Print);
        add(Home);
  
        Home.addActionListener(new ActionListener() {
  
        
            public void actionPerformed(ActionEvent e)
            {
                WelcomePage wp = new WelcomePage();
                wp.setVisible(true);
                //String data = "";
                /*if (list1.getSelectedIndex() != -1) {
                    data = "You had selected the Group:"
                           + list1.getSelectedValue();
                    label.setText(data);
                }
                if (list2.getSelectedIndex() != -1) {
                    data += " and Hostel with the "
                            + "facility of: ";
            */
                    /* for (Object frame :
                         list2.getSelectedValues()) {
                        data += frame + " ";
                    }*/
                }
                //label.setText(data);
            //}
        });
  
        b2.addActionListener(
            new ActionListener() {
                public void actionPerformed(
                    ActionEvent e)
                {
                    area2.setText("");
                    area1.setText("");
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                    tf6.setText(" ");
                   // tf7.setText(" ");
                }
            });
  
        Print.addActionListener(
            new ActionListener() {
                public void actionPerformed(
                    ActionEvent e)
                {
                    try {
                        area2.print();
                    }
                    catch (java.awt.print
                               .PrinterException a) {
                        System.err.format(
                            "NoPrinter Found",
                            a.getMessage());
                    }
                }
            });

        // Generating the receipt
        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
  
                area2.setText(
                    "--------------------------------"
                    + "-----------KSRTC BUS TICKET----"
                    + "--------------------------"
                    + "--------------------------"
                    + "-------------------\n");
  
                area2.setText(area2.getText()
                              + "First Name: "
                              + tf1.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Last Name: "
                              + tf2.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Aadhar number: "
                              + tf3.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Email ID: "
                              + tf4.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Contact Number: "
                              + tf5.getText()
                              + "\n");
                area2.setText(area2.getText()
                              + "Offers and discounts: "
                              + cb.getSelectedItem()
                                    .toString()
                              + "\n");
  
            
  
                 if (e.getSource() == Receipt) {
                    try {
                        FileWriter fw
                            = new FileWriter(
                                "java.txt", true);
                        fw.write(area2.getText());
                        fw.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
                }
                
                JOptionPane.showMessageDialog(
                    area2, "DATA SAVED SUCCESSFULLY");
                    
                
                    

                    
                    String firstName = tf1.getText();
                    String lastName = tf2.getText();
                    String aadhar = tf3.getText();
                    String emailid = tf4.getText();
                    String contactNumber = tf5.getText();
                    String address=tf6.getText();
                    //String nationality=tf7.getText();
                     
                    //System.out.println(firstName);


                    try {
                        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ksrtc", "postgres", "1408");
                
                        String query = "INSERT INTO TICKETSUMMARY values('" + tf1.getText()+ "','" + tf2.getText()+ "','" + tf3.getText() + "','" +
                            tf4.getText()+ "','" + tf5.getText() + "','" + tf6.getText() +tf8.getText()+ "')";
                
                        Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query);
                        if (x == 0) {
                            JOptionPane.showMessageDialog(Receipt, "This is already exists");
                        } else {
                            JOptionPane.showMessageDialog(Receipt,
                                "Your ticket has been generated, " +  "Enjoy your trip");
                        }
                        
                        System.out.println(x);
                        connection.close();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    
                    }
                    
    
                }
                   


            );


        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(
                    WindowEvent we)
                {
                    System.exit(0);
                }
            });


        setSize(1050, 1050);
        setLayout(null);
        setVisible(true);
        setBackground(new Color(97,212,195));

    }
    public static void main(String[] args)
    {
        new Summary();

    }
}
