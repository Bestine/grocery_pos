package grocery_pos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SignupPanel extends JPanel{
	JButton signupButton;
	
	SignupPanel(){
		signupButton = new JButton();
		signupButton.setText("SIGN UP");
		signupButton.setBounds(300, 190, 150, 50);
		signupButton.setFocusable(false);
		signupButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		signupButton.setForeground(Color.WHITE);
		signupButton.setBackground(new Color(0, 255, 51));
		signupButton.setBorder(BorderFactory.createEmptyBorder());
		
		this.setLayout(null);
		this.setSize(710, 485);
		this.setBounds(0, 50, 710, 485);
		this.setBackground(Color.WHITE);
		this.add(signupButton);
		this.setVisible(false);
		
	}
}
