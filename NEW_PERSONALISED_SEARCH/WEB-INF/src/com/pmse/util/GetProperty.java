package com.pmse.util;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


public class GetProperty 
{
	public static String getProperty(String str) 
	{
		String pro="";
		try
		{
			java.security.ProtectionDomain pd =	GetProperty.class.getProtectionDomain();
			
			java.security.CodeSource cs = pd.getCodeSource();
			java.net.URL url = cs.getLocation();
			java.io.File f = new File( url.getFile());
			String path=f.getParent();
			Properties property = new Properties();
			FileInputStream in=null;
			in = new FileInputStream(path+"\\mod.properties");
			property.load(in);
			pro=property.getProperty(str);
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's error is in Utility getPro(String str) "+e);
		}
		return pro;
	}
}
