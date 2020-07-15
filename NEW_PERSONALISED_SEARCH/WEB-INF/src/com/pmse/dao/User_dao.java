package com.pmse.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.pmse.db.DBConnection;

public class User_dao 
{
	public static Connection con=null;
	public static Statement st=null;
	public static ResultSet rs=null;
	
	public static String checkLogin(String user,String pass)
	{
		String unmae=null;
		try 
		{
			con=DBConnection.connector();
			String sql="select u_name from m_user where u_id='"+user+"' and u_pwd='"+pass+"' ";
			System.out.println(sql);
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next())
			{
				unmae=rs.getString(1);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return unmae;
	}
	public static boolean Changepass(String x_old_pass,String x_new_pass)
	{
		
		try
		{
			con=DBConnection.connector();
			st=con.createStatement();
			String sql="update m_user set u_pwd='"+x_new_pass+"' where u_pwd='"+x_old_pass+"'";
			System.out.println("Sql....."+sql);
			int i=st.executeUpdate(sql);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public static boolean insertUser(String user,String pass,String uname,String email,String phone)
	{
		boolean flag=false;
		try 
		{
			con=DBConnection.connector();
			String sql="insert into m_user(u_id,u_name,u_pwd,u_email,u_cellno) value('"+user+"','"+uname+"','"+pass+"','"+email+"','"+phone+"') ";
			System.out.println(sql);
			st=con.createStatement();
			int i=st.executeUpdate(sql);
			if(i==1)
			{
				flag=true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	public static ArrayList<String> getUserdet(String uid)
	{
		ArrayList<String> user_det=new ArrayList<String>();
		try 
		{
			con=DBConnection.connector();
			String sql="select u_name,u_email,u_cellno from m_user where u_id='"+uid+"' ";
			System.out.println(sql);
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next())
			{
				user_det.add(rs.getString(1));
				user_det.add(rs.getString(2));
				user_det.add(rs.getString(3));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return user_det;
	}
	
	public static boolean updateUser(String uid,String uname,String email,String phone)
	{
		boolean flag=false;
		try 
		{
			con=DBConnection.connector();
			String sql="update m_user set u_name='"+uname+"',u_email='"+email+"',u_cellno='"+phone+"' where u_id='"+uid+"' ";
			System.out.println(sql);
			st=con.createStatement();
			int i=st.executeUpdate(sql);
			if(i==1)
			{
				flag=true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return flag;
	}
}
