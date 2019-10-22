package michael_asemota_excercise2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int answer = 0;
		
		Scanner input = new Scanner(System.in);
		//Checks answer
		for(boolean hello = false; hello == false;) {
		System.out.println("Please enter a number from 3 - 27");
			answer = input.nextInt();
			if(answer <= 27 && answer > 3) {
				hello = true;
			}
			else {
			hello = false;
			}
			}
		// Different Lotto classes numbers
				LottoClass test1 = new LottoClass();
				int sum1 = test1.getFirstN() + test1.getSecondN() + test1.getThirdN();
				System.out.printf("First Number %d Second Number %d Third Number %d\n"
						,test1.getFirstN(), test1.getSecondN(), test1.getThirdN());
				System.out.printf("Lotto 1 Sum %d\n",sum1);
				
				LottoClass test2 = new LottoClass();
				int sum2 = test2.getFirstN() + test2.getSecondN() + test2.getThirdN();
				System.out.printf("First Number %d Second Number %d Third Number %d\n"
						,test2.getFirstN(), test2.getSecondN(), test2.getThirdN());
				System.out.printf("Lotto 2 Sum %d\n",sum2);
				
				LottoClass test3 = new LottoClass();
				int sum3 = test3.getFirstN() + test3.getSecondN() + test3.getThirdN();
				System.out.printf("First Number %d Second Number %d Third Number %d\n",test3.getFirstN(), test3.getSecondN(), test3.getThirdN());
				System.out.printf("Lotto 3 Sum %d\n",sum3);
				
				LottoClass test4 = new LottoClass();
				int sum4 = test4.getFirstN() + test4.getSecondN() + test4.getThirdN();
				System.out.printf("First Number %d Second Number %d Third Number %d\n"
						,test4.getFirstN(), test4.getSecondN(), test4.getThirdN());
				System.out.printf("Lotto 4 Sum %d\n",sum4);
				
				LottoClass test5 = new LottoClass();
				int sum5 = test5.getFirstN() + test5.getSecondN() + test5.getThirdN();
				System.out.printf("First Number %d Second Number %d Third Number %d\n"
						,test5.getFirstN(), test5.getSecondN(), test5.getThirdN());
				System.out.printf("Lotto 5 Sum %d\n",sum5);
				
				if (answer == sum1 || answer == sum2 || answer == sum3 || answer == sum4 || answer == sum5) {
					System.out.printf("Your Guess: %d\n",answer);
					System.out.println("I Lose You win :(");
				}
				else {
					System.out.printf("Your Guess: %d\n",answer);
					System.out.println("I win You Lose ! :)");
				}
				

	}

}
