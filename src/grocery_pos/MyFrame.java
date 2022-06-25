package grocery_pos;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	JFrame frame = new JFrame();
	MyFrame(){
		this.setTitle("Grocery POS");
		this.setSize(750, 420);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
