package com.pmse.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pmse.dao.Search_dao;

public class Process 
{
	private static final int IMG_WIDTH = 247;
	private static final int IMG_HEIGHT = 130;
	   public static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type)
	    {
	 
			BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
			Graphics2D g = resizedImage.createGraphics();
			g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
			g.dispose();	
			g.setComposite(AlphaComposite.Src);
		 
			g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
			RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			g.setRenderingHint(RenderingHints.KEY_RENDERING,
			RenderingHints.VALUE_RENDER_QUALITY);
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		 
			return resizedImage;
	    }	
	   
	   public static  float distance(double lat1, double lon1, double lat2, double lon2) 
		{
				  double theta = lon1 - lon2;
				  double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
				  dist = Math.acos(dist);
				  dist = rad2deg(dist);
				  
				  dist = dist * 1.609344;
				  float f = (float) dist;
				  return (f);
		}
		private static double rad2deg(double rad) 
		{
			return (rad * 180 / Math.PI);
		}
		private static double deg2rad(double deg) 
		{
			return (deg * Math.PI / 180.0);
		}
		public static boolean set_process(String search_no,String post_no)
		{
			boolean flag=false;
			String pos;
			int s_no=Integer.parseInt(search_no);
			String sets[]=Search_dao.getNegatioveSet(s_no );
			System.out.println("  Postive Sets :"+sets[0]+" Negative_ Sets :"+sets[1]);
			if(sets[0]!=null)
			{
				 pos=sets[0]+","+post_no;
			}
			else
			{
				 pos=post_no;
			}
			
			String negative[]=sets[1].split(",");
			for(int i=0;i<negative.length;i++)
			{
				if(post_no.equals(negative[i]))
				{
					negative[i]=null;
				}
			}
			String neg="";
			for(String a : negative) 
			{
			       if(a != null && a.length() > 0)
			      {
			    	   neg=neg+','+a;
			       }
			}
			System.out.println("  Neg  : "+neg);
			if(neg.trim().length()!=0)
			{
				neg = neg.substring(1,neg.length());
			}
			
			System.out.println(" After Postive Sets :"+pos+" Negative_ Sets :"+neg);
			flag=Search_dao.updateSets(pos, neg, s_no);
			
			return flag;
		}
		
		
   public static void main(String[] args) 
   {
	   List<String> strings = new ArrayList<String>();
	   strings.add("stack");
	   strings.add("overflow");
	   strings.add("stack");strings.add("yahoo");strings.add("google");
	   strings.add("msn");strings.add("MSN");strings.add("stack");strings.add("overflow");strings.add("user");
	   
	  

	   Map<String, Integer> counts = new HashMap<String, Integer>();

	   for (String str : strings) {
	       if (counts.containsKey(str)) {
	           counts.put(str, counts.get(str) + 1);
	       } else {
	           counts.put(str, 1);
	       }
	   }

	   for (Map.Entry<String, Integer> entry : counts.entrySet()) {
	       System.out.println(entry.getKey() + " = " + entry.getValue());
	   }
   }
  public static Map<String, Integer> CountDuplicate(ArrayList<String> list)
  {
	  Map<String, Integer> counts = new HashMap<String, Integer>();

	   for (String str : list) 
	   {
	       if (counts.containsKey(str)) 
	       {
	           counts.put(str, counts.get(str) + 1);
	       } else 
	       {
	           counts.put(str, 1);
	       }
	   }

	   for (Map.Entry<String, Integer> entry : counts.entrySet()) {
	       System.out.println(entry.getKey() + " = " + entry.getValue());
	   }
	return counts;
  }
}
