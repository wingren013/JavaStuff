package classwork;

public class reverse_bubble {

	/**
	 * @param args
	 */
	public static int[] kill() {
		int[] myArray = { 4, 5, 2, 3, 7, 555, 11, 1, 7, 10};
for (int red = 0; red <= myArray.length-1; red++){
	for (int black = myArray.length-1; black > red; black--){
		System.out.println(black);
		if(myArray[black]<myArray[black-1]){
			int x = myArray[black];
			myArray[black] = myArray[black-1];
			myArray[black-1] = x;
		}
	}
}
return myArray;
	}
	public static void main(String[] args) {
System.out.println(java.util.Arrays.toString(kill()));
	}

}
