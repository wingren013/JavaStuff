package midterm;

public class multi_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrice[][];
		matrice = getarray();
		printArray(matrice);
		sum_diag(matrice);
	}
	public static int[][] getarray(){
		int matrice[][];
		matrice = new int[4][4];
		for(int x =0; x < 4; x++){
		for(int i= 0; i < 4; i++){
			double y = Math.rint(Math.random());
			matrice[i][x]=  (int) y;
		}
		}
		return matrice;
	}
	public static void printArray(int[][] series){
		for(int x =0; x < series.length; x++){
		for(int i=0; i< 4; i++){
			System.out.print(series[x][i] + " ");
			if(i == 3){
			System.out.println();
		}
		}
	}
	}
	public static int sum_diag(int[][] series){
		int sum = 0;
		for(int x = 0; x < series.length; x++){
			sum += series[x][x];
}
		System.out.println();
		System.out.println(sum);
		return sum;
	}
}
