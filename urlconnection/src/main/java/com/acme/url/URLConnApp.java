//http://www.tutorialspoint.com/java/java_url_processing.htm


package com.acme.url;

import java.net.*;
import java.io.*;

public class URLConnApp 
{
    public static void main( String[] args )
    {
    	
    	      try
    	      {
    	         URL url = new URL("http://mfhadoopt03:8983/");
    	         URLConnection urlConnection = url.openConnection();
    	         HttpURLConnection connection = null;
    	         if(urlConnection instanceof HttpURLConnection)
    	         {
    	            connection = (HttpURLConnection) urlConnection;
    	         }
    	         else
    	         {
    	            System.out.println("Please enter an HTTP URL.");
    	            return;
    	         }
    	         BufferedReader in = new BufferedReader(
    	         new InputStreamReader(connection.getInputStream()));
    	         String urlString = "";
    	         String current;
    	         while((current = in.readLine()) != null)
    	         {
    	            urlString += current;
    	         }
    	         System.out.println(urlString);
    	      }catch(IOException e)
    	      {
    	         e.printStackTrace();
    	      }
    }
}
