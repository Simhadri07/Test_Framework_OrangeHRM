package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * This class is for properties file data (common Data)
 * @author simhadri
 *
 */
public class PropertiesUtilityOhrm {
	
	/**
	 * This method is a generic method for properties data
	 * @param data
	 * @return
	 * @throws exception
	 */
	
	public String GetdataFromProperties(String data) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\schat\\selenium\\OrangeHRMLoginCredentials.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String DATA = pobj.getProperty(data);
		return DATA;
		
	}
}
