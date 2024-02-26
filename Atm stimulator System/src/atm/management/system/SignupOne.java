
package atm.management.system;

 

import javax.swing.*; //to import frame 
import java.awt.*; //to import color class
import java.util.*; // to import random package
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class SignupOne extends JFrame implements ActionListener{
    
    JTextField nameTextField, fnameTextField, emailTextField ,
            addressTextField,cityTextField, stateTextField,pincodeTextField;
    
    Random ran =  new Random();
    long first4 =  Math.abs((ran.nextLong()%9000L)+1000L);
    String first =""+Math.abs(first4);
    
    
    JButton next;
    JRadioButton male,female,other, married , unmarried;
    JDateChooser datechooser;
    JLabel formno,personalDetails,name,fname,dob,gender,email,marital,address,city,state,pincode;
  
    SignupOne(){
     
    setTitle("NEW ACCOUNT APPLICATION FORM");

     setLayout(null);// to align center
        
     //THIS WILL GENERATE POSITIVE 4-DIGIT RANDOM NUMBER
     formno = new JLabel("APPLICATION FORM NO: "+first);
     formno.setFont(new Font("Raleway",Font.BOLD,38));
     formno.setBounds(140,20,600,40);
     add(formno);
     
     //personal details
     personalDetails = new JLabel("Page 1: Personal Details");
     personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
     personalDetails.setBounds(290,80,400,30);
     add(personalDetails);
     
     //name
     name = new JLabel("Name:");
     name.setFont(new Font("Raleway",Font.BOLD,20));
     name.setBounds(100,140,100,30);
     add(name);
     
     nameTextField = new JTextField();
     nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
     nameTextField.setBounds(300,140,400,30);
     add(nameTextField);
     
     //Fathers name
     fname = new JLabel("Father's Name:");
     fname.setFont(new Font("Raleway",Font.BOLD,20));
     fname.setBounds(100,180,200,30);
     add(fname); 
     
      fnameTextField = new JTextField();
      fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
     fnameTextField.setBounds(300,180,400,30);
     add(fnameTextField);
     
     //Date of birth
     dob = new JLabel("Date of Birth:");
     dob.setFont(new Font("Raleway",Font.BOLD,20));
     dob.setBounds(100,220,200,30);
     add(dob); 
     
     datechooser = new JDateChooser();
     datechooser.setBounds(300,220,400,30);
     datechooser.setForeground(new Color(105,105,105));
     add(datechooser);
     
     //gender
     gender = new JLabel("Gender:");
     gender.setFont(new Font("Raleway",Font.BOLD,20));
     gender.setBounds(100,260,200,30);
     add(gender); 
     
     male = new JRadioButton("Male");
     male.setBounds(300,260,60,30);
     male.setBackground(Color.WHITE);
     add(male);
     
    female = new JRadioButton("Female");
     female.setBounds(450,260,120,30);
     female.setBackground(Color.WHITE);
     add(female);
     
     ButtonGroup gndrGrp = new ButtonGroup();
     gndrGrp.add(male);
     gndrGrp.add(female);
     
     //EMAIL
     email = new JLabel("Email:");
     email.setFont(new Font("Raleway",Font.BOLD,20));
     email.setBounds(100,300,200,30);
     add(email);
     
     emailTextField = new JTextField();
     emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
     emailTextField.setBounds(300,300,400,30);
     add(emailTextField);
     
     //marital status
     marital = new JLabel("Marital Status:");
     marital.setFont(new Font("Raleway",Font.BOLD,20));
     marital.setBounds(100,340,200,30);
     add(marital);
     
     unmarried = new JRadioButton("Unmarried ");
     unmarried.setBounds(300,340,100,30);
     unmarried.setBackground(Color.WHITE);
     add(unmarried);
     
     married = new JRadioButton("Married");
     married.setBounds(450,340,100,30);
     married.setBackground(Color.WHITE);
     add(married);
     
     other = new JRadioButton("Other");
     other.setBounds(630,340,100,30);
     other.setBackground(Color.WHITE);
     add(other);
     
     ButtonGroup maritalGrp = new ButtonGroup();
     maritalGrp.add(unmarried);
     maritalGrp.add(female);
     maritalGrp.add(other);
     //address
     address = new JLabel("Address:");
     address.setFont(new Font("Raleway",Font.BOLD,20));
     address.setBounds(100,380,200,30);
     add(address);
     
     addressTextField = new JTextField();
     addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
     addressTextField.setBounds(300,380,400,30);
     add(addressTextField);
     
     //city
     city = new JLabel("City:");
     city.setFont(new Font("Raleway",Font.BOLD,20));
     city.setBounds(100,420,200,30);
     add(city);
     
     cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
     cityTextField.setBounds(300,420,400,30);
     add(cityTextField);
     
     
     //state
     state = new JLabel("State:");
     state.setFont(new Font("Raleway",Font.BOLD,20));
     state.setBounds(100,460,200,30);
     add(state);
     
     stateTextField = new JTextField();
     stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
     stateTextField.setBounds(300,460,400,30);
     add(stateTextField);
     
     
     //pincode
     pincode = new JLabel("pincode:");
     pincode.setFont(new Font("Raleway",Font.BOLD,20));
     pincode.setBounds(100,500,200,30);
     add(pincode);
     
     pincodeTextField = new JTextField();
     pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
     pincodeTextField.setBounds(300,500,400,30);
     add(pincodeTextField);
     
     //NEXT BUTTON
     next = new JButton("Next");
     next.setForeground(Color.WHITE);
     next.setBackground(Color.BLACK);
     next.setFont(new Font("Raleway",Font.BOLD,14));
     next.setBounds(620,550,80,20);
     next.addActionListener(this);
     add(next);
     
     getContentPane().setBackground(Color.WHITE);// to set background color of frame
     
        
      //to create frame
      
     setSize(850,800);
     setVisible(true);
     setLocation(350,30);
     
}
   public void actionPerformed(ActionEvent ae){
    
       String sformno = first;
       String sname = nameTextField.getText();
       String sfname = fnameTextField.getText();
       String sdob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
       String sgender = null;
       if(male.isSelected()){
           sgender = "Male";
       }else if(female.isSelected()){
           sgender = "Female";
       }
       
       String semail =  emailTextField.getText();
       String marital = null;
       if(married.isSelected()){
           marital = "Married";
       }else if(unmarried.isSelected()){
           marital = "Unmarried";
       }else if(other.isSelected()){
           marital = "Other";
       }
       String saddress = addressTextField.getText();
       String scity = cityTextField.getText();
       String sstate = stateTextField.getText();
       String spincode = pincodeTextField.getText();
       
       
       try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null, "Fill all the required fields");
           }else {
               Conn c =  new Conn();
               String query ="Insert into Signup values ('"+sformno+"','"+sname+"','"+sfname+"','"+sdob+"','"+sgender+"','"+semail+"','"+marital+"','"+saddress+"','"+scity+"','"+sstate+"','"+spincode+"')";
               c.s.executeUpdate(query);
               
               new Signup2(first).setVisible(true);
               setVisible(false);  
           }
           
       }catch(Exception e){
          e.printStackTrace();
       }
    }
    
   public static void main(String args[]){
        new SignupOne().setVisible(true);
   }   
}
