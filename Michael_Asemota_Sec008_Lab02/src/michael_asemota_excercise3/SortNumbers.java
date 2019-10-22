package michael_asemota_excercise3;
import java.util.Arrays;
import java.util.Collections;

public class SortNumbers {
	
	static int[] array;

	public static void sortNumber(int... numbers) {
		
		int holder;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				// Compares array values and switches them if the lower array place 
				// holder is less than the greater
				if (numbers[i] < numbers[j]) {
					holder = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = holder;
				} 
			}
		}
		System.out.println("Numbers in Descending Order: \n");
		for(int i : numbers) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		SortNumbers sort = new SortNumbers();
		sort.sortNumber(100, 99, 25, 54, 32, 23);
	}
}
