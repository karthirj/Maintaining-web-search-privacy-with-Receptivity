package com.pmse.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.pmse.dao.User_dao;

public class UserLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String value=req.getParameter("submit");
		RequestDispatcher rd=null;
		System.out.println("its came inside Userlogin"+value);
		String id=req.getParameter("userid");
		String pwd=req.getParameter("userpwd");
		String uname=req.getParameter("uname");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String location=req.getParameter("loc");
		
		String m_old_pass=req.getParameter("old_pass");
		String m_new_pass=req.getParameter("new_pass");
		String m_re_pass=req.getParameter("re_pass");
		
		if(value.equals("Login"))
		{
			System.out.println("its came inside userlogin>>>>>>>>>>>>>>>>>>>>>>");
			uname=User_dao.checkLogin(id, pwd);
			if(uname!=null)
			{
				HttpSession session=req.getSession(true);
				session.setAttribute("uid",id);
				session.setAttribute("uname",uname);
				session.setAttribute("uloc",location);
				
			resp.sendRedirect(req.getContextPath()+"/jsp/user/index.jsp");
			}
			else
			{
				resp.sendRedirect(req.getContextPath()+"/index.jsp?status=2");
			}
			
		}
		else if(value.equals("Register"))
		{
			boolean flag=false;
			
			flag=User_dao.insertUser(id, pwd, uname, email, phone);
			if(flag)
			{
				resp.sendRedirect(req.getContextPath()+"/index.jsp?status=3");
				System.out.println("Registered Sucessfully ");
			}
			else
			{
				resp.sendRedirect(req.getContextPath()+"/index.jsp?status=4");
				System.out.println("Registered Failure ");
			}
			
		}
		else if(value.equals("Update"))
		{
			boolean flag=false;
			flag=User_dao.updateUser(id, uname, email, phone);
			if(flag)
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/user/index.jsp?status=1");
				System.out.println("Profile Updated Sucessfully ");
			}
			else
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/user/index.jsp?status=2");
				System.out.println("Profile Updated Failure ");
			}
			
		}
		else if(value.equals("Chage Password"))
		{
			String uname1=User_dao.checkLogin(id, m_old_pass);
			if(uname1!=null)
			{
				User_dao.Changepass(m_old_pass, m_new_pass);
				resp.sendRedirect(req.getContextPath()+"/jsp/user/cpass.jsp?status=1");
				System.out.println("Password Changed Sucessfully ");
			}
			else
			{
				resp.sendRedirect(req.getContextPath()+"/jsp/user/cpass.jsp?status=2");
				System.out.println("Password Changed Failure ");
			}
			
		}
		
		
		
	}
}
