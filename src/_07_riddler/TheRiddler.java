package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Total = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
        String Answer1 = JOptionPane.showInputDialog("What Can Travel Around The World While Staying In A Corner?");
        if(Answer1.equals("Stamp")) {
        	JOptionPane.showMessageDialog(null, "Correct, +1 Point"); Total = Total + 1;}
      else {
         	JOptionPane.showMessageDialog(null, "Incorrect, -1 Point"); Total = Total - 1;
     	}
        
        String Answer2 = JOptionPane.showInputDialog("A sphere has three, a circle has two, and a point has zero. What is it?");
        if(Answer2.equals("Dimenesions")) {
        	JOptionPane.showMessageDialog(null, "Correct, +1 Point"); Total = Total + 1;}
      else {
         	JOptionPane.showMessageDialog(null, "Incorrect, -1 Point"); Total = Total - 1;
     	}
        
    	String Answer3 = JOptionPane.showInputDialog("What does a girl have 4 of and a cow have 3 of?");
        if(Answer3.equals("Letters")) {
        	JOptionPane.showMessageDialog(null, "Correct, +1 Point"); Total = Total + 1;}
      else {
         	JOptionPane.showMessageDialog(null, "Incorrect, -1 Point"); Total = Total - 1;
     	}
        
    	String Answer4 = JOptionPane.showInputDialog("What runs around the whole yard without moving?");
        if(Answer4.equals("Fence")) {
        	JOptionPane.showMessageDialog(null, "Correct, +1 Point"); Total = Total + 1;}
      else {
         	JOptionPane.showMessageDialog(null, "Incorrect, -1 Point"); Total = Total - 1;}
        
        // 4. If they got the answer right, pop up "correct!" and increase the score by one
        
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	    JOptionPane.showMessageDialog(null, "Total: " + Total);
	}};