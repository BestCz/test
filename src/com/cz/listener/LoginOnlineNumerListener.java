package com.cz.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class LoginOnlineNumerListener
 *
 */
@WebListener
public class LoginOnlineNumerListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public LoginOnlineNumerListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name=event.getName();
    	if(name.equals("id"))
    	{
    		ServletContext application=event.getSession().getServletContext();
        	int num=(Integer)application.getAttribute("num");
        	application.setAttribute("num", num+1);
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name=event.getName();
    	if(name.equals("id"))
    	{
    		ServletContext application=event.getSession().getServletContext();
        	int num=(Integer)application.getAttribute("num");
        	application.setAttribute("num", num-1);
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	String name=event.getName();
    	if(name.equals("id"))
    	{
    		ServletContext application=event.getSession().getServletContext();
        	int num=(Integer)application.getAttribute("num");
        	application.setAttribute("num", num+1);
    	}
    }
	
}
