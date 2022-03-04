import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculator implements ActionListener
{

 JTextField t1,t2,t3;
 JButton b1,b2,b3,b4;
 
 calculator()
 {
  JFrame f=new JFrame("SIMPLE CALCULATOR");
  
  JLabel l1=new JLabel("Number 1:");
  l1.setBounds(10,50,100,50);
  
  JLabel l2=new JLabel("Number 2:");
  l2.setBounds(210,50,100,50);
 
  JLabel l3=new JLabel("Result:");
  l3.setBounds(110,150,100,50);
 
  t1 = new JTextField();
  t1.setBounds(90,50,100,50);
  
  t2 = new JTextField();
  t2.setBounds(290,50,100,50);
  
  t3 = new JTextField();
  t3.setEditable(false);
  t3.setBounds(190,150,100,50);
  
  
  b1=new JButton("+");
  b1.setBounds(30,250,50,50);
  b1.addActionListener(this);
  
  b2=new JButton("-");
  b2.setBounds(130,250,50,50);
  b2.addActionListener(this);
  
  b3=new JButton("*");
  b3.setBounds(230,250,50,50);
  b3.addActionListener(this);
  
  b4=new JButton("/");
  b4.setBounds(330,250,50,50);
  b4.addActionListener(this);
  
  f.add(l1);f.add(l2);f.add(l3);
  f.add(b1);f.add(b2);f.add(b3);f.add(b4);
  f.add(t1);f.add(t2);f.add(t3);
  
  f.setLayout(null);
  f.setSize(400,400);
  f.setVisible(true);
 }
 
 public void actionPerformed(ActionEvent e)
 {
  String s1=t1.getText();
  String s2=t2.getText();
  int a=Integer.parseInt(s1);
  int b=Integer.parseInt(s2);
 	int c=0;
 	if(e.getSource()==b1){
 			c=a+b;
 	}
 	else if(e.getSource()==b2){
 			c=a-b;
 	}
 	else if(e.getSource()==b3){
 			c=a*b;
 	}
 	else if (e.getSource()==b4){
 			c=a/b;
 	}
 	String r=String.valueOf(c);
 	t3.setText(r);
 }
 
 public static void main(String args[])
 {
 	new calculator();
 }
}
