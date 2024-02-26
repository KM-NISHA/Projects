
package atm.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Transactions extends JFrame implements ActionListener{
    
    JLabel text;
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balncenquiry,exit;
    String pinnumber;
    
    
    Transactions(String pinnumber){
       
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text = new JLabel("Please select your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        image.add(text);
        
        
        //Deposit button
        deposit = new JButton("Deposit");
        deposit.setBounds(160,415,150,30);
        deposit.setFont(new Font("system",Font.BOLD,16));
        deposit.addActionListener(this);
        image.add(deposit);
        
        //cash withdrawl
        withdrawl = new JButton("Cash Withdrawal");
        withdrawl.setBounds(340,415,170,30);
        withdrawl.addActionListener(this);
        withdrawl.setFont(new Font("system",Font.BOLD,16));
        image.add(withdrawl);
        
        
        fastcash = new JButton("Fast cash");
        fastcash.setBounds(160,450,150,30);
        fastcash.addActionListener(this);
        fastcash.setFont(new Font("system",Font.BOLD,16));
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(340,450,170,30);
        ministatement.addActionListener(this);
        ministatement.setFont(new Font("system",Font.BOLD,16));
        image.add(ministatement);
        
        pinchange = new JButton("Pin change");
        pinchange.setBounds(160,485,150,30);
        pinchange.addActionListener(this);
        pinchange.setFont(new Font("system",Font.BOLD,16));
        image.add(pinchange);
        
        
        balncenquiry = new JButton("Balance Enquiry");
        balncenquiry.setBounds(340,485,170,30);
        balncenquiry.addActionListener(this);
        balncenquiry.setFont(new Font("system",Font.BOLD,16));
        image.add(balncenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(340,520,170,30);
        exit.addActionListener(this);
        exit.setFont(new Font("system",Font.BOLD,16));
        image.add(exit);
        
       setSize(900,900);
       setLocation(300, 0);// to remove borders
       setUndecorated(true);
       setVisible(true);
        
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit){
            System.exit(0);
        }else if(ae.getSource()== deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if (ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawal(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()== pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()== balncenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()== ministatement){
            //setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String []args){
        new Transactions("").setVisible(true);
    }
}
