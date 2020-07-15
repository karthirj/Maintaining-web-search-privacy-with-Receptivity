package com.pmse.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pmse.db.DBConnection;

public class Search_dao 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	
	public static int insertSearch(String uid,String keyword,String match_post) 
	{
		int s_no=0;
		try
		{
			int u_code=0;
			
			connection=DBConnection.connector();
			statement = connection.createStatement();
			String sql="select u_code from m_user where u_id='"+uid+"'";
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				u_code=resultSet.getInt(1);
			}
			int i = statement.executeUpdate("insert into m_search (s_query,u_code) values('"+keyword+"','"+u_code+"') ");
			 i = statement.executeUpdate("insert into m_set (s_query,u_code,matched_post,negative) values('"+keyword+"','"+u_code+"','"+match_post+"','"+match_post+"') ");
			if(i==1)
			{
				ResultSet rs=statement.executeQuery("select s_no from m_search order by s_no desc limit 1");
				while(rs.next())
				{
					s_no=rs.getInt(1);
				}
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
		return s_no;
	}
	public static boolean  getSearchResult(String uid)
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			System.out.println("select * from m_search a join m_user b on a.u_code=b.u_code where b.u_id='"+uid+"' ");
			resultSet = statement.executeQuery("select * from m_search a join m_user b on a.u_code=b.u_code where b.u_id='"+uid+"' ");
			while(resultSet.next())
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
	
	public static ResultSet  getResult()
	{
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_temp ");
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->getPostingsDetails() : "+e);
		}
		return resultSet;
	}
	public static String[] getNegatioveSet(int search_no)
	{
		String sets[]=new String[2];
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			System.out.println("select negative from m_set where s_no='"+search_no+"'");
			resultSet = statement.executeQuery("select positive,negative from m_set where s_no='"+search_no+"'");
			while(resultSet.next())
			{
				sets[0]=resultSet.getString(1);
				sets[1]=resultSet.getString(2);
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
		return sets;
	}
	
	public static String getSets(String uid,String query)
	{
		String p_set="";
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			System.out.println("select a.positive from m_set a join m_user b on a.u_code=b.u_code where b.u_id='"+uid+"'and s_query='"+query+"' ");
			resultSet = statement.executeQuery("select a.positive from m_set a join m_user b on a.u_code=b.u_code where b.u_id='"+uid+"'and s_query='"+query+"' ");
			while(resultSet.next())
			{
				if(resultSet.getString(1)!=null)
				{
					p_set=p_set+","+resultSet.getString(1);
					System.out.println(resultSet.getString(1)+"$$$$$$$$$"+p_set);
				}
			}
			if(p_set.length()!=0)
			{
				p_set=p_set.substring(1, p_set.length());
				System.out.println("  P_set -- "+p_set);
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
		return p_set;
	}
	
	public static boolean updateSets(String poistive,String negative,int s_code) 
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("update  m_set set positive='"+poistive+"',negative='"+negative+"' where s_no='"+s_code+"' ");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in Location_dao class-->addLocation() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
	
	public static boolean addtempPostings(int post_code,String post_heading,String post_desc,String post_img,String location)
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			
			int i = statement.executeUpdate("insert into m_temp  values('"+post_code+"','"+post_heading+"','"+post_desc+"','"+post_img+"','"+location+"') ");
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
	
	public static boolean deletetempPostings()
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			
			int i = statement.executeUpdate("delete from m_temp ");
			if(i==1)
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in Postings_dao class-->deletetempPostings() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return flag;
	}
}
