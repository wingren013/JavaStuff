package Practice;

public class sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 2 , 4 , 3 , 7 , 11 , 555 , 444 , 1};
		java.util.Arrays.sort(myArray);
		int[] myArray2 = { 1 , 2 , 3 , 4 , 7 , 11 , 444 , 555};
		java.util.Arrays.sort(myArray2);
		java.util.Arrays.binarySearch(myArray, 3);
		System.out.println(java.util.Arrays.binarySearch(myArray, 4));
		System.out.println(java.util.Arrays.binarySearch(myArray2, 4));
	}

}
