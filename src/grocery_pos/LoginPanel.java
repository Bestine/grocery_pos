package grocery_pos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginPanel extends JPanel implements ActionListener{
	
	VegFruitsPanel vegFruitsPanel = new VegFruitsPanel();
	
	JButton loginButton;
	
	LoginPanel(){
		loginButton = new JButton();
		loginButton.setText("LOGIN");
		loginButton.setBounds(300, 170, 150, 50);
		loginButton.setFocusable(false);
		loginButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(Color.ORANGE);
		loginButton.addActionListener(this);
		loginButton.setBorder(BorderFactory.createEmptyBorder());
		
		this.setLayout(null);
		this.setSize(710, 520);
		this.setBounds(0, 0, 720, 520);
		this.setBackground(Color.WHITE);
		this.add(loginButton);
		this.setVisible(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==loginButton) {	
			this.setVisible(false);
			vegFruitsPanel.setVisible(true);
		
		}
		
	}
}
