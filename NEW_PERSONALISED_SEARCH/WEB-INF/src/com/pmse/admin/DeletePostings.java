package com.pmse.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmse.dao.Location_dao;
import com.pmse.dao.Postings_dao;

public class DeletePostings extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		boolean flag=false;
		
		try 
		{
			String[] post_code=req.getParameterValues("post_code");
			for(int i=0;i<post_code.length;i++)
			{
				flag=Postings_dao.deletePostings(Integer.parseInt(post_code[i]));
			}
			if(flag)
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/admin/postings.jsp?status=3");
				System.out.println("Deleted Sucessfully ");				
			}
		} 
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
	}
}
