
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int lastFib = 1, thisFib = 1, newFib, i;
		System.out.print(lastFib + " ");
		System.out.print(thisFib + " ");
		for(i = 1; i <= 10; i++) {
			newFib = lastFib + thisFib;
			lastFib = thisFib;
			thisFib = newFib;
			System.out.print(newFib + " ");
		}
		
		
		
		
		
		

			
		}
		
		
	}
	
	

