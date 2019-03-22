package laba12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Poi {
	private JFrame frame;
	JButton button1, button2, buttonGroup1;
	JTextField textGroup2, textGroup1;
	JComboBox comboBox;

	Poi() {
		create();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	void create() {
		frame = new JFrame("zxc");
		frame.setSize(1000, 800);
		frame.getContentPane().setLayout(null);

		textGroup1 = new JTextField();
		textGroup1.setBounds(50, 120, 200, 20);
		frame.add(textGroup1);

		buttonGroup1 = new JButton();
		buttonGroup1.setText("Нажми чтобы добавить");
		buttonGroup1.setBounds(50, 50, 200, 20);
		//buttonGroup1.addActionListener(new ListenerButtonGroup1())//
		frame.add(buttonGroup1);

		comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(300, 20, 200, 20);
		frame.add(comboBox);

		textGroup2 = new JTextField();
		textGroup2.setBounds(50, 50, 200, 20);
		frame.add(textGroup2);

		button1 = new JButton();
		button1.setText("Нажми меня");
		button1.setBounds(300,120,200,20);
		button1.addActionListener(new Button1Listener1());
		frame.add(button1);

		button2 = new JButton();
		button2.setText("А лучше меня");
		button2.setBounds(300,150,200,20);
		button2.addActionListener(new Button1Listener2());
		frame.add(button2);
	}

	public class Button1Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			button2.setText(textGroup2.getText());
		}
	}

	public class Button1Listener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s;
			s = button2.getText();
			button2.setText(button1.getText());
			button1.setText(s);
		}
	}

	public static void main(String[] args) {
		Poi start = new Poi();

	}
}
