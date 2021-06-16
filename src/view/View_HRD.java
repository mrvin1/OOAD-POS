package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View_HRD extends JFrame{
	private JLabel username_label;
	private JLabel password_label;
	void setFrame() {
		setSize(800, 600);
		setTitle("HRD");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void setField() {
		
	}
	public View_HRD() {
		setFrame();  
		setField();
		setVisible(true);
		
	}
}
