
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.*;



public class URLConnection{ 
URLConnection connection = new URL(“<IPRSURL>/<endpoint>?param1=value1&param2=value2”).openConnection();
connection.setRequestProperty("header1", header1);
connection.setRequestProperty("header2", header2);
//Get Response  
InputStream is = connection.getInputStream();
private InputStream getInputStream() {
    
    return null;
}
System.out.println(connection.getContentType());
}