package grocery_pos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	
	
	JButton mangoButton;
	JButton appleButton;
	JButton avocadoButton;
	JButton bananaButton;
	JButton coconutButton;
	JButton orangeButton;
	JButton pawpawButton;
	JButton pineappleButton;
	JButton watermelonButton;
	
	JButton cabbageButton;
	JButton carrotButton;
	JButton onionButton;
	JButton pepperButton;
	JButton spinachButton;
	JButton tomatoButton;	
	
	LoginPanel loginPanel = new LoginPanel();
	
	MyFrame(){
		//Fruits
		ImageIcon mangoImage = new ImageIcon("images/fruits/mango.png");
		ImageIcon appleImage = new ImageIcon("images/fruits/apple.png");
		ImageIcon avocadoImage = new ImageIcon("images/fruits/avocado.png");
		ImageIcon bananaImage = new ImageIcon("images/fruits/banana.png");
		ImageIcon coconutImage = new ImageIcon("images/fruits/coconut.png");
		ImageIcon orangeImage = new ImageIcon("images/fruits/orange.png");
		ImageIcon pawpawImage = new ImageIcon("images/fruits/pawpaw.png");
		ImageIcon pineappleImage = new ImageIcon("images/fruits/pineapple.png");
		ImageIcon watermelonImage = new ImageIcon("images/fruits/watermelon.png");
		
		//VEGETABLES
		ImageIcon cabbageImage = new ImageIcon("images/vegetables/cabbage.png");
		ImageIcon carrotImage = new ImageIcon("images/vegetables/carrot.png");
		ImageIcon onionImage = new ImageIcon("images/vegetables/onion.png");
		ImageIcon pepperImage = new ImageIcon("images/vegetables/pepper.png");
		ImageIcon spinachImage = new ImageIcon("images/vegetables/spinach.png");
		ImageIcon tomatoImage = new ImageIcon("images/vegetables/tomato.png");
		
			
		// create item Buttons
		//FRUITS		
		mangoButton = new JButton();
		mangoButton.addActionListener(this);
		mangoButton.setText("Mango");
		mangoButton.setIcon(mangoImage);
		mangoButton.setVerticalTextPosition(JButton.BOTTOM);
		mangoButton.setHorizontalTextPosition(JButton.CENTER);
		mangoButton.setFocusable(false);
		
		appleButton = new JButton();
		appleButton.addActionListener(this);
		appleButton.setText("Apple");
		appleButton.setIcon(appleImage);
		appleButton.setVerticalTextPosition(JButton.BOTTOM);
		appleButton.setHorizontalTextPosition(JButton.CENTER);
		appleButton.setFocusable(false);
		
		avocadoButton = new JButton();
		avocadoButton.addActionListener(this);
		avocadoButton.setText("Avocado");
		avocadoButton.setIcon(avocadoImage);
		avocadoButton.setVerticalTextPosition(JButton.BOTTOM);
		avocadoButton.setHorizontalTextPosition(JButton.CENTER);
		avocadoButton.setFocusable(false);
		
		bananaButton = new JButton();
		bananaButton.addActionListener(this);
		bananaButton.setText("Banana");
		bananaButton.setIcon(bananaImage);
		bananaButton.setVerticalTextPosition(JButton.BOTTOM);
		bananaButton.setHorizontalTextPosition(JButton.CENTER);
		bananaButton.setFocusable(false);
		
		coconutButton = new JButton();
		coconutButton.addActionListener(this);
		coconutButton.setText("Coconut");
		coconutButton.setIcon(coconutImage);
		coconutButton.setVerticalTextPosition(JButton.BOTTOM);
		coconutButton.setHorizontalTextPosition(JButton.CENTER);
		coconutButton.setFocusable(false);
		
		orangeButton = new JButton();
		orangeButton.addActionListener(this);
		orangeButton.setText("Orange");
		orangeButton.setIcon(orangeImage);
		orangeButton.setVerticalTextPosition(JButton.BOTTOM);
		orangeButton.setHorizontalTextPosition(JButton.CENTER);
		orangeButton.setFocusable(false);
		
		pawpawButton = new JButton();
		pawpawButton.addActionListener(this);
		pawpawButton.setText("Pawpaw");
		pawpawButton.setIcon(pawpawImage);
		pawpawButton.setVerticalTextPosition(JButton.BOTTOM);
		pawpawButton.setHorizontalTextPosition(JButton.CENTER);
		pawpawButton.setFocusable(false);
		
		pineappleButton = new JButton();
		pineappleButton.addActionListener(this);
		pineappleButton.setText("Pineapple");
		pineappleButton.setIcon(pineappleImage);
		pineappleButton.setVerticalTextPosition(JButton.BOTTOM);
		pineappleButton.setHorizontalTextPosition(JButton.CENTER);
		pineappleButton.setFocusable(false);
		
		watermelonButton = new JButton();
		watermelonButton.addActionListener(this);
		watermelonButton.setText("Watermelon");
		watermelonButton.setIcon(watermelonImage);
		watermelonButton.setVerticalTextPosition(JButton.BOTTOM);
		watermelonButton.setHorizontalTextPosition(JButton.CENTER);
		watermelonButton.setFocusable(false);
		
		//VEGETABLES
		cabbageButton = new JButton();
		cabbageButton.addActionListener(this);
		cabbageButton.setText("Cabbage");
		cabbageButton.setIcon(cabbageImage);
		cabbageButton.setVerticalTextPosition(JButton.BOTTOM);
		cabbageButton.setHorizontalTextPosition(JButton.CENTER);
		cabbageButton.setFocusable(false);
		
		carrotButton = new JButton();
		carrotButton.addActionListener(this);
		carrotButton.setText("Carrot");
		carrotButton.setIcon(carrotImage);
		carrotButton.setVerticalTextPosition(JButton.BOTTOM);
		carrotButton.setHorizontalTextPosition(JButton.CENTER);
		carrotButton.setFocusable(false);
		
		onionButton = new JButton();
		onionButton.addActionListener(this);
		onionButton.setText("Onion");
		onionButton.setIcon(onionImage);
		onionButton.setVerticalTextPosition(JButton.BOTTOM);
		onionButton.setHorizontalTextPosition(JButton.CENTER);
		onionButton.setFocusable(false);
		
		pepperButton = new JButton();
		pepperButton.addActionListener(this);
		pepperButton.setText("Pepper");
		pepperButton.setIcon(pepperImage);
		pepperButton.setVerticalTextPosition(JButton.BOTTOM);
		pepperButton.setHorizontalTextPosition(JButton.CENTER);
		pepperButton.setFocusable(false);
		
		spinachButton = new JButton();
		spinachButton.addActionListener(this);
		spinachButton.setText("Spinach");
		spinachButton.setIcon(spinachImage);
		spinachButton.setVerticalTextPosition(JButton.BOTTOM);
		spinachButton.setHorizontalTextPosition(JButton.CENTER);
		spinachButton.setFocusable(false);
		
		tomatoButton = new JButton();
		tomatoButton.addActionListener(this);
		tomatoButton.setText("Tomato");
		tomatoButton.setIcon(tomatoImage);
		tomatoButton.setVerticalTextPosition(JButton.BOTTOM);
		tomatoButton.setHorizontalTextPosition(JButton.CENTER);
		tomatoButton.setFocusable(false);
		
		
		// Add items and login panels
		JPanel itemPanel = new JPanel();
		

		// Add items to the items Panel
		itemPanel.setSize(900, 550);
		itemPanel.setBounds(0, 0, 900, 550);
		itemPanel.add(mangoButton);
		itemPanel.add(appleButton);
		itemPanel.add(avocadoButton);
		itemPanel.add(bananaButton);
		itemPanel.add(coconutButton);
		itemPanel.add(orangeButton);
		itemPanel.add(pineappleButton);
		itemPanel.add(pawpawButton);
		itemPanel.add(watermelonButton);
		itemPanel.add(cabbageButton);
		itemPanel.add(carrotButton);
		itemPanel.add(onionButton);
		itemPanel.add(pepperButton);
		itemPanel.add(spinachButton);
		itemPanel.add(tomatoButton);
		itemPanel.setVisible(true);
		
		
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 550);
		this.setVisible(true);
		this.add(itemPanel);
		this.add(loginPanel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==mangoButton) {
			System.out.println("You just ordered Mango");
		}
		else if (e.getSource()==appleButton) {
			System.out.println("You just ordered Apple");
		}
		else if (e.getSource()==avocadoButton) {
			System.out.println("You just ordered Avocado");
		}
		else if (e.getSource()==bananaButton) {
			System.out.println("You just ordered Banana");
		}
		else if (e.getSource()==coconutButton) {
			System.out.println("You just ordered Coconut");
		}
		else if (e.getSource()==orangeButton) {
			System.out.println("You just ordered Orange");
		}
		else if (e.getSource()==pawpawButton) {
			System.out.println("You just ordered Pawpaw");
		}
		else if (e.getSource()==pineappleButton) {
			System.out.println("You just ordered Pineapple");
		}
		else if (e.getSource()==watermelonButton) {
			System.out.println("You just ordered Watermelon");
		}
		else if (e.getSource()==cabbageButton) {
			System.out.println("You just ordered Cabbage");
		}
		else if (e.getSource()==carrotButton) {
			System.out.println("You just ordered Carrot");
		}
		else if (e.getSource()==onionButton) {
			System.out.println("You just ordered Onion");
		}
		else if (e.getSource()==pepperButton) {
			System.out.println("You just ordered Pepper");
		}
		else if (e.getSource()==spinachButton) {
			System.out.println("You just ordered Spinach");
		}
		else if (e.getSource()==tomatoButton) {
			System.out.println("You just ordered Tomato");
		}
	}

}
