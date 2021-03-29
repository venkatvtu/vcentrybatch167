package textFileTest;

import java.io.File;
import java.io.IOException;

public class FileExitsTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\test1.txt");
		//f.createNewFile();
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		
	}

}
