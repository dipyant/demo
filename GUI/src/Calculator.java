import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
GridLayout layout = new GridLayout(10, 1);
JLabel l1 = new JLabel("Number 1:");
JLabel l2 = new JLabel("Number 2:");
JLabel l3 = new JLabel("Answer:"); 
JTextField t1 = new JTextField(30);
JTextField t2 = new JTextField(30);
JTextField t3 = new JTextField(30);
JButton add = new JButton("+");
JButton sub = new JButton("-");
JButton mul = new JButton("*");
JButton div= new JButton("/");
JButton res= new JButton("CE");
Float ans; 

public Calculator()
  {
    super("Calculator");
    setSize(250, 250);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(add);
    add(sub);
    add(mul);
    add(div);
    add(res);
    setLayout(layout);
    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);
    res.addActionListener(this);
    setVisible(true);
  }

public void actionPerformed(ActionEvent e)
  {
String n1 = t1.getText();
String n2 = t2.getText();
Float num1 = Float.parseFloat(n1);
Float num2 = Float.parseFloat(n2);   
Object clicked = e.getSource();

if(add == clicked)
{
  t3.setText(String.valueOf(num1+num2));
}

else if(sub == clicked)
{
  t3.setText(String.valueOf(num1-num2));
}

else if(mul == clicked)
{
  t3.setText(String.valueOf(num1*num2));
}
else if(res == clicked)
{
	t1.setText("");
	t2.setText("");
	t3.setText("");
	JOptionPane.showMessageDialog(null,"Fuck Off");
}
	
else
{
if(num2 == 0)
t3.setText("Can't Divide By Zero");
else
t3.setText(String.valueOf(num1/num2));
  }
 }




  public static void main(String[] args)
  {
    Calculator calc = new Calculator();
    calc.setVisible(true);
  }
}