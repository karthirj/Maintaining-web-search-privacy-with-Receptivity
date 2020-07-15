package com.pmse.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.pmse.dao.Content_dao;
import com.pmse.dao.Location_dao;
import com.pmse.dao.Postings_dao;
import com.pmse.dao.Search_dao;
import com.pmse.util.GetProperty;
import com.pmse.util.HashingTechnique;
import com.pmse.util.Process;


public class PersonalSearch extends HttpServlet
{
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	RequestDispatcher rd=null;
	
	ArrayList<Integer>p_head_code=new ArrayList<Integer>();
	ArrayList<String>p_heading=new ArrayList<String>();
	ArrayList<String>p_desc=new ArrayList<String>();
	ArrayList<String>p_image=new ArrayList<String>();
	ArrayList<String>p_locname=new ArrayList<String>();
	
	ArrayList<Integer>p_head_code1=new ArrayList<Integer>();
	ArrayList<String>p_heading1=new ArrayList<String>();
	ArrayList<String>p_desc1=new ArrayList<String>();
	ArrayList<String>p_image1=new ArrayList<String>();
	ArrayList<String>p_locname1=new ArrayList<String>();
	
	ArrayList<Integer>index=new ArrayList<Integer>();
	ArrayList<String>p_lat=new ArrayList<String>();
	ArrayList<String>p_longd=new ArrayList<String>();
	

	
	 ArrayList<Integer> post_list = new ArrayList<Integer> ();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		
		boolean flag=false;
		PrintWriter out=resp.getWriter();
		
		long start = System.nanoTime();
		int search_no=0;
		
		String keyword=req.getParameter("keyword");
		
