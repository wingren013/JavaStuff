import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class read {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static List reader(File file) throws FileNotFoundException{
		Scanner input = new Scanner(file);
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		Pattern p = Pattern.compile("[ .!?,;:\\n]");
		input.useDelimiter(p);
		System.out.println(input.delimiter());
		while (input.hasNext()){
			String line = input.next();
			String s = line.toLowerCase();
			list.add(s);
		}
		System.out.println(list.size());
		input.close();
		return list;

	}
	public static void main(String[] args) throws FileNotFoundException {	
		File f = new File("r.txt");
		List list = reader(f);
		System.out.println(list.size());
		
	}

}
