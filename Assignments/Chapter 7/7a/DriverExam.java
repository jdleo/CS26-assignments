

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
	
	/**
	 * Method for determining how many correct answers the student had
	 * @param studentAnswers
	 * @param answerKey
	 * @return amount of correct answers (int)
	 */
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
	
	/**
	 * Method for determining number of incorrect answers the student had
	 * @param studentAnswers
	 * @param answerKey
	 * @return number of incorrect answers (int)
	 */
	public static int totalIncorrect(String[] studentAnswers, String[] answerKey) {
		int totalIncorrect = 0;
		
		// for-loop to loop through the array
				for (int index = 0; index < studentAnswers.length; index++) {
					if ( !studentAnswers[index].equals(answerKey[index]) ) {
						totalIncorrect += 1;
					}
				}
				
		return totalIncorrect;
	}
	
	/**
	 * Method for giving us a list of the question numbers student got wrong
	 * @param studentAnswers
	 * @param answerKey
	 * @return int[] object with question numbers
	 */
	public static int[] questionsMissed(String[] studentAnswers, String[] answerKey) {
		int missed[] = new int[totalIncorrect(studentAnswers, answerKey)];
		
		// for-loop 
		for (int index = 0; index < studentAnswers.length; index++) {
			if ( !studentAnswers[index].equals(answerKey[index]) ) {
				
				//has to be index+1 because we want the exact question #
				missed[index] = index+1;
			}
		}
		
		return missed;
	}
	
	
}
