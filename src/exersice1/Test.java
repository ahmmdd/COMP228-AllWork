package exersice1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;
/**
 * Class to simulate a java test
 * @author Mohammed Ahmed
 * @author 300833356
 *
 */
public class Test extends JDialog {
	JButton btnNext = new JButton("Next");
	ButtonGroup group = new ButtonGroup();
	String[] correctMessages = {"Excellent!!","Good!!","Keep up the Good Work!!","Nice Work!!"};
	String[] incorrectMessages = {"No.Please try again","Wrong. Try once more","Don't give up!","No. Keep trying.."};
	Random random = new Random();
	List<QuestionAnswer> javaQuestions = new ArrayList<QuestionAnswer>();
	/**
	 * Constructor
	 */
	public Test(){
		super();
		setTitle("Java Test");
		setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
	/**
	 * Interacts with user and creates questions and answers.
	 */
	public int inputAnswer(){
		javaQuestions.add(new QuestionAnswer("1. Which of these packages contains all the classes and methods required for event handling in Java?", new String[]{"java.applet", "java.awt","java.event", "java.awt.event"}, "java.awt.event"));
		javaQuestions.add(new QuestionAnswer("2. Java Source Code is compiled into?", new String[]{".exe",".jar","bytecode","sourcecode"}, "bytecode"));
		javaQuestions.add(new QuestionAnswer("3. Which of the following cannot be used as a variable name in java?", new String[]{"identifier","keyword","both a and b","None of the mentioned"}, "keyword"));
		javaQuestions.add(new QuestionAnswer("4. Which of these data type value is returned by equals() method of String class?", new String[]{"char","int","boolean","None of the mentioned"}, "boolean"));
		javaQuestions.add(new QuestionAnswer("5. What is the process of defining more than one method in a class differentiated by method signature?", new String[]{"Method overriding","Method overloading","Function doubling","None of the mentioned"}, "Method overloading"));
		int score=0;
		int count=0;
		for (QuestionAnswer quest : javaQuestions){
			count++;
			simulateQuestion(quest, count);
			if (group.getSelection()!=null && group.getSelection().getActionCommand().equals(quest.getCorrectJavaAnswer())){
				score++;
			}
		}
		dispose();
		return score;
	}
	/**
	 * Simulates each question with the correct and incorrect answers
	 * @param q
	 */
	private void simulateQuestion(QuestionAnswer q, int questCount){
		getContentPane().removeAll();
		JLabel questionLabel = new JLabel(q.getJavaQuestion());
		getContentPane().add(questionLabel);
		for (String answer : q.getJavaAnswers()){
			JRadioButton radio = new JRadioButton(answer);
			radio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					_checkAnswer(e, q.correctAnswer);
				}
			});
			radio.setActionCommand(answer);
			group.add(radio);
			getContentPane().add(radio);
		}
		if(questCount==javaQuestions.size()){
			btnNext.setText("Score");
		}
		getContentPane().add(btnNext);
		pack();
		setVisible(true);
	}
	/**
	 * Checks for correct and incorrect answers.
	 * @param e
	 * @param cAnswer
	 */
	private void _checkAnswer(ActionEvent e, String cAnswer){
		if(e.getActionCommand().equalsIgnoreCase(cAnswer)){
			_simulateMessage(true);
		}else{
			_simulateMessage(false);
		}
	}
	/**
	 * Simulates random messages for correct and incorrect answers
	 */

	private void _simulateMessage(Boolean ans){
		int randomNumber = random.nextInt(4);
		if(ans){
			JOptionPane.showMessageDialog(this, correctMessages[randomNumber],"Correct Answer",-1);
		}else{
			JOptionPane.showMessageDialog(this, incorrectMessages[randomNumber],"Incorrect Answer",0);
		}
	}
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String args[]) {
		Test quiz = new Test();
		double numOfQuestions = 5;
		double passedScore = quiz.inputAnswer();
		double passPercentage = (passedScore/numOfQuestions)*100;
		JOptionPane.showMessageDialog(null,"Your score is "+((int) passedScore)+" out of "+((int)numOfQuestions)+". Your pass percentage is "+((int)passPercentage)+"%","",JOptionPane.INFORMATION_MESSAGE);
	}
}
