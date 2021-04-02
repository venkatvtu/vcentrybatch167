package textFileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork1_4_21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\homework.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("vcentry");
		bw.newLine();
		bw.write("technologies");
		bw.newLine();
		bw.write("guindy");
		bw.newLine();
		bw.write("chennai");
		bw.newLine();
		bw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		/*
		 * System.out.println(br.readLine()); System.out.println(br.readLine());
		 * System.out.println(br.readLine()); System.out.println(br.readLine());
		 * System.out.println(br.readLine());
		 */
		String x="";
		while((x=br.readLine())!=null) {
			System.out.println(x);
		}
		
	}

}
