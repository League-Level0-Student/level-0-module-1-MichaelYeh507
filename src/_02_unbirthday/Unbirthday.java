package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String userBDay = JOptionPane.showInputDialog("What is your birthday");
		
		if (userBDay.equals("9/30")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
			
		} else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}
}
}
