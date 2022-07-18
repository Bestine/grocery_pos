package grocery_pos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	JFrame frame = new JFrame();
	
	
	LoginPanel loginPanel = new LoginPanel();
	JPanel vegFruitsPanel = new VegFruitsPanel();
	
	MyFrame(){	
		
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(710, 520);
		this.setVisible(true);
		this.add(loginPanel);
		this.add(vegFruitsPanel);
				
	}
}
