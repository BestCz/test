package com.cz.order.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IMenu;
import com.cz.order.business.IOrder;
import com.cz.order.factory.Businessfactory;

/**
 * Servlet implementation class OrderDel
 */
@WebServlet("/OrderDel")
public class OrderDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderDel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			IOrder im=Businessfactory.getOrder();
			String id=request.getParameter("id");
			System.out.println(id);
			im.del(id);
			
			
			response.sendRedirect("http://localhost:8080/dingcan/OrderGetlist");
			
		}catch(Exception e){
			System.out.println("menumainaction 处错误"+e.getMessage());
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
