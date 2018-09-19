package test;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public class testExport {
	/*public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8080/test/"+encode("select * from AUDIT_PARAM")+"/db3/"+encode("测试1.xls")+"/"+encode("ID,达到,大苏打,大苏打2,大苏打3,大苏打2,大苏打,大苏打,大苏打"));
		HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();
		urlcon.connect(); // 获取连接
		urlcon.getInputStream();

		// System.out.println(" content-encode："+urlcon.getContentEncoding());
		// System.out.println(" content-length："+urlcon.getContentLength());
		// System.out.println(" content-type："+urlcon.getContentType());
		// System.out.println(" date："+urlcon.getDate());
	}*/
	
	//测试github
	/*public static String encode(String s) throws UnsupportedEncodingException {
		String urlStr = URLEncoder.encode(s, "utf-8");
		String replaceAll = urlStr.replaceAll("\\+", "%20");
		return replaceAll;
	}*/
}
