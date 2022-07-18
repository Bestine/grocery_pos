package grocery_pos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginPanel extends JPanel{
	
	VegFruitsPanel vegFruitsPanel = new VegFruitsPanel();
	
	JButton loginButton;
	
	LoginPanel(){
		loginButton = new JButton();
		loginButton.setText("LOGIN");
		loginButton.setBounds(300, 190, 150, 50);
		loginButton.setFocusable(false);
		loginButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(new Color(0, 255, 51));
		loginButton.setBorder(BorderFactory.createEmptyBorder());
		
		this.setLayout(null);
		this.setSize(710, 485);
		this.setBounds(0, 50, 710, 485);
		this.setBackground(Color.WHITE);
		this.add(loginButton);
		this.setVisible(false);
		
	}
}
