package simplehttpserver.Config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import simplehttpserver.util.Json;

public class ConfigurationManager{
	
	private static ConfigurationManager myConfigurationManager;
	private static Configuration myCurrenctConfiguration;
	
	
	private ConfigurationManager() {
		
	}
	
	public static ConfigurationManager getInstance() {
		if(myConfigurationManager==null) {
			myConfigurationManager = new ConfigurationManager();
		}
		return myConfigurationManager;
		
	} // end of ConfigurationManager
	
	/**
	 * Used to load a configuration file by the path provided
	 * @throws IOException 
	 * 
	 * 
	 */
	
	public void loadConfigurationfile(String filePath) throws IOException {
		FileReader fileReader = new FileReader(filePath);
		StringBuffer sb = new StringBuffer();
		int i;
		while( (i = fileReader.read()) != -1) {
			sb.append((char)i);
		}
		JsonNode conf = Json.parse(sb.toString());
		myConfiguration = Json.fromJson(conf, Configuration.class);
		
		
		
		
		
	}// end of loadConfigurationfile
	
	
	// Returns the Current loaded Configuration
	
	public Configuration getCurrentConfiguration() {
		if(myCurrentConfiguration == null) {
			throw new HttpConfigurationException("No Current Configuration");
		}
		return myCurrentConfiguration;
		
		
	} // end of getCurrentConfiguration
}