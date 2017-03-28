package classwork;

import java.util.Scanner;

public class string {

	/**
	 * @param args
	 * @return 
	 */
	public static boolean keeper(String string1, String string2) {
		// TODO Auto-generated method stub
		boolean x = false;
		if (string1.equalsIgnoreCase(string2)){
			x = true;
		}
		return x;
	}
	public static int sifter(String string1, String string2){
		int y = 0;
		char[] matrice = string1.toCharArray();
		int[] list = new int[string1.length()];
		int listroll = 0;
		for (int i = 0; i < string1.length(); i++){
			list[i] = string2.indexOf(matrice[i]);
			//System.out.println(list[i]);
			if(list[i] == -1){
				break;
			}
			listroll += 1;
		}
		//System.out.println("hippo");
		char[] matriceNew = new char[listroll];
		for (int x = 0; x < listroll; x++){
			matriceNew[x] = matrice[x];
		}
		if (matriceNew.length == string1.length()){
			y = 1;
		}
		return y;
		
	}
	public static void main(String[] args){
		System.out.println("Please enter a string"+
				"(put a space at the end if you wish to exclude words which inlude " +
				"the string but are not equal to it)");
		Scanner input = new Scanner(System.in);
		String string1 = input.nextLine();
		System.out.println("Please enter another string " +
				"(put a space at the end if you did so with the first string)");
		Scanner input2 = new Scanner(System.in);
		String string2 = input2.nextLine();
	//System.out.println(keeper("", ""));
	//sifter("marklar, marklar, the 3rd", "marklar the 33rd");
	if(sifter(string1, string2) == 1){
		System.out.println("string1 is a substring of string2");
	}else{System.out.println("string1 is not a substring of string2");}
	//substring();
	/**if(substring() == 1){
		System.out.println(1+1);
	}
	**/
	
	}
	public static int substring(){
		int string3 = 2;
		System.out.println("Please enter a string"+
				"(put a space at the end if you wish to exclude words which inlude " +
				"the string but are not equal to it)");
		Scanner input = new Scanner(System.in);
		String string1 = input.nextLine();
		System.out.println("Please enter another string " +
				"(put a space at the end if you did so with the first string)");
		Scanner input2 = new Scanner(System.in);
		String string2 = input2.nextLine();
	//System.out.println(keeper("", ""));
	//sifter("marklar, marklar, the 3rd", "marklar the 33rd");
	if(sifter(string1, string2) == 1){
		System.out.println("string1 is a substring of string2");
		string3 = 1;
	}else{System.out.println("string1 is not a substring of string2");
	string3 = 0;}
	return string3;
	}

}
