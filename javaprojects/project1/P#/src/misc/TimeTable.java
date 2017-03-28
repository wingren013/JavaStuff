package misc;

public class TimeTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 0;
		int base_num = 0;
		int first_num = 0;
		int second_num = 0;
		int third_num = 0;
		int fourth_num = 0;
		int fifth_num = 0;
		int sixth_num = 0;
		int seventh_num = 0;
		int eigth_num = 0;
		int ninth_num = 0;
		for (int i=0; i < 9;){
			i++;
			base_num = i;
			//System.out.println(i);
			first_num = i*1;
			second_num = i*2;
			third_num = i*3;
			fourth_num = i*4;
			fifth_num = i*5;
			sixth_num = i*6;
			seventh_num = i*7;
			eigth_num = i*8;
			ninth_num = i*9;
			System.out.println(base_num + " " + first_num + " " + second_num + " " + third_num + " " + fourth_num
					+ " " + fifth_num + " " + sixth_num + " " + seventh_num + " " + eigth_num 
					+ " " + ninth_num);
		}
	}

}
