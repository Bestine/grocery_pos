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
	JButton saladsButton;
	JButton juiceButton;
	JButton fruitsButton;
	
	ItemsFrame(){
		/*Create Login and SignUp Button
		Login Button*/
		logoutButton = new JButton();
		logoutButton.setText("LOGOUT");
		logoutButton.setBounds(1200, 8, 100, 35);
		logoutButton.setFocusable(false);
		logoutButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setBackground(new Color(0, 255, 51));
		logoutButton.setBorder(BorderFactory.createEmptyBorder());
		logoutButton.addActionListener(this);
		
		//fruits button
		fruitsButton = new JButton();
		fruitsButton.setText("Fruits");
		fruitsButton.setBounds(50, 100, 160, 35);
		fruitsButton.setFocusable(false);
		fruitsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		fruitsButton.setForeground(Color.WHITE);
		fruitsButton.setBackground(new Color(0, 255, 51));
		fruitsButton.setBorder(BorderFactory.createEmptyBorder());
		fruitsButton.addActionListener(this);
		
		//vegetable button
		vegFruitsButton = new JButton();
		vegFruitsButton.setText("Vegetables");
		vegFruitsButton.setBounds(50, 200, 160, 35);
		vegFruitsButton.setFocusable(false);
		vegFruitsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		vegFruitsButton.setForeground(Color.WHITE);
		vegFruitsButton.setBackground(new Color(0, 255, 51));
		vegFruitsButton.setBorder(BorderFactory.createEmptyBorder());
		vegFruitsButton.addActionListener(this);
		
		//grains button
		grainsButton = new JButton();
		grainsButton.setText("Grains");
		grainsButton.setBounds(50, 300, 160, 35);
		grainsButton.setFocusable(false);
		grainsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		grainsButton.setForeground(Color.WHITE);
		grainsButton.setBackground(new Color(0, 255, 51));
		grainsButton.setBorder(BorderFactory.createEmptyBorder());
		grainsButton.addActionListener(this);
		
		//salads button
		saladsButton = new JButton();
		saladsButton.setText("Salads");
		saladsButton.setBounds(50, 400, 160, 35);
		saladsButton.setFocusable(false);
		saladsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		saladsButton.setForeground(Color.WHITE);
		saladsButton.setBackground(new Color(0, 255, 51));
		saladsButton.setBorder(BorderFactory.createEmptyBorder());
		saladsButton.addActionListener(this);

		//juice button
		juiceButton = new JButton();
		juiceButton.setText("Juice");
		juiceButton.setBounds(50, 500, 160, 35);
		juiceButton.setFocusable(false);
		juiceButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		juiceButton.setForeground(Color.WHITE);
		juiceButton.setBackground(new Color(0, 255, 51));
		juiceButton.setBorder(BorderFactory.createEmptyBorder());
		juiceButton.addActionListener(this);
		
		this.setLayout(null);
		this.setResizable(true);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1323, 740);
		this.setVisible(true);
		this.add(fruitsButton);
		this.add(vegFruitsButton);
		this.add(grainsButton);
		this.add(saladsButton);
		this.add(juiceButton);
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
