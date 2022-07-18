package grocery_pos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VegFruitsPanel extends JPanel implements ActionListener{
	
	//Add button for items
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
	
	VegFruitsPanel() {
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
		mangoButton.setBackground(Color.WHITE);
		mangoButton.setBorder(BorderFactory.createEmptyBorder());
				
		appleButton = new JButton();
		appleButton.addActionListener(this);
		appleButton.setText("Apple");
		appleButton.setIcon(appleImage);
		appleButton.setVerticalTextPosition(JButton.BOTTOM);
		appleButton.setHorizontalTextPosition(JButton.CENTER);
		appleButton.setFocusable(false);
		appleButton.setBackground(Color.WHITE);
		appleButton.setBorder(BorderFactory.createEmptyBorder());
				
		avocadoButton = new JButton();
		avocadoButton.addActionListener(this);
		avocadoButton.setText("Avocado");
		avocadoButton.setIcon(avocadoImage);
		avocadoButton.setVerticalTextPosition(JButton.BOTTOM);
		avocadoButton.setHorizontalTextPosition(JButton.CENTER);
		avocadoButton.setFocusable(false);
		avocadoButton.setBackground(Color.WHITE);
		avocadoButton.setBorder(BorderFactory.createEmptyBorder());
				
		bananaButton = new JButton();
		bananaButton.addActionListener(this);
		bananaButton.setText("Banana");
		bananaButton.setIcon(bananaImage);
		bananaButton.setVerticalTextPosition(JButton.BOTTOM);
		bananaButton.setHorizontalTextPosition(JButton.CENTER);
		bananaButton.setFocusable(false);
		bananaButton.setBackground(Color.WHITE);
		bananaButton.setBorder(BorderFactory.createEmptyBorder());
				
		coconutButton = new JButton();
		coconutButton.addActionListener(this);
		coconutButton.setText("Coconut");
		coconutButton.setIcon(coconutImage);
		coconutButton.setVerticalTextPosition(JButton.BOTTOM);
		coconutButton.setHorizontalTextPosition(JButton.CENTER);
		coconutButton.setFocusable(false);
		coconutButton.setBackground(Color.WHITE);
		coconutButton.setBorder(BorderFactory.createEmptyBorder());
				
		orangeButton = new JButton();
		orangeButton.addActionListener(this);
		orangeButton.setText("Orange");
		orangeButton.setIcon(orangeImage);
		orangeButton.setVerticalTextPosition(JButton.BOTTOM);
		orangeButton.setHorizontalTextPosition(JButton.CENTER);
		orangeButton.setFocusable(false);
		orangeButton.setBackground(Color.WHITE);
		orangeButton.setBorder(BorderFactory.createEmptyBorder());
				
		pawpawButton = new JButton();
		pawpawButton.addActionListener(this);
		pawpawButton.setText("Pawpaw");
		pawpawButton.setIcon(pawpawImage);
		pawpawButton.setVerticalTextPosition(JButton.BOTTOM);
		pawpawButton.setHorizontalTextPosition(JButton.CENTER);
		pawpawButton.setFocusable(false);
		pawpawButton.setBackground(Color.WHITE);
		pawpawButton.setBorder(BorderFactory.createEmptyBorder());
				
		pineappleButton = new JButton();
		pineappleButton.addActionListener(this);
		pineappleButton.setText("Pineapple");
		pineappleButton.setIcon(pineappleImage);
		pineappleButton.setVerticalTextPosition(JButton.BOTTOM);
		pineappleButton.setHorizontalTextPosition(JButton.CENTER);
		pineappleButton.setFocusable(false);
		pineappleButton.setBackground(Color.WHITE);
		pineappleButton.setBorder(BorderFactory.createEmptyBorder());
				
		watermelonButton = new JButton();
		watermelonButton.addActionListener(this);
		watermelonButton.setText("Watermelon");
		watermelonButton.setIcon(watermelonImage);
		watermelonButton.setVerticalTextPosition(JButton.BOTTOM);
		watermelonButton.setHorizontalTextPosition(JButton.CENTER);
		watermelonButton.setFocusable(false);
		watermelonButton.setBackground(Color.WHITE);
		watermelonButton.setBorder(BorderFactory.createEmptyBorder());
				
				//VEGETABLES
		cabbageButton = new JButton();
		cabbageButton.addActionListener(this);
		cabbageButton.setText("Cabbage");
		cabbageButton.setIcon(cabbageImage);
		cabbageButton.setVerticalTextPosition(JButton.BOTTOM);
		cabbageButton.setHorizontalTextPosition(JButton.CENTER);
		cabbageButton.setFocusable(false);
		cabbageButton.setBackground(Color.WHITE);
		cabbageButton.setBorder(BorderFactory.createEmptyBorder());
				
		carrotButton = new JButton();
		carrotButton.addActionListener(this);
		carrotButton.setText("Carrot");
		carrotButton.setIcon(carrotImage);
		carrotButton.setVerticalTextPosition(JButton.BOTTOM);
		carrotButton.setHorizontalTextPosition(JButton.CENTER);
		carrotButton.setFocusable(false);
		carrotButton.setBackground(Color.WHITE);
		carrotButton.setBorder(BorderFactory.createEmptyBorder());
				
		onionButton = new JButton();
		onionButton.addActionListener(this);
		onionButton.setText("Onion");
		onionButton.setIcon(onionImage);
		onionButton.setVerticalTextPosition(JButton.BOTTOM);
		onionButton.setHorizontalTextPosition(JButton.CENTER);
		onionButton.setFocusable(false);
		onionButton.setBackground(Color.WHITE);
		onionButton.setBorder(BorderFactory.createEmptyBorder());
				
		pepperButton = new JButton();
		pepperButton.addActionListener(this);
		pepperButton.setText("Pepper");
		pepperButton.setIcon(pepperImage);
		pepperButton.setVerticalTextPosition(JButton.BOTTOM);
		pepperButton.setHorizontalTextPosition(JButton.CENTER);
		pepperButton.setFocusable(false);
		pepperButton.setBackground(Color.WHITE);
		pepperButton.setBorder(BorderFactory.createEmptyBorder());
				
		spinachButton = new JButton();
		spinachButton.addActionListener(this);
		spinachButton.setText("Spinach");
		spinachButton.setIcon(spinachImage);
		spinachButton.setVerticalTextPosition(JButton.BOTTOM);
		spinachButton.setHorizontalTextPosition(JButton.CENTER);
		spinachButton.setFocusable(false);
		spinachButton.setBackground(Color.WHITE);
		spinachButton.setBorder(BorderFactory.createEmptyBorder());
				
		tomatoButton = new JButton();
		tomatoButton.addActionListener(this);
		tomatoButton.setText("Tomato");
		tomatoButton.setIcon(tomatoImage);
		tomatoButton.setVerticalTextPosition(JButton.BOTTOM);
		tomatoButton.setHorizontalTextPosition(JButton.CENTER);
		tomatoButton.setFocusable(false);
		tomatoButton.setBackground(Color.WHITE);
		tomatoButton.setBorder(BorderFactory.createEmptyBorder());
				
		// Add items to the vegFruitsPanel
		this.setSize(710, 520);
		this.setBounds(0, 0, 710, 520);
		this.setBackground(new Color(102, 255, 102));
		this.add(mangoButton);
		this.add(appleButton);
		this.add(avocadoButton);
		this.add(bananaButton);
		this.add(coconutButton);
		this.add(orangeButton);
		this.add(pineappleButton);
		this.add(pawpawButton);
		this.add(watermelonButton);
		this.add(cabbageButton);
		this.add(carrotButton);
		this.add(onionButton);
		this.add(pepperButton);
		this.add(spinachButton);
		this.add(tomatoButton);
		this.setVisible(false);
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
