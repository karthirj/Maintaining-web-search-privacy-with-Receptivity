package com.pmse.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pmse.db.DBConnection;

public class Admin_dao 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	public static boolean ckeckAdmin(String id,String pwd) 
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			System.out.println("select * from m_admin where admin_id='"+id+"' and admin_pwd='"+pwd+"'" );
			resultSet = statement.executeQuery("select * from m_admin where admin_id='"+id+"' and admin_pwd='"+pwd+"' ");
			while(resultSet.next())
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Admin_dao class-->ckeckAdmin() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	public static boolean Changepass(String x_old_pass,String x_new_pass)
	{
		
		try
		{
			connection=DBConnection.connector();
			statement=connection.createStatement();
			String sql="update m_admin set admin_pwd='"+x_new_pass+"' where admin_pwd='"+x_old_pass+"'";
			System.out.println("Sql....."+sql);
			int i=statement.executeUpdate(sql);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return true;
	}
}
