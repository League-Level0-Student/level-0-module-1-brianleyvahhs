package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
        int Score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
        String Answer1 = JOptionPane.showInputDialog("What Can Travel Around The World While Staying In A Corner?");
        // 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
        if(Answer1.equals("stamp")) {
        	JOptionPane.showMessageDialog(null, "Correct"); Score = Score+1;} else {JOptionPane.showMessageDialog(null, "Wrong");}

        String Answer2 = JOptionPane.showInputDialog("Who makes it, has no need for it. Who buys it, has no use for it. Who uses it, can either see or feel it. What is it?");
        if(Answer2.equals("coffin")) {
        	JOptionPane.showMessageDialog(null, "Correct"); Score = Score+1;} else {JOptionPane.showMessageDialog(null, "Wrong");}
        
        String Answer3 = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, and the rich need it, and if you eat it, you'll die?");
        if(Answer3.equals("nothing")) {
        	JOptionPane.showMessageDialog(null, "Correct"); Score = Score+1;} else {JOptionPane.showMessageDialog(null, "Wrong");}
        // 2. Make a pop up to show the score.
        JOptionPane.showMessageDialog(null, "Total Score: " + Score);
		
	}
}