package grocery_pos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GrainsPanel extends JPanel implements ActionListener{
	
	//Add button for items
	JButton beansButton;
	JButton peasButton;
	JButton pigeonpeasButton;
	JButton soyabeansButton;
	JButton peanutsButton;
	JButton greengramsButton;
	JButton frenchbeansButton;
	JButton blackbeansButton;
	JButton lentilsButton;
	
	JButton cornButton;
	JButton riceButton;
	JButton wheatButton;
	JButton oatsButton;
	JButton sorghumButton;
	JButton milletButton;
	
	GrainsPanel() {
		//Legumes
		ImageIcon beansImage = new ImageIcon("images/grains/beans.png");
		ImageIcon peasImage = new ImageIcon("images/grains/peas.png");
		ImageIcon pigeonpeasImage = new ImageIcon("images/grains/pigeon peas.png");
		ImageIcon soyabeansImage = new ImageIcon("images/grains/soya beans.png");
		ImageIcon peanutsImage = new ImageIcon("images/grains/peanuts.png");
		ImageIcon greengramsImage = new ImageIcon("images/grains/green grams.png");
		ImageIcon frenchbeansImage = new ImageIcon("images/grains/french beans.png");
		ImageIcon blackbeansImage = new ImageIcon("images/grains/black beans.png");
		ImageIcon lentilsImage = new ImageIcon("images/grains/lentils.png");
						
		//grains
		ImageIcon cornImage = new ImageIcon("images/grains/corn.png");
		ImageIcon riceImage = new ImageIcon("images/grains/rice.png");
		ImageIcon wheatImage = new ImageIcon("images/grains/wheat.png");
		ImageIcon oatsImage = new ImageIcon("images/grains/oats.png");
		ImageIcon sorghumImage = new ImageIcon("images/grains/sorghum.png");
		ImageIcon milletImage = new ImageIcon("images/grains/millet.png");
						
							
		// create item Buttons
		//LEGUMES		
		beansButton = new JButton();
		beansButton.addActionListener(this);
		beansButton.setText("Beans");
		beansButton.setIcon(beansImage);
		beansButton.setVerticalTextPosition(JButton.BOTTOM);
		beansButton.setHorizontalTextPosition(JButton.CENTER);
		beansButton.setFocusable(false);
		beansButton.setBackground(Color.WHITE);
		beansButton.setBorder(BorderFactory.createEmptyBorder());
						
		peasButton = new JButton();
		peasButton.addActionListener(this);
		peasButton.setText("Peas");
		peasButton.setIcon(peasImage);
		peasButton.setVerticalTextPosition(JButton.BOTTOM);
		peasButton.setHorizontalTextPosition(JButton.CENTER);
		peasButton.setFocusable(false);
		peasButton.setBackground(Color.WHITE);
		peasButton.setBorder(BorderFactory.createEmptyBorder());
						
		pigeonpeasButton = new JButton();
		pigeonpeasButton.addActionListener(this);
		pigeonpeasButton.setText("Pigeon Peas");
		pigeonpeasButton.setIcon(pigeonpeasImage);
		pigeonpeasButton.setVerticalTextPosition(JButton.BOTTOM);
		pigeonpeasButton.setHorizontalTextPosition(JButton.CENTER);
		pigeonpeasButton.setFocusable(false);
		pigeonpeasButton.setBackground(Color.WHITE);
		pigeonpeasButton.setBorder(BorderFactory.createEmptyBorder());
						
		soyabeansButton = new JButton();
		soyabeansButton.addActionListener(this);
		soyabeansButton.setText("Soya Beans");
		soyabeansButton.setIcon(soyabeansImage);
		soyabeansButton.setVerticalTextPosition(JButton.BOTTOM);
		soyabeansButton.setHorizontalTextPosition(JButton.CENTER);
		soyabeansButton.setFocusable(false);
		soyabeansButton.setBackground(Color.WHITE);
		soyabeansButton.setBorder(BorderFactory.createEmptyBorder());
						
		peanutsButton = new JButton();
		peanutsButton.addActionListener(this);
		peanutsButton.setText("Peanuts");
		peanutsButton.setIcon(peanutsImage);
		peanutsButton.setVerticalTextPosition(JButton.BOTTOM);
		peanutsButton.setHorizontalTextPosition(JButton.CENTER);
		peanutsButton.setFocusable(false);
		peanutsButton.setBackground(Color.WHITE);
		peanutsButton.setBorder(BorderFactory.createEmptyBorder());
						
		greengramsButton = new JButton();
		greengramsButton.addActionListener(this);
		greengramsButton.setText("Green Grams");
		greengramsButton.setIcon(greengramsImage);
		greengramsButton.setVerticalTextPosition(JButton.BOTTOM);
		greengramsButton.setHorizontalTextPosition(JButton.CENTER);
		greengramsButton.setFocusable(false);
		greengramsButton.setBackground(Color.WHITE);
		greengramsButton.setBorder(BorderFactory.createEmptyBorder());
				
		frenchbeansButton = new JButton();
		frenchbeansButton.addActionListener(this);
		frenchbeansButton.setText("French Beans");
		frenchbeansButton.setIcon(frenchbeansImage);
		frenchbeansButton.setVerticalTextPosition(JButton.BOTTOM);
		frenchbeansButton.setHorizontalTextPosition(JButton.CENTER);
		frenchbeansButton.setFocusable(false);
		frenchbeansButton.setBackground(Color.WHITE);
		frenchbeansButton.setBorder(BorderFactory.createEmptyBorder());
						
		blackbeansButton = new JButton();
		blackbeansButton.addActionListener(this);
		blackbeansButton.setText("Black Beans");
		blackbeansButton.setIcon(blackbeansImage);
		blackbeansButton.setVerticalTextPosition(JButton.BOTTOM);
		blackbeansButton.setHorizontalTextPosition(JButton.CENTER);
		blackbeansButton.setFocusable(false);
		blackbeansButton.setBackground(Color.WHITE);
		blackbeansButton.setBorder(BorderFactory.createEmptyBorder());
						
		lentilsButton = new JButton();
		lentilsButton.addActionListener(this);
		lentilsButton.setText("Lentils");
		lentilsButton.setIcon(lentilsImage);
		lentilsButton.setVerticalTextPosition(JButton.BOTTOM);
		lentilsButton.setHorizontalTextPosition(JButton.CENTER);
		lentilsButton.setFocusable(false);
		lentilsButton.setBackground(Color.WHITE);
		lentilsButton.setBorder(BorderFactory.createEmptyBorder());
						
		//cereals
		cornButton = new JButton();
		cornButton.addActionListener(this);
		cornButton.setText("Corn");
		cornButton.setIcon(cornImage);
		cornButton.setVerticalTextPosition(JButton.BOTTOM);
		cornButton.setHorizontalTextPosition(JButton.CENTER);
		cornButton.setFocusable(false);
		cornButton.setBackground(Color.WHITE);
		cornButton.setBorder(BorderFactory.createEmptyBorder());
						
		riceButton = new JButton();
		riceButton.addActionListener(this);
		riceButton.setText("Rice");
		riceButton.setIcon(riceImage);
		riceButton.setVerticalTextPosition(JButton.BOTTOM);
		riceButton.setHorizontalTextPosition(JButton.CENTER);
		riceButton.setFocusable(false);
		riceButton.setBackground(Color.WHITE);
		riceButton.setBorder(BorderFactory.createEmptyBorder());
						
		wheatButton = new JButton();
		wheatButton.addActionListener(this);
		wheatButton.setText("Wheat");
		wheatButton.setIcon(wheatImage);
		wheatButton.setVerticalTextPosition(JButton.BOTTOM);
		wheatButton.setHorizontalTextPosition(JButton.CENTER);
		wheatButton.setFocusable(false);
		wheatButton.setBackground(Color.WHITE);
		wheatButton.setBorder(BorderFactory.createEmptyBorder());
						
		oatsButton = new JButton();
		oatsButton.addActionListener(this);
		oatsButton.setText("Oats");
		oatsButton.setIcon(oatsImage);
		oatsButton.setVerticalTextPosition(JButton.BOTTOM);
		oatsButton.setHorizontalTextPosition(JButton.CENTER);
		oatsButton.setFocusable(false);
		oatsButton.setBackground(Color.WHITE);
		oatsButton.setBorder(BorderFactory.createEmptyBorder());
					
		sorghumButton = new JButton();
		sorghumButton.addActionListener(this);
		sorghumButton.setText("Sorghum");
		sorghumButton.setIcon(sorghumImage);
		sorghumButton.setVerticalTextPosition(JButton.BOTTOM);
		sorghumButton.setHorizontalTextPosition(JButton.CENTER);
		sorghumButton.setFocusable(false);
		sorghumButton.setBackground(Color.WHITE);
		sorghumButton.setBorder(BorderFactory.createEmptyBorder());
					
		milletButton = new JButton();
		milletButton.addActionListener(this);
		milletButton.setText("Millet");
		milletButton.setIcon(milletImage);
		milletButton.setVerticalTextPosition(JButton.BOTTOM);
		milletButton.setHorizontalTextPosition(JButton.CENTER);
		milletButton.setFocusable(false);
		milletButton.setBackground(Color.WHITE);
		milletButton.setBorder(BorderFactory.createEmptyBorder());
						
		// Add items to the grainsPanel
		this.setSize(710, 485);
		this.setBounds(0, 50, 710, 485);
		this.setBackground(new Color(102, 255, 102));
		this.add(beansButton);
		this.add(peasButton);
		this.add(pigeonpeasButton);
		this.add(soyabeansButton);
		this.add(peanutsButton);
		this.add(greengramsButton);
		this.add(blackbeansButton);
		this.add(frenchbeansButton);
		this.add(lentilsButton);
		this.add(cornButton);
		this.add(riceButton);
		this.add(wheatButton);
		this.add(oatsButton);
		this.add(sorghumButton);
		this.add(milletButton);
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==beansButton) {
			System.out.println("You just ordered Beans");
		}
		else if (e.getSource()==peasButton) {
			System.out.println("You just ordered Peas");
		}
		else if (e.getSource()==pigeonpeasButton) {
			System.out.println("You just ordered Pigeon peas");
		}
		else if (e.getSource()==soyabeansButton) {
			System.out.println("You just ordered Soya beans");
		}
		else if (e.getSource()==peanutsButton) {
			System.out.println("You just ordered Peanuts");
		}
		else if (e.getSource()==greengramsButton) {
			System.out.println("You just ordered Green grams");
		}
		else if (e.getSource()==blackbeansButton) {
			System.out.println("You just ordered Black beans");
		}
		else if (e.getSource()==frenchbeansButton) {
			System.out.println("You just ordered French beans");
		}
		else if (e.getSource()==lentilsButton) {
			System.out.println("You just ordered Lentils");
		}
		else if (e.getSource()==cornButton) {
			System.out.println("You just ordered Corn");
		}
		else if (e.getSource()==riceButton) {
			System.out.println("You just ordered Rice");
		}
		else if (e.getSource()==wheatButton) {
			System.out.println("You just ordered Wheat");
		}
		else if (e.getSource()==oatsButton) {
			System.out.println("You just ordered Oats");
		}
		else if (e.getSource()==sorghumButton) {
			System.out.println("You just ordered Sorghum");
		}
		else if (e.getSource()==milletButton) {
			System.out.println("You just ordered Millet");
		}		
	}

}
