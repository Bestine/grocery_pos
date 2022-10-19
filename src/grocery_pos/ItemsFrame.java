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
	GrainsPanel grainsPanel = new GrainsPanel();
	
	JButton logoutButton;
	JButton vegFruitsButton;
	JButton grainsButton;
	
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
		
		//vegetable and fruits button
		vegFruitsButton = new JButton();
		vegFruitsButton.setText("Veg & Fruits");
		vegFruitsButton.setBounds(10, 8, 160, 35);
		vegFruitsButton.setFocusable(false);
		vegFruitsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		vegFruitsButton.setForeground(Color.WHITE);
		vegFruitsButton.setBackground(new Color(0, 255, 51));
		vegFruitsButton.setBorder(BorderFactory.createEmptyBorder());
		vegFruitsButton.addActionListener(this);
		
		//grains button
		grainsButton = new JButton();
		grainsButton.setText("Grains");
		grainsButton.setBounds(180, 8, 160, 35);
		grainsButton.setFocusable(false);
		grainsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		grainsButton.setForeground(Color.WHITE);
		grainsButton.setBackground(new Color(0, 255, 51));
		grainsButton.setBorder(BorderFactory.createEmptyBorder());
		grainsButton.addActionListener(this);

		
		this.setLayout(null);
		this.setResizable(true);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1323, 740);
		this.setVisible(true);
		this.add(vegFruitsButton);
		this.add(grainsButton);
		this.add(logoutButton);
		this.add(vegFruitsPanel);
		this.add(grainsPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==vegFruitsButton) {
			grainsPanel.setVisible(false);
			vegFruitsPanel.setVisible(true);
		}
		else if(e.getSource()==grainsButton) {
			vegFruitsPanel.setVisible(false);
			grainsPanel.setVisible(true);
		}
		else if(e.getSource()==logoutButton) {
			this.dispose();
			new CredentialsFrame();
		}
		
	}

}
