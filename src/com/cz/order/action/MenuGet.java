package com.cz.order.action;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IMenu;
import com.cz.order.factory.Businessfactory;
import com.cz.order.value.menuValue;

/**
 * Servlet implementation class MenuGet
 */
@WebServlet("/MenuGet")
public class MenuGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mid=request.getParameter("mid");
	
		
		try{
			IMenu mm=Businessfactory.getMenu();
			menuValue mv=mm.get(mid);
			String mname=mv.getMname();
			String mpicture=mv.getMpicture();
			String mprice=mv.getMprice();
			String id=mv.getMid();
			
			request.setAttribute("id", id);
			request.setAttribute("mprice",mprice);
			request.setAttribute("mname", mname);
			request.setAttribute("mpicture", mpicture);
			
			request.getRequestDispatcher("menu/result.jsp").forward(request, response);
			
			}catch(Exception e){
				System.out.println("菜单sevlet添加错误"+e.getMessage());
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
