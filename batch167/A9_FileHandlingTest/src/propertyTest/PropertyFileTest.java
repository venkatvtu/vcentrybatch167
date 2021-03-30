package propertyTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\src\\propertyTest\\Test.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.get("username"));
		Enumeration e =prop.keys();
		while(e.hasMoreElements())
		{
			//System.out.println(e.nextElement());
		//System.out.println(table.get(e.nextElement()));
		String key = (String) e.nextElement();
		System.out.println(key+":"+prop.get(key));
		}
		
	}

}
