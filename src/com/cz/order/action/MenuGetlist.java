package com.cz.order.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IMenu;
import com.cz.order.factory.Businessfactory;
import com.cz.order.value.menuValue;

/**
 * Servlet implementation class MenuGetlist
 */
@WebServlet("/MenuGetlist.do")
public class MenuGetlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuGetlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			IMenu im=Businessfactory.getMenu();
			List menulist=im.getList();
			
			request.setAttribute("menulist", menulist);
			

			RequestDispatcher rd=request.getRequestDispatcher("menu/menulist.jsp");		
			rd.forward(request, response);
			
		}catch(Exception e){
			System.out.println("menumainaction 处错误"+e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
