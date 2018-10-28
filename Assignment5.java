import java.util.*;

public class Assignment5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeGuesses();
		
	}
	public static void makeGuesses() {
		Random r = new Random();
		int num = 0;
		int count = 0;
		while(num < 48) {
			num = r.nextInt(50) +1;
			System.out.println("Guess = " + num);
			count++;
		}
		System.out.println("total guesses = " + count);
	}
}
