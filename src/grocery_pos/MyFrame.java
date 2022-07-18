package grocery_pos;

import java.awt.Color;
import java.awt.Font;

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
		// Add a welcome icon
		ImageIcon welcomeIcon = new ImageIcon("images/logos/welcome.png");
		
		
		// Create A welcome label
		JLabel welcomeLabel = new JLabel();
		welcomeLabel.setText("WELCOME!");
		welcomeLabel.setFont(new Font("Serif", Font.BOLD, 60));
		welcomeLabel.setForeground(Color.WHITE);
		welcomeLabel.setIcon(welcomeIcon);
		welcomeLabel.setHorizontalTextPosition(JLabel.CENTER);
		welcomeLabel.setVerticalTextPosition(JLabel.CENTER);;
		welcomeLabel.setSize(710, 520);
		welcomeLabel.setBounds(0, 0, 710, 520);
		welcomeLabel.setVisible(true);
	
		
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(710, 520);
		this.setVisible(true);
		this.add(welcomeLabel);
//		this.add(loginPanel);
//		this.add(vegFruitsPanel);
				
	}
}
