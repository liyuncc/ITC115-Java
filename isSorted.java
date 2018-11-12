
public class isSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		boolean result1 = isSorted(list1);
		System.out.println(result1);
		boolean result2 = isSorted(list2);
		System.out.println(result2);
	}

		
	public static boolean isSorted(double[] list) {
		//if it is NOT sorted, return false. else, return true.
		for(int i = 0; i <list.length-1; i++) {
			if(list[i] > list[i+1]) {
				return false;
			}	
		}
		return true;
	}
}
