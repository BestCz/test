package com.cz.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class login
 */
@WebFilter("")
public class login implements Filter {
	private FilterConfig config = null;
	private String Webroot = null;
    /**
     * Default constructor. 
     */
    public login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		HttpSession session = req.getSession(false);
		String uri = req.getRequestURI();
		request.setCharacterEncoding("UTF-8");
		
		if(uri!=null && (uri.equals(Webroot+"/login/login.jsp"))) {
			chain.doFilter(request, response);
		}
		
		else {
			if(session == null) {
				res.sendRedirect(Webroot + "/login/login.jsp");
			} else {
				String userId = (String)session.getAttribute("id");
				if(userId == null) {
					res.sendRedirect(Webroot + "/login/login.jsp");
				} else {
					chain.doFilter(request, response);
				}
			}
		}


		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.config = fConfig;
		ServletContext ctx = fConfig.getServletContext();
		Webroot = ctx.getContextPath();
	}

}
