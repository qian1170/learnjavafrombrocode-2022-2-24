package toturial_from_brocode;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class JAVALABEL {

	public static void main(String[] args) {
		//JLabel = a GUI display area for a string of text, an iamge or both
		
		ImageIcon image = new ImageIcon("logo.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		
		
		JLabel label = new JLabel();//create a label
		label.setText("Bro, do you even code?");// set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);//set text left,center,right of imageicon
		label.setForeground(Color.green);//set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
		label.setIconTextGap(25);//set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true);//display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text
		//label.setBounds(100,100,900,900);//set x,y position within frame as well as dimensions
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();// it will fit your text_imageicon automatically and show all of them
		
		

	}

}
