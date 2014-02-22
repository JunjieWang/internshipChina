/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scraper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


/**
 * Parser use jsoup to parse HTML files
 * HTML Source: http://www.yingjiesheng.com/beijing-moreptjob-1.html
 * @author taozheng
 *
 */
public class HTMLParser {
	private static String urlprefix = "http://www.yingjiesheng.com/beijing-moreptjob-1.html";
	HTMLParser () {
		
	}
	
	private static String getHtmlContent(String preparedURL) {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(preparedURL);
			URLConnection con = url.openConnection();
			
			InputStreamReader isr = new InputStreamReader(con.getInputStream(), "gbk");
			BufferedReader buffer = new BufferedReader(isr);
			String line;
			while ((line = buffer.readLine() ) != null) {
				sb.append(line);
				sb.append("\n");
			}
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		} catch (MalformedURLException e) {
			
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
		} catch (IOException e) {
			
		}
		return sb.toString();
	}
	
	public static String test() {
		String htmlContent = "";
		try {
			URL url = new URL("http://www.tdrd.org");
			URLConnection con = url.openConnection();
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		    connection.connect();
		    InputStream inputStream = connection.getInputStream();
		    
		    byte bytes[] = new byte[1024*100]; 
		    int index = 0;
		    int count = inputStream.read(bytes, index, 1024*100);
		    while (count != -1) {
		      index += count;
		      count = inputStream.read(bytes, index, 1);
		    }
		    System.out.println (count);
		    htmlContent = new String(bytes, "gb2312");//
	
		} catch (MalformedURLException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
		return htmlContent;
	}
	
	public static String readHtml(String myurl) {
	    StringBuffer sb = new StringBuffer("");
	    URL url;
	    try {
	        url = new URL(myurl);
	        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "gbk"));
	        String s = "";
	        while ((s = br.readLine()) != null) {
	            sb.append(s + "\r\n");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return sb.toString();
	}
	/**
	 * This section is used for test.
	 * @param args
	 */
	public static void main(String[] args) {
		String preparedURL = urlprefix;
		System.out.println(getHtmlContent(preparedURL));
		System.out.println("============================");
		System.out.println(readHtml("http://www.yingjiesheng.com/beijing-moreptjob-1.html"));
	}
}
