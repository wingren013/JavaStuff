package midterm;


public class reverse_bubble_reverse {

	/**
	 * @param args
	 */
	public static int[] kill() {
		int[] myArray = { 34, 85, 37, 99, 1, 23, 75, 3, 65};
for (int red = 0; red <= myArray.length-1; red++){
	for (int black = myArray.length-1; black > red; black--){
		System.out.print(black+ " ");
		if(myArray[black]<myArray[black-1]){
			int x = myArray[black];
			myArray[black] = myArray[black-1];
			myArray[black-1] = x;
		}
	}
}
return myArray;
	}
	public static int[] murder() {
		int[] myArray = { 34, 85, 37, 99, 1, 23, 75, 3, 65};
for (int red = myArray.length-1; red >= 0; red--){
	for (int black = 0; black < red; black++){
		System.out.print(black+ " ");
		if(myArray[black]<myArray[black+1]){
			int x = myArray[black];
			myArray[black] = myArray[black+1];
			myArray[black+1] = x;
		}
	}
}
return myArray;
}
	public static void main(String[] args) {
//System.out.println(java.util.Arrays.toString(kill()));
System.out.println(java.util.Arrays.toString(murder()));

}
}