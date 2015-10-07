/**
 * 
 */
package com.shunya.tomcat;

import java.io.IOException;

import org.apache.catalina.Session;
import org.apache.catalina.session.ManagerBase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author bhatt
 *
 */
public class RedisSessionManager extends ManagerBase {
	
	private final Log logger = LogFactory.getLog(getClass());

	public void load() throws ClassNotFoundException, IOException {
		logger.info("In session load" + System.currentTimeMillis());
	}

	public void unload() throws IOException {
		logger.info("in session unload" + System.currentTimeMillis());
	}
	
	private Session superFindSession(String id)throws IOException{
		return super.findSession(id);
	}
	
	 @Override
	  public Session findSession(String id) throws IOException {
		 logger.info("find session for id" + id);
		 return superFindSession(id);
	    }
	

}
