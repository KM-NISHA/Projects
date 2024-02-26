
package atm.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JLabel text,image;
    JButton oneHundred,fiveHundred,oneThousand,twoThousand,fiveThousand,tenThousand,back;
    String pinnumber;
    
    
    FastCash(String pinnumber){
       
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text = new JLabel("PLEASE SECLECT WITHDRAWAL AMOUNT");
        text.setBounds(210,300,780,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        image.add(text);
        
        
        oneHundred = new JButton("Rs 100");
        oneHundred.setBounds(160,415,150,30);
        oneHundred.setFont(new Font("system",Font.BOLD,16));
        oneHundred.addActionListener(this);
        image.add(oneHundred);
        
        
        fiveHundred = new JButton("Rs 500");
        fiveHundred.setBounds(340,415,170,30);
        fiveHundred.addActionListener(this);
        fiveHundred.setFont(new Font("system",Font.BOLD,16));
        image.add(fiveHundred);
        
        
        oneThousand = new JButton("Rs 1000");
        oneThousand.setBounds(160,450,150,30);
        oneThousand.addActionListener(this);
        oneThousand.setFont(new Font("system",Font.BOLD,16));
        image.add(oneThousand);
        
        twoThousand = new JButton("Rs 2000");
        twoThousand.setBounds(340,450,170,30);
        twoThousand.addActionListener(this);
        twoThousand.setFont(new Font("system",Font.BOLD,16));
        image.add(twoThousand);
        
        fiveThousand = new JButton("Rs 5000");
        fiveThousand.setBounds(160,485,150,30);
        fiveThousand.addActionListener(this);
        fiveThousand.setFont(new Font("system",Font.BOLD,16));
        image.add(fiveThousand);
        
        
        tenThousand = new JButton("Rs 10000");
        tenThousand.setBounds(340,485,170,30);
        tenThousand.addActionListener(this);
        tenThousand.setFont(new Font("system",Font.BOLD,16));
        image.add(tenThousand);
        
        back = new JButton("Back");
        back.setBounds(340,520,170,30);
        back.addActionListener(this);
        back.setFont(new Font("system",Font.BOLD,16));
        image.add(back);
        
       setSize(900,900);
       setLocation(300, 0);// to remove borders
       setUndecorated(true);
       setVisible(true);
          
    }
    public void actionPerformed(ActionEvent ae){
        try{ 
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn con = new Conn();
            ResultSet rs = con.s.executeQuery("select * from bank where PinNumber= '"+pinnumber+"' ");
            int balance =0;
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                        }
                }String num ="17";
                 if(ae.getSource()!=back && balance < Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null, "Insufficient balance");
                return;
                }
                 
                 if(ae.getSource()== back){
                      setVisible(false);
                      new Transactions(pinnumber).setVisible(true);
            }else{
             Date date = new Date();
             String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'withdrwal', '"+amount+"')";
             con.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs "+amount+" debited successfully");
             
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    
    public static void main(String []args){
        new FastCash("").setVisible(true);
    }
}
