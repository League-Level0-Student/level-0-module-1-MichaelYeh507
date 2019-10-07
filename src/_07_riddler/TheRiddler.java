package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
		"Who buys it, has no use for it.\r\n" + 
		"Who uses it can neither see nor feel it.\r\n" + 
		"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equalsIgnoreCase("a coffin")) {
JOptionPane.showMessageDialog(null, "Correct!");
score += 1;
} else {
JOptionPane.showMessageDialog(null, "Wrong!");
//5. Otherwise, say "wrong" and tell them the answer	
JOptionPane.showMessageDialog(null, "It's a coffin");
}
// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle2.equalsIgnoreCase("A stamp")) {
JOptionPane.showMessageDialog(null, "Correct!");
score += 1;
} else {
JOptionPane.showMessageDialog(null, "Wrong!");
//5. Otherwise, say "wrong" and tell them the answer	
JOptionPane.showMessageDialog(null, "It's a stamp");
}

String riddle3 = JOptionPane.showInputDialog("What is made of water but if you put it into water it will die?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle3.equalsIgnoreCase("An ice cube")) {
JOptionPane.showMessageDialog(null, "Correct!");
score += 1;
} else {
JOptionPane.showMessageDialog(null, "Wrong!");
//5. Otherwise, say "wrong" and tell them the answer	
JOptionPane.showMessageDialog(null, "It's an ice cube");
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);

}

}}