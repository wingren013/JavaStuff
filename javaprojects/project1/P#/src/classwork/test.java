package classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import java.String.StringBuilder;
//import string.StringBuilder;
//import String.StringBuilder;

public class test {

	/**
	 * @param args
	 */
	public static boolean match(String s1){
		String CurrentString = s1;
		Pattern patt = Pattern.compile("\\d{4}\\sMills");
	    Matcher m = patt.matcher(CurrentString);
	    boolean truFal;
	   if(m.find() == true){
		   truFal = true;
	   }else{truFal = false;}
		return truFal;
	}
	
	public static void trueP(){
		System.out.println("true");
	}
	public static void falseP(){
		System.out.println("false");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println('A' > 'a');
		//System.out.println('A' - 'a');
		// you cannot use mathematical expressions with characters
		//the -32 result is an error code
		
	
	   
	   
		if(match("122 Mills Dr. Sacramento") == true){
			trueP();
		}else{falseP();}
		
		if(match("1234 Mills Street, Kentfield") == true){
			trueP();
		}else{falseP();}
		
		if(match("3523 Mills Ave., San Mateo") == true){
			trueP();
		}else{falseP();}
		
		if(match("12 Mills Ave., Santa Rosa") == true){
			trueP();
		}else{falseP();}
		
		String s1 = "122 Mills Dr. Sacramento".replaceFirst("Dr.", "Drive");
		System.out.println(s1);
		String s2 = "1234 Mills Street, Kentfield".replaceAll("e", "X");
		System.out.println(s2);
		String[] s3 = "3523 Mills Ave., San Mateo".split("[ ]");
		System.out.println(s3[3]);
		char[] c1 = {'a', '.', '[', 'q', 'w', 'e', 'r', 't', 'y', ']', 'b', ' '};
		String str = new String(new char[] {'a', '.', '[', 'q', 'w', 'e', 'r', 't', 'y', ']', 'b', ' '});
		String str1 = new String(c1);
		
		String str2= c1.toString();
		System.out.println(str2);
		// why return as hex?
		
		String str3 = String.valueOf(c1);
		System.out.println(str+" "+str1+" "+str2+" "+str3);
		//String str4 = StringBuilder();
		
		String l1 = String.valueOf(54.5);
		System.out.println(l1);
		double l2 = Double.valueOf(l1);
		System.out.println(l2);
		String c2 = String.valueOf('a');
		System.out.println(c2);
		char c3 = '9';
		if(Character.isLetter(c3)){
			System.out.println(1);
		}else{System.out.println(0);}
		
		
		Character oil = new Character('a');
		Character water = new Character('A');
		System.out.println(oil.compareTo(water));
		System.out.println(oil.equals(water));
		// the result 32 refers to the fact that 'A' is 32 places distant from 'a'
		// the result false is because 'A' is as much a separate character from 'a' as 'f' is
	}
	
	

}
