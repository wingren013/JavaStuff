package universal_assets$copy_and_paste;

public class testbed {

	/**
	 * @param args
	 * @return 
	 */
	public static void lb(int x){
		for(int i = 0; i < x; i++){
		System.out.println();
		}
	}
	public static boolean duplicate(int[] series, int n_position, int n){
		for(int i = 0; i < n_position; i++){
			if(series[i] == n){
				return true;
			}
		}
		return false;
	}
	public static void generateRandomArrayExclusive(int[] series, int x, int y){
		int size = 0;
		int a = 0;
		int b= 0;
		int n =0;
		if(x > y){
			size = x-y;
			a = y;
			b = x;
		}else if(y >x){
			size = y-x;
			a = x;
			b = y;
		}else{
			System.out.println("ERROR");
		}
		for(int i=0; i < size; i++){
			n = (int) (a+Math.random()*(b-a+1));
			if(duplicate(series, i, n)==true){
				i += -1;
			}else{
				series[i] = n;
			}
		}
		printArray(series);
	}
	public static void printArray(int[] series){
			for(int i=0; i< series.length; i++){
				System.out.print(series[i] + " ");
			}
		}
	public static void methodTest(int[] test_array, int size){
		for(int i = 0; i < size; i++){
			test_array[i]= 10+(i);
		}
	}
	public static void printRandomArrayEntry(int[] test_array, int entries){
		for(int i = 0; i < entries; i++){
		int	n = (int) (Math.random()*(test_array.length));
				System.out.print(test_array[n]+" ");
		}
	}
	public static void printRandomArrayEntry_as_hex(int[] test_array, int entries){
		for(int i = 0; i < entries; i++){
		int	n = (int) (Math.random()*(test_array.length));
				System.out.print(Integer.toHexString(test_array[n])+" ");
		}
	}
	public static void printRandomArrayEntry_as_bin(int[] test_array, int entries){
		for(int i = 0; i < entries; i++){
		int	n = (int) (Math.random()*(test_array.length));
				System.out.print(Integer.toBinaryString(test_array[n])+" ");
		}
	}
	public static void printRandomArrayEntry_as_digits(int[] test_array, int entries){
		for(int i = 0; i < entries; i++){
		int	n = (int) (Math.random()*(test_array.length));
				System.out.print(test_array[n]);
		}
	}
	public static void printRandomArrayEntry_as_digits_input(int[] test_array, int entries){
		for(int i = 0; i < entries; i++){
		int	n = (int) (Math.random()*(test_array.length));
				System.out.print(test_array[n]);
		}
	}
	public static void printRandomArrayEntry_as_hex_digits(int[] test_array, int entries){
		for(int i = 0; i < entries; i++){
		int	n = (int) (Math.random()*(test_array.length));
				System.out.print(Integer.toHexString(test_array[n]));
		}
	}

	public static void main(String[] args) {
		int [] test_array = new int[6];
		int [] series = new int[20];
		// TODO Auto-generated method stub
		generateRandomArrayExclusive(series, 1, 19);
		methodTest(test_array, 6);
		System.out.println();
		printRandomArrayEntry(test_array, 1);
		lb(1);
		printRandomArrayEntry(series, 1);
		lb(1);
		printRandomArrayEntry_as_bin(series, 15);
		lb(1);
		printRandomArrayEntry_as_digits(series, 2);
		lb(1);
		printRandomArrayEntry_as_digits(series, 15);
		lb(1);
		printRandomArrayEntry_as_hex(series, 15);
		lb(1);
		printRandomArrayEntry_as_hex_digits(series, 15);
		lb(1);
	}

}
