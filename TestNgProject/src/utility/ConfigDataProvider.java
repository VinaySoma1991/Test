package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider() throws FileNotFoundException {
		
		File src=new File("./Config/config.properties");
		try{
		FileInputStream fc=new FileInputStream(src);
		pro=new Properties();
		
			pro.load(fc);
		} catch (Exception e) {
			System.out.println("Not able to login Config file"+e.getMessage());
		}
	}
	
	public String getDataFromConfig(String key) {
		return pro.getProperty(key);
	}
	public String getUrl() {
	return	pro.getProperty("aurl");

		
	}

	
}
 