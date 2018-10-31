import java.io.Console;
import java.util.*;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("max Position"+ RandomWalk());
	}
	
	private static int RandomWalk() {
		//algorithm
		int x = 0;
		int maxPosition = 0;
		Random rand = new Random();		
		while(x > -3 && x< 3) {
			Boolean increase = rand.nextBoolean();
			if(increase) {
				x++;
			}else {
				x--;
			}
			System.out.println("Position"+ x);
			if(maxPosition < x) {
				maxPosition = x;
			}			
		}
		
		return maxPosition;
	}

}

	


