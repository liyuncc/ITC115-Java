import java.util.Scanner;

public class Assignment4 {

		//method main to interact with user
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a month between 1 and 12: ");
		int m = console.nextInt();
		System.out.println("Enter a date between 1 and 31: ");
		int d = console.nextInt();
		
		season(m,d);

	
	}	
		
	public static void season(int mon, int date) {
		if(mon <= 3 && date <= 15) {
			System.out.println("winter"); 
		}else if(mon <= 6 && date <= 15){
			System.out.println("spring"); 
		}else if(mon <= 9 && date <= 15) {
			System.out.println("summer"); 
		}else if(mon <= 12 && date <=15) {
			System.out.println("fall"); 
		}else {
			System.out.println("winter"); 
		}
	
		
	}
		

	
}