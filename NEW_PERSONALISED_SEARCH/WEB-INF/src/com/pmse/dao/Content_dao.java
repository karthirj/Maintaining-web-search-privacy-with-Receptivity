package com.pmse.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.pmse.db.DBConnection;

public class Content_dao 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	public static String getContentName(int co_code) throws SQLException
	{
		
		String con_name="root";
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select keywords from m_content_ontology where co_code='"+co_code+"' ");
			System.out.println("select keywords from m_content_ontology where co_code='"+co_code+"'");
			while(resultSet.next())
			{
				con_name=resultSet.getString(1);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Content_dao class-->getContentName() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return con_name;
	}
	
	
	
	public static ResultSet getContentDetails() throws SQLException
	{
		ArrayList<String> loc_names=new ArrayList<String>();
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_content_ontology ");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Content_dao class-->getParentNames() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return resultSet;
	}
	
	public static int getContentcode(String keyword) throws SQLException
	{
		int co_code=0;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select co_code from m_content_ontology where keywords='"+keyword+"' ");
			while(resultSet.next())
			{
				co_code=resultSet.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Content_dao class-->getParentNames() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return co_code;
	}
	
	public static boolean addContent(String keyword,String parent,String enc) throws SQLException
	{
		boolean flag=false;
		String remark="";
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			
			int par=Integer.parseInt(parent);
			if(par==0)
			{
				remark=keyword+"-"+"root";
			}
			else
			{
				String s=Content_dao.getContentName(par);
				remark=keyword+"-"+s;
			}
			int i = statement.executeUpdate("insert into m_content_ontology (keywords,parent,remarks,enc_keywords) values('"+keyword+"','"+parent+"','"+remark+"','"+enc+"') ");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in Content_dao class-->addContent() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	
	public static boolean updateContent(String keyword,String parent,int co_code,String enc) throws SQLException
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("update  m_content_ontology set keywords='"+keyword+"',parent='"+parent+"',enc_keywords='"+enc+"' where co_code='"+co_code+"' ");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in Content_dao class-->updateContent() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	public static boolean deleteContent(int co_code) throws SQLException
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from  m_content_ontology  where co_code='"+co_code+"' ");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in Content_dao class-->deleteContent() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	
	public static Map getparentCode(String keyword) 
	{
		Map map=new HashMap();
		ArrayList<Integer> parent=new ArrayList<Integer>();
		ArrayList<Integer> co_code=new ArrayList<Integer>();
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select parent,co_code from m_content_ontology where keywords='"+keyword+"' ");
			while(resultSet.next())
			{
				parent.add(resultSet.getInt(1));
				co_code.add(resultSet.getInt(2));
			}
			map.put("parent", parent);
			map.put("key_code", co_code);
		}
		catch(Exception e)
		{
			System.out.println("Exception in Content_dao class-->deleteContent() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return map;
	}
}
