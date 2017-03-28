package universal_assets$copy_and_paste;

public class attack_roll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = d50();
		System.out.println(d50());
		while(x != 50){
			x = d50();
		}
		while(x == 50){
			System.out.println(100);
			break;
		}
	}
	public static int d50(){
		int result = (int) (1 + Math.random() * 50);
		
		return result;
	}
	public static int d10(){
		int result = (int) (1 + Math.random() * 10);
		
		return result;
	}
	public static int d100000000(){
		int result = (int) (1 + Math.random() * 100000000);
		
		return result;
	}
	
	public static int attack_result(int attack, int defense, int damage, int armor){
		int final_damage= 0;
		
		
		return final_damage;
	}

}
