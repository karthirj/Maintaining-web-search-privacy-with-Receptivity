package com.pmse.admin;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.pmse.dao.Content_dao;
import com.pmse.dao.Location_dao;
import com.pmse.dao.Postings_dao;
import com.pmse.util.HashingTechnique;

public class PostingsDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		ArrayList list =  new ArrayList();
		String s = "";
		String fileName="";
		String filepath = "";
		String decKey = "";
		boolean flag=false;
		boolean isMultipart =  ServletFileUpload.isMultipartContent(req);
		if(isMultipart)
		{
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
	        try
	        {
	          	List items = upload.parseRequest(req);
	          	Iterator iterator = items.iterator();
	            while (iterator.hasNext()) 
	            {
	            	FileItem item = (FileItem) iterator.next();
	            	if (item.isFormField()) 
	            	{
	            		s = item.getString();
                    	list.add(s);//All Form Field Values
	            	}
	            	else 
	            	{
	            		 fileName = item.getName();
	            		 if(fileName!="")
	            		 filepath = req.getRealPath("")+"\\Image\\"+fileName;
		  	             File f1=new File(filepath);
		  	             item.write(f1);
		  	             flag = true;
		  	            
	            	}
	            }
	            System.out.println("******* Decrypt Image Information *******");
	            System.out.println("File Name : " + fileName);
	            System.out.println("Form Field Data : " + list);
	            System.out.println("Form Field Data : " + list.size());
	        	if(flag)
	    		{
	        		String heading=(String) list.get(0);
	        		String desc=(String) list.get(4);
	        		String location=(String) list.get(3);
	        		String value=(String) list.get(5);
	        		
	        			String content="";
		    			String contents=(String) list.get(2);
		    			String keywords[]=contents.split(",");
		    			for(int i=0;i<keywords.length;i++)
		    			{
		    				int code=Content_dao.getContentcode(keywords[i]);
		    				content=content+","+code;
		    			}
		    			content=content.trim().substring(1, content.length());
		    			
		    			flag=Postings_dao.addPostings(heading,desc,content,location, fileName);
		    			
		    			if(flag)
						{
							resp.sendRedirect(req.getContextPath()+"/jsp/admin/postings.jsp?status=1");
							System.out.println("Created Sucessfully ");
						}
	        		
	    		}
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Opps's Error is in User==>DecryptImage Servlet inside isMultipart Block : ");
	        	e.printStackTrace();
	        	
	        }
		}
		
		/* Inserting into database */
	
		
	
	}
}
