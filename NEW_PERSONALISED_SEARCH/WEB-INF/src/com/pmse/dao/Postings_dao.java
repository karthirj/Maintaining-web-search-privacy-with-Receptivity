package com.pmse.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.pmse.db.DBConnection;



public class Postings_dao 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	
	public static boolean addPostings(String post_heading,String post_desc,String post_link_content,String post_link_location,String post_img)
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			
			int i = statement.executeUpdate("insert into m_post (post_heading,post_description,post_link_content,post_link_location,post_image) values('"+post_heading+"','"+post_desc+"','"+post_link_content+"','"+post_link_location+"','"+post_img+"') ");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->addPostings() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	
	public static ResultSet getPostingsDetails() 
	{
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_post ");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->getPostingsDetails() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return resultSet;
	}
	
	public static ResultSet getPosting(String post_no) 
	{
	
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select a.post_no,a.post_heading,a.post_description,a.post_image,b.location_name from m_post a join m_location_ontology b on a.post_link_location=b.lo_code where post_no ='"+post_no+"'");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->getPostingsDetails() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return resultSet;
	}
	
	public static boolean deletePostings(int post_code) 
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from  m_post  where post_no='"+post_code+"' ");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->deletePostings() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	
	public static ResultSet getPostingSearch(String keyword,String encyp) 
	{
		try
		{
			int s=0;
			connection=DBConnection.connector();
			statement = connection.createStatement();
			String query="select co_code from m_content_ontology where keywords='"+encyp+"'";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
				 s=rs.getInt(1);
			}
			Statement st=connection.createStatement();
			resultSet = st.executeQuery("select a.post_no,a.post_heading,a.post_description,a.post_image,b.location_name,b.latitude,b.longitude from m_post a join m_location_ontology b on a.post_link_location=b.lo_code where post_heading like '%"+keyword+"%' or  post_description like '%"+keyword+" %' or post_link_content like '%,"+s+",%' or post_link_content like '"+s+",%' or post_link_content like '%,"+s+"' ");
			System.out.println("select a.post_no,a.post_heading,a.post_description,a.post_image,b.location_name,b.latitude,b.longitude from m_post a join m_location_ontology b on a.post_link_location=b.lo_code where post_heading like '%car%' or  post_description like '%car%' or post_link_content like '%1%'  ");
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->getPostingsDetails() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return resultSet;
	}
	
	
	public static boolean checkkeyword(String keyword) 
	{boolean flag=false;
		try
		{
			
			int s=0;
			connection=DBConnection.connector();
			statement = connection.createStatement();
			String query="select * from m_content_ontology where keywords='"+keyword+"'";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
				flag=true;
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->getPostingsDetails() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	
	public static String getContentLink(int post_code) 
	{
		String link_con="";
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			System.out.println("select post_link_content from m_post where post_no='"+post_code+"'");
			resultSet = statement.executeQuery("select post_link_content from m_post where post_no='"+post_code+"'");
			while(resultSet.next())
			{
				link_con=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->getPostingsDetails() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return link_con;
	}
	
}
