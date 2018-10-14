
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersOfN(4,3);
		System.out.println();
		printPowersOfN(5,6);
	}
	
	public static void printPowersOfN(int n, int power) {
		// use java math class
		for(int i= 0; i<= power; i++) {
			Math.pow(n, i);
			System.out.print((int)Math.pow(n, i) + " ");
		
	}
		
	}
	

}
