package GamePlay;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePlay extends Frame {
	JFrame frame = new JFrame("Casino");
	JPanel panel = new JPanel();
	
	public GamePlay(){
		frame.setVisible(true);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setBackground(Color.BLACK);
	}
	public static void main(String[] args) {
	      new GamePlay();
	   }
}
