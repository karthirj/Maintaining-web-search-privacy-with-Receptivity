package com.pmse.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pmse.dao.Admin_dao;

public class AdminLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		String value=req.getParameter("submit");
		System.out.println("  Value : "+value);
		String user=req.getParameter("id");
		System.out.println("  user : "+user);
		String pwd=req.getParameter("pwd");
		String m_old_pass=req.getParameter("old_pass");
		String m_new_pass=req.getParameter("new_pass");
		String m_re_pass=req.getParameter("re_pass");
	
		if(value.equals("Login"))
		{
			boolean flag=false;
			flag=Admin_dao.ckeckAdmin(user, pwd);
			System.out.println(flag);
			if(flag)
			{
				HttpSession session=req.getSession(true);
				session.setAttribute("aid",user);
				resp.sendRedirect(req.getContextPath()+"/jsp/admin/adminhome.jsp?status=1");
			}
			else
			{
				resp.sendRedirect(req.getContextPath()+"/index.jsp?status=1");
			}
			
		}
		else if(value.equals("Chage Password"))
		{
			boolean flag=false;
			flag=Admin_dao.ckeckAdmin(user, m_old_pass);
			System.out.println(flag);
			if(flag)
			{
				Admin_dao.Changepass(m_old_pass, m_new_pass);
				resp.sendRedirect(req.getContextPath()+"/jsp/admin/changepass.jsp?status=1");
			}
			else
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/admin/changepass.jsp?status=2");
			}
			
		}
	}
}
