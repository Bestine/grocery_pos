package grocery_pos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ItemsFrame extends JFrame implements ActionListener{
	
	VegFruitsPanel vegFruitsPanel = new VegFruitsPanel();
	
	JButton logoutButton;
	JButton vegFruitsButton;
	
	ItemsFrame(){
		/*Create Login and SignUp Button
		Login Button*/
		logoutButton = new JButton();
		logoutButton.setText("LOGOUT");
		logoutButton.setBounds(600, 8, 100, 35);
		logoutButton.setFocusable(false);
		logoutButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setBackground(new Color(0, 255, 51));
		logoutButton.setBorder(BorderFactory.createEmptyBorder());
		logoutButton.addActionListener(this);
		//Sign up Button
		vegFruitsButton = new JButton();
		vegFruitsButton.setText("Veg & Fruits");
		vegFruitsButton.setBounds(420, 8, 160, 35);
		vegFruitsButton.setFocusable(false);
		vegFruitsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		vegFruitsButton.setForeground(Color.WHITE);
		vegFruitsButton.setBackground(new Color(0, 255, 51));
		vegFruitsButton.setBorder(BorderFactory.createEmptyBorder());
		vegFruitsButton.addActionListener(this);

		
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(710, 570);
		this.setVisible(true);
		this.add(vegFruitsButton);
		this.add(logoutButton);
		this.add(vegFruitsPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vegFruitsButton) {
			vegFruitsPanel.setVisible(true);
		}
		
	}

}
