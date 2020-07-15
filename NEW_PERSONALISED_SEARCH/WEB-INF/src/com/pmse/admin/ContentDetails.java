package com.pmse.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmse.dao.Content_dao;
import com.pmse.util.HashingTechnique;


public class ContentDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		boolean flag=false;
		String value=req.getParameter("submit");
		String con_name=req.getParameter("con_name");
		String parent=req.getParameter("parent");
		
		String[] con_code=req.getParameterValues("con_code");
		String co_code=req.getParameter("co_code");
	
		System.out.println(" value :"+value);
		
		String enc = HashingTechnique.MD5(con_name);
		try 
		{
			if(value.equals("Add"))
			{
				flag=Content_dao.addContent(con_name, parent,enc);
				if(flag)
				{
					resp.sendRedirect(req.getContextPath()+"/jsp/admin/content.jsp?status=1");
					System.out.println("Added Sucessfully ");
				}
				
			}
			else if(value.equals("Update"))
			{
				flag=Content_dao.updateContent(con_name, parent, Integer.parseInt(co_code),enc);
				if(flag)
				{
					resp.sendRedirect(req.getContextPath()+"/jsp/admin/content.jsp?status=2");
					System.out.println("Updated Sucessfully ");
				}
			}
			else if(value.equals("Delete"))
			{
				for(int i=0;i<con_code.length;i++)
				{
					flag=Content_dao.deleteContent(Integer.parseInt(con_code[i]));
				}
				
				if(flag)
				{
					resp.sendRedirect(req.getContextPath()+"/jsp/admin/content.jsp?status=3");
					System.out.println("Deleted Sucessfully ");
				}
			}
		}
		catch (SQLException e) 
		{e.printStackTrace();}
	}
}
