
package atm.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PinChange extends JFrame implements ActionListener {
    
    String pinnumber;
    JPasswordField pin,repin;
    JButton change, back;
    
    PinChange(String pinnumber){
       this.pinnumber=pinnumber;
       setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
       
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(250,280,500,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN:");
        pintext.setBounds(165,320,180,25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("system",Font.BOLD,16));
        image.add(pintext);
        
        pin  = new JPasswordField();
        pin.setFont(new Font("system",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        
        JLabel repintext = new JLabel("Re-Enter PIN:");
        repintext.setBounds(165,360,180,25);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("system",Font.BOLD,16));
        image.add(repintext);
        
        repin  = new JPasswordField();
        repin.setFont(new Font("system",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
        
        change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
       
        setSize(900, 900);
        setLocation(300, 0);// to remove borders
       //setUndecorated(true);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== change){
            try{
            String npin =  pin.getText();
            String rpin = repin.getText(); 

            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered pin is mis-matched");
                return;
                } 
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "PLEASE ENTER NEW PIN");
                return;
            }
            if (rpin.equals("")){
                JOptionPane.showMessageDialog(null, "PLEASE RE-ENTER PIN");
                return;
            }
            
            Conn con = new Conn();
            String query = "update bank set PinNumber = '"+rpin+"' where PinNumber = '"+pinnumber+"' ";
            String query2 = "update login set PinNumber = '"+rpin+"' where PinNumber = '"+pinnumber+"'";
            String query3  = "update account_details set PinNumber = '"+rpin+"' where PinNumber = '"+pinnumber+"'";
            
            con.s.executeUpdate(query);
            con.s.executeUpdate(query2);
            con.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN CHANGED SUCCESSFULLY");
                setVisible(true);
                new Transactions(rpin).setVisible(true);
            
            }catch(Exception e){
            System.err.println(e);
            }
        }else if(ae.getSource()== back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
        
    public static void main(String []args){
        new PinChange("").setVisible(true);
    }
}
