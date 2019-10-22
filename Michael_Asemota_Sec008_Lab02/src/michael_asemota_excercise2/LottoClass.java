package michael_asemota_excercise2;
import java.security.SecureRandom;

public class LottoClass {
	
	static int[] array;
	
	static int firstN;
	static int secondN;
	static int thirdN;
	
	public static int getFirstN() {return firstN;}
	public static int getSecondN() {return secondN;}
	public static int getThirdN() {return thirdN;}
	

	
	public LottoClass() {
		SecureRandom randomNumber = new SecureRandom();
		firstN = randomNumber.nextInt(8) + 1;
		secondN = randomNumber.nextInt(8) + 1;
		thirdN = randomNumber.nextInt(8) + 1;
	}
	
	public static int[] populateArray() {
		array = new int[] {
				getFirstN(),
				getSecondN(),
				getThirdN()
		};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		return array;
	}
	

}
