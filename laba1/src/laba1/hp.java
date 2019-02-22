package laba1;
import java.awt.*;
import javax.swing.*;

public class hp {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Okno");
		frame.setSize(1000, 650);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text=new JTextField();
		text.setBounds(50, 50, 250, 55);
		text.setText("gh");
		frame.add(text);
		frame.setVisible(true);

	}

}
