import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.*;
import java.sql.*;

public class Ass140 extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l4;
 JButton b1;
 JTextField t1,t2,t3,t4;
 /* xyz changes*/
 //hwsqjk
 Ass140()
 {
  l1=new JLabel("Client");
  l2=new JLabel("Exchange");
  l3=new JLabel("Login");
  l4=new JLabel("Password");
  b1=new JButton("BUTTON 1");
  
  t1=new JTextField(8);
  t2=new JTextField(8);
  t3=new JTextField(8);
  t4=new JTextField(8);
  /* fdf */
  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(l3);
  add(t3);
  add(l4);
  add(t4);
  add(b1);
  
  b1.addActionListener(this);
  
  setSize(200,200);
  setLayout(new FlowLayout());
  setTitle("Add a user");
 }

 public void actionPerformed(ActionEvent ae)
 {
	 //for Connectivity
	 String url = "jdbc:mysql://50.97.161.228:3306/samssara_ClientUpdates";
//   String dbName = "samssara_ClientUpdates";
   String driver = "com.mysql.jdbc.Driver";
   String userName = "samssara_sam";
   String userName2 = "samssara_sam2";
   String password = "sam123";
   Statement UpdateResult;
   try {
       Class.forName(driver).newInstance();
      DriverManager.getConnection(url,userName,password);
      // UpdateTime = System.currentTimeMillis();
       Connection conn = DriverManager.getConnection(url,userName,password);
       String UpdateString = "INSERT INTO UserLogin (CLIENT, EXCHANGE, LOGIN, PASS)";
       UpdateResult=conn.createStatement();
      UpdateString = UpdateString + "VALUES ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')";
      UpdateResult.executeUpdate(UpdateString);
      JOptionPane.showMessageDialog(null,"Inserted Successfully!");
      conn.close();
   
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
	/* float a,b,c;
  if(ae.getSource()==b1)
  {
   a=Float.parseFloat(t1.getText());
   b=Float.parseFloat(t2.getText());
   
   c=a+b;
   t3.setText(String.valueOf(c));
   
  }
  
  
 }*/
 }
 public static void main(String args[])
 {
  Ass140 a=new Ass140();
  a.setVisible(true);
  a.setLocation(200,200);
  
 }

}
