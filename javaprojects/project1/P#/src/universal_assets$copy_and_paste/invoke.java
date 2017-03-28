package universal_assets$copy_and_paste;

import javax.swing.JOptionPane;

public class invoke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
invoke.Cthulu();
invoke.Sauron();
	}
public static String Sauron(){
	return "THE DARK LORD AWAITS HIS FAITHFUL SERVANTS";
}
public static String Cthulu(){
	System.out.println("PH'NgLUI MGLW'NAfH Cthulhu r'lyeh WgaH'NagL FHTagN");
	  String s = "Ph'nglui mglw'nafh Cthulhu R'lyeh wgah'nagl fhtagn";
	  byte[] bytes = s.getBytes();
	  StringBuilder binary = new StringBuilder();
	  for (byte b : bytes)
	  {
	     int val = b;
	     for (int i = 0; i < 8; i++)
	     {
	        binary.append((val & 128) == 0 ? 0 : 1);
	        val <<= 1;
	     }
	     binary.append(' ');
	  }
	  JOptionPane.showMessageDialog(null, binary);
	JOptionPane.showMessageDialog(null, "...,.,..;'/;',;ok3po53pju9205257up;2/;f//,3f52i29555552u;j4k2.mmc2o4j489fucj2vl");
	return "ph'nGlui mglw'naFh_Cthulhu R'1yeh wGAh^nAGl fhtAGn";
}
}
