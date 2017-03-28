import java.io.File;
import java.io.FileNotFoundException;


public class driver {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void collectionsort(String f) throws FileNotFoundException {
		File file = new File(f);
		display.displayer(sort.sorter(read.reader(file)));
	}

}
