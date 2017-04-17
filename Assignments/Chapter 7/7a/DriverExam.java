

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
	
	
	
}

