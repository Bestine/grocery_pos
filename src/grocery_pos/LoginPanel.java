package grocery_pos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginPanel extends JPanel implements ActionListener{
	
	LoginPanel(){
		JButton loginButton = new JButton();
		loginButton.setText("LOGIN");
		loginButton.setBounds(400, 200, 150, 50);
		loginButton.setFocusable(false);
		loginButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(Color.GREEN);
		loginButton.addActionListener(this);
		
		this.setLayout(null);
		this.setSize(900, 550);
		this.setBounds(0, 0, 900, 550);
		this.setBackground(Color.WHITE);
		this.setVisible(false);
		this.add(loginButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}