package advanced_java;

public class Convert_ascii {

	/**
	 * @param args
	 */

	public static String convert(int[] input){
		String output = "";
		char ch = 'a';
				for(int i =0; i < input.length; i++){
					ch = (char) input[i];
					output += ch;
				}
		//System.out.println(output);
		return output;
	}

}
