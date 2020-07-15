package com.pmse.admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pmse.dao.Location_dao;

public class LocationDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		boolean flag=false;
		String value=req.getParameter("submit");
		String loc_name=req.getParameter("loc_name");
		String parent=req.getParameter("parent");
		String latitude=req.getParameter("latitude");
		String longitude=req.getParameter("longitude");
		String[] loc_code=req.getParameterValues("loc_code");
		String lo_code=req.getParameter("lo_code");
	
		System.out.println(" value :"+value);
		if(value.equals("Add"))
		{
			flag=Location_dao.addLocation(loc_name, latitude, longitude, parent);
			if(flag)
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/admin/location.jsp?status=1");
				System.out.println("Added Sucessfully ");
			}
			
		}
		else if(value.equals("Update"))
		{
			flag=Location_dao.updateLocation(loc_name, latitude, longitude, parent, Integer.parseInt(lo_code));
			if(flag)
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/admin/location.jsp?status=2");
				System.out.println("Updated Sucessfully ");
			}
		}
		else if(value.equals("Delete"))
		{
			for(int i=0;i<loc_code.length;i++)
			{
				flag=Location_dao.deleteLocation(Integer.parseInt(loc_code[i]));
			}
			
			if(flag)
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/admin/location.jsp?status=3");
				System.out.println("Deleted Sucessfully ");
			}
		}
	}
}
