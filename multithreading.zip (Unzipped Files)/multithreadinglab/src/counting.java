
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class counting implements Runnable {

	public int count;
	public JTextField jtext;
	public static Boolean stop;

	public counting(JTextField j, int c, Boolean s){
		this.count = c;
		this.jtext = j;
		this.stop = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		uu.stop = false;
		try{
		for (int i = 0; i < 10000; i++) {
			// Check if STOP button has been pushed
			// which changes the stop flag state to true}
			System.out.println(stop);
			if (uu.stop == true){
				break;
			}
			
			this.jtext.setText(this.count + " ");
			++count;
			
			Thread.sleep(100);
		}
		}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
