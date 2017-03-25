package exersice1;

/**
 * Class to maintain Question and answer.
 * @author MohammedJuned
 * @author 300833356
 */
public class QuestionAnswer {
	String question="";
	String[] answers;
	String correctAnswer;
	public QuestionAnswer(String jQuestion, String[] allAnswers, String correctAnswer){
		this.question = jQuestion;
		this.answers = allAnswers;
		this.correctAnswer = correctAnswer;
	}
	public String getJavaQuestion() {
		return question;
	}
	public String[] getJavaAnswers() {
		return answers;
	}
	public String getCorrectJavaAnswer() {
		return correctAnswer;
	}
}