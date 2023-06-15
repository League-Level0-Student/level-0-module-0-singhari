package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
	if (score == 0) {
		String prompt =  JOptionPane.showInputDialog("Are chicken nuggets good?");
				// 2.  Ask the user a question 
				if (prompt.equals("yes")) {
					score = score+1;
				}
	}
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		if (score ==1) {
			String prompt =  JOptionPane.showInputDialog("Pick one: Pie or Cake");
			
			if (prompt.equals("Cake")) {
				score = score+1;
			}
		}
		if (score ==2) {
			String t =  JOptionPane.showInputDialog("Is 7 a good number?");
			if (t.equals("yes")) {
				score = score+1;
			}
		}
		// After all the questions have been asked, tell the user their final score 
		else {
			JOptionPane.showMessageDialog(null,score);
		}
	}
}
