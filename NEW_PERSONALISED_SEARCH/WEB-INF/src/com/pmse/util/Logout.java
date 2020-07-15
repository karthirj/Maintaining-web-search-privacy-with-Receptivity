package com.pmse.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		System.out.println("logout------------------------");
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			session.invalidate();
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		System.out.println("logout------------------------");
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			session.invalidate();
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}
	}
}
