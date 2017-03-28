package Chapter_5;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class genmeth {

	/**
	 * @param args
	 */
	public static String format_numbers(String format_format, double input) {
		// TODO Auto-generated method stub
		DecimalFormat generic = new DecimalFormat(format_format);
		String output = generic.format(input);
		return output;
	}
	public static String dollar_format(double input) {
		// TODO Auto-generated method stub
		DecimalFormat generic = new DecimalFormat("$####.##");
		String output = generic.format(input);
		return output;
	}
	public static double parseD(String x){
		double x1= Double.parseDouble(x);
		return x1;
	}
	public static int parseI(String x){
		int x1= Integer.parseInt(x);
		return x1;
	}
	public static String parseSD(double x){
		String x1= Double.toString(x);
		return x1;
	}
	public static String parseSI(int x){
		String x1= Double.toString(x);
		return x1;
	}
	public static double SEQsumINPUT(String input1, String input2, String input3, String input4, String input5) {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat("####.##");
		
			//String input1 =	JOptionPane.showInputDialog(null, "What number does the sequence begin with?");
			//String input2 = JOptionPane.showInputDialog(null, "What number does the sequence end with?");
			//String input3 = JOptionPane.showInputDialog(null, "All numbers in the sequence must be divisible by what?");
			//String input4 = JOptionPane.showInputDialog(null, "All numbers in the sequence are to what power?");
			//String input5 = JOptionPane.showInputDialog(null, "All numbers in the sequence are divided by what?");
			
			double x1= Double.parseDouble(input1);
			double x2= Double.parseDouble(input2);
			double x3= Double.parseDouble(input3);
			double x4= Double.parseDouble(input4);
			double x5= Double.parseDouble(input5);
		 double sum = 0;
		 double i=x1-1;
		 int count = 0;
		 
		 
		 while(i < x2){
			 i++;
			 if(i%x3 == 0){
			 		count++;
					sum = Math.pow(i/x5, x4)+ sum;
			 }
				}
		 		//String sum1 = myFormat.format(sum);
				//String sum2 = myFormat.format(sum/count);
		        //System.out.println(sum1);
		        //System.out.println(sum2);
		       // System.out.println(count);
		        
		        	return sum;
		        }
	public static double SEQsum() {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat("####.##");
		
			String input1 =	JOptionPane.showInputDialog(null, "What number does the sequence begin with?");
			String input2 = JOptionPane.showInputDialog(null, "What number does the sequence end with?");
			String input3 = JOptionPane.showInputDialog(null, "All numbers in the sequence must be divisible by what?");
			String input4 = JOptionPane.showInputDialog(null, "All numbers in the sequence are to what power?");
			String input5 = JOptionPane.showInputDialog(null, "All numbers in the sequence are divided by what?");
			
			double x1= Double.parseDouble(input1);
			double x2= Double.parseDouble(input2);
			double x3= Double.parseDouble(input3);
			double x4= Double.parseDouble(input4);
			double x5= Double.parseDouble(input5);
		 double sum = 0;
		 double i=x1-1;
		 int count = 0;
		 
		 
		 while(i < x2){
			 i++;
			 if(i%x3 == 0){
			 		count++;
					sum = Math.pow(i/x5, x4)+ sum;
			 }
				}
		 		//String sum1 = myFormat.format(sum);
				//String sum2 = myFormat.format(sum/count);
		        //System.out.println(sum1);
		        //System.out.println(sum2);
		        //System.out.println(count);
		       
		        	return sum;	
		        }
	public static double SEQaverage() {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat("####.##");
		
			String input1 =	JOptionPane.showInputDialog(null, "What number does the sequence begin with?");
			String input2 = JOptionPane.showInputDialog(null, "What number does the sequence end with?");
			String input3 = JOptionPane.showInputDialog(null, "All numbers in the sequence must be divisible by what?");
			String input4 = JOptionPane.showInputDialog(null, "All numbers in the sequence are to what power?");
			String input5 = JOptionPane.showInputDialog(null, "All numbers in the sequence are divided by what?");
			
			double x1= Double.parseDouble(input1);
			double x2= Double.parseDouble(input2);
			double x3= Double.parseDouble(input3);
			double x4= Double.parseDouble(input4);
			double x5= Double.parseDouble(input5);
		 double sum = 0;
		 double i=x1-1;
		 int count = 0;
		 
		 
		 while(i < x2){
			 i++;
			 if(i%x3 == 0){
			 		count++;
					sum = Math.pow(i/x5, x4)+ sum;
			 }
				}
		 		//String sum1 = myFormat.format(sum);
				//String sum2 = myFormat.format(sum/count);
		        //System.out.println(sum1);
		        //System.out.println(sum2);
		        //System.out.println(count);
		       
		        	return sum/count;	
		        }
	public static double SEQaverageINPUT(String input1, String input2, String input3, String input4, String input5) {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat("####.##");
		
			//String input1 =	JOptionPane.showInputDialog(null, "What number does the sequence begin with?");
			//String input2 = JOptionPane.showInputDialog(null, "What number does the sequence end with?");
			//String input3 = JOptionPane.showInputDialog(null, "All numbers in the sequence must be divisible by what?");
			//String input4 = JOptionPane.showInputDialog(null, "All numbers in the sequence are to what power?");
			//String input5 = JOptionPane.showInputDialog(null, "All numbers in the sequence are divided by what?");
			
			double x1= Double.parseDouble(input1);
			double x2= Double.parseDouble(input2);
			double x3= Double.parseDouble(input3);
			double x4= Double.parseDouble(input4);
			double x5= Double.parseDouble(input5);
		 double sum = 0;
		 double i=x1-1;
		 int count = 0;
		 
		 
		 while(i < x2){
			 i++;
			 if(i%x3 == 0){
			 		count++;
					sum = Math.pow(i/x5, x4)+ sum;
			 }
				}
		 		//String sum1 = myFormat.format(sum);
				//String sum2 = myFormat.format(sum/count);
		       // System.out.println(sum1);
		        //System.out.println(sum2);
		        //System.out.println(count);
		        
		        	return sum/count;
		        }
	public static double SEQaverageINPUTbasic(double x1, double x2) {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat("####.##");
		
			//String input1 =	JOptionPane.showInputDialog(null, "What number does the sequence begin with?");
			//String input2 = JOptionPane.showInputDialog(null, "What number does the sequence end with?");
			//String input3 = JOptionPane.showInputDialog(null, "All numbers in the sequence must be divisible by what?");
			//String input4 = JOptionPane.showInputDialog(null, "All numbers in the sequence are to what power?");
			//String input5 = JOptionPane.showInputDialog(null, "All numbers in the sequence are divided by what?");

		 double sum = 0;
		 double i=x1-1;
		 int count = 0;
		 
		 
		 while(i < x2){
			 i++;
			 		count++;
					sum = i+ sum;
				}
		 		//String sum1 = myFormat.format(sum);
				//String sum2 = myFormat.format(sum/count);
		        //System.out.println(sum1);
		        //System.out.println(sum2);
		       // System.out.println(count);
		        
		        	return sum/count;
		        }
	public static double SEQsumINPUTbasic(double input1, double input2) {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat("####.##");
		
			//String input1 =	JOptionPane.showInputDialog(null, "What number does the sequence begin with?");
			//String input2 = JOptionPane.showInputDialog(null, "What number does the sequence end with?");
			//String input3 = JOptionPane.showInputDialog(null, "All numbers in the sequence must be divisible by what?");
			//String input4 = JOptionPane.showInputDialog(null, "All numbers in the sequence are to what power?");
			//String input5 = JOptionPane.showInputDialog(null, "All numbers in the sequence are divided by what?");
			
			double x1= input1;
			double x2= input2;
			double x3= 1;
			double x4= 1;
			double x5= 1;
		 double sum = 0;
		 double i=x1-1;
		 int count = 0;
		 
		 
		 while(i < x2){
			 i++;
			 if(i%x3 == 0){
			 		count++;
					sum = Math.pow(i/x5, x4)+ sum;
			 }
				}
		 		//String sum1 = myFormat.format(sum);
				//String sum2 = myFormat.format(sum/count);
		        //System.out.println(sum1);
		        //System.out.println(sum2);
		       // System.out.println(count);
		        
		        	return sum;
		        }
	public static String starwars(){
		return "I love Star Wars";
		
	}
	public static String getPentagonalNumber(int x, int y){
	int limit = y;

	System.out.println("Pentagonal Series from " + x + " to " + limit);


	for(int i=x; i< limit; i++){
		System.out.print(i*(3*i-1)/2 + " ");
	}
	return "";
	}
	public static int sumDigits(long n){
		int count = 0;
		int sum = 0;
		while(n != 0){
		long x =  n%10;
		n = n/10;
		count++;
		sum += x;
		}
		return sum;
	}
	public static int reverse(int n){
		int y = 0;
		while(n != 0){
		int x = n%10;
				//y += x*Math.pow(10, count-1);
				y = y*10 + x;
		 n = n/10;
		}
		return y;
	}
	public static int print_binary(int n){
	int y = 0;
	int b =0;
	while(n != 0){
	int x = n%2;
			//y += x*Math.pow(10, count-1);
			y = y*10 + x;
	 n = n/2;
	}
	return reverse(y);
}
	public static double randomizer(int x, int y){
		int i = y + 1 - 6;
		return x + Math.random()*i;
	}
	public static boolean palindrome(int n){
		int x = reverse(n);
		boolean y = false;
		if(x == n){
			y = true;
		}else{
			y = false;
		}
		if(y == true){
			System.out.println("This number is a palindrome");
		}else{
			System.out.println("This number is not a palindrome");
		}
		return y;
		
	}

	public static void main(String[] args){
		double x = 223.41;
		System.out.println(format_numbers("####.#", x));
		System.out.println(sumDigits(994));
		if(palindrome(112) == true){
			System.out.println("Yay!");
		}
	}

}
