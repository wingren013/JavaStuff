package advanced_java;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Letters {

	/**
	 * @param args
	 */
	public static int[] countletters(String s) {
		int size = s.length();
		s.toLowerCase();
	//	char ch2 = 'a';
		int[] output = new int[s.length()];
		int[] alphabetArray = new int[26];
	    for ( int i = 0; i < s.length(); i++ ) {
	    	char ch=  s.charAt(i);
	         int value = (int) ch;
	         if (value >= 97 && value <= 122){
	        	 //System.out.println(value);
	        	// ch2 = (char) (value);
	        	// System.out.println(ch2);
	        	 output[i] = value;
	        	 //System.out.println(output[i]);
	         alphabetArray[ch-'a']++;
	        }
	    	
	    }
	    return output; 
	}
}

