package http;

import java.net.*;
import java.io.*;

public class Http 
{

        public static void main(String[] args) throws IOException 
        {

           //this loads the website html code into a variable and displays it
            URL url = new URL("https://www.lds.org/?lang=eng");
            URLConnection conn = url.openConnection();
            BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s = buff.readLine();
            while (s != null)
            {
                System.out.println(s);
                s = buff.readLine();
            }

           // this attempts to load a page that doesn't exist and shows the code for the page not found
            try 
            {
                URL url2 = new URL("http://www.lds.org/sldfjsldfj");
                URLConnection conn2 = url2.openConnection();
                BufferedReader buff2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
                String s2 = buff2.readLine();
                while (s2 != null) 
                {
                    System.out.println(s2);
                    s2 = buff2.readLine();
                }
            }
            catch (Exception e)
            {
                System.out.print("Failed: Page does not exist\n");
            }

        
            //this tries a completely fake url
            try 
            {
                URL url3 = new URL("www.yomomma.com");
                URLConnection conn3 = url3.openConnection();
                BufferedReader buff3 = new BufferedReader(new InputStreamReader(conn3.getInputStream()));
                String s3 = buff3.readLine();
                while (s3 != null) 
                {
                    System.out.println(s3);
                    s3 = buff3.readLine();
                }
            }
            catch (Exception e)
            {
                System.out.print("Failed: non-existant URL\n");
            }

          


        }


}