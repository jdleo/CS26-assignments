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
			} while (!attempt.toLowerCase().equals("a") &&
					!attempt.toLowerCase().equals("b") &&
					!attempt.toLowerCase().equals("c") &&
					!attempt.toLowerCase().equals("d"));
			
			studentAnswers[i] = attempt.toLowerCase();
		}
		
		// set student answers in our exam object
		exam.setStudentAnswers(studentAnswers);
		
		// display result message
		if (exam.passed(studentAnswers, exam.getAnswerKey())) {
			String prompt = String.format("YOU PASSED! \n"
					+ "Total Correct: %s \n"
					+ "Total Incorrect: %s \n"
					+ "Questions Missed: %s", 
					exam.totalCorrect(studentAnswers, exam.getAnswerKey()),
					exam.totalIncorrect(studentAnswers, exam.getAnswerKey()),
					exam.questionsMissed(studentAnswers, exam.getAnswerKey()).toString());
			JOptionPane.showMessageDialog(null, prompt);
		} else {
			String prompt = String.format("YOU FAILED! \n"
					+ "Total Correct: %s \n"
					+ "Total Incorrect: %s \n"
					+ "Questions Missed: %s", 
					exam.totalCorrect(studentAnswers, exam.getAnswerKey()),
					exam.totalIncorrect(studentAnswers, exam.getAnswerKey()),
					exam.questionsMissed(studentAnswers, exam.getAnswerKey()).toString());
			JOptionPane.showMessageDialog(null, prompt);
		}
	}
}
