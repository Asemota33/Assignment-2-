package michael_asemota_excercise1;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Scanner;


public class QuestionBank {

	static int p = 0;
	static int i;
	static Scanner input = new Scanner(System.in);
	static String[] questions = {"Question 1. Which print statement starts on a new line \n 1) system.out.print \n 2) system.out.println \n 3) system.out.printf \n 4) system.format \n"
			,"Question 2. What is the escape character \n 1) \\ \n 2) * \n 3) h \n 4) $ \n"
			,"Question 3. Which way do we read data in Java \n 1) Scanner \n 2) IntNext \n 3) Hello World \n 4) system.out \n"
			,"Question 4. Which is a relational operator \n 1) * \n 2) = \n 3) != \n 4) # \n"
			,"Question 5. Which is not a valid identifier \n 1) myValue \n 2) _ $$$$ \n 3) helloWorld \n 4) myLife \n"
			};
	
	public static void simulateQuestion() {
			
		for(i = 0; i < questions.length; i ++) {
			System.out.print(questions[i]);
		}
	}
	
	public static void inputAnswer() {
		simulateQuestion();
		System.out.println("\nPlease enter your responses below: ");
		int total = 5;
		for(int i = 0; i < 5; i++) {
			System.out.printf("Question %d. ", i + 1);
			p++;
		int userInput = input.nextInt();
		boolean newAnswer = checkAnswer(userInput);
		if(newAnswer == false) {
			total -= 1;
		}
		generateMessage(newAnswer);
		}
		double percent = (double)total / (double)5 * 100 ;
		System.out.printf("Score: %d/5 %.0f%%" , total, percent);
		
	}
	
	public static void generateMessage(boolean answer) {
		SecureRandom randomNumber = new SecureRandom();
		
		switch(randomNumber.nextInt(4))
		{
		case 0: 
			if (answer == true) {
				System.out.println("Excellent!");
				break;
			}
			else if (answer == false){
				System.out.println("Better Luck Next time");
				break;
			}
		case 1: 
			if (answer == true) {
				System.out.println("You're a superstar!");
				break;
			}
			else if (answer == false){
				System.out.println("Keep Trying");
				break;
				}
		case 2: 
				if (answer == true) {
					System.out.println("Phenomenal!");
					break;
					}
				else if (answer == false){
					System.out.println("Don't give up");
					break;
					}
		case 3: 
			if (answer == true) {
				System.out.println("Great Job!");
				break;
			}
			else if (answer == false){
				System.out.println("Try Again");
				break;
			}
		
		}
		
		
	}
	public static boolean checkAnswer(int answer) {
		//System.out.println(p);
		if (p == 1 && answer == 2) {
			 return true;
	}
		else if (p == 2 && answer == 1 ) {
			 return true;
	}
		else if (p == 3 && answer == 1 ) {
			 return true;
	}
		else if (p == 4 && answer == 3 ) {
			 return true;
	}
		else if (p == 5 && answer == 2 ) {
			 return true;
	}
		else {
			return false;
		}
	}
}//end of class
