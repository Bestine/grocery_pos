package grocery_pos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	JFrame frame = new JFrame();
	MyFrame(){
		JLabel titleLabel = new JLabel();
		
		titleLabel.setText("Grocery POS");
		titleLabel.setBounds(0, 0, 50, 750);
		titleLabel.setFont(new Font("Mv Boli", Font.BOLD, 50));
		titleLabel.setForeground(Color.BLUE);
		
//		this.setLayout(null);
		this.setTitle("Grocery POS");
//		this.setSize(750, 420);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(titleLabel);
		this.pack();
	}

}
