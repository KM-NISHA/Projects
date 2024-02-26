
package atm.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;


public class Signup3 extends JFrame implements ActionListener {
    
    JLabel head,accType,cardNo,number,cardDetails,pin,pinno,pinDetails,service;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno ;
    
    
    Signup3(String formno){
        this.formno=formno;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        head = new JLabel("Page 3: Account Details");
        head.setFont(new Font("Raleway",Font.BOLD,22));
        head.setBounds(280,40,400,40);
        add(head);
        
       //Account type
        accType = new JLabel("Account Type");
        accType.setFont(new Font("Raleway",Font.BOLD,20));
        accType.setBounds(100,100,200,30);
        add(accType);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        r1.setBackground(Color.white);
        r1.setBounds(100,140,250,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        r2.setBackground(Color.white);
        r2.setBounds(350,140,250,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,15));
        r3.setBackground(Color.white);
        r3.setBounds(100,180,250,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,15));
        r4.setBackground(Color.white);
        r4.setBounds(350,180,250,20);
        add(r4);
        
        ButtonGroup grpAcc = new ButtonGroup();
        grpAcc.add(r1);
        grpAcc.add(r2);
        grpAcc.add(r3);
        grpAcc.add(r4);
        
        
        //Card NUMBER 
        cardNo = new JLabel("Card Number:");
        cardNo.setFont(new Font("Raleway",Font.BOLD,20));
        cardNo.setBounds(100,230,250,30);
        add(cardNo);
        
        number = new JLabel("XXXX-XXXX - 4186");
        number.setFont(new Font("Raleway",Font.BOLD,20));
        number.setBounds(330,230,250,30);
        add(number);
        
        cardDetails = new JLabel("Your 16 Digit Number");
        cardDetails.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetails.setBounds(100,260,200,20);
        add(cardDetails);
        
        //PIN NUMBER 
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,300,250,30);
        add(pin);
        
        pinno = new JLabel("XXXX");
        pinno.setFont(new Font("Raleway",Font.BOLD,20));
        pinno.setBounds(330,300,250,30);
        add(pinno);
        
        pinDetails = new JLabel("Your 4 Digit pin");
        pinDetails.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetails.setBounds(100,330,200,20);
        add(pinDetails);
        
        //Services Required
        service = new JLabel("Services Required:");
        service.setFont(new Font("Raleway",Font.BOLD,20));
        service.setBounds(100,370,250,30);
        add(service);
        
        
        //checkboxes
        c1 =new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,410,200,30);
        add(c1);
        
        c2 =new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,410,200,30);
        add(c2);
        
        c3 =new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,450,200,30);
        add(c3);
        
        
        c4 =new JCheckBox("Eamil & SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,450,200,30);
        add(c4);
        
        c5 =new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,490,200,30);
        add(c5);
        
        c6 =new JCheckBox("E Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,490,200,30);
        add(c6);
        
        c7 =new JCheckBox("I herby Declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,540,650,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(150, 590, 150, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420, 590, 150, 30);
        cancel.addActionListener(this);
        add(cancel);
                
     getContentPane().setBackground(Color.WHITE);
     setSize(850,800);
     setVisible(true);
     setLocation(350,30);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType="Current Account";
            }else if(r3.isSelected()){
                accountType="Recurring Deposite";
            }
            
            Random random = new Random();
            long first7 =(random.nextLong()%90000000L)+5040936000000000L;
            String cardNumber = ""+ Math.abs(first7);
            
            long first3 =(random.nextLong()%9000L)+1000L;
            String pinNumber =""+ Math.abs(first3);  
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility + " ATM Card ";
            }else if(c2.isSelected()){
                facility = facility + " Internet Banking ";
            }else if(c3.isSelected()){
                facility = facility + " Mobile Banking ";
            }else if(c4.isSelected()){
                facility = facility + " Email & SMS Alerts ";
            }else if(c5.isSelected()){
                facility = facility + " Cheque book ";
            }else if(c6.isSelected()){
                facility = facility + " E statement ";
            }
            try{
                if(ae.getSource()==submit){
                    
                if(accType.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn con = new Conn();                                  
                    String Query1 = "insert into account_details values('"+formno+"','"+accType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
                    String Query2 = "insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";
                    con.s.executeUpdate(Query1);
                    con.s.executeUpdate(Query2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardNumber+ " & "+" Pin Number: "+pinNumber);
                    
                    new Deposit(pinNumber).setVisible(true);
                    setVisible(false);
                }
                }else if(ae.getSource()==cancel){
                    System.exit(0);
                }
                
            }catch(Exception e){
               e.printStackTrace();
            }   
        }
    }
    public static void main(String []args){
        new Signup3("").setVisible(true);
    }
}
