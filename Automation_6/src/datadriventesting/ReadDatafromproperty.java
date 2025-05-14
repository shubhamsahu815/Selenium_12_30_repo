package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDatafromproperty {
public static void main(String[] args) throws IOException {
	//step1:create FileInputStream object
	FileInputStream fis=new FileInputStream("./Testdata/commandata.properties");
	
	//step2:create respective file type object
	Properties prop=new Properties();
	
	//step3:call read methods
	prop.load(fis);
	String url=prop.getProperty("url");
	System.out.println(url);
	
	String email=prop.getProperty("email");
	System.out.println(email);
}
}
