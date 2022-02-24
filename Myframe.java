package toturial_from_brocode;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame{
	
	Myframe() {
		
		this.setTitle("Cat is the best!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(420,420);
		this.setResizable(false);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("logo.png"); 
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(103,60,200));
		
		
		
		
	}

}
