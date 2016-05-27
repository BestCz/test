package com.cz.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestLifeListnener
 *
 */
@WebListener
public class RequestLifeListnener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public RequestLifeListnener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent event)  { 
         // TODO Auto-generated method stub
    	 ServletContext application=event.getServletContext();
         int cnum=(Integer)application.getAttribute("clicknum");
         application.setAttribute("clicknum", cnum+1);
    }
	
}
