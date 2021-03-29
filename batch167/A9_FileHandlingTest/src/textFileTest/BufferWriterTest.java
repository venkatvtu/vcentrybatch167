package textFileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest {

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
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("vcentry1");
		bw.newLine();
		bw.write("vcentry2");
		bw.newLine();
		bw.write("vcentry3");
		bw.newLine();
		bw.write("vcentry4");
		bw.close();
	}

		
	}


