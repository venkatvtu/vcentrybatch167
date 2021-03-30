package textFileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\Read.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		/*bw.write("vcentry1");
		bw.newLine();
		bw.write("vcentry2");
		bw.newLine();
		bw.newLine();
		bw.write("vcentry3");
		bw.newLine();
		bw.write("vcentry4");
		bw.newLine();*/
		for(int i=1;i<=1000;i++)
		{
			bw.write(""+i);
			bw.newLine();
		}
		bw.close();
		
		// read file
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//br.readLine();
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		String x ="";
		while((x= br.readLine())!=null)
		{
			System.out.println(x);
		}
	
		
		
		
	}

}
