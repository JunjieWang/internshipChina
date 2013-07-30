package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import sun.net.www.http.HttpClient;

/**
 * Parser use jsoup to parse HTML files
 * HTML Source: http://www.yingjiesheng.com/beijing-moreptjob-1.html
 * @author taozheng
 *
 */
public class Parser {
	private static String urlprefix = "http://www.yingjiesheng.com/beijing-moreptjob-1.html";
	
	Parser () {
		
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
	
	private static String getTableTag(String htmlContent) {
		String tableContent = "";
		Document doc =  Jsoup.parse(htmlContent);
		
		Elements elements = doc.getElementsByTag("table");
		System.out.println(elements.get(0));
		tableContent = elements.get(0).toString();
		return tableContent;
	}
	
	public static ArrayList<OnePost> getPosts(String tableContent) {
		ArrayList<OnePost> posts = new ArrayList<OnePost>();
		Document document = Jsoup.parse(tableContent);
		
		//abstract one <tr> entry
		Elements tr = document.getElementsByTag("tr");
		System.out.println(tr.size());
		return posts;
	}
	/**
	 * This section is used for test.
	 * @param args
	 */
	public static void main(String[] args) {
		String preparedURL = urlprefix;
		String htmlContent = getHtmlContent(preparedURL);
		//System.out.println(htmlContent);
		String tableContent = getTableTag(htmlContent);
		System.out.println("表格" + tableContent);
		getPosts(tableContent);
	}
}
