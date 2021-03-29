package textFileTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\test2.txt");
		//f.createNewFile();
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		fw.write("vcentry");
		//fw.close(); //throw an error
		fw.write("vcentry2");
		fw.close();
		
	}

}
