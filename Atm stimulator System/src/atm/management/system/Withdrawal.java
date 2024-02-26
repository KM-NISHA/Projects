
package atm.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;



public class Withdrawal extends JFrame implements ActionListener {
    JTextField amount;
    JButton withdrwl,back;
    String pinnumber;
    JLabel text1,text2;
    
   Withdrawal(String pinnumber){
       
       this.pinnumber = pinnumber;
       setLayout(null);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
       Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(0, 0, 900, 900);
       add(image);
       
       text2 = new JLabel("MAXIMUM WITHDRAWAL IS RS 10,000");
       text2.setForeground(Color.WHITE);
       text2.setFont(new Font("Raleway",Font.BOLD,16));
       text2.setBounds(170, 300, 400, 20);
       image.add(text2);
       
       
       text1 = new JLabel("Please Enter your amount");
       text1.setForeground(Color.WHITE);
       text1.setFont(new Font("Raleway",Font.BOLD,16));
       text1.setBounds(170, 350, 320, 25);
       image.add(text1);
       
       amount = new JTextField();
       amount.setFont(new Font("Raleway",Font.BOLD,22));
       amount.setBounds(170, 390, 330, 30);
       image.add(amount);
       
       withdrwl =  new JButton("Withdrawal");
       withdrwl.setBounds(350, 470,150,35);
       withdrwl.addActionListener(this);
       image.add(withdrwl);
       
       back =  new JButton("Back");
       back.setBounds(350, 510,150,35);
       back.addActionListener(this);
       image.add(back);
       
       setSize(900,900);
       setLocation(300, 0);
       setVisible(true);
   }
   public void actionPerformed(ActionEvent ae){
       try{
          String number =  amount.getText();
           Date date = new Date(); 
           if(ae.getSource()==withdrwl){
           if(number.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
           }else{
               Conn con = new Conn();
               ResultSet rs  = con.s.executeQuery("select * from bank where PinNumber  = '"+pinnumber+"'");
               int balance =0;
               while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                           balance += Integer.parseInt(rs.getString("amount"));
               }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                }
               }
               if(balance <Integer.parseInt(number)){
                   JOptionPane.showMessageDialog(null, "Insufficient balance ");
                   return;
               }
               con.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+number+"')");
               JOptionPane.showMessageDialog(null, "Rs "+number+ "Debited Successfully");
               
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
           }
           }else if (ae.getSource()==back){
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
           }
           }catch(Exception e){
             e.printStackTrace();
           }
   }
   
   public static void main(String []args){
       new Withdrawal("").setVisible(true);
   }
}
