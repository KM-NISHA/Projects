
package atm.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Signup2 extends JFrame implements ActionListener {
    
    JLabel additionlDetails,religion,category,income,education,quali,occupation,panNo,aadhrno,snrCitizen,exAcc;
    JButton next;
    JRadioButton seniorYes,seniorNo, existsYes, existsNo;
    JComboBox relign,categry,incm,educQual,occup;
    JTextField panTextField,aadharTextField;
    String formno;
    
    
    Signup2(String formno){
     
     this.formno= formno;   
     setLayout(null);
     setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
     Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel l14 = new JLabel(i3);
     l14.setBounds(150, 0, 100, 100);
        add(l14);
     
     //personal details
     additionlDetails = new JLabel("Page 2: Additional Details");
     additionlDetails.setFont(new Font("Raleway",Font.BOLD,22));
     additionlDetails.setBounds(290,80,400,30);
     add(additionlDetails);
     
     //Religion
     religion = new JLabel("Religion:");
     religion.setFont(new Font("Raleway",Font.BOLD,20));
     religion.setBounds(100,140,100,30);
     add(religion);
     
     String valRelign[] = {"Select","Hindu", "Muslim","Sikh","Christian","Other"};
      relign = new JComboBox(valRelign);
      relign.setBounds(300,140,400,30);
      relign.setBackground(Color.white);
     add(relign);
     
   
     //Category
     category = new JLabel("Category:");
     category.setFont(new Font("Raleway",Font.BOLD,20));
     category.setBounds(100,180,200,30);
     add(category); 
     
     String valCategry[] = {"Select","General", "OBC","SC","ST","Other"};
     categry = new JComboBox(valCategry);
     categry.setFont(new Font("Raleway",Font.BOLD,14));
     categry.setBounds(300,180,400,30);
     categry.setBackground(Color.white);
     add(categry);
     
     //Date of birth
     income = new JLabel("Income:");
     income.setFont(new Font("Raleway",Font.BOLD,20));
     income.setBounds(100,220,200,30);
     add(income); 
     
     String valincm[] = {"Select","Null", "less than 1.5 lakh","less than 2.5 lakh","less than 5 lakh","upto 10 lakh"};
     incm = new JComboBox(valincm);
     incm.setFont(new Font("Raleway",Font.BOLD,14));
     incm.setBounds(300,220,400,30);
     incm.setBackground(Color.white);
     add(incm);
     
   
     //Educational Qualification
     education = new JLabel("Eductional");
     education.setFont(new Font("Raleway",Font.BOLD,20));
     education.setBounds(100,260,200,30);
     add(education); 
    
     quali = new JLabel("Qualification:");
     quali.setFont(new Font("Raleway",Font.BOLD,20));
     quali.setBounds(100,290,200,30);
     add(quali);
     
     String educValues[] = {"Select","Non- Graduate", "Graduate","Post- Graduate","Doctrate","others"};
     educQual = new JComboBox(educValues);
     educQual.setFont(new Font("Raleway",Font.BOLD,14));
     educQual.setBounds(300,275,400,30);
     add(educQual);
     
     //Occupation
     occupation = new JLabel("Occupation:");
     occupation.setFont(new Font("Raleway",Font.BOLD,20));
     occupation.setBounds(100,340,200,30);
     add(occupation);
     
     String occupValues[] = {"Select","Salaried", "Self-Employed","Business","Student","Retired","others"};
     occup = new JComboBox(occupValues);
     occup.setBounds(300,340,400,30);
     occup.setBackground(Color.WHITE);
     add(occup);
     
     
     //PAN NO
     panNo = new JLabel("PAN No:");
     panNo.setFont(new Font("Raleway",Font.BOLD,20));
     panNo.setBounds(100,380,200,30);
     add(panNo);
     
     panTextField = new JTextField();
     panTextField.setFont(new Font("Raleway",Font.BOLD,14));
     panTextField.setBounds(300,380,400,30);
     add(panTextField);
     
     //AADHAR NO
     aadhrno = new JLabel("Aadhar Number:");
     aadhrno.setFont(new Font("Raleway",Font.BOLD,20));
     aadhrno.setBounds(100,420,200,30);
     add(aadhrno);
     
     aadharTextField = new JTextField();
     aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
     aadharTextField.setBounds(300,420,400,30);
     add(aadharTextField);
     
     
     //state
     snrCitizen = new JLabel("Senior citizen:");
     snrCitizen.setFont(new Font("Raleway",Font.BOLD,20));
     snrCitizen.setBounds(100,470,200,30);
     add(snrCitizen);
     
     seniorYes= new JRadioButton("Yes");
     seniorYes.setBounds(300,470,100,30);
     seniorYes.setBackground(Color.WHITE);
     add(seniorYes);
     
     
    seniorNo = new JRadioButton("No");
     seniorNo.setBounds(450,470,100,30);
     //stateTextField.setBounds(300,460,400,30);
     seniorNo.setBackground(Color.WHITE);
     add(seniorNo);
     
     ButtonGroup seniorGrp = new ButtonGroup();
     seniorGrp.add(seniorYes);
     seniorGrp.add(seniorNo);
     
     
     
     //EXISTING ACCOUNT
     exAcc = new JLabel("Existing Account:");
     exAcc.setFont(new Font("Raleway",Font.BOLD,20));
     exAcc.setBounds(100,520,200,30);
     add(exAcc);
     
     existsYes= new JRadioButton("Yes");
     existsYes.setBounds(300,520,80,30);
     //pincodeTextField.setBounds(300,500,400,30);
     existsYes.setBackground(Color.WHITE);
     add(existsYes);
     
     
    existsNo = new JRadioButton("No");
     existsNo.setBounds(450,520,100,30);
     existsNo.setBackground(Color.WHITE);
     add(existsNo);
     
     ButtonGroup exixtsAccGrp = new ButtonGroup();
     exixtsAccGrp.add(seniorYes);
     exixtsAccGrp.add(seniorNo);
     
     
     //NEXT BUTTON
     next = new JButton("Next");
     next.setForeground(Color.WHITE);
     next.setBackground(Color.BLACK);
     next.setFont(new Font("Raleway",Font.BOLD,14));
     next.setBounds(620,580,80,20);
     next.addActionListener(this);
     add(next);
     
     getContentPane().setBackground(Color.WHITE);// to set background color of frame
     
        
      //to create frame
      
     setSize(850,800);
     setVisible(true);
     setLocation(350,30);
     
}
   public void actionPerformed(ActionEvent ae){
    
       
       String sReligion = (String)relign.getSelectedItem();
       String sCatogry = (String)categry.getSelectedItem();
       String sIncm = (String)incm.getSelectedItem();
       String sEducQual = (String)educQual.getSelectedItem();
       String sOccup = (String)occup.getSelectedItem();
       String sPan = panTextField.getText();
       String sAadhr = aadharTextField.getText();
       
       String senrCitizen = null;
       if(seniorYes.isSelected()){
           senrCitizen = "Yes";
       }else if(seniorNo.isSelected()){
           senrCitizen = "No";
       }
       
       String existsAcc = null;
       if(existsYes.isSelected()){
           existsAcc = "Yes";
       }else if(existsNo.isSelected()){
           existsAcc = "No";
       }
       
       
       try{
           if(panTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill all the required fields");
           }else{
               Conn c =  new Conn();               
               String query ="Insert into additional_details values ('"+formno+"','"+sReligion+"','"+sCatogry+"','"+sIncm+"','"+sEducQual+"','"+sOccup+"','"+sPan+"','"+sAadhr+"','"+senrCitizen+"','"+existsAcc+"')";
               c.s.executeUpdate(query);
               
               //signup3 object
               new Signup3(formno).setVisible(true);
               setVisible(false);
               
            }
           
         }catch(Exception e){
          e.printStackTrace();
       }
    }
    
   public static void main(String args[]){
        new Signup2("").setVisible(true);
   }
}
