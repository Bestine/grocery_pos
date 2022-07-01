package grocery_pos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	JFrame frame = new JFrame();
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
		
		
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Grocery POS");
		titleLabel.setFont(new Font("MV Boli", Font.BOLD, 38));
		titleLabel.setForeground(Color.green);
		
		
		// create item Label
		//FRUITS
		JLabel mangoLabel = new JLabel();
		mangoLabel.setText("Mango");
		mangoLabel.setIcon(mangoImage);
		mangoLabel.setVerticalTextPosition(JLabel.BOTTOM);
		mangoLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel appleLabel = new JLabel();
		appleLabel.setText("Apple");
		appleLabel.setIcon(appleImage);
		appleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		appleLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel avocadoLabel = new JLabel();
		avocadoLabel.setText("Avocado");
		avocadoLabel.setIcon(avocadoImage);
		avocadoLabel.setVerticalTextPosition(JLabel.BOTTOM);
		avocadoLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel bananaLabel = new JLabel();
		bananaLabel.setText("Banana");
		bananaLabel.setIcon(bananaImage);
		bananaLabel.setVerticalTextPosition(JLabel.BOTTOM);
		bananaLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel coconutLabel = new JLabel();
		coconutLabel.setText("Coconut");
		coconutLabel.setIcon(coconutImage);
		coconutLabel.setVerticalTextPosition(JLabel.BOTTOM);
		coconutLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel orangeLabel = new JLabel();
		orangeLabel.setText("Orange");
		orangeLabel.setIcon(orangeImage);
		orangeLabel.setVerticalTextPosition(JLabel.BOTTOM);
		orangeLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel pawpawLabel = new JLabel();
		pawpawLabel.setText("Pawpaw");
		pawpawLabel.setIcon(pawpawImage);
		pawpawLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pawpawLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel pineappleLabel = new JLabel();
		pineappleLabel.setText("Pineapple");
		pineappleLabel.setIcon(pineappleImage);
		pineappleLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pineappleLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel watermelonLabel = new JLabel();
		watermelonLabel.setText("Watermelon");
		watermelonLabel.setIcon(watermelonImage);
		watermelonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		watermelonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		//VEGETABLES
		JLabel cabbageLabel = new JLabel();
		cabbageLabel.setText("Cabbage");
		cabbageLabel.setIcon(cabbageImage);
		cabbageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		cabbageLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel carrotLabel = new JLabel();
		carrotLabel.setText("Carrot");
		carrotLabel.setIcon(carrotImage);
		carrotLabel.setVerticalTextPosition(JLabel.BOTTOM);
		carrotLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel onionLabel = new JLabel();
		onionLabel.setText("Onion");
		onionLabel.setIcon(onionImage);
		onionLabel.setVerticalTextPosition(JLabel.BOTTOM);
		onionLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel pepperLabel = new JLabel();
		pepperLabel.setText("Pepper");
		pepperLabel.setIcon(pepperImage);
		pepperLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pepperLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel spinachLabel = new JLabel();
		spinachLabel.setText("Spinach");
		spinachLabel.setIcon(spinachImage);
		spinachLabel.setVerticalTextPosition(JLabel.BOTTOM);
		spinachLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		JLabel tomatoLabel = new JLabel();
		tomatoLabel.setText("Tomato");
		tomatoLabel.setIcon(tomatoImage);
		tomatoLabel.setVerticalTextPosition(JLabel.BOTTOM);
		tomatoLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		
		// Add title and items panels
		JPanel titlePanel = new JPanel();
		JPanel itemPanel = new JPanel();
		
		
		// Add items to titlePanel
		titlePanel.setSize(750, 50);
		titlePanel.setBounds(0, 0, 750, 50);
		titlePanel.add(titleLabel);
		
		
		// Add items to the items Panel
		itemPanel.setSize(750, 550);
		itemPanel.setBounds(0, 50, 750, 550);
		itemPanel.add(mangoLabel);
		itemPanel.add(appleLabel);
		itemPanel.add(avocadoLabel);
		itemPanel.add(bananaLabel);
		itemPanel.add(coconutLabel);
		itemPanel.add(orangeLabel);
		itemPanel.add(pineappleLabel);
		itemPanel.add(pawpawLabel);
		itemPanel.add(watermelonLabel);
		itemPanel.add(cabbageLabel);
		itemPanel.add(carrotLabel);
		itemPanel.add(onionLabel);
		itemPanel.add(pepperLabel);
		itemPanel.add(spinachLabel);
		itemPanel.add(tomatoLabel);
		
		
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("Grocery POS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750, 600);
		this.setVisible(true);
		this.add(titlePanel);
		this.add(itemPanel);
		
	}

}
