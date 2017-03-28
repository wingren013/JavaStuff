package misc;

public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+ + + + +
		int i = 0;
		while(i <= 5){
			i++;
			while(i == 1){
				System.out.println("+ + + + +");
				i++;
			}
			while(i == 2){
				System.out.println("+ + + +");
				i++;
			}
			while(i == 3){
				System.out.println("+ + +");
				i++;
			}
			while( i== 4){
				System.out.println("+ +");
				i++;
			}
			while(i== 5){
				System.out.println("+");
				i++;
			}
		}
	}

}