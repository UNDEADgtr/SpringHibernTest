package by.undead;

import by.undead.service.IService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * Application Lifecycle Listener implementation class ShopContextListener
 *
 */
public class BookContextListener implements ServletContextListener {

	private ConfigurableApplicationContext ctx = null;
	private static IService service = null;
	
	public static IService getService() {
		return service;
	}
	
	/**
     * Default constructor. 
     */
    public BookContextListener() {
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
    	ctx = new ClassPathXmlApplicationContext("classpath:/spring-config.xml");
    	if (ctx != null) {
    		service = (IService) ctx.getBean("service");
    	}
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
    	if (ctx != null) {
    		ctx.close();
    	}
    }
	
}
