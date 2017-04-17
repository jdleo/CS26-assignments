import javax.swing.JOptionPane;

/** @author John Leonardo */

public class Main {
	public static void main(String[] args) {
		
		// create a DriverExam object
		DriverExam exam = new DriverExam();
		
		//create array for holding student answers, to set in DriverExam
		String[] studentAnswers = new String[20];
		
		for(int i = 0; i < studentAnswers.length; i++) {
			String attempt;
			
			//answer must be a,b,c,d
			do {
				attempt = JOptionPane.showInputDialog(
						"Enter your answer for Question #" + (i+1));
			} while (attempt.toLowerCase() == "a" ||
					attempt.toLowerCase() == "b" ||
					attempt.toLowerCase() == "c" ||
					attempt.toLowerCase() == "d");
			
			studentAnswers[i] = attempt.toLowerCase();
		}
	}
}
