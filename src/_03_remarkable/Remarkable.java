package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String remarkable1 = " being a coder";
String remarkable2 = " knowing java";
String remarkable3 = " being kind";
String name1 = "Chris";
String name2 = "John";
String name3 = "James";

		// 2. Ask the user to enter a name. Store their answer in a variable.
String answer = JOptionPane.showInputDialog("Enter a name: Chris, John or James");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (answer.equalsIgnoreCase("Chris")) {
	JOptionPane.showMessageDialog(null, name1 + "is remarkable for " + remarkable1);
} else if (answer.equalsIgnoreCase("John")) {
	JOptionPane.showMessageDialog(null, name2 + "is remarkable for " + remarkable2);
} else {
	JOptionPane.showMessageDialog(null, name3 + "is remarkable for " + remarkable3);
}
}
}