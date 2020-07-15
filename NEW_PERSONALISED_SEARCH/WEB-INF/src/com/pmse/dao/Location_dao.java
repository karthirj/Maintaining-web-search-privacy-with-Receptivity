package com.pmse.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.pmse.db.DBConnection;



public class Location_dao 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	public static String getLocationName(int loc_code) 
	{
		
		String loc_name="root";
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select location_name from m_location_ontology where lo_code='"+loc_code+"' ");
			while(resultSet.next())
			{
				loc_name=resultSet.getString(1);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Location_dao class-->getLocation() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return loc_name;
	}
	
	public static ResultSet getLocationDet(int loc_code) 
	{
		
		
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select location_name,latitude,longitude from m_location_ontology where lo_code='"+loc_code+"' ");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Location_dao class-->getLocation() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return resultSet;
	}
	
	public static ResultSet getLocationDetails()
	{
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_location_ontology ");
		}
		catch(Exception e)
		{
			System.out.println("Exception in Location_dao class-->getLocation() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return resultSet;
	}
	
	public static ResultSet getParentNames()
	{
		ArrayList<String> loc_names=new ArrayList<String>();
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select lo_code,location_name from m_location_ontology ");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Location_dao class-->getLocation() : "+e);
		}
		finally
		{
			//DBConnection.closeConnection(connection, statement, resultSet);
		}
		return resultSet;
	}
	
	public static String[] getlat_longd(String loc_name)
	{
		String[] parm_values=new String[2];
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select latitude,longitude from m_location_ontology where location_name='"+loc_name+"' ");
			while(resultSet.next())
			{
				parm_values[0]=resultSet.getString(1);
				parm_values[1]=resultSet.getString(2);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in Location_dao class-->getLocation() : "+e);
		}
		finally
		{
			DBConnection.closeConnection(connection, statement, resultSet);
		}
		return parm_values;
	}
	
	public static boolean addLocation(String loc_name,String latitude,String longitude,String parent) 
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			
			int i = statement.executeUpdate("insert into m_location_ontology (location_name,latitude,longitude,parent) values('"+loc_name+"','"+latitude+"','"+longitude+"','"+parent+"') ");
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
	
	public static boolean updateLocation(String loc_name,String latitude,String longitude,String parent,int loc_code) 
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("update  m_location_ontology set location_name='"+loc_name+"',latitude='"+latitude+"',longitude='"+longitude+"',parent='"+parent+"' where lo_code='"+loc_code+"' ");
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
	public static boolean deleteLocation(int loc_code) 
	{
		boolean flag=false;
		try
		{
			connection=DBConnection.connector();
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from  m_location_ontology  where lo_code='"+loc_code+"' ");
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
}
