package Practice;

public class String_Prac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring = "I love pie, cats, and candy";
		String[] tokens = mystring.split("[,]");
		for (int i = 0; i < tokens.length; i++){
			System.out.println(tokens[i]);
		}
		String Q = new String(mystring);
		if (Q.equals(mystring)){
			System.out.println("Q = mystring");
			//Q should be equal to mystring
		}
		String otherstring = "I LOVE PIE, CATS, AND CANDY";
		if (otherstring.equals(mystring)){
			System.out.println("otherstring = mystring");
		}else{ System.out.println("otherstring =! mystring");
			//otherstring should not be equal to mystring
	}
		if (otherstring.equalsIgnoreCase(mystring)){
			System.out.println("otherstring = mystring");
			//otherstring should be equal to mystring
	}else{System.out.println("otherstring =! mystring");}
		String lazors1 = "Laser cannons";
		String lazors2 = "Laser Guns";
		System.out.println(lazors2.compareToIgnoreCase(lazors1));
		// lazors1 should be less than lazors2
		if (lazors1.regionMatches(7, lazors2, 7, 2)){
			System.out.println("true");
		}else{ System.out.println("false");
		//should return false unless (int, string, int, 0)
		}
		if (lazors1.regionMatches(7, lazors2, 7, 2)){
			System.out.println("true");
		}else{ System.out.println("false");
	}
		if (lazors1.startsWith(Q)){
			System.out.println("true");
		}else{System.out.println("false");}
		//should be false
		
		
		
		{
			System.out.println();
		}
	}
}
