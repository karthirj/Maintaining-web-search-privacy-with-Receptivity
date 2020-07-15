package com.nice;

import java.io.*;

import javax.servlet.http.HttpServlet;

public class Nice_agent extends HttpServlet
{
	public Nice_agent()
	{
		File_Read();
	}
	
	public static void File_Read()
	{
		System.out.println(System.getProperty("catalina.base"));
	    String location = "C:/Program Files/Apache Software Foundation/Tomcat 6.0"+ java.io.File.separator + "logs" + java.io.File.separator + 
	    "localhost_access_log." + new java.sql.Date(System.currentTimeMillis()) +".txt";
	    
	    System.out.println("   Location : "+location);
	    File f=new File(location.trim());  
	    if(f.exists())
	    { 
	    	try 
	    	{
	    		String sCurrentLine;
	    		StringBuffer sb=new StringBuffer();
				BufferedReader br = new BufferedReader(new FileReader(location.trim()));
				if ((sCurrentLine = br.readLine()) != null) 
				{
					sb.append(sCurrentLine+"\n");
					
				}
				System.out.println(sb.toString());
				
				FileWriter fw = new FileWriter(location.trim());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("");
				bw.close();
	 
				System.out.println("Done");
			} 
	    	catch (FileNotFoundException e) 
	    	{
				e.printStackTrace();
			} 
	    	catch (IOException e)
			{
				e.printStackTrace();
			}	
	    }  
	}
	
	public static void main(String[] args) 
	{
		new Nice_agent();
	}
}