		System.out.println("keyword is >>>>>>>>>>>>>>>>>>>>>>"+keyword);
		
flag=Postings_dao.checkkeyword(keyword);

if(flag==false)
{
	
	System.out.println("its came inisde");
    RequestDispatcher rd=req.getRequestDispatcher("/jsp/user/search.jsp?no=3");
	rd.forward(req, resp);
	
}
else
{
		
		
		
		HttpSession session=req.getSession(false);
		String uid=(String) session.getAttribute("uid");
		String uloc=(String) session.getAttribute("uloc");
		String loc_det[]=Location_dao.getlat_longd(uloc);
		 ArrayList<Float> avg_list=new ArrayList<Float>();
		 ArrayList<Float> con_avg_list =new ArrayList<Float>();
		 ArrayList<Float> loc_avg_list=new ArrayList<Float>();
		 
		
		 
		Search_dao.deletetempPostings();
		
		try
		{
			 String enc = HashingTechnique.MD5(keyword);
			 
			ResultSet rs=Postings_dao.getPostingSearch(keyword,enc);
		
			
			while(rs.next())
			{
				p_head_code.add(rs.getInt(1));
				p_heading.add(rs.getString(2));
				p_desc.add(rs.getString(3));
				p_image.add(rs.getString(4));
				p_locname.add(rs.getString(5));
				p_lat.add(rs.getString(6));
				p_longd.add(rs.getString(7));
				
			}
			String match_post="";
			for( int i=0;i<p_head_code.size();i++)
			{
				match_post=match_post+","+p_head_code.get(i);
			}
			System.out.println(" match_post :"+match_post);
			
			/*if(match_post.equals(""))
			{
				
			}
		*/
			
			match_post=match_post.substring(1, match_post.length());
			
			System.out.println(" match_post :"+match_post);
			
			if(Search_dao.getSearchResult(uid))
			{
				String p_set=Search_dao.getSets(uid, enc);
				System.out.println(" p_set :"+p_set);
		
				if(p_set.trim().length()!=0)
				{
					String pos[]=p_set.split(",");
					 con_avg_list =Content_dist(pos,keyword);
					 System.out.println("************************************************************* content over *************************");
					 loc_avg_list=Location_dist(loc_det);
					
					System.out.println("con_avg_list---------------"+con_avg_list+"loc_avg_list--------------"+loc_avg_list);
					System.out.println("p_head_code---------------"+p_head_code+"post_list--------------"+post_list);
					for(int i=0;i<p_head_code.size();i++)
					{
						for(int j=0;j<post_list.size();j++)
						{
							if(p_head_code.get(i).equals(post_list.get(j)))
							{
								System.out.println("p_head_code.get(i)---------------"+p_head_code.get(i)+"post_list.get(j)--------------"+post_list.get(j));
								float sum=con_avg_list.get(j)+loc_avg_list.get(i);
								loc_avg_list.set(i, sum);
							}	
						}
					}
					for(int i=0;i<p_head_code.size();i++)
					{
						 int sim=Similarities(p_head_code.get(i), keyword);
						 float sum=loc_avg_list.get(i)+sim;
						 loc_avg_list.set(i, sum);
					}
					
					System.out.println(" Final Array list : "+loc_avg_list);
					 reOrdering(loc_avg_list);
					search_no=Search_dao.insertSearch(uid, enc, match_post);
				}
				else
				{
					 avg_list=Location_dist(loc_det);
					 reOrdering(avg_list);
					search_no=Search_dao.insertSearch(uid, enc, match_post);
				}
				
			}
			else
			{
				 avg_list=Location_dist(loc_det);
				 reOrdering(avg_list);
				search_no=Search_dao.insertSearch(uid, enc, match_post);
			}
			
			long end = System.nanoTime();
			 
			long diff = ((end-start)/1000)/1000;
			
			System.out.println("Diff :"+diff);
			
			req.setAttribute("temp", "yes");
			session.setAttribute("Time", ""+diff);
			req.setAttribute("search_no", ""+search_no);
			System.out.println("============================================================================"+search_no);
			rd=req.getRequestDispatcher("/jsp/user/search.jsp");
			rd.forward(req, resp);
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			p_head_code.clear();p_heading.clear();p_desc.clear();p_image.clear();p_locname.clear();
			p_head_code1.clear();p_heading1.clear();p_desc1.clear();p_image1.clear();p_locname1.clear();
			index.clear();p_lat.clear();p_longd.clear();avg_list.clear();con_avg_list.clear();loc_avg_list.clear();post_list.clear();
		}
		
	}
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		String post_no=req.getParameter("code");
		String search_no=req.getParameter("search_no");
		ResultSet rs=null;
		boolean flag=Process.set_process(search_no, post_no);
		if(flag)
		{
			 rs=Postings_dao.getPosting(post_no);
		}
		req.setAttribute("rs", rs);
		req.setAttribute("search_no", ""+search_no);
		req.setAttribute("temp", "yes");
		rd=req.getRequestDispatcher("/jsp/user/search.jsp");
		rd.forward(req, resp);
		
		
	}
	public  ArrayList<Float> Location_dist(String[] loc_det)
	{
		ArrayList<Float>distance=new ArrayList<Float>();
		ArrayList<Float>avg_list=new ArrayList<Float>();
		
		float total_dist=0;
		for(int i=0;i<p_lat.size();i++)
		{
			float dist=Process.distance(Double.parseDouble(loc_det[0]), Double.parseDouble(loc_det[1]), Double.parseDouble(p_lat.get(i)), Double.parseDouble(p_longd.get(i)));
			total_dist=total_dist+dist;
			distance.add(dist);
		}
		System.out.println(distance+"  "+total_dist);
		 for(int  i=0;i<distance.size();i++)
		   {
			 float avg=((float)distance.get(i)/total_dist)*100;
			 System.out.println("  avg : "+avg);
			 avg=100-avg;
			   System.out.println(distance.get(i)+"+++++++"+avg+"+++++++"+total_dist);
			   avg_list.add(avg/2);
			   
		   }
		return avg_list;
	}
	
	public  ArrayList<Float> Content_dist(String[] pos,String keyword)
	{
		int total=pos.length;
		ArrayList<String> newposList = new ArrayList<String>();
		 ArrayList<Integer> count_list = new ArrayList<Integer> ();
		
		 ArrayList<Float> avg_list = new ArrayList<Float> ();
	
		
		 newposList.addAll(Arrays.asList(pos));
		 Map<String, Integer> counts=	Process.CountDuplicate(newposList);
		   for (Map.Entry<String, Integer> entry : counts.entrySet()) 
		   {
			   String a =""+entry.getKey();
			   int post=Integer.parseInt(a);
			   post_list.add(post);
			   String d =""+entry.getValue();
			   int count=Integer.parseInt(d);
			   count_list.add(count);
		   }
		   
		   
		   for(int  i=0;i<count_list.size();i++)
		   {
			 
			   float avg=((float)count_list.get(i)/total)*100;
			   System.out.println(count_list.get(i)+"+++++++"+avg+"+++++++"+total+"++++++++++");
			   avg_list.add(avg/2);
		   }
		return avg_list;
		
	}
	public  void reOrdering(ArrayList<Float> avglist)
	{
		 ArrayList<Float> avg_list = new ArrayList<Float> ();
		 avg_list.addAll(avglist);
		 Collections.sort(avglist, Collections.reverseOrder());
	
		System.out.println("  avg_list : "+avg_list+" avglist : "+avglist);
		for(int i=0;i<avglist.size();i++)
		{
			for(int j=0;j<avg_list.size();j++)
			{
				if(avglist.get(i).equals(avg_list.get(j)))
				{
					if(!index.contains(j))
					{	
						index.add(j);
					}
				}
			}
			
		}
		for(int i=0;i<index.size();i++)
		{	
			int s=index.get(i);
			p_head_code1.add(p_head_code.get(s));
			p_heading1.add(p_heading.get(s));
			p_desc1.add(p_desc.get(s));
			p_image1.add(p_image.get(s));
			p_locname1.add(p_locname.get(s));
		}
	
		for(int i=0;i<p_head_code1.size();i++)
		{
			boolean flag=Search_dao.addtempPostings(p_head_code1.get(i), p_heading1.get(i), p_desc1.get(i), p_image1.get(i), p_locname1.get(i));
		}
	}
	
	public  int Similarities(int pcode,String keyword)
	{
		int simliar=0;String parent_code = "",child_code = "";
		ArrayList<Integer>Simlarities=new ArrayList<Integer>();
		Map map=Content_dao.getparentCode(keyword);
		String f_code=Postings_dao.getContentLink(post_list.get(0));
		
		ArrayList<Integer>parent=(ArrayList<Integer>) map.get("parent");
		ArrayList<Integer>keycode=(ArrayList<Integer>) map.get("key_code");
		String m=GetProperty.getProperty("m");
		String n=GetProperty.getProperty("n");
		
		int extra=Integer.parseInt(m);
		int grace=Integer.parseInt(n);
		
		for(int j=0;j<parent.size();j++)
		{
			String c=""+parent.get(j);
			String d=""+keycode.get(j);
			if(f_code.contains(c)&&f_code.contains(d))
			{
				parent_code=c;
				child_code=d;
			}
			
		}
		
		String code=Postings_dao.getContentLink(pcode);
		
		if(code.contains(parent_code)&&code.contains(child_code)&&code.trim().length()>2)
		{
			simliar=extra;
			
		}
		if(code.contains(parent_code)&&code.contains(child_code)&&code.trim().length()==3)
		{
			if(!post_list.contains(pcode))
			{
				simliar=simliar+grace;
			}
		}
		
		System.out.println(" Simliarity : "+simliar);
		return simliar;
		
		
	}
}
