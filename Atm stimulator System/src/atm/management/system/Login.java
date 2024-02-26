
package atm.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    JLabel text,cardno,pin;
    
    public Login() {
		setTitle("Automated Teller Machine");
		
                setLayout(null);
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
                Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT );
                ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
                label.setBounds(70,10,100,100);
		add(label);
                
                //1st text
                text = new JLabel("WELCOME TO ATM");
                text.setFont(new Font("osward",Font.BOLD,38));
                text.setBounds(200,40,400,40);
                add(text);
                
                //2nd Text
                cardno = new JLabel("Card No:");
                cardno.setFont(new Font("Raleway",Font.BOLD,28));
                cardno.setBounds(120,150,150,30);
                add(cardno);
                
                //textField1
                cardTextField = new JTextField();
                cardTextField.setBounds(300,150,230,30);
                cardTextField.setFont(new Font("Arial",Font.BOLD,14));
                add(cardTextField);
                
                
                //3rd Txt
                pin = new JLabel("Pin: ");
                pin.setFont(new Font("Raleway",Font.BOLD,28));
                pin.setBounds(120,220,250,30);
                add(pin);
                
                //textField1
                pinTextField = new JPasswordField();
                pinTextField.setBounds(300,220,230,30);
                pinTextField.setFont(new Font("Arial",Font.BOLD,14));
                add(pinTextField);
		
                //signin button 
                login = new JButton("Sign In");
                login.setBounds(300,300,100,30);
                login.setBackground(Color.black);
                login.setForeground(Color.WHITE);
                login.addActionListener(this);//function for clicking 
                add(login);
                
                
                //CLEAR bUTTON
                clear = new JButton("Clear");
                clear.setBounds(430,300,100,30);
                clear.setBackground(Color.black);
                clear.setForeground(Color.WHITE);
                clear.addActionListener(this);
                add(clear);
                
                //Signup bUTTON
                signup = new JButton("Sign Up");
                signup.setBounds(300,350,230,30);
                signup.setBackground(Color.black);
                signup.setForeground(Color.WHITE);
                signup.addActionListener(this);
                add(signup);
                
                getContentPane().setBackground(Color.white);
                
		setSize(800,480);
	       setVisible(true);
	       setLocation(350, 100);
	}
    
    public void actionPerformed(ActionEvent ae){
      try{
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
                    
        }else if(ae.getSource()== login){
            Conn con = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where CardNumber='"+cardnumber+"' and PinNumber='"+pinnumber+"'";
           
               ResultSet rs = con.s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
               }
             }else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            }
             }catch(Exception e){
                System.out.println(e);
            }
        }
    public static void main(String[] args) {
		new Login() ;
		
	}
    
}
