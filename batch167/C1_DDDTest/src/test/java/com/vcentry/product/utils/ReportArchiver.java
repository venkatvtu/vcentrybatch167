package com.vcentry.product.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class ReportArchiver {
	
	public static void archiveScreenshot() throws IOException
	{
		Date d =new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh-mm-ss");
		String folderName =sdf.format(d);
		File src=new File("C:\\vcentry\\batch167\\C1_DDDTest\\Screenshot");
		File dst=new File("C:\\vcentry\\batch167\\C1_DDDTest\\Archieve\\old_"+folderName);
		FileUtils.copyDirectory(src, dst);
		FileUtils.cleanDirectory(src);
	}
}
