package grocery_pos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CredentialsFrame extends JFrame implements ActionListener{
	
	JPanel loginPanel;
	JPanel signupPanel;
	
	//Make components Global
	JLabel welcomeLabel;
	JButton loginButton;
	JButton signupButton;
	
	JButton submitLoginsButton;
	JButton createAccountButton;
	
	CredentialsFrame(){
		//========WELCOME PAGE============
		
		// Add a welcome icon
		ImageIcon welcomeIcon = new ImageIcon("images/logos/welcome.png");
		
		
		// Create A welcome label
		welcomeLabel = new JLabel();
		welcomeLabel.setText("WELCOME!");
		welcomeLabel.setFont(new Font("Serif", Font.BOLD, 60));
		welcomeLabel.setForeground(Color.green);
		welcomeLabel.setIcon(welcomeIcon);
		welcomeLabel.setHorizontalTextPosition(JLabel.CENTER);
		welcomeLabel.setVerticalTextPosition(JLabel.CENTER);;
		welcomeLabel.setSize(710, 485);
		welcomeLabel.setBounds(0, 50, 710, 485);
		welcomeLabel.setVisible(true);
		
		/*Create Login and SignUp Button
		Login Button*/
		loginButton = new JButton();
		loginButton = new JButton();
		loginButton.setText("LOGIN");
		loginButton.setBounds(480, 8, 100, 35);
		loginButton.setFocusable(false);
		loginButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(new Color(0, 255, 51));
		loginButton.setBorder(BorderFactory.createEmptyBorder());
		loginButton.addActionListener(this);
		//Sign up Button
		signupButton = new JButton();
		signupButton = new JButton();
		signupButton.setText("SIGN UP");
		signupButton.setBounds(600, 8, 100, 35);
		signupButton.setFocusable(false);
		signupButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		signupButton.setForeground(Color.WHITE);
		signupButton.setBackground(new Color(0, 255, 51));
		signupButton.setBorder(BorderFactory.createEmptyBorder());
		signupButton.addActionListener(this);
		
		// Create Title Label
		JLabel titleLabel = new JLabel();
		titleLabel.setText("GROCERY SHOP");
		titleLabel.setFont(new Font("Andalus", Font.PLAIN, 30));
		titleLabel.setForeground(Color.GREEN);
		titleLabel.setSize(380, 30);
		titleLabel.setBounds(100, 10, 380, 30);
		titleLabel.setVerticalTextPosition(JLabel.CENTER);
		titleLabel.setHorizontalTextPosition(JLabel.CENTER);
		titleLabel.setVisible(true);
		
		// Create a Header Panel
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setSize(710, 50);
		headerPanel.setBounds(0, 0, 710, 50);
		headerPanel.setBackground(new Color(255, 255, 255));
		headerPanel.setVisible(true);
		headerPanel.add(titleLabel);
		headerPanel.add(loginButton);
		headerPanel.add(signupButton);
		
	
		//=======================LOGIN PAGE=========================
		JTextField usernameTextField = new JTextField();
		usernameTextField.setText("Username");
		usernameTextField.setFont(new Font("Consolas", Font.PLAIN, 25));
		usernameTextField.setBorder(BorderFactory.createLineBorder(Color.green, 2, true));
		usernameTextField.setForeground(Color.gray);
		usernameTextField.setBounds(250, 70, 250, 50);
		
		JTextField passwordTextField = new JTextField();
		passwordTextField.setText("Password");
		passwordTextField.setFont(new Font("Consolas", Font.PLAIN, 25));
		passwordTextField.setBorder(BorderFactory.createLineBorder(Color.green, 2, true));
		passwordTextField.setForeground(Color.gray);
		passwordTextField.setBounds(250, 140, 250, 50);
		
		
		//submitLogins Button
		submitLoginsButton = new JButton();
		submitLoginsButton.setText("LOGIN");
		submitLoginsButton.setBounds(300, 220, 150, 50);
		submitLoginsButton.setFocusable(false);
		submitLoginsButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		submitLoginsButton.setForeground(Color.WHITE);
		submitLoginsButton.setBackground(new Color(0, 255, 51));
		submitLoginsButton.setBorder(BorderFactory.createEmptyBorder());
		submitLoginsButton.addActionListener(this);		
		
		loginPanel = new JPanel();
		loginPanel.setLayout(null);
		loginPanel.setSize(710, 485);
		loginPanel.setBounds(0, 50, 710, 485);
		loginPanel.setBackground(Color.WHITE);
		loginPanel.add(usernameTextField);
		loginPanel.add(passwordTextField);
		loginPanel.add(submitLoginsButton);
		loginPanel.setVisible(false);
		
		
		//======================SIGN UP PAGE=======================
		createAccountButton = new JButton();
		createAccountButton = new JButton();
		createAccountButton.setText("SIGN UP");
		createAccountButton.setBounds(300, 190, 150, 50);
		createAccountButton.setFocusable(false);
		createAccountButton.setFont(new Font("MV Boli", Font.BOLD, 20));
		createAccountButton.setForeground(Color.WHITE);
		createAccountButton.setBackground(new Color(0, 255, 51));
		createAccountButton.setBorder(BorderFactory.createEmptyBorder());
		createAccountButton.addActionListener(this);
		
		signupPanel = new JPanel();
		signupPanel.setLayout(null);
		signupPanel.setSize(710, 485);
		signupPanel.setBounds(0, 50, 710, 485);
		signupPanel.setBackground(Color.WHITE);
		signupPanel.add(createAccountButton);
		signupPanel.setVisible(false);
		
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(710, 570);
		this.setVisible(true);
		this.add(welcomeLabel);
		this.add(headerPanel);
		this.add(loginPanel);
		this.add(signupPanel);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loginButton) {
			welcomeLabel.setVisible(false);
			signupPanel.setVisible(false);
			loginPanel.setVisible(true);
		}
		else if(e.getSource()==signupButton) {
			welcomeLabel.setVisible(false);
			loginPanel.setVisible(false);
			signupPanel.setVisible(true);
		}
		else if(e.getSource()==submitLoginsButton) {
			this.dispose();
			new ItemsFrame();
		}
		else if(e.getSource()==createAccountButton) {
			this.dispose();
			new ItemsFrame();
		}
	}
}
