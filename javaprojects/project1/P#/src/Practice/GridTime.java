package Practice;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

public class GridTime extends JFrame
{
	
	public static void main(String[] args)
	{
		GridTime fraemz = new GridTime();
		fraemz.setTitle("GRIDTIME");
		fraemz.setSize(900,900);
		fraemz.setLocation(0,0);
		fraemz.setVisible(true);
		fraemz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	GridTime()
	{
		GridLayout bord1 = new GridLayout(7,6);
		setLayout(bord1);
		/**setLayout(new FlowLayout(FlowLayout.LEADING, 100, 10));		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		JButton jbut = new JButton("GREAT");
		JButton jbut1 = new JButton("Great");
		JButton jbut2 = new JButton("GREAT");
		JButton jbut3 = new JButton("Great");
		JButton jbut4 = new JButton("GREATfaw");
		JButton jbut5 = new JButton("Great");
		panel2.add(jbut);
		panel2.add(jbut1);
		panel2.add(jbut2);
		panel1.add(jbut3);
		panel1.add(jbut4);		
		panel1.add(jbut5);
		panel3.add(jbut);
		panel3.add(jbut1);
		panel3.add(jbut2);
		panel4.add(jbut3);
		panel4.add(jbut4);		
		panel4.add(jbut5);
		//panel1.setLocation(0,0);
		//panel2.setLocation(600,0);		
		add(panel2);
		add(panel1);
		add(panel4);
		add(panel3);
		
		
		//add(panel3);*/		
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		for (int x = 0; x < 42; ++x)
		    {				
				Random rand = new Random();
				float r = rand.nextFloat();
				float g = rand.nextFloat();
				float b = rand.nextFloat();

				ImageIcon monk3 = new ImageIcon("monk3.jpg");
				ImageIcon monk2 = new ImageIcon("monk2.jpg");
				ImageIcon monk = new ImageIcon("images.jpg");
				JLabel slotBtn = new JLabel(monk);
				
				Color randomColor = new Color(r,g,b);	
					
				slotBtn.setBackground(randomColor);
				
				//BorderFactory.createLineBorder(randomColor, 4);				
				
				slotBtn.setBorder(BorderFactory.createLineBorder(randomColor, 4));
		       
				JButton jbt = new JButton(monk);
				jbt.setBorder(BorderFactory.createLineBorder(randomColor, 4));
				jbt.setRolloverIcon(monk2);
				jbt.setPressedIcon(monk3);
				
				add(jbt);
		    }
		

	}



}

	