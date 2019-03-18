package laba1new;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Poi {
	private
    JFrame frame;
    JButton button1, button2;
    JTextField lable1;
	
	Poi ()
 {
	 create();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
 }
 
 void create()
 {
	 frame = new JFrame("zxc");
	 frame.setSize(1000,800);
	 frame.getContentPane().setLayout(null);
	 
	 lable1 = new JTextField();
	 lable1.setBounds(50,50,200,20);
	 frame.add(lable1);
	 
	 button1 = new JButton();
	 button1.setText("Жми меня");
	 button1.setBounds(300,50,200,20);
	 button1.addActionListener(new Button1Listener1());
	 frame.add(button1);
	 
	 button2 = new JButton();
	 button2.setText("Нет меня");
	 button2.setBounds(300,100,200,20);
	 button2.addActionListener(new Button1Listener2());
	 frame.add(button2);
 }
 
 public class Button1Listener1 implements ActionListener
 {
 	public void actionPerformed(ActionEvent e)
 	{
 		button2.setText(lable1.getText());
 	}
 }
 
 public class Button1Listener2 implements ActionListener
 {
 	public void actionPerformed(ActionEvent e)
 	{
 		String s;
 		s=button2.getText();
 		button2.setText(button1.getText());
 		button1.setText(s);
 	}
 }
 
}


