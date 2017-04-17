

public class DriverExam {
	// array that holds the correct answers
	private String[] answerKey = {"b", "d", "a", "a", "c",
								  "a", "b", "a", "c", "d",
								  "b", "c", "d", "a", "d",
								  "c", "c", "b", "d", "a"};
	// array that will eventually hold the student's answers
	private String[] studentAnswers = new String[20];
	
	// only will need a setter for the student answers
	public void setStudentAnswers(String[] studentAnswers) {
		this.studentAnswers = studentAnswers;
	}
	
	// --- BEGIN GETTERS --- //
	public String[] getAnswerKey() {
		return answerKey;
	}

	public String[] getStudentAnswers() {
		return studentAnswers;
	}
	// --- END GETTERS --- //
	
	/**
	 * Method for determining whether the student passed or failed
	 * @param studentAnswers
	 * @param answerKey
	 * @return true / false depending on passing
	 */
	public static boolean passed(String[] studentAnswers, String[] answerKey) {
		int totalCorrect = totalCorrect(studentAnswers, answerKey);
		// student must correctly answer 15 out of 20, to pass the exam
		if (totalCorrect >= 15) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int totalCorrect(String[] studentAnswers, String[] answerKey) {
		int totalCorrect = 0;
		
		// for-loop to loop through the array
		for (int index = 0; index < studentAnswers.length; index++) {
			if (studentAnswers[index].equals(answerKey[index])) {
				totalCorrect += 1;
			}
		}
		
		return totalCorrect;
	}
	
	public static int totalIncorrect(String[] studentAnswers, String[] answerKey) {
		
	}
	
	public static int[] questionsMissed(String[] studentAnswers, String[] answerKey) {
		
	}
	
	
}
