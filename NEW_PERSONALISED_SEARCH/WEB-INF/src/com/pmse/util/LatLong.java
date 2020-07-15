package com.pmse.util;

import java.net.*;
import java.io.*;

/**
 * This class will get the lat long values.
 * @author SANTHOSH REDDY MANDADI
 * @version 1.0
 * @since 20-Sep-2012
 */
public class LatLong
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter a postcode:");
    String postcode=reader.readLine();
    StringBuffer input=new StringBuffer();
    String data=null;
    String latLong=null;
    String link="http://maps.google.com/maps?q="+URLEncoder.encode(postcode, "UTF-8");
    URL url=new URL(link);
    HttpURLConnection connection=(HttpURLConnection)url.openConnection();
    BufferedReader br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
    if(connection.getResponseCode()==200)
    {
      System.out.println("Success");
      while((data=br.readLine())!=null)
        input.append(data);
    }
    System.out.println(input);
    int x=input.indexOf("lat:");
    int y=input.indexOf("}",x);
   System.out.println(x);
    System.out.println(y);
    latLong=input.substring(x,y);
   System.out.println(latLong);
    latLong=latLong.replaceAll("lat:","");
    latLong=latLong.replaceAll("lng:","");
    System.out.println(latLong);
    String[] array=latLong.split(",");
    System.out.println("Latitude: "+array[0]+" and Longitude: "+array[1]+" for "+postcode);
  }
}