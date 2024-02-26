
package atm.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class MiniStatement extends JFrame implements ActionListener {
    
    JButton exit ;
    String pinnumber;
   
    MiniStatement(String pinnumber){
        
        setTitle("Mini Statement");
        this.pinnumber=pinnumber;
        setLayout(null);
        
        JLabel mini = new JLabel();
        mini.setBounds(10,140,400,200);
        //mini.setForeground(Color.WHITE);
        mini.setFont(new Font("system",Font.BOLD,16));
        add(mini);
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,300,20);
        //bank.setForeground(Color.WHITE);
        bank.setFont(new Font("system",Font.BOLD,25));
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        //card.setForeground(Color.WHITE);
        card.setFont(new Font("system",Font.BOLD,16));
        add(card);
        
        JLabel bal = new JLabel();
        bal.setBounds(20,400,420,20);
        //bal.setForeground(Color.WHITE);
        bal.setFont(new Font("system",Font.BOLD,16));
        add(bal);
        
        try{
            Conn con = new Conn();
            
            ResultSet rs  = con.s.executeQuery("select * from login where PinNumber = '"+pinnumber+"' ");
            while(rs.next()){
                card.setText("Card Number: "+ rs.getString("CardNumber").substring(0,4)+"XXXXXXXX"+rs.getString("CardNumber").substring(12));
               
            }
            
        }catch(Exception e){
            System.err.println(e);
            System.err.println("hello");
        }
        
        try{
            Conn con = new Conn();
            int balance =0;
            ResultSet rs =  con.s.executeQuery("select * from bank where PinNumber = '"+pinnumber+"' ");
            while(rs.next()){
                mini.setText(mini.getText()+"<html>" + rs.getString("date")+ 
                      "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                       + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                      }
                
            }
            bal.setText("Your current balance is Rs "+balance);
        }catch(Exception e){
            //
            System.err.println(e);
        }
        
        exit = new JButton("Exit");
        exit.setBounds(20,500,100,25);
        exit.addActionListener(this);
        add(exit);
        
        
       getContentPane().setBackground(Color.WHITE);
      
       setSize(600,600);
       setLocation(300, 0);// to remove borders
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String []args){
        new MiniStatement("").setVisible(true);
    }
}
