package simplehttpserver;

import simplehttpserver.Config.Configuration;
import simplehttpserver.Config.ConfigurationManager;

/**
 * 
 * Driver Class for the Http Server
 *
 */

public class HttpServer {

	public static void main(String[] args) {
	System.out.println("Server Starting");
	ConfigurationManager.getInstance().loadConfigurationfile("E:/eclipse-workspace/simplehttpserver/src/main/resources/json.java");
	Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();
	System.out.println("Using Port: " + conf.getPort());
	System.out.println("Using Port: " + conf.getPort());
	}

}
