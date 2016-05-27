package com.cz.order.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IMenu;
import com.cz.order.factory.Businessfactory;

/**
 * Servlet implementation class MenuAdd
 */
@WebServlet("/MenuAdd.do")
public class MenuAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mid=request.getParameter("mid");
		String mname=request.getParameter("mname");
		String mpicture=request.getParameter("mpicture");
		String mprice=request.getParameter("mprice");
		
		try{
			IMenu im=Businessfactory.getMenu();
			im.add(mid, mname, mpicture, mprice);
			
			
			response.sendRedirect("http://localhost:8080/dingcan/MenuGetlist.do");
			
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
