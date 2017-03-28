package Practice;

public class Math_Prac {
static int num1=21;
static double num2=3.5;
static int num3a=(int) (num1+num2);
static double num3b=num1+num2;
static float num3c= (float) (num1+num2);
static int i =10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(num1 + num2);
System.out.println(num3a);
System.out.println(num3b);
System.out.println(num3c);
System.out.println("---------");
System.out.println(2+ (i++));
System.out.println(i);
i = 10;
System.out.println(2+ (++i));
System.out.println(i);
i = 10;
System.out.println(2+ (i--));
System.out.println(i);
i = 10;
System.out.println(2+ (--i));
System.out.println(i);
	}

}
