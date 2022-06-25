package grocery_pos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	JFrame frame = new JFrame();
	MyFrame(){
		ImageIcon mangoImage = new ImageIcon("images/mango.png");
		ImageIcon bananaImage = new ImageIcon("images/banana.png");
		
		JLabel titleLabel = new JLabel(); //label for title
		JLabel mangoLabel = new JLabel();
		JLabel bananaLabel = new JLabel();
		
		titleLabel.setText("Grocery POS");
		titleLabel.setBounds(0, 0, 50, 750);
		titleLabel.setFont(new Font("Mv Boli", Font.BOLD, 45));
		titleLabel.setForeground(Color.GREEN);
		titleLabel.setVerticalAlignment(JLabel.TOP);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//Add the fruit labels
		//Mango
		mangoLabel.setText("Mango");
		mangoLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		mangoLabel.setIcon(mangoImage);
		mangoLabel.setVerticalTextPosition(JLabel.BOTTOM);
		mangoLabel.setHorizontalTextPosition(JLabel.CENTER);
		mangoLabel.setHorizontalAlignment(JLabel.CENTER);
		mangoLabel.setVerticalAlignment(JLabel.CENTER);
		mangoLabel.setBounds(0, 50, 250, 150);
		/*mangoLabel.setBackground(Color.decode("#A8E4A0"));
		mangoLabel.setOpaque(true);*/
		
		//Banana
		bananaLabel.setText("Banana");
		bananaLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		bananaLabel.setIcon(bananaImage);
		bananaLabel.setVerticalTextPosition(JLabel.BOTTOM);
		bananaLabel.setHorizontalTextPosition(JLabel.CENTER);
		bananaLabel.setHorizontalAlignment(JLabel.CENTER);
		bananaLabel.setVerticalAlignment(JLabel.CENTER);
		bananaLabel.setBounds(0, 100, 250, 150);
		
		
		
//		this.setLayout(null);
		this.setTitle("Grocery POS");
		this.setSize(750, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(titleLabel);
		this.add(mangoLabel);
		this.add(bananaLabel);
		this.pack();
	}

}
